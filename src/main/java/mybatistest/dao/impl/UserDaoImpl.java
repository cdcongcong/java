package mybatistest.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import mybatistest.dao.UserDao;
import mybatistest.entity.Scusers;

@Repository
@Scope("prototype")   
public class UserDaoImpl extends BaseDaoImpl<Scusers> implements UserDao {


}
