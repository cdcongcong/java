package mybatistest.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import mybatistest.dao.UserDao;
import mybatistest.entity.User;

@Repository
@Scope("prototype")   
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {



}
