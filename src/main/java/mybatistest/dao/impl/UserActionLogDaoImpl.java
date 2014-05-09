package mybatistest.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import mybatistest.dao.UserActionLogDao;
import mybatistest.entity.UserActionLog;

@Repository
@Scope("prototype")   
public class UserActionLogDaoImpl extends BaseDaoImpl<UserActionLog> implements UserActionLogDao {


}
