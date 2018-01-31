<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ICT项目添加</title>
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
input {
	width: 200px;
}

.thclass {
	height: 50px;
}
</style>

<body>
	<form id="prog_form" action="" method="post">
		<input type="hidden" name="id" value="${projprog.id }">
		<input type="hidden" name="projectid" value="${projectid }">
		<table class="tableForm" style="margin-top: 10px;">
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">项目进度：<font style="color: red">*</font></th>
				<td><input type="text" name="progress" class="easyui-numberbox"  missingMessage="进度只能为数值"
					  size="28"
					value="${projprog.progress}" />%</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">添加时间：<font style="color: red">*</font></th>
				<td>
					<input class="easyui-datebox" 
					id="addtime" name="addtime" data-options="showSeconds:true "
					 value="${projprog.addtime}"/>
				</td>
			</tr> 
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">情况说明：</th>
				<td>
					<textarea rows="" cols="" name="remark" style="width: 230px;height: 80px;">${ictproj.remark}</textarea>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>