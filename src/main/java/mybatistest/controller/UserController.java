package mybatistest.controller;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;
import mybatistest.common.contant.*;
import mybatistest.common.exception.CommonException;
import mybatistest.entity.Scusers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.sun.org.apache.bcel.internal.generic.NEW;


@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController {
	Logger log = Logger.getLogger(getClass());

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login") //, method = RequestMethod.POST)
	public ModelAndView Login(String userName, String password,HttpServletRequest request) {
		log.debug("userName:" + userName);
		log.debug("password:" + password);

		HttpSession session = request.getSession();
		log.debug("AUTHENTICATION_SESSION_ID:" + session.getAttribute(HttpSessionContant.AUTHENTICATION_SESSION_ID));

		ModelAndView mv = new ModelAndView();

		Scusers user;
		try {
			user = userService.userLogin(userName, password); 
			if (null != user) {
				log.debug("用户验证成功");
				session.setAttribute(HttpSessionContant.AUTHENTICATION_SESSION_ID, DaoHelper.getUUID());
				session.setAttribute(HttpSessionContant.AUTHENTICATION_ID, user.getUserid());
				session.setAttribute(HttpSessionContant.AUTHENTICATION_NO, user.getUserno());
				session.setAttribute(HttpSessionContant.AUTHENTICATION_NAME, user.getUsername());
				session.setAttribute("result", user);
				session.setAttribute("sysdate", new Date().toString());
				mv.addObject("success", true);
				mv.addObject("result",user);
//				mv.addObject("sysdate",new Date().toString());
				//重定向到主页
				mv.setViewName("redirect:/jsp/index.jsp");
			}
		} 
		catch(CommonException e){
			//验证未通过
			log.debug("验证未通过");
			mv.addObject("success", false);

//			LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
//	 		Locale locale = lr.resolveLocale(request);
//			mv.addObject("result",messageSource.getMessage(e.getMessage(), new Object[] {userName}, locale));
//			mv.addObject("result",I18nUtil.getMessage(e.getMessage(), new Object[] {userName}, request));
	 		mv.addObject("result",getMessage(e.getMessage(), new Object[] {userName}, request));
			mv.setViewName("login");
			
		}
		catch (Exception e) {
			// 其他异常
			log.debug("Login异常");
			mv.addObject("success", false);
			mv.addObject("result",e.getMessage());
			mv.setViewName("login");
			e.printStackTrace();
		}
		return mv;
	}


	@RequestMapping(value = "/loginout")
	//, method = RequestMethod.POST)
	public ModelAndView loginout(
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		session.removeAttribute(HttpSessionContant.AUTHENTICATION_SESSION_ID);
		session.removeAttribute(HttpSessionContant.AUTHENTICATION_ID);
		session.removeAttribute(HttpSessionContant.AUTHENTICATION_NO);
		session.removeAttribute(HttpSessionContant.AUTHENTICATION_NAME);

		mv.addObject("success", true);
		mv.setViewName("login");
		
		return mv;
	}
	
	
	
    @RequestMapping("/changeLocale")
    public ModelAndView changeLocale(HttpServletRequest request,
    		HttpServletResponse response)
    {
 		LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
 		Locale locale = lr.resolveLocale(request);
    	log.debug(locale);
    	lr.setLocale(request, response, locale);
    	ModelAndView mv = new ModelAndView();
		mv.addObject("success", true);
		mv.setViewName("login");
        return mv;
    }

	
	

}
