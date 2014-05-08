package mybatistest.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatistest.dao.BaseDao;
import mybatistest.service.BaseService;

//事务采用配置而不是注解
public abstract class BaseServiceImpl<T,  D extends BaseDao<T>> implements
		BaseService<T> {
	@Autowired
	private D mainDao;

	//供子类使用
	protected D getMainDao() {
		return mainDao;
	}

}
