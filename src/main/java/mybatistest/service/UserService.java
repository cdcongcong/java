package mybatistest.service;

import mybatistest.common.exception.CommonException;
import mybatistest.entity.Scusers;

public interface UserService extends BaseService<Scusers>{

	public Boolean userLogin(String userNumber, String userPassword) throws CommonException;  

}
