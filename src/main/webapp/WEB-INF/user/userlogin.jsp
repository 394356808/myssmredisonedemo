<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<div align="center">
<form id="userForm" action="${pageContext.request.contextPath }/User/addUserSubim.action" method="post">
<h3><b>用户注册</b></h3>
<table>
<tr>
<td>用户名：</td><td><input type="text" id="name" name="username"/></td>
</tr>
<tr><td>密 码：</td><td><input type="password" id="pwd" name="userpwd"></td></tr>
<tr><td>性别：</td><td><input type="text" id="sex" name="sex"></td>
</tr> 
<tr><td>年龄：</td><td><input type="text" id="age" name="age"></td></tr>
<tr><td>邮箱：</td><td><input type="text" id="emil" name="emil"></td>
<tr><td colspan="2" align="center"><input type="submit" value="提交"></td></tr>
</table>
</form>
</div>
</body>
</html>