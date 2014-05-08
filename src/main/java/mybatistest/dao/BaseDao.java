package mybatistest.dao;

import java.io.Serializable;
import java.util.List;

import mybatistest.entity.Scusers;

public interface BaseDao<T>{

	public T findById(Serializable id);
	public List<T> findByExample(Scusers instance);
}
