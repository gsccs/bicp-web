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
	height: 50px;
}

.thclass {
	height: 50px;
}
</style>

<body>

	<form id="terminal_form" method="post" >
		<input type="hidden" name="id" value="${terminal.id }">
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">设备序列号：<font style="color: red">*</font></th>
				<td><input type="text" name="tersn" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.tersn}" /></td>
				<th style="width: 130px;text-align: right;">采购订单号：<font style="color: red">*</font></th>
				<td><input type="text" name="orderno" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.orderno}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">终端品牌：<font style="color: red">*</font></th>
				<td>
					<select id="brands" name="brands" class="textbox textbox_indent">
						<option value="1002" <c:if test="${terminal.brands=='1002' }">selected="selected"</c:if>>联迪</option>
						<option value="1003" <c:if test="${terminal.brands=='1003' }">selected="selected"</c:if>>新大陆</option>
						<option value="1004" <c:if test="${terminal.brands=='1004' }">selected="selected"</c:if>>商米</option>
					</select>
				</td>
				<th style="width: 130px;text-align: right;">型号：<font style="color: red">*</font></th>
				<td><input type="text" name="modelno" class="textbox easyui-validatebox"
					  size="28" value="${terminal.modelno}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">商户号：<font style="color: red">*</font></th>
				<td><input type="text" name="mchno" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.mchno}" /></td>
				<th style="width: 130px;text-align: right;">终端号：<font style="color: red">*</font></th>
				<td><input type="text" name="terno" class="textbox easyui-validatebox"
					  size="28" value="${terminal.terno}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">设备型号：<font style="color: red">*</font></th>
				<td><input type="text" name="modelno" class="textbox easyui-validatebox"
					  size="28"
					value="${terminal.modelno}" /></td>
				<th style="width: 130px;text-align: right;">程序版本：<font style="color: red">*</font></th>
				<td><input type="text" name="pgmv" class="textbox easyui-validatebox"
					  size="28" value="${terminal.pgmv}" /></td>
			</tr>
			
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">目前寿命：<font style="color: red">*</font></th>
				<td><input type="text" name="curryear" class="textbox easyui-validatebox"
					  size="28" value="${terminal.curryear}" /></td>
				<th style="width: 130px;text-align: right;">财务寿命：<font style="color: red">*</font></th>
				<td><input type="text" name="finayear" class="textbox easyui-validatebox"
					  size="28" value="${terminal.finayear}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">所在库：<font style="color: red">*</font></th>
				<td><input type="text" name="curstore" class="textbox easyui-validatebox"
					  size="28" value="${terminal.curstore}" /></td>
				<th style="width: 130px;text-align: right;">子库存：<font style="color: red">*</font></th>
				<td><input type="text" name="substore" class="textbox easyui-validatebox"
					  size="28" value="${terminal.substore}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">丢机前状态：<font style="color: red">*</font></th>
				<td>
					<select name="loststate">
						<option value="1" <c:if test="${terminal.loststate=='1' }">selected="selected"</c:if>>进行中</option>
						<option value="0" <c:if test="${terminal.loststate=='0' }">selected="selected"</c:if>>结束</option>
						<option value="2" <c:if test="${terminal.loststate=='-1' }">selected="selected"</c:if>>关闭</option>
					</select>
				</td>
				
				<th style="width: 130px;text-align: right;">客户经理：<font style="color: red">*</font></th>
				<td colspan="3">
					<select id="userid" name="userid" class="textbox textbox_indent">
	              		<option value="">----- 请选择-----</option>
	              		<c:forEach items="${userList }" var="user">
	              		<option value="${user.id }" <c:if test="${terminal.userid==user.id }">selected="selected"</c:if>> ${user.title }</option>
	              		</c:forEach>
	              	</select>	
				</td>
			</tr>
		
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">备注信息：</th>
				<td colspan="3">
					<textarea rows="" cols="" name="remark" style="width: 230px;height: 80px;">${terminal.remark}</textarea>
				</td>
			</tr>
		</table>
	</form>
</body>

</html>
