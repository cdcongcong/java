package mybatistest.service;

import java.util.List;

public interface BaseService<T> {

	
	public List<T> getList();
	
}
