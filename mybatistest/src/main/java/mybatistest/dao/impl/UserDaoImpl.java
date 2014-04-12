package mybatistest.dao.impl;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

public class UserDaoImpl extends BaseDaoImpl<User, String> implements UserDao {

	public String getUserString(String id) {
		return "UserDao.getUserString";
	}

//	public UserDaoImpl(){
//		super();
//	}
	
	
}
