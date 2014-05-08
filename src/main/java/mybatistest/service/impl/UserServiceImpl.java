package mybatistest.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatistest.common.exception.CommonException;
import mybatistest.dao.UserDao;
import mybatistest.entity.Scusers;
import mybatistest.service.UserService;

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
		if (user.getPassword() != userPassword) {
			// return "密码不正确！";
			throw new CommonException("Authentication.errorPassword");
		}
		return true;
	}

}
