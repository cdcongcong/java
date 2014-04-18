package mybatistest.controller;

import java.util.HashMap;
import java.util.Map;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller  
@RequestMapping("/user/*")
public class UserController extends BaseController  {
	@Autowired
	private UserService userService;
	
//	@RequestMapping("login")
	@RequestMapping(value="/login",   
	            method=RequestMethod.GET,produces={"text/html", "application/xml", "application/json"}) 	
	// 子request请求url，拼接后等价于/user/login
	public ModelAndView Login(String userName, String password) {
		System.out.println("===============");
		System.out.println("username:" + userName);
		System.out.println("password:" + password);

        ModelAndView mv = new ModelAndView();   
        //添加模型数据 可以是任意的POJO对象   
//        mv.addObject("message", userName + "! Hello World!");  
//        User user = userService.getByID("1");
//        mv.addObject("message", user.getUserName() + "! Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面   
//        mv.setViewName("hello");  // 逻辑视图名
        User user = null;
        user = new User();
        user.setUserID(DaoHelper.getUUID());
        user.setUserNumber("001");
        user.setUserName("李四");
        user.setRemark("备注");
        mv.addObject(user);
        Map<String, User> mp = new HashMap<>();
        mp.put("message", user);
        mv.addAllObjects(mp);
        mv.setViewName("hello");
        return mv;           
	}
}
