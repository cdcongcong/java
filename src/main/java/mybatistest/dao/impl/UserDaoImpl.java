package mybatistest.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

@Repository
@Scope("prototype")   
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public String getUserString(String id) {
		return "UserDao.getUserString";
	}
	
	public String insertUser(User user) {
		
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		
		getSqlSession().insert(getClazz().getName() + "." + methodName, user);
		return user.getUserID();
	}

}
