package mybatistest.dao.impl;

import mybatistest.entity.UserActionLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")   
public class JdbcDaoTest {

	@Autowired  
	private JdbcTemplate jdbcTemplate;	
	
	public int insertPersonUseUpdate(UserActionLog userActionLog){
	    String sql="insert into user_action_log(log_id, user_id, action_type) values(?,?,?)";
	    Object[] params=new Object[]{
	    		userActionLog.getLogId(),
	    		userActionLog.getUserId(),
	    		userActionLog.getActionType()
	    };
	    return this.jdbcTemplate.update(sql,params);
	}	
	
}
