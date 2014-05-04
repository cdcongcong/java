package mybatistest.dao.impl;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

@Repository
@Scope("prototype")   
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public Map<String, Object> getMap() {
		// TODO Auto-generated method stub
		return 		 getSqlSession()
				.selectOne("mybatistest.entity.User.getByID","1");

	}



}
