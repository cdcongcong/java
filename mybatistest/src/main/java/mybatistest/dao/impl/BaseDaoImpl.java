package mybatistest.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatistest.dao.BaseDao;

public class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

	protected SqlSessionFactory sqlSessionFactory;
	private Class<T> clazz;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		String resource = "mybatis-configuration.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];

	}

	public T getByID(PK id) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		return sqlSessionFactory.openSession().selectOne(
				clazz.getName() + "." + methodName, id);

	}

}
