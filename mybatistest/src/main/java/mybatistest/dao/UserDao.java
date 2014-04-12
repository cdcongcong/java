package mybatistest.dao;

import mybatistest.entity.User;

public interface UserDao extends BaseDao<User, String>{
	
	public String getUserString(String id);

}
