package mybatistest.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

public interface BaseDao<T>{
	public SessionFactory getSessionFactory();
	
	public T findById(Serializable id);
	public List<T> find(String hql, List<Object> param);
	public List<T> findByExample(T instance);
	
	public void persist(T transientInstance);
	public void attachDirty(T instance);
	public T merge(T detachedInstance);
	public void save(T pojo);
	
	public void delete(T persistentInstance);
	
	
	
	
}
