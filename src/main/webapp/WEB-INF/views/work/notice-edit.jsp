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

	<form id="notice_editForm" method="post">
		<input type="hidden" name="id" value="${worknotice.id }">
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 30px;">标题<font style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox"
					  size="28"
					value="${worknotice.title}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 30px;">内容<font style="color: red">*</font></th>
				<td>
					<textarea rows="" cols="" name="content" class="easyui-validatebox"
					  >${worknotice.content}</textarea>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>
