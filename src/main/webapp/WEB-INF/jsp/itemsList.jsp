<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
<script type="text/javascript" src="js/selectitems.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.2.js"></script> 
<script type="text/javascript">
function ajaxTest(){  
    $.ajax({  
    data:"name="+$("#name").val(),  
    type:"POST",  
    dataType: 'json',  
    //fileElementId:'uFile',
    url:"login",  
    error:function(data){  
        alert("出错了！！:"+data.msg);  
    },  
    success:function(data){  
        alert("success:"+data.msg);  
        $("#result").html(data.msg) ;  
    }  
    });  
}  

function doUpload() {  
    var formData = new FormData($( "#uploadForm" )[0]);  
    $.ajax({  
         url: 'upload',  
         type: 'POST',  
         data: formData,  
         async: false,  
         cache: false,  
         contentType: false,  
         processData: false,  
         success: function (returndata) {  
             alert(returndata);  
         },  
         error: function (returndata) {  
             alert(returndata);  
         }  
    });  
}  
</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
查询条件：
<table width="100%" border=1>
<tr><td><input type="text" name="cxitemsname" id="cxitemsid">
<input type="button" value="查询" onClick="selectitems()">
</td>
<td><a href="${pageContext.request.contextPath }/additems.action" >添加商品</a></td>

</tr>
</table>
商品列表
 <table width="100%" border=1 id="splist">
 <tr>
 <td>商品名称：</td>
 <td>商品价格：</td>
 <td>商品日期：</td>
 <td>商品描述：</td>
 <td>操作：</td></tr>
 <c:forEach items="${itemsList }" var="item">
 <tr>
 <td>${item.itemsname }</td>
  <td>${item.itemsprice }</td>
   <td><fmt:formatDate value="${item.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
    <td>${item.itemstext}</td>
    <td><a href="${pageContext.request.contextPath }/updateitems.action?id=${item.itemsid}">修改</a>
    <a href="#" onClick="deltitems(${item.itemsid})">删除</a></td>
 </tr>
 </c:forEach>
 </table>
</form>
<input type="file" id="uFile" name="uFile"/>
    <input type="text" name="name" id="name"/>  
    <input type="submit" value="登录" onclick="ajaxTest();"/>  
    <div id="result"></div>  
    
    <form id= "uploadForm">  
      <p >指定文件名： <input type="text" name="filename" value= ""/></p >  
      <p >上传文件： <input type="file" name="file"/></ p>  
      <input type="button" value="上传" onclick="doUpload()" />  
</form> 
</body>
</html>