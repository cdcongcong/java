<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<base href="<%=basePath%>">
<title>通威物资管理系统</title>
<style>
* { margin:0 auto; padding:0; border:0;}
</style>
</head>
<frameset rows="82,*" frameborder="0" border="0" framespacing="0">
  <frame src="jsp/top.html" name="top" scrolling="No" noresize="noresize" id="top" />
  <frame src="jsp/center.html" name="center" id="center" />
  </frameset>
<noframes>
<body>

</body>
</noframes>
</html>

