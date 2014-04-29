package mybatistest.controller;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.servlet.LoginFilter;
import mybatistest.utils.DaoHelper;

import org.apache.log4j.Logger;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController {
	Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	// @RequestMapping("login")
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// ,produces={"text/html", "application/xml", "application/json"})
	// 子request请求url，拼接后等价于/user/login
	public ModelAndView Login(String userName, String password) {
		logger.debug("=============");
		logger.debug("username:" + userName);
		logger.debug("password:" + password);

		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象
		// mv.addObject("message", userName + "! Hello World!");
		// User user = userService.getByID("1");
		// mv.addObject("message", user.getUserName() + "! Hello World!");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		// mv.setViewName("hello"); // 逻辑视图名
		User user = null;
		user = new User();
		user.setUserID(DaoHelper.getUUID());
		user.setUserNumber("001");
		user.setUserName("李四");
		user.setRemark("备注");
		mv.addObject(user);
//		Map<String, Boolean> mp = new HashMap<>();
//		mp.put("success", true);
//		mv.addAllObjects(mp);

		mv.addObject("success", true);

		mv.setViewName("hello");
		return mv;
	}

	@RequestMapping(value = "/submit")
	//, method = RequestMethod.POST)
	public ModelAndView submit(String userName, String password, String redirectURL,
			HttpServletRequest request) {
		logger.debug("=============");
		logger.debug("username:" + userName);
		logger.debug("password:" + password);


		// 用户admin 密码admin的用户
		if (userName.equals("admin") && password.equals("admin")) {
			// 当登录成功时，将用户信息存放到session中去
			logger.debug("用户验证成功");

			HttpSession session = request.getSession();
			session.setAttribute(LoginFilter.SEESION_MEMBER, userName);
//			ModelAndView mv = new ModelAndView(new RedirectView("index"));
			
			ModelAndView mv = new ModelAndView();

			User user = null;
			user = new User();
			user.setUserID(DaoHelper.getUUID());
			user.setUserNumber("001");
			user.setUserName("李四");
			user.setRemark("备注");
			mv.addObject(user);
			
			mv.addObject("success", true);
			
//			mv.setViewName("redirect:/index.jsp");
			mv.setViewName("index");
			logger.debug("登录成功");
			return mv;
		} else {
//			ModelAndView mv = new ModelAndView(new RedirectView("login"));
			logger.debug("登录失败1");
			ModelAndView mv = new ModelAndView();
			mv.addObject("success", false);
			
//			mv.setViewName("redirect:/login.jsp");
			mv.setViewName("login");
			logger.debug("登录失败2");
			return mv;
		}
	}

}
