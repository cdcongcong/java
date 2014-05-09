package mybatistest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mybatistest.dao.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T> {
	Logger log = Logger.getLogger(getClass());

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

	public Class<T> getClazz() {
		return clazz;
	}

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		log.debug("getting "+ this.clazz +" instance with id: " + id);
		try {
			T instance = (T) sessionFactory.getCurrentSession()
					.get(this.clazz, id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
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
	
	public List<T> findByExample(T instance) {
		log.debug("finding "+ this.clazz +" instance by example");
try {
			List<T> results = this.getCurrentSession()
					.createCriteria(this.clazz)
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}   
	
	
	public void persist(T transientInstance) {
		log.debug("persisting "+ this.clazz +" instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}
	
	public void attachDirty(T instance) {
		log.debug("attaching dirty "+ this.clazz +" instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	
	public T merge(T detachedInstance) {
		log.debug("merging "+ this.clazz +" instance");
		try {
			T result = (T) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
	
	public void save(T pojo){
		sessionFactory.getCurrentSession().save(pojo);
	}
	
	public void delete(T persistentInstance) {
		log.debug("deleting "+ this.clazz +" instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}
	
	
    
}
