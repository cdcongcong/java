package mybatistest.dao;

import java.io.Serializable;

public interface BaseDao<T>{

	public T getByID(Serializable id);
}
