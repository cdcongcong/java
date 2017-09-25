package mybatistest.utils;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class HibernateUtil {
	static Logger log = Logger.getLogger("HibernateUtil");
	
	private static final SessionFactory sessionFactory = getSessionFactory();

    public static SessionFactory getSessionFactory() {
    	//hibernate4 从上下文件中取到SessionFactory
    	//不能从hibernate4的配置中去取
    	WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
//    	String[] names = wac.getBeanDefinitionNames();
//    	for(int i=0; i<names.length; i++){	
//		log.debug("---"+names[i]);
//    	}

    	SessionFactory sf  = (SessionFactory)wac.getBean(SessionFactory.class);// .getBean("sessionFactory");  
        return sf;
    }
    
    //会在一个线程中，由spring管理事务并关闭
    public static Session getCurrentSession(){
    	return sessionFactory.getCurrentSession();
    }

    //创建了一个Session，需要自己处理事务并关闭
    public static Session openSession(){
    	return sessionFactory.openSession();
    }
    
    
}
