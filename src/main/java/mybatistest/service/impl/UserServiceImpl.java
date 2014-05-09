package mybatistest.service.impl;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatistest.common.exception.CommonException;
import mybatistest.dao.UserActionLogDao;
import mybatistest.dao.UserDao;
import mybatistest.dao.impl.UserActionLogDaoImpl;
import mybatistest.entity.Scusers;
import mybatistest.entity.UserActionLog;
import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;
import mybatistest.utils.HibernateUtil;

@Service
public class UserServiceImpl extends BaseServiceImpl<Scusers, UserDao>
		implements UserService {
	Logger logger = Logger.getLogger(getClass());

	public Boolean userLogin(String userNumber, String userPassword)
			throws CommonException {
		// ((UserDao) mainDao).getUserString("");
		// 子类可以不用强制转换了

		Scusers loginUser = new Scusers();
		loginUser.setUserno(userNumber);
		List<Scusers> scusers = getMainDao().findByExample(loginUser);
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
		this.getMainDao().attachDirty(user);//.persist(user);//.attachDirty(user);.merge(user);
		//记录登录日志
		UserActionLog userActionLog = new UserActionLog();
		userActionLog.setLogId(DaoHelper.getUUID());
		userActionLog.setUserId(user.getUserid());
		userActionLog.setActionType("LOGIN");
		userActionLog.setActionDate(new Date());
		userActionLog.setActionRemark("成功登录");
		
//		Session session = HibernateUtil.getCurrentSession();
		Session session = this.getMainDao().getSessionFactory().getCurrentSession();
		session.save(userActionLog);
		
//		UserActionLogDao userActionLogDao = new UserActionLogDaoImpl();
//		userActionLogDao.save(userActionLog);
		
		return true;
	}

}
