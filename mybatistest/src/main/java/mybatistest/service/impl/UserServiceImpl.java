package mybatistest.service.impl;

import org.springframework.stereotype.Service;
import mybatistest.dao.UserDao;
import mybatistest.entity.User;
import mybatistest.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserDao> implements
		UserService {

	public String userLogin(String userNumber, String userPassword) {
//		((UserDao) mainDao).getUserString("");
//		子类可以不用强制转换了
//		getMainDao().getUserString("1");
		User user = getMainDao().getByID("1");
		if (null == user) {
			return "用户不存在！";
		}
		if ("XXX" != userPassword) {
			return "密码不正确！";
		}
		return "登录成功！";
	}
}
