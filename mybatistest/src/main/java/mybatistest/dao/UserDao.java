package mybatistest.dao;

import mybatistest.entity.User;

public interface UserDao extends BaseDao<User>{
	
	public String insertUser(User user);
	public String getUserString(String id);

}
