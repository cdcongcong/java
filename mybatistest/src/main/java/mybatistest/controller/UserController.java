package mybatistest.controller;

import mybatistest.entity.User;
import mybatistest.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController  {
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	// 子request请求url，拼接后等价于/user/login
	public ModelAndView Login(String userName, String password) {
		System.out.println("===============");
		System.out.println("username:" + userName);
		System.out.println("password:" + password);

        ModelAndView mv = new ModelAndView();   
        //添加模型数据 可以是任意的POJO对象   
//        mv.addObject("message", userName + "! Hello World!");  
        User user = userService.getByID("1");
        mv.addObject("message", user.getUserName() + "! Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面   
        mv.setViewName("hello");  // 逻辑视图名 
        return mv;           
	}
}
