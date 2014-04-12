package mybatistest.service;

import java.io.Serializable;

public interface BaseService<T, PK extends Serializable> {

	public T getByID(PK id);
}
