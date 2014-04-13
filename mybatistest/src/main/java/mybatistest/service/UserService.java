package mybatistest.service;

import mybatistest.entity.User;

public interface UserService extends BaseService<User>{

	public String userLogin(String userNumber, String userPassword);  

}
