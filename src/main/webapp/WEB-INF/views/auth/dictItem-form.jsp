<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<style type="text/css">
th {
	width: 130px;
	font-size: 14px;
}

input {
	width: 80% !important;
	height: 30px;
}

table{
width: 100% !important;
}
</style>
</head>

<body>
	<form id="dictitem_form" method="post">
		<input type="hidden" name="id" value="${dictItem.id }" />
		<input type="hidden" name="ordernum" value="${dictItem.ordernum }" />
		<table class="tableForm" style="margin-top: 10px;width:100%;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; font-size: 14px;">字典分组</th>
				<td>${dictGroup.title }
					<input type="hidden" name="groupid" value="${dictGroup.id }" />
				</td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; font-size: 14px;">字典项<font
					style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox" style="width:200px"
									 value="${dictItem.title}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; font-size: 14px;">字典排序</th>
				<td><input type="text" name="ordernum" class="easyui-validatebox" style="width:200px"
									 value="${dictItem.ordernum}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; font-size: 14px;">字典状态</th>
				<td>
					<select id="status" name="status" style="width: 200px">
						<option value="1" <c:if test="${dictItem.status=='1'}">selected="selected"</c:if>>启用</option>
						<option value="0" <c:if test="${dictItem.status=='0'}">selected="selected"</c:if>>禁用</option>
					</select>
				</td>
			</tr>
		</table>
	</form>

</body>

</html>
