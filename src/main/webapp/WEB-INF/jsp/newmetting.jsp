<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新建会议</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.2.js"></script>
<script type="text/javascript">
function checkmett(){
	var name=$("#metttitle").val();
	var id=$("#id").val();
	if(name==null && name==""){
		alert("请输入会议名称");
	}else{
		if(isNaN(id)){
			alert("请输入数字");
		}else{
			$('form1').submit();
		}
	}
}
</script>
</head>
<body>
<form action="${ctx }/Mett/addmetting" name="form1" id="form1" method="post">
<div style="font-size:40;bgcolor:#79CDCD">新建会议</div>
<table>
<tr><td>会议名称:</td><td><input type="text" name="metttitle" id="name" ></td><td><font color="red">*必填</font></td></tr>
<tr><td>会议说明:</td><td><input type="text" name="metttext" id="take"></td><td></td></tr>
<tr><td>会议id:</td><td><input type="text" name="mettid" id="id"></td><td><font color="red">*必填企业号中的应用ID</font></td></tr>
<tr><td>会议时间:</td><td><input type="text" name="metttime" id="time"></td><td></td></tr>
<tr><td colspan=3><button onclick="checkmett()">提交</button></td></tr></table>
</form>
</body>
</html>