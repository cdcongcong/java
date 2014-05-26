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

<style>
* { margin:0 auto; padding:0; border:0;}
body { font:12px "宋体"; color:#FFF;}
.lable { background:url(jsp/images/top_lable.jpg) no-repeat; width:126px; height:28px; float:left;}
 .lable p { margin-top:8px;}
.menu { background:url(jsp/images/top_menu.jpg) no-repeat; width:348px; height:28px; float:right;}
 .menu ul { margin:8px 0 0 45px; list-style:none;}
 .menu li { display:inline;}
 .menu a { float:left; text-decoration:none; padding-left:2px;}
 .menu a:hover {text-decoration:none;}
 .menu a span { display:block; padding-right:10px; color:#FFF; }
 .menu a:hover span { color:#004c7e; }
.menu_left { background:url(jsp/images/menu_left.jpg) no-repeat; width:155px; height:22px; float:left; margin:3px 0 0 6px; text-align:center;}
 .menu_left p { margin-top:5px;} 
.menu_list { width:100%; height:25px;}
  .menu_list ul { margin:0; padding:4px 0 0 70px; list-style:none; }
    .menu_list li { display:inline; }
    .menu_list a { float:left; text-decoration:none; }
    .menu_list a span { display:block; padding:4px 10px 0 10px; color:#004c7e; }
    .menu_list a:hover span { color:#FFF; border:1px solid #004c7e;}
   .menu_list a:hover { background:url(jsp/images/menu_list.jpg) repeat-x; }
</style>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td background="jsp/images/top_bg.jpg" width="289" height="57">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="jsp/images/top_lf.jpg" /></td>
        </tr>
      </table>
    </td>
    <td background="jsp/images/top_bg.jpg">
     <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="29">今天是 ${sysdate} </td>
      </tr>
      <tr>
        <td width="50%" height="28">
          <div class="lable">
           <p>通威物资管理系统</p>
          </div>
         </td>
        <td>
          <div class="menu">
           <ul>
             <li><a href="#"><span>个人用户管理</span></a></li>
             <li><a href="#"><span>首页</span></a></li>
             <li><a href="#"><span>后退</span></a></li>
             <li><a href="#"><span>前进</span></a></li>
             <li><a href="#"><span>刷新</span></a></li>
             <li><a href="#"><span>退出</span></a></li>
           </ul>
          </div>
        </td>
        <td width="18"></td>
       </tr>
      </table>
    </td>
      </tr>
    </table>
   <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td background="jsp/images/menu_bg.jpg" width="165">
        <div class="menu_left">
         <p>当前用户：${result.username} </p>
        </div>
    </td>
    <td background="jsp/images/menu_bg.jpg">
     <div class="menu_list">
      <ul>
        <li><a href="#"><span>查询业务</span></a></li>
        <li><a href="#"><span>出口业务</span></a></li>
        <li><a href="#"><span>打印管理</span></a></li>
        <li><a href="#"><span>公共管理</span></a></li>
        <li><a href="#"><span>静态数据</span></a></li>
        <li><a href="#"><span>收单行业务</span></a></li>
      </ul>
     </div>
    </td>
  </tr>
</table>    

</body>
</html>
