<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/updateitemsSubmit.action" method="post">
<input type="hidden" name="itemsid" value="${items.itemsid }"/>
<div align="center">
修改商品
<table width="100%" border=1>
<tr>
<td>商品名称：</td>
<td><input type="text" name="itemsname" value="${items.itemsname }"/></td>
</tr>
<tr>
<td>商品价格：</td>
<td><input type="text" name="itemsprice" value="${items.itemsprice }"/></td>
</tr>
<tr>
<td>商品日期</td>
<td><input type="text" name="createtime" value="${items.createtime }"></td>
</tr>
<tr><td>商品介绍：</td>
<td><textarea rows="3" cols="40" name="itemstext">${items.itemstext}</textarea></td>
</tr>
<tr><td colspan="2" align="center"><input type="submit" value="提交"></td></tr>
</table>
</div>
</form>
</body>
</html>