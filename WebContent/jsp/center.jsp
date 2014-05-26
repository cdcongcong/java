<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="includeJsp.jsp"%> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<base href="<%=basePath%>"/>
<title>无标题文档</title>
<style type="text/css">
<!--
body { margin:0 auto; padding:0;}
-->
</style>
<style> 
.navPoint { 
color:white; cursor:hand; font:12px "宋体";} 
</style> 
<script>
function switchSysBar(){ 
var locate=location.href.replace('jsp/middel.jsp','');
var ssrc=document.all("img1").src.replace(locate,'');
if (ssrc=="jsp/images/list_button.gif")
{ 
document.all("img1").src="jsp/images/list_button_r.gif";
document.all("frmTitle").style.display="none" 
} 
else
{ 
document.all("img1").src="jsp/images/list_button.gif";
document.all("frmTitle").style.display="" 
} 
} 
</script>
</head>

<body style="overflow:hidden">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="table-layout:fixed;">
  <tr>
    <td width="162" id=frmTitle noWrap name="fmTitle" align="center" valign="top">
       <iframe name="I1" height="100%" width="162" src="jsp/left.jsp" border="0" frameborder="0" scrolling="no"> 此网页使用了框架,但您的浏览器不支持框架，请升级您的浏览器。</iframe></td>
    <td width="4" style="width:4px;"valign="middle" bgcolor="004C7E" onclick=switchSysBar()><span class=navPoint 
id=switchPoint title="打开/关闭左栏"><img src="images/list_button.gif" name="img1" width=4 height=40 id=img1></span></td>
    <td width="5"></td>
    <td align="center" valign="top"><iframe name="I2" height="100%" width="100%" frameborder="0" src="jsp/right.jsp"> 此网页使用了框架,但您的浏览器不支持框架，请升级您的浏览器。</iframe></td>
  </tr>
</table>
</body>
</html>
