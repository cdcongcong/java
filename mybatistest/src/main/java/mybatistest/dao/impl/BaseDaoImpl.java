package mybatistest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import mybatistest.dao.BaseDao;

public class BaseDaoImpl<T, PK extends Serializable> extends
		SqlSessionDaoSupport implements BaseDao<T, PK> {

	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public T getByID(PK id) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		return getSqlSession()
				.selectOne(clazz.getName() + "." + methodName, id);

	}

}
