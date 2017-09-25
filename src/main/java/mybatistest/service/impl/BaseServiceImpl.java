package mybatistest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mybatistest.dao.BaseDao;
import mybatistest.dao.UserDao;
import mybatistest.service.BaseService;

//事务采用配置而不是注解事务
public abstract class BaseServiceImpl<T,  D extends BaseDao<T>> implements
		BaseService<T> {
	
	//每个Services对应的一个默认Dao
//	private D Dao;
	//这样也能自动注入
//	@Autowired
//	protected D Dao;
	//供子类使用
//	protected D getDao() {
//		return Dao;
//	}

	D dao;
	
	public List<T> getList(){
		return (List<T>) dao.find("", null);
//		return  dao.find("from Scusers", null);
	}
	

}
