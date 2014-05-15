package mybatistest.utils;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

public class I18nUtil {
	//国际化
	private static final MessageSource messageSource = getMessageSource();

	public static MessageSource getMessageSource(){
    	WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
    	MessageSource ms  = (MessageSource)wac.getBean(MessageSource.class);
    	return ms;
	}

	//根据Locale得到多语言消息
	public static String getMessage(String code, Object[] args, Locale locale){
		return messageSource.getMessage(code, args, locale);
	}
	//根据HttpRequest得到多语言消息
	public static String getMessage(String code, Object[] args, HttpServletRequest request){
		LocaleResolver lr = RequestContextUtils.getLocaleResolver(request);
 		Locale locale = lr.resolveLocale(request);
		return messageSource.getMessage(code, args, locale);
	}
	
}
