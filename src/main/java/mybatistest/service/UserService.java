package mybatistest.service;

import mybatistest.common.exception.CommonException;
import mybatistest.entity.Scusers;

public interface UserService extends BaseService<Scusers>{

	public Scusers userLogin(String userNumber, String userPassword) throws CommonException;  

}
