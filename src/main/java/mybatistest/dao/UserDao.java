package mybatistest.dao;

import java.util.Map;

import mybatistest.entity.User;

public interface UserDao extends BaseDao<User>{
	
public Map<String, Object> getMap();
}
