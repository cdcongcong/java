package mybatistest.service;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

public interface UserService extends BaseService<User, UserDao>{

	public String userLogin(String userNumber, String userPassword);  

}
