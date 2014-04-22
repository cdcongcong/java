package mybatistest.service.impl;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import mybatistest.dao.BaseDao;
import mybatistest.service.BaseService;

public abstract class BaseServiceImpl<T,  D extends BaseDao<T>> implements
		BaseService<T> {
	@Autowired
	private D mainDao;

	//供子类使用
	protected D getMainDao() {
		return mainDao;
	}

	//实现接口BaseSerivce中的方法
	public T getByID(Serializable id) {
		return mainDao.getByID(id);
	};
}
