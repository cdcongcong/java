package mybatistest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;

import mybatistest.dao.BaseDao;
import mybatistest.entity.Scusers;

public class BaseDaoImpl<T>  implements BaseDao<T> {

	@Autowired  
	private SessionFactory sessionFactory;  

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
    private Session getCurrentSession() {  
        return sessionFactory.getCurrentSession();  
    }  	
	
	//子类的class
	private Class<T> clazz;
	// 表名
	private String tableName;
	// 主键字段名
	private String pkName;

	public Class<T> getClazz() {
		return clazz;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getPkName() {
		return pkName;
	}

	public void setPkName(String pkName) {
		this.pkName = pkName;
	}

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public BaseDaoImpl(String tableName, String pkName) {
		this();
		this.tableName = tableName;
		this.pkName = pkName;
	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		return (T) this.getCurrentSession().get(this.clazz, id);
	}

	
    public List<T> find(String hql, List<Object> param) {  
        Query q = this.getCurrentSession().createQuery(hql);  
        if (param != null && param.size() > 0) {  
            for (int i = 0; i < param.size(); i++) {  
                q.setParameter(i, param.get(i));  
            }  
        }  
        return q.list();  
    } 	
	
	public List<T> findByExample(Scusers instance) {
		try {
			List<T> results = this.getCurrentSession()
					.createCriteria(this.clazz)
					.add(Example.create(instance)).list();
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}    
    
}
