package mybatistest.service;

import java.io.Serializable;

public interface BaseService<T> {

	public T getByID(Serializable id);
}
