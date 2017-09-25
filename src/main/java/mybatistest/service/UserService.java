package mybatistest.service;

import java.util.List;

import mybatistest.common.exception.CommonException;
import mybatistest.entity.Scusers;

public interface UserService extends BaseService<Scusers>{

	public Scusers userLogin(String userNumber, String userPassword) throws CommonException;
	

	public void jdbcTest();
}
