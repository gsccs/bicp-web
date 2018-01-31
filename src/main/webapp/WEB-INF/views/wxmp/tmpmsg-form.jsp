<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>编辑</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/easyui-lang-zh_CN.js"></script>
</head>
<style type="text/css">
input {
	width: 200px;
}

.thclass {
	height: 50px;
}
</style>

<body>

	<form id="msg_form" method="post">
		<input type="hidden" name="id" value="${terminal.id }">
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">任务节点：<font style="color: red">*</font></th>
				<td><input type="text" name="tersn" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.tersn}" /></td>
			</tr>
			<tr>
				<th style="width: 130px;text-align: right;">时间：<font style="color: red">*</font></th>
				<td><input type="text" name="orderno" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.orderno}" /></td>
			</tr>
		
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">办理地点：</th>
				<td >
					<textarea rows="" cols="" name="remark" style="width: 230px;height: 80px;">${projInfo.remark}</textarea>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>
