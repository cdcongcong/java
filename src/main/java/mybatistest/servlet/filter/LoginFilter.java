package mybatistest.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mybatistest.common.contant.*;


import org.apache.log4j.Logger;

public class LoginFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
//		chain.doFilter(request, response);
		Logger logger = Logger.getLogger(getClass());
		
		// 获得在下面代码中要用的request,response,session对象
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		String ContextPath = servletRequest.getContextPath();
		logger.debug("ContextPath:" + ContextPath);

		String url = servletRequest.getRequestURL().toString();
		logger.debug("url:" + url);
		
		// 获得用户请求的URI
		String path = servletRequest.getRequestURI();
		logger.debug("path:" + path);

		// 从session里取员工工号信息
		String sessionID = (String) session.getAttribute(HttpSessionContant.AUTHENTICATION_SESSION_ID);

		/*
		 * 创建类Constants.java，里面写的是无需过滤的页面 for (int i = 0; i <
		 * Constants.NoFilter_Pages.length; i++) {
		 * 
		 * if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		 * chain.doFilter(servletRequest, servletResponse); return; } }
		 */

		// 登陆页面无需过滤
		if (path.indexOf("/login.jsp") > -1) {
			chain.doFilter(request, response);
			logger.debug("到登录页面");
			return;
		}

		if (path.indexOf("/user/login") > -1) {
			chain.doFilter(request, response);
			logger.debug("到登录控制器");
			return;
		}

		// 判断如果没有取到员工信息,就跳转到登陆页面
		if (sessionID == null || "".equals(sessionID)) {
			// 跳转到登陆页面
//			servletResponse.sendRedirect("/login.jsp");
			logger.debug("没有登录过，到登录页面");
//			request.getRequestDispatcher(ContextPath + "/login.jsp").forward(request, response);
			servletResponse.sendRedirect(ContextPath + "/jsp/login.jsp");

		} else {
			logger.debug("已经登陆,继续此次请求");
			// 已经登陆,继续此次请求
			chain.doFilter(request, response);
		}

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
