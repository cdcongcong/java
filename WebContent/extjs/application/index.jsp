<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）:     
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>index</title>

<base href="<%=basePath%>">


<!-- ExtJS核心库及更换主题 -->
<script type="text/javascript"
	src="extjs/application/shared/include-ext.js"></script>
<script type="text/javascript"
	src="extjs/application/shared/options-toolbar.js"></script>


<!-- extjs多语言 -->
<script src="extjs/locale/ext-lang-zh_CN.js"></script>
<script src="extjs/application/locale/application-lang-zh_CN.js"></script>


<!-- index页面样式表 -->
<link rel="stylesheet" type="text/css"
	href="extjs/application/index/index.css" />

<!-- index主页面View -->
<script type="text/javascript"
	src="extjs/application/index/view/Index.js"></script>
<%
    HttpSession s = request.getSession(); 
    String userSessionID = (String) s.getAttribute("userSessionID");
    String userID = (String) s.getAttribute("userID");
%>

<script type="text/javascript">
	Ext.Loader.setConfig({
		enabled : true
	});

	Ext.Loader.setPath('Application', 'extjs/application');
		Ext.onReady(function() {
		    var userSessionID = "<%=userSessionID%>";
		    //Ext.MessageBox.alert("userSessionID",userSessionID);

		if (("" == userSessionID)||("null" == userSessionID)) {
			var loginForm = Ext.create('Application.index.view.LoginForm');
		} else {

			Ext.create('Application.index.view.Index');
		}
	});
</script>

</head>
<body>

</body>
</html>