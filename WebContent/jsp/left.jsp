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
body { margin:0 auto; padding:0; border:0;}
td { text-align:center;}
.style1 { font:12px "宋体"; color:#004C7E;}
a { color:#004C7E; text-decoration:none;}
a:hover { color:#FFF; text-decoration:underline;}

</style>
</head>

<body>
<table width="166" height="100%" cellpadding="0" cellspacing="0">
    <tr>
        <td align="center" valign="top" bgcolor="D4ECFC">
            <table width="162" height="100%" cellpadding="0" cellspacing="0">
              <tr>
                <td background="jsp/images/list_top.gif" height="28"></td>
              </tr>
              <tr>
                <td height="92" valign="top">
                 <table width="100%" height="40" cellpadding="0" cellspacing="0">
                   <tr>
                     <td height="20"><span class="style1">币种</span></td>
                     <td><span class="style1">买入价</span></td>
                     <td><span class="style1">卖出价</span></td>
                   </tr>
                   <tr>
                     <td height="20"><span class="style1">RMB</span></td>
                     <td><span class="style1">1895.0000</span></td>
                     <td><span class="style1">1895.0000</span></td>
                   </tr>
                 </table>
                 <table width="100%" height="52" cellpadding="0" cellspacing="0">
                   <tr>
                     <td><span class="style1">刷新</span></td>
                     <td><span class="style1">更多</span></td>
                   </tr>
                 </table>
                </td>
              </tr>
              <tr>
               <td height="25" background="jsp/images/list_task.jpg">
                 <span class="style1"><a href="#">任务管理</a></span>
               </td>
              </tr>
              <tr>
               <td height="25" style="border-bottom:1px dotted #004C7E;">
                 <span class="style1"><a href="#">已经完成交易</a></span>
               </td>
              </tr>
              <tr>
               <td height="25" style="border-bottom:1px dotted #004C7E;">
                 <span class="style1"><a href="#">到期日期</a></span>
               </td>
              </tr>
              <tr>
               <td>&nbsp;</td>
              </tr>
              <tr>
               <td height="25" background="jsp/images/list_task.jpg">
                 <span class="style1"><a href="#">公告栏</a></span>
               </td>
              </tr>
              <tr>
               <td height="25" background="jsp/images/list_task.jpg">
                <span class="style1"><a href="#">即时消息</a></span>
               </td>
              </tr>
            </table>
        </td>
    </tr>
</table>    
</body>
</html>
