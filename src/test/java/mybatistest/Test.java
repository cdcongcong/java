package mybatistest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.service.impl.UserServiceImpl;
import mybatistest.utils.DaoHelper;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		//打印自动注册的类
		for (String beanName:ac.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
		// 注意定义成接口，并通过getBean方式取得Bean
//		UserService userService = (UserService) ac.getBean("userServiceImpl");
		UserService userService = ac.getBean(UserService.class);

		// 测试从接口中的服务取一个entity
		User user = userService.getByID("1");
		System.out.println(user.getUserName());
		// 测试调接口的userLogin服务
		System.out.println(userService.userLogin("1", "XXX"));
		User newUser = new User();
		newUser.setUserID(DaoHelper.getUUID());
		newUser.setUserNumber("2");
		newUser.setUserName("李四");
		newUser.setRemark("");
		userService.insertUser(newUser);
	}
}
