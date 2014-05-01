package mybatistest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;
import mybatistest.servlet.Contants;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController {
	Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(String userName, String password,HttpServletRequest request) {
		logger.debug("userName:" + userName);
		logger.debug("password:" + password);

		ModelAndView mv = new ModelAndView();

		// 用户admin 密码admin的用户
		if (userName.equals("admin") && password.equals("admin")) {
			// 当登录成功时，将用户信息存放到session中去
			logger.debug("用户验证成功");

			HttpSession session = request.getSession();
			logger.debug("USER_SESSION_ID:" + session.getAttribute(Contants.USER_SESSION_ID));
			
			session.setAttribute(Contants.USER_SESSION_ID, DaoHelper.getUUID());
			session.setAttribute(Contants.USER_ID, userName);
			

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

	@RequestMapping(value = "/submit")
	//, method = RequestMethod.POST)
	public ModelAndView submit(String userName, String password, String redirectURL,
			HttpServletRequest request) {
		return null;
	}

}
