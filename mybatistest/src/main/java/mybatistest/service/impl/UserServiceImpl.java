package mybatistest.service.impl;

import mybatistest.dao.impl.UserDaoImpl;
import mybatistest.entity.User;
import mybatistest.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<User, String> implements
		UserService {

	public UserServiceImpl() {
		 mainDao = new UserDaoImpl();
	}

	public String userLogin(String userNumber, String userPassword) {
//		((UserDao) mainDao).getUserString("");
		User user = mainDao.getByID("1");
		if (null == user) {
			return "用户不存在！";
		}
		if ("XXX" != userPassword) {
			return "密码不正确！";
		}
		return "登录成功！";
	}
}
