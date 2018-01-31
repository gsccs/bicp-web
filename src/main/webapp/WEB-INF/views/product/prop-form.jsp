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

<style>
input {
	width: 200px;
}
</style>

<body>
	<form id="prop_form" method="post" >
		<input type="hidden" name="id" value="${prop.id }" />
		<table class="tableForm" style="margin-top: 10px;">
			<tr>
				<th style="width: 130px; text-align: right;">属性名称<font
					style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox"
					class="easyui-validatebox " required="true"
					missingMessage="属性名称不能为空" value="${prop.title }" /></td>
			</tr>
			<tr>
				<th style="width: 130px; text-align: right;">属性表单类型<font
					style="color: red">*</font></th>
				<td><select id="showtype" name="showtype">
						<option value="text">文本输入框</option>
						<option value="numberbox">数值输入框</option>
						<option value="datebox">日期选择框</option>
						<option value="combobox">下拉选择框</option>
				</select></td>
			</tr>
			<tr>
				<th style="width: 130px; text-align: right;">数据字典<font
					style="color: red">*</font></th>
				<td><select id="dictcode" name="dictcode">
						<c:forEach items="${dictgrouplist }" var="dictgroup">
						<option value="${dictgroup.code }">${dictgroup.title }</option>
						</c:forEach>
						<option value="10008">数据组2</option>
				</select></td>
			</tr>

			<tr>
				<th style="width: 130px; text-align: right;">默认值<font
					style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox"
					class="easyui-validatebox " required="true"
					missingMessage="企业名称不能为空" value="${company.title }" /></td>
			</tr>

			<tr class="thclass" style="height: 40px">
				<th style="width: 130px; text-align: right;">状态</th>
				<td colspan="3">
				<select name="state">
					<option value="1"
						<c:if test="${prop.status=='1' }"> selected="selected"</c:if>>正常</option>
					<option value="0"
						<c:if test="${prop.status=='0' }"> selected="selected"</c:if>>禁用</option>
				</select></td>
			</tr>

			<tr>
				<th style="width: 130px; text-align: right;">属性描述</th>
				<td colspan="3"><textarea style="width: 350px;" rows="3"
						cols="25" name="remark">${prop.remark }</textarea></td>
			</tr>

		</table>
	</form>

	
</body>

</html>
