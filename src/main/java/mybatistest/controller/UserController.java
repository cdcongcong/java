package mybatistest.controller;

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
import org.springframework.context.MessageSource;
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
	Logger log = Logger.getLogger(getClass());

	@Autowired
	private UserService userService;
	

	@RequestMapping(value = "/login") //, method = RequestMethod.POST)
	public ModelAndView Login(String userName, String password,HttpServletRequest request) {
		log.debug("userName:" + userName);
		log.debug("password:" + password);
//		 Locale locale = LocaleContextHolder.getLocale(); 

//		 RequestContext requestContext = new RequestContext(request);
//		 Locale locale = requestContext.getLocale();
// 		Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);  
 		LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
 		Locale locale = lr.resolveLocale(request);
		 
		 log.debug(locale);
//		logger.debug(messageSource.getMessage("Authentication.emptyPassword", null, locale));
		HttpSession session = request.getSession();
		log.debug("USER_SESSION_ID:" + session.getAttribute(HttpSessionContant.USER_SESSION_ID));

		ModelAndView mv = new ModelAndView();

		Scusers user;
		try {
			user = userService.userLogin(userName, password); 
			if (null != user) {
				log.debug("用户验证成功");
				session.setAttribute(HttpSessionContant.USER_SESSION_ID, DaoHelper.getUUID());
				session.setAttribute(HttpSessionContant.USER_ID, user.getUserid());
				mv.addObject("success", true);
				user.setPassword(null);
				mv.addObject(user);
				mv.setViewName("index");
			}
		} 
		catch(CommonException e){
			//验证未通过
			log.debug("验证未通过");
			mv.addObject("success", false);
			mv.addObject("result",messageSource.getMessage(e.getMessage(), new Object[] {userName}, locale));
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
