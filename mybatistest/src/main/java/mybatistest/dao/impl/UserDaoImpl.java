package mybatistest.dao.impl;

import org.springframework.stereotype.Component;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

@Component
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public String getUserString(String id) {
		return "UserDao.getUserString";
	}

}
