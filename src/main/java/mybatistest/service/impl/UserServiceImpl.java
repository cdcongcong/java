package mybatistest.service.impl;

import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.management.Query;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.dialect.Dialect;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mybatistest.common.exception.CommonException;
import mybatistest.dao.UserActionLogDao;
import mybatistest.dao.UserDao;
import mybatistest.dao.impl.JdbcDaoTest;
import mybatistest.entity.Scusers;
import mybatistest.entity.UserActionLog;
import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;
import mybatistest.utils.HibernateUtil;
import mybatistest.utils.JsonUtils;

@Service
public class UserServiceImpl extends BaseServiceImpl<Scusers, UserDao>
		implements UserService {
	Logger logger = Logger.getLogger(getClass());
	
	@Autowired  
	UserActionLogDao userActionLogDao;
	@Autowired
	UserDao userDao;
	@Autowired  
	JdbcDaoTest jdbcDaoTest;
	
	

	
	public Scusers userLogin(String userNumber, String userPassword)
			throws CommonException {
		// ((UserDao) mainDao).getUserString("");
		// 子类可以不用强制转换了

		Scusers loginUser = new Scusers();
		loginUser.setUserno(userNumber);
		List<Scusers> scusers = userDao.findByExample(loginUser);
		if (0 == scusers.size()) {
			// return "用户不存在！";
			throw new CommonException("Authentication.notFound");
		}
		Scusers user = scusers.get(0);
		if (!user.getPassword().equals(userPassword)) {
			// return "密码不正确！";
			throw new CommonException("Authentication.errorPassword");
		}
		//保存最近登录信息
		user.setLastlogin(new Date());
		this.userDao.attachDirty(user);//.persist(user);//.attachDirty(user);.merge(user);
		//记录登录日志
		UserActionLog userActionLog = new UserActionLog();
		userActionLog.setLogId(DaoHelper.getUUID());
		userActionLog.setUserId(user.getUserid());
		userActionLog.setActionType("LOGIN");
		userActionLog.setActionDate(new Date());
		userActionLog.setActionRemark("成功登录");
		
//		Session session = HibernateUtil.getCurrentSession();
//		Session session = this.getMainDao().getSessionFactory().getCurrentSession();
//		session.save(userActionLog);
//		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		userActionLogDao.save(userActionLog);
//		s.save(userActionLog);
		
		return user;
	}

	@Override
	public List<Scusers> getList() {
		return userDao.find("from Scusers", null);
	}
	
	public void jdbcTest(){
		
//		UserActionLog userActionLog = new UserActionLog();
//		userActionLog.setLogId(DaoHelper.getUUID());
//		userActionLog.setUserId("1111111111");
//		userActionLog.setActionType("Hibernate");
//		
//
//	
//		UserActionLog userActionLog2 = new UserActionLog();
//		userActionLog2.setLogId(userActionLog.getLogId());
//		userActionLog2.setUserId("2222222222");
//		userActionLog2.setActionType("JdbcTemplate");
//
//		jdbcDaoTest.insertPersonUseUpdate(userActionLog2);
//		
//		userActionLogDao.save(userActionLog);
//		userActionLogDao.getSessionFactory().getCurrentSession().flush();

		Session session = userActionLogDao.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		session.createQuery("");
//		Transformers transformers;
//		List list =  session.createSQLQuery("select userid as \"userid\", orderno as \"orderno\", userno as \"userno\", username as \"username\" from scusers").setResultTransformer(new AliasToBeanResultTransformer(Scusers.class)).list();
		List list =  session.createSQLQuery("select userid as \"userid\", orderno as \"orderno\", userno as \"userno\", username as \"username\" from scusers").setResultTransformer(Transformers.aliasToBean(Scusers.class)).list();
		System.out.println(JsonUtils.Bean2JsonFormatString(list));
//		Transformers transformers;
		SQLQuery query = session.createSQLQuery("delete from user_action_log");
//		query.setParameters(values, types);
		query.executeUpdate();
		Properties pro = new Properties();  
		pro.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");  
		Dialect dialect = Dialect.getDialect(pro);  
		String sqlQuery = dialect.getLimitString("Select * from tabel", 1, 5);
		System.out.println(sqlQuery);
	}	
	

}
