package mybatistest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import mybatistest.dao.BaseDao;

public class BaseDaoImpl<T> extends
		SqlSessionDaoSupport implements BaseDao<T> {
	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public T getByID(Serializable id) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		return getSqlSession()
				.selectOne(clazz.getName() + "." + methodName, id);

	}
	
	@Autowired
	  public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		    super.setSqlSessionTemplate(sqlSessionTemplate);
		  }

}
