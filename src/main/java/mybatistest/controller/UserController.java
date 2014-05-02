package mybatistest.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybatistest.entity.User;
import mybatistest.service.UserService;
import mybatistest.utils.DaoHelper;
import mybatistest.common.contant.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;


@Controller
@RequestMapping("/user/*")
public class UserController extends BaseController {
	Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	//国际化
	@Autowired
    private ReloadableResourceBundleMessageSource resourceBundleMessageSource;


	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(String userName, String password,HttpServletRequest request) {
		logger.debug("userName:" + userName);
		logger.debug("password:" + password);
//		 Locale locale = LocaleContextHolder.getLocale(); 

//		 RequestContext requestContext = new RequestContext(request);
//		 Locale locale = requestContext.getLocale();
// 		Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);  
 		LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
 		Locale locale = lr.resolveLocale(request);
		 
		 logger.debug(locale);
		logger.debug(resourceBundleMessageSource.getMessage("Authentication.emptyPassword", null, locale));
		HttpSession session = request.getSession();
		logger.debug("USER_SESSION_ID:" + session.getAttribute(HttpSessionContant.USER_SESSION_ID));

		ModelAndView mv = new ModelAndView();

		// 用户admin 密码admin的用户
		if (userName.equals("admin") && password.equals("admin")) {
			// 当登录成功时，将用户信息存放到session中去
			logger.debug("用户验证成功");

//			HttpSession session = request.getSession();
//			logger.debug("USER_SESSION_ID:" + session.getAttribute(HttpSessionContant.USER_SESSION_ID));
			
			session.setAttribute(HttpSessionContant.USER_SESSION_ID, DaoHelper.getUUID());
			session.setAttribute(HttpSessionContant.USER_ID, userName);

			mv.addObject("success", true);
			
			mv.setViewName("index");
			return mv;
		} else {
			logger.debug("登录失败1");
			mv.addObject("success", false);
			mv.addObject("result",resourceBundleMessageSource.getMessage("Authentication.emptyPassword", null, locale));
			mv.setViewName("login");
			logger.debug("登录失败2");
			return mv;
		}
	}

	
    @RequestMapping("/changeLocale")
    public String changeLocale(Locale locale,HttpServletRequest request,
    		HttpServletResponse response)
    {
//        Locale l = LocaleContextHolder.getLocale(); 
//
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver (request); 
//      String language = request.getParameter("language");  
//      Locale locale1 =  StringUtils.parseLocaleString (language); 
        

//        SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME;





        localeResolver.setLocale(request, response, locale);
        return "redirect:/demo/index.do";
    }

	
	
	@RequestMapping(value = "/submit")
	//, method = RequestMethod.POST)
	public ModelAndView submit(String userName, String password, String redirectURL,
			HttpServletRequest request) {
		return null;
	}

}
