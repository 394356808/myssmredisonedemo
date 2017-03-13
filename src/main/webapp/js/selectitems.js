function selectitems(){
	var temp=$("#cxitemsid").val();
	var reg=/^[-\+]?\d+(\.\d+)?$/;
	var a = /^(\d{4})-(\d{2})-(\d{2})$/;
	if(reg.test(temp)){
		alert("是double");
	}else{if(RQcheck(temp)){
		alert("是日期");
	}else{
		alert("是字符串");
	}
	}
}
function RQcheck(RQ) {
    var date = RQ;
    var result = date.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/);

    if (result == null)
        return false;
    var d = new Date(result[1], result[3] - 1, result[4]);
    return (d.getFullYear() == result[1] && (d.getMonth() + 1) == result[3] && d.getDate() == result[4]);

}
function deltitems(id){
	$.ajax({
		url:"deletcitems.action",
		type:"post",
		dataType:"json",
		data:{id: id},
		success:function(data){
		 var myobj=eval(data);
		 //var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
		 var obj="<tr><td>商品名称：</td><td>商品价格：</td><td>商品日期：</td><td>商品描述：</td><td>操作：</td></tr>";
		 var temp1="";
		 for(var i=0;i<myobj.length;i++){
		 var temp="<tr><td>"+myobj[i].itemsname +"</td><td>"+myobj[i].itemsprice +"</td><td>"+myobj[i].createtime +
		 "</td><td>"+myobj[i].itemstext+"</td><td><a href='updateitems.action?id="+myobj[i].itemsid+
		 "'>修改</a><a href='#' onClick='deltitems("+myobj[i].itemsid+")'>删除</a></td></tr>"
		 temp1+=temp;
		 }
		 obj+=temp1;
		 $("#splist").html(obj);
		}
	});
}
function huidiaohangshu(data){
	alert("data");
}