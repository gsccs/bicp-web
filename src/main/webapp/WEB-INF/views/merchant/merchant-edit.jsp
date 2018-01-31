<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>客户信息添加</title>
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
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">添加客户信息</legend>
<form id="corp_form" action="" method="post">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">集团编码<font style="color: red">*</font></th>
			<td><input type="text" id="ispcode" name="ispcode" class="easyui-validatebox"
					readonly="readonly" value="${corp.ispcode }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">集团名称<font style="color: red">*</font></th>
			<td><input type="text" id="title" name="title" class="easyui-validatebox"
					required="true" missingMessage="不能为空"
					value="${corp.title }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">联系人</th>
			<td><input type="text" id="linker" name="linker" maxlength="200"
					value="${corp.linker }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">联系电话</th>
			<td><input type="text" id="phone" name="phone" maxlength="200" value="${corp.phone }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">详细地址</th>
			<td><input type="text" id="address" name="address" value="${corp.address }" maxlength="200"/>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">所在地域<font style="color: red">*</font></th>
			<td><input type="text" id="areaid" name="acode" class="easyui-validatebox" value="${corp.acode }" />
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">客户经理<font style="color: red">*</font></th>
			<td>
				<select id="amuserid" name="amuserid">
					<c:forEach items="${userList }" var="user">
					<option value="">----请选择----</option>
					<option value="${user.id }" <c:if test="${user.id==corp.amuserid }">selected="selected"</c:if>>${user.title }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		
		<tr>
			<td colspan="2" style="text-align: right">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-add'"
					href="javascript:" onclick="saveCorp();">保存</a> 
				<a  class="easyui-linkbutton" data-options="iconCls:'icon-back'"
					href="javascript:" onclick="BackIndex()">返回</a>
		</tr>
	</table>
</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";
$(document).ready(function(){
	$('#areaid').combotree({
	    url: basepath+'/area/tree',
	    valueField:'code',
	    textField:'name',
	    method:'post'
	}); 
});	
function saveCorp(){
	var valid = $("#corp_form").form('validate');
	if(!valid){
		return;
	}
	$.ajax({
		url: basepath+'/corp/update',
		data : $("#corp_form").serialize(),
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
			   self.location = basepath+'/corp';
		   }
	   }
	});
}
	
function BackIndex(){
	self.location= basepath+'/corp';
}
	
</script>
</body>
</html>
