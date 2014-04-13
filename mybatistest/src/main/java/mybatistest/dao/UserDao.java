package mybatistest.dao;

import mybatistest.entity.User;

public interface UserDao extends BaseDao<User>{
	
	public String getUserString(String id);

}
