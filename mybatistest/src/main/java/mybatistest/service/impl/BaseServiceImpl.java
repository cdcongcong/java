package mybatistest.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import mybatistest.dao.BaseDao;
import mybatistest.service.BaseService;
@Component
public abstract class BaseServiceImpl<T,  D > implements
		BaseService<T, D> {
	@Autowired
	private D mainDao;

	//子类使用
	protected D getMainDao() {
		return mainDao;
	}

	public T getByID(Serializable id) {
		return ((BaseDao<T>) mainDao).getByID(id);
//		return null;
	};
}
