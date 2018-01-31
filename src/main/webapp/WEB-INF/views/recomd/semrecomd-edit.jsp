<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>走访信息推荐产品编辑</title>
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


<form id="recomd_form" method="post" >
	<input type="hidden" name="id" value="${recomd.id }" />
	<input type="hidden" name="reportid" value="${recomd.reportid}" />
	<input type="hidden" name="productid" value="${recomd.productid }" />
	<input type="hidden" name="amuserid" value="${recomd.amuserid }" />
	<input type="hidden" name="corpid" value="${recomd.corpid }" />
		<table class="tableForm" style="margin-top: 10px;">
			
			
			<tr id="dictcode_div" class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">推荐结果<font
					style="color: red">*</font></th>
				<td>
					<select id="remresult" name="remresult" style="width:200px;">
						<c:forEach var="bean" items="${itemList}" varStatus="status">
							<c:choose>
								<c:when test="${bean.id== recomd.remresult}">
								<option value="${bean.id }" selected="selected">${bean.title }</option>
								</c:when>
								<c:otherwise>
								<option value="${bean.id }" >${bean.title }</option>
								</c:otherwise>
							</c:choose>
						</c:forEach>
					</select>
				</td>
			</tr>


		</table>
	</form>
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
		   $.messager.show({
				title : '提示',
				msg : result.msg,
				timeout : 3000,
				showType : 'slide'
			}); 
		 	if (result.success) {
		 		document.location = basepath+'/report/item';
			}
	   }
	});
}
function BackIndex(){
	document.location = basepath+'/report/item';
}
</script>
	
</body>

</html>
