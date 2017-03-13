<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传图片</title>
</head>
<body>
<form id="itemForm" action="filefilap.action" method="post" enctype="multipart/form-data">
<div>图片上传</div>
<c:if test="${item.pic!=null }">
<img src="/pic/${item.pic }" width=100 height=100/>
<br/>
</c:if>
<input type="file" name="items_pic"/>
<input type="submit" value="提交"/>
</form>
</body>
</html>