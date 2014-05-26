package mybatistest.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mybatistest.entity.Scusers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main/*")
public class MainController {
	Logger log = Logger.getLogger(getClass());
	
	@RequestMapping(value = "/top") 
	public ModelAndView GoTop(HttpServletRequest request) {
		log.debug("GoTop");
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		Scusers user;
		user = (Scusers)session.getAttribute("result");
		mv.addObject("success", true);
		mv.addObject("result",user);

		Calendar sysdate=new GregorianCalendar();
		SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日"); 
		mv.addObject("sysdate",df.format(sysdate.getTime()));
		mv.setViewName("top");
		
        return mv;		
	}

	@RequestMapping(value = "/workspace") 
	public ModelAndView GoWorkspace(HttpServletRequest request) {
		log.debug("GoWorkspace");
		ModelAndView mv = new ModelAndView();
		mv.addObject("success", true);
		mv.setViewName("workspace");
		
        return mv;		
	}
	
}
