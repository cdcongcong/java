package mybatistest.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import mybatistest.dao.BaseDao;
import mybatistest.entity.User;

public class BaseDaoImpl<T> extends SqlSessionDaoSupport implements BaseDao<T> {
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

	public T getByID(Serializable id) {
		String methodName = Thread.currentThread().getStackTrace()[1]
				.getMethodName();
		return getSqlSession()
				.selectOne(clazz.getName() + "." + methodName, id);

	}

	// SqlSessionDaoSupport没有提供注解注入
	@Autowired
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

}
