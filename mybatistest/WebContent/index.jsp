<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hell world!</title>
</head>
<body>
	${message}

	<form name="loginform" action="user/login" method="post">

		名称 <input type="text" name="userName" value="${status.value}" /> <font
			color="red"><c:out value="${status.errorMessage}" /></font> <br />


		密码 <input type="password" name="password" value="${status.value}" />
		<font color="red"><c:out value="${status.errorMessage}" /></font> <br />
		<br /> <input type="submit" value="确定" />
	</form>

</body>
</html>