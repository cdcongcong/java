package mybatistest.service.impl;

import java.io.Serializable;

import mybatistest.dao.BaseDao;
import mybatistest.service.BaseService;

public abstract class BaseServiceImpl<T, PK extends Serializable> implements
		BaseService<T, PK> {

	protected BaseDao<T, PK> mainDao;

	public BaseDao<T, PK> getMainDao() {
		return mainDao;
	}

	public void setMainDao(BaseDao<T, PK> mainDao) {
		this.mainDao = mainDao;
	}

	public T getByID(PK id) {
		return  mainDao.getByID(id);
	};
}
