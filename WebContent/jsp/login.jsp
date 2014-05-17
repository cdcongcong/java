<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<title>登录</title>


</head>
<style>
* { margin:0 auto; padding:0; border:0;}
body { background:#0462A5; font:14px "宋体"; color:#004C7E;}
input { border:1px solid #004C7E;}
.main { background:url(jsp/images/bg.jpg) repeat-x; height:800px;}
.login { background:#DDF1FE; width:468px; height:262px; border:1px solid #000;}
.top { background:url(jsp/images/login_bg.jpg) repeat-x; width:464px; height:113px; border:1px solid #2376B1; margin-top:1px;}
.logo { background:url(jsp/images/logo.gif) no-repeat; width:214px; height:42px; float:left; margin:29px 0 0 14px;}
.lable { background:url(jsp/images/lable.gif) no-repeat; width:157px; height:32px; float:right; margin:81px 31px 0 0;}
.submit { background:url(jsp/images/submit.gif) no-repeat; width:71px; height:24px; border:0;} 
.reset { background:url(jsp/images/reset.gif) no-repeat; width:71px; height:24px; border:0;} 
</style>
<body>
<table width="100%" class="main" cellpadding="0" cellspacing="0">
  <tr>
   <td>
    <div class="login">
     <div class="top">
      <div class="logo"></div>
      <div class="lable"></div>
     </div>
     <table width="468" cellpadding="0" cellspacing="0">
       <tr>
         <td width="282" style="padding-top:17px;">
          <form id="logonForm" method="post" action="user/login">
           <table width="100%" cellpadding="0" cellspacing="0">
             <tr>
               <td align="right" height="27">用户</td>
               <td align="right" width="161"><input style="height:22px" type="text" id="user" name="userName"/></td>
             </tr>
             <tr>
               <td align="right" height="27">密码</td>
               <td align="right" width="161" height="32"><input style="height:22px" type="text" id="password" name="password"/></td>
             </tr>
             <tr>
               <td align="right" height="27">选择语言</td>
               <td align="right" width="161"><input style="height:22px" type="text" id="branch" /></td>
             </tr>
           </table>
           </form>
         </td>
         <td style="padding-top:30px;">
           <table width="100%" cellpadding="0" cellspacing="0">
             <tr><td align="center" height="29"><input name="submit" type="submit" value="" class="submit" onclick="document.forms[0].submit();" /></td></tr>
             <tr><td align="center" height="29"><input name="reset" type="button" class="reset" /></td></tr>
           </table>
         </td>
       </tr>
     </table>
     <table width="100%" cellpadding="0" cellspacing="0" style="margin-top:28px;">
       <tr>
         <td align="center">Conpyright 2014 tongwei Co.Ltd</td>
       </tr>
     </table>
    </div><!--login -->
   </td>
  </tr>  
</table>
</body>
</html>
