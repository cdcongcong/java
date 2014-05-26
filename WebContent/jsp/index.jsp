<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="includeJsp.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<base href="<%=basePath%>" />
<link href="jsp/style/index.css" rel="stylesheet" type="text/css" />

<title>通威物资管理系统</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<div id="banner">
				<div id="companylogo"></div>
				<div id="bannerright">
					<div id="sysdate">今天是 ${sysdate}</div>
					<div id="applicationname">通威物资管理系统</div>
					<div id="sys_menu" class="sys_menu">
						<ul>
							<li><a href="#"><span>个人用户管理</span></a></li>
							<li><a href="#"><span>首页</span></a></li>
							<li><a href="#"><span>后退</span></a></li>
							<li><a href="#"><span>前进</span></a></li>
							<li><a href="#"><span>刷新</span></a></li>
							<li><a href="#"><span>退出</span></a></li>
						</ul>
					</div>
				</div>
			</div>
			<div id="main_menu_div">
				<div id="main_menu_user" class="main_menu_user">
					<p>当前用户：${result.username}</p>
				</div>
				<div id="main_menu_list" class="main_menu_list">
					<ul>
						<li><a href="#"><span>查询业务</span></a></li>
						<li><a href="#"><span>出口业务</span></a></li>
						<li><a href="#"><span>打印管理</span></a></li>
						<li><a href="#"><span>公共管理</span></a></li>
						<li><a href="#"><span>静态数据</span></a></li>
						<li><a href="#"><span>收单行业务</span></a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="pagebody">
			<div id="leftsidebar">
				<div id="functionmenutop"></div>
				<div id="functionmenubody">
				    <div id="functionmenubodytop"></div>
					<div class="functionmenutitle">
						基础数据
					</div>
					<div class="functionMenuitem"><a href="#">物资类别</a></div>
                    <div class="functionMenuitem"><a href="#">物资属性</a></div>
                    <div class="functionMenuitem"><a href="#">物资信息</a></div>
                    <div class="functionMenuitem"><a href="#">物资查询</a></div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>

