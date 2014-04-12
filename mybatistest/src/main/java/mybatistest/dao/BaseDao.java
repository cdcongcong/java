package mybatistest.dao;

import java.io.Serializable;

public interface BaseDao<T, PK extends Serializable> {

	public T getByID(PK id);
}
