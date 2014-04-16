package mybatistest.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mybatistest.controller.UserController;

@Controller
@RequestMapping("/user/*")
public class UserControllerImpl extends BaseControllerImpl implements
		UserController {
	@RequestMapping("login")
	// 子request请求url，拼接后等价于/user/login
	public ModelAndView Login(String userName, String password) {
		System.out.println("===============");
		System.out.println("username:" + userName);
		System.out.println("password:" + password);
        ModelAndView mv = new ModelAndView();   
        //添加模型数据 可以是任意的POJO对象   
        mv.addObject("message", userName + "!  Hello World!");   
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面   
        mv.setViewName("hello");   
        return mv;                                         //○3 模型数据和逻辑视图名   
	}
	
 
}
