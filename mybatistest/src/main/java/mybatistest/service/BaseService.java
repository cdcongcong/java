package mybatistest.service;

import java.io.Serializable;

public interface BaseService<T, D> {

	public T getByID(Serializable id);
}
