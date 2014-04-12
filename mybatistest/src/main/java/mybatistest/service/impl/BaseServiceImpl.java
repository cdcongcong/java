package mybatistest.service.impl;

import java.io.Serializable;

import mybatistest.dao.BaseDao;
import mybatistest.service.BaseService;

public abstract class BaseServiceImpl<T, PK extends Serializable> implements
		BaseService<T, PK> {

	protected BaseDao<T, PK> mainDao;

	public T getByID(PK id) {
		return  mainDao.getByID(id);
	};
}
