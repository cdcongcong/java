<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）:     
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>">
<!-- 
<link href="css/htmlglobals.css"
    type="text/css" rel="stylesheet">
-->    
<link rel="Stylesheet"
    href="jsp/css/blafplus.css" type="text/css">

<link rel="Stylesheet" href="jsp/css/login/login.css"
    type="text/css">

<link rel="Stylesheet"
    href="jsp/css/obips.FormFields.css"
    type="text/css">

<title>登录</title>

</head>

<body>
    <table id="branding" class="branding" width="100%" border="0"
        cellpadding="0" cellspacing="0">
        <tbody>
            <tr>
                <td id="logoCell" class="logo" width="119" valign="middle"
                    height="25"><img alt="11.1.1.7.0" title="11.1.1.7.0"
                    src="/analytics/res/sk_blafp/login/oracle_logo.png" width="119"
                    border="0" height="25"></td>
                <td class="topbody bottomborder" valign="top" width="*" align="left"><span
                    id="appName" style="position: absolute; top: 2px; left: 120px;"
                    class="appname">Business Intelligence</span></td>
                <td align="right"
                    class="padding-right12 padding-left12 topbody bottomborder"
                    nowrap="nowrap"><div align="right">
                        <img src="/analytics/res/sk_blafp/login/spacer.gif" alt="X"
                            width="11" height="1"><a id="helpLink" class="pagelink"
                            href="/analytics/olh/l_zh-CN/biee0361.htm">帮助</a>
                    </div></td>
            </tr>
        </tbody>
    </table>
    <table id="content" class="stylenormal" width="100%" border="0"
        cellpadding="0" cellspacing="10" style="display: table;">
        <tbody>
            <tr>
                <td id="content-cell">
                    <div align="center" class="centerDiv">
                        <table width="180" border="0" cellpadding="0" cellspacing="0">
                            <tbody>
                                <tr>
                                    <td class="lefttop"></td>
                                    <td class="topmiddle" width="100%" height="12"></td>
                                    <td class="righttop"></td>
                                </tr>

                                <tr>
                                    <td class="leftmiddle"></td>
                                    <td class="boxcontent" width="100">

                                        <form id="logonForm" method="post" action="user/login">

                                            <table width="100%" cellpadding="0" cellspacing="0">
                                                <tbody>
                                                    <tr>
                                                        <td class="loginlabel" nowrap="nowrap">登录</td>
                                                    </tr>
                                                    <tr>
                                                        <td class="opttext" nowrap="nowrap">请输入您的用户帐号和口令。<br>
                                                            <br></td>
                                                    </tr>

                                                    <tr>
                                                        <td class="stylenormal" nowrap="nowrap">
                                                            <div class="margin-top3">
                                                                <label for="sawlogonuser">用户帐号</label><br>
                                                            </div> <input id="sawlogonuser" class="margin-top5" type="text"
                                                            name="userName" value="" size="50" style="width: 200px;">
                                                            <div class="margin-top5">
                                                                <label for="sawlogonpwd">口令 </label><br>
                                                            </div> <input id="sawlogonpwd" class="margin-top5"
                                                            type="password" name="password" size="50"
                                                            style="width: 200px;" autocomplete="off"> <input
                                                            type="hidden" name="Locale" value=""> <br> <br>
                                                            <img src="/analytics/res/sk_blafp/login/spacer.gif"
                                                            alt="X" width="5" height="10"> <input id="idlogon"
                                                            type="submit" class="button" style="width: 120px;"
                                                            onmouseover="NQWSetHasClassName(document.getElementById('idlogon'), 'buttonOver', true)"
                                                            onmouseout="NQWSetHasClassName(document.getElementById('idlogon'), 'buttonOver')"
                                                            value="登录"> <br> <br>
                                                            <br>



                                                            <hr> <label for="selectlanguage"><span
                                                                class="offScreenVPATLabel">选择语言</span></label> <img
                                                            src="jsp/pic/world_36x20.png"
                                                            style="visibility: visible;" class="defaultHidden"
                                                            width="36" align="bottom" height="20" alt="选择语言"
                                                            title="选择语言"> <select id="selectlanguage"
                                                            style="visibility: visible;" class="defaultHidden"
                                                            onchange="return onLangChange(false)">
                                                                <option value="en" locale="en-us">English</option>
                                                                <option value="zh-CN" selected="" locale="zh-cn">中文
                                                                    -Chinese</option>
                                                                
                                                        </select>



                                                        </td>
                                                    </tr>

                                                </tbody>
                                            </table>
                                        </form>
                                    </td>
                                    <td class="rightmiddle"></td>
                                </tr>
                                <tr>
                                    <td class="leftbottom"></td>
                                    <td class="bottommiddle" width="100%" height="12"></td>
                                    <td class="rightbottom"></td>
                                </tr>
                            </tbody>
                        </table>
                    </div>

                </td>
            </tr>
        </tbody>
    </table>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <table id="footer" class="footer" width="100%" border="0"
        cellpadding="0" cellspacing="0">
        <tbody>
            <tr></tr>
            <tr>
                <td id="copyRight" class="Copyright">版权所有 © 1997, 2013, Oracle
                    和/或其附属公司。保留所有权利。</td>
                <td class="padding-right12 padding-left12"><div align="right">
                        <p>
                            <a class="pagelink" id="aboutProduct"
                                href="/analytics/saw.dll?aboutPage">关于产品</a>
                        </p>
                    </div></td>
            </tr>
        </tbody>
    </table>
	
	
	
</body>
</html>