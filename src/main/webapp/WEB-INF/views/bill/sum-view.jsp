<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>流程定义表单</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
  <script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script> 
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
 
<style type="text/css">
th{
	font-size: 12px;
  	padding: 5px 10px;
}

.datagrid-header td{
	text-align: center;
}
</style>
</head>
<body>
	
<form id="billkm_form" action="" method="post" >
	<input type="hidden" id="id" name="id" value="${billKm.id }">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">科目名称<font style="color: red">*</font></th>
			<td>
				<input type="text" id="title" name="title" style="width:165px;" value="${billKm.title }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">科目编码<font style="color: red">*</font></th>
			<td>
				<input type="text" id="code" name="code" style="width:165px;" value="${billKm.title }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">默认金额<font style="color: red">*</font></th>
			<td>
				<input type="text" id="fee" name="fee" style="width:165px;" value="${billKm.fee }" />
			</td>
		</tr>
	 	<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">状态<font style="color: red">*</font></th>
			<td>
				<select name="status" style="width:165px;">
					<option value="1" selected="selected">是</option>
					<option value="0" >否</option>
				</select>	
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">备注说明</th>
			<td colspan="3">
				<textarea rows="" cols="" id="remark" name="remark" style="width: 300px;height:70px;">${processDef.remark}</textarea>  
			</td>
		</tr>
	</table>
</form>
</body>
</html>
