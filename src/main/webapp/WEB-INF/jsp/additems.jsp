<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
</head>
<body>
<div align="center">
<form id="itemForm" action="${pageContext.request.contextPath }/additemsSubmit.action" method="post">
<h3><b>添加商品</b></h3>
<table>
<tr>
<td>商品名称：</td><td><input type="text" id="name" name="itemsname"/></td>
</tr>
<tr><td>商品价格：</td><td><input type="text" id="price" name="itemsprice"></td></tr>
<tr><td>上产日期：</td><td><input type="text" id="createtime" name="createtime"></td>
</tr> 
<tr><td>商品描述：</td><td><input type="text" id="itemstext" name="itemstext"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="提交"></td></tr>
</table>
</form>
</div>

</body>
</html>