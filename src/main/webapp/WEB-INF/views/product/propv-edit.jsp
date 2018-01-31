<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品属性值编辑</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
</head>


<style type="text/css">
input {
	width: 200px;
}
th{
	font-size: 12px;
  	padding: 5px 10px;
}

.datagrid-header td{
	text-align: center;
}
</style>

<body>
<fieldset>
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">编辑产品属性</legend>

	<form id="propv_form" method="post" >
	<input type="hidden" name="id" value="${propv.id }" />
	<input type="hidden" name="propid" value="${propv.propid }" />
	<input type="hidden" name="corpid" value="${propv.corpid }" />
	<input type="hidden" name="productid" value="${propv.productid }" />
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性名称<font
					style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox"
					 readonly="readonly" value="${propv.proptitle }" /></td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性编码<font
					style="color: red">*</font></th>
				<td><input type="text" name="propcode" class="easyui-validatebox"
					  readonly="readonly" value="${propv.propcode }" /></td>
			</tr>
			
			 <tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性值<font
					style="color: red">*</font></th>
				<td><input type="text" name="propval" class="easyui-validatebox"
					  value="${propv.propval }" /></td>
			</tr>
			<tr class="thclass" style="height: 40px">
			<th style="width: 130px;height: 50px;">备注说明</th>
			<td><textarea rows="5" cols="30" id="remark" name="remark">${product.remark}</textarea>
			</td>
		</tr>

			
			
		</table>
	</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";

window.onload = function(){ 
	var typeVal = $("#div_showtype").val();
	if(typeVal =='select'){
		document.getElementById("dictcode_div").style.display="";
	}else{
		document.getElementById("dictcode_div").style.display="none";
	}
} 

function selectFun(){
	var selectVal = document.all['showtype'].value;
	if(selectVal == 'select'){
		document.getElementById("dictcode_div").style.display="";
	}else{
		document.getElementById("dictcode_div").style.display="none";
	}
}
	

function saveProp(){
	$.ajax({
		url: basepath+'/prop/update',
		data : $("#prop_form").serialize(),
		dataType : 'json',
		type : 'POST',
	   success: function(result){
		
		 if (result.success) {
		
			}
			$.messager.show({
				title : '提示',
				msg : result.msg,
				timeout : 3000,
				showType : 'slide'
			}); 
	   }
	});
}
function BackIndex(){
	document.location = basepath+'/prop';
}
</script>
	
</body>

</html>
