package mybatistest.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

public class BaseController {
	//国际化
	@Autowired
    protected MessageSource messageSource;

	//根据Locale得到多语言消息
	public String getMessage(String code, Object[] args, Locale locale){
		return messageSource.getMessage(code, args, locale);
	}
	//根据HttpRequest得到多语言消息
	public String getMessage(String code, Object[] args, HttpServletRequest request){
		LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
 		Locale locale = lr.resolveLocale(request);
		return messageSource.getMessage(code, args, locale);
	}
	
}
