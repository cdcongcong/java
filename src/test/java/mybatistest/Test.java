package mybatistest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatistest.dao.UserDao;
import mybatistest.dao.impl.UserDaoImpl;
import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.service.impl.UserServiceImpl;
import mybatistest.utils.DaoHelper;

public class Test {

	public static void main(String[] args) {
		String resource = "mybatis-configuration.xml";
		try { // 方式一（官网）
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
					.build(inputStream);
			// 方式二
			// SqlSessionFactory sqlSessionFactory = new
			// SqlSessionFactoryBuilder()
			// .build(Test.class.getResource("/mybatis-configuration.xml").openStream());
			// 测试用，因还没有Mapper，就随便commit一下
//			Map<String, Object> um = sqlSessionFactory.openSession().selectOne(
//					"mybatistest.entity.User.getByID", "1");
//			System.out.println(um);
			
			User u = (User) sqlSessionFactory.openSession().selectOne(
			"mybatistest.entity.User.getByID", "1");
	System.out.println(u);			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// UserDao ud = new UserDaoImpl();
	// Map<String, Object> um = ud.getMap();
	// System.out.println(um);
	// Collection<Object> c = um.values();
	// Iterator<Object> it = c.iterator();
	// for (; it.hasNext();) {
	// System.out.println(it.next());
	// }

}
