package mybatistest;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		        //注意定义成接口   
		        UserService userService = new UserServiceImpl();  
		        //测试从接口中的服务取一个entity   
		        User user = userService.getByID("1");  
		        System.out.println(user.getUserName());  
		        //测试调接口的userLogin服务   
		        System.out.println(userService.userLogin("1", "XXX"));  

	}
}
