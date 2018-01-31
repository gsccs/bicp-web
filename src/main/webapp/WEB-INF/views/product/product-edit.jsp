<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信息化产品编辑</title>
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
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">编辑产品</legend>
<form id="product_form" action="" method="post">
	<input type="hidden" name="id" value="${product.id }">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">产品名称<font style="color: red">*</font></th>
			<td><input type="text" id="title" name="title" class="easyui-validatebox"
					required="true" missingMessage="不能为空"
					value="${product.title}" />
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">使用状态</th>
				<td>
				<select name="status">
					<option value="1" <c:if test="${product.status=='1' }"> selected="selected"</c:if>>使用</option>
					<option value="0" <c:if test="${product.status=='0' }"> selected="selected"</c:if>>废弃</option>
				</select>		
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">是否参与摸底产品</th>
				<td>
				<select name="ismodi">
					<option value="1" <c:if test="${product.ismodi=='1' }"> selected="selected"</c:if>>是</option>
					<option value="0" <c:if test="${product.ismodi=='0' }"> selected="selected"</c:if>>否</option>
				</select>		
				</td>
		</tr>
			
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">是否成员营销产品</th>
				<td>
				<select name="issem">
					<option value="1" <c:if test="${product.issem=='1' }"> selected="selected"</c:if>>正常</option>
					<option value="0" <c:if test="${product.issem=='0' }"> selected="selected"</c:if>>下线</option>
				</select>		
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;height: 50px;">备注说明</th>
			<td><textarea rows="5" cols="30" id="remark" name="remark">${product.remark}</textarea>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: right">
				<a id="saveTopicBtn"
					class="easyui-linkbutton" data-options="iconCls:'icon-add'"
					href="javascript:" onclick="saveProdect();">保存</a> 
				<a id="btnBack" class="easyui-linkbutton" data-options="iconCls:'icon-back'"
					href="javascript:" onclick="BackIndex()">返回</a>
		</tr>
	</table>
</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";

function saveProdect(){
	$.ajax({
		url: basepath+'/product/update',
		data : $("#product_form").serialize(),
		dataType : 'json',
		type : 'POST',
	   success: function(result){
		
		 if (result.success) {
			 $("#title").val("");
			 $("#remark").val("");
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
	document.location = basepath+'/product';
}
	
	
</script>
</body>
</html>
