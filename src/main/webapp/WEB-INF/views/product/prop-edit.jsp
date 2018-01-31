<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品属性定义</title>
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


<form id="prop_form" method="post" >
	<input type="hidden" name="id" value="${prop.id }" />
	<input type="hidden" name="productid" value="${prop.productid}" />
	<input type="hidden" name="indexnum" value="${prop.indexnum }" />
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性名称<font
					style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox"
					 required="true" missingMessage="属性名称不能为空" value="${prop.title }" /></td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性编码<font
					style="color: red">*</font></th>
				<td><input type="text" name="propcode" class="easyui-validatebox"
					  value="${prop.propcode }" /></td>
			</tr>
			
			<%--  <tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">产品编码<font
					style="color: red">*</font></th>
				<td>
					<select id="productid" name="productid" style="width:200px;">
						
						<c:forEach var="bean" items="${ptList}" varStatus="status">
							<c:choose>
								<c:when test="${bean.id== prop.productid}">
								<option value="${bean.id }" selected="selected">${bean.title }</option>
								</c:when>
								<c:otherwise>
								<option value="${bean.id }" >${bean.title }</option>
								</c:otherwise>
							</c:choose>
							
						</c:forEach>
					</select>
				</td>
			</tr>  --%>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">属性表单类型<font
					style="color: red">*</font></th>
				<td><select id="showtype" name="showtype" onchange="selectFun()" style="width:200px;">
						<option value="text" <c:if test="${prop.showtype=='text' }">selected="selected"</c:if>>文本输入框</option>
						<option value="numberbox" <c:if test="${prop.showtype=='numberbox' }">selected="selected"</c:if>>数值输入框</option>
						<option value="datebox" <c:if test="${prop.showtype=='datebox' }">selected="selected"</c:if>>日期选择框</option>
						<option value="combobox" <c:if test="${prop.showtype=='combobox' }">selected="selected"</c:if>>下拉选择框</option>
				</select></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">数据类型<font
					style="color: red">*</font></th>
				<td>
					<select id="datatype" name="datatype" style="width:200px;">
						<option value="text">文本</option>
						<option value="date">日期</option>
						<option value="num">数字</option>
					</select>
				</td>
			</tr>
			
			<tr id="dictcode_div" class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">数据字典<font
					style="color: red">*</font></th>
				<td>
					<select id="dictcode" name="dictcode" style="width:200px;">
						<c:forEach var="bean" items="${dgtList}" varStatus="status">
							<c:choose>
								<c:when test="${bean.id== prop.dictcode}">
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


			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">状态</th>
				<td colspan="3" style="width: 130px;">
				<select name="state" style="width:200px;">
					<option value="1"
						<c:if test="${prop.status=='1' }"> selected="selected"</c:if>>正常</option>
					<option value="0"
						<c:if test="${prop.status=='0' }"> selected="selected"</c:if>>禁用</option>
				</select>
				</td>
			</tr>
			<!-- <tr>
				<td colspan="2" style="text-align: right">
					<a id="saveTopicBtn"
						class="easyui-linkbutton" data-options="iconCls:'icon-add'"
						href="javascript:" onclick="saveProp();">保存</a> 
					<a id="btnBack" class="easyui-linkbutton" data-options="iconCls:'icon-back'"
						href="javascript:" onclick="BackIndex()">返回</a>
			</tr> -->
			

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
