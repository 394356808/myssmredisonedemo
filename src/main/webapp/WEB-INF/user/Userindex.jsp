<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="userdlForm" action="${pageContext.request.contextPath }/User/userlogin.action" method="post">
<div align="center">
<table>
<tr>
<td colspan="2">用户登录</td>
</tr>
<tr>
<td>用户名：</td><td><input type="text" name="username" id="username"></td>
</tr>
<tr>
<td>密 码：</td><td><input type="password" id="userpwd" name="userpwd"></td></tr>
<tr><td colspan="2"><input type="submit" value="提交"></td></tr>
</table>
</div>
</form>
</body>
</html>