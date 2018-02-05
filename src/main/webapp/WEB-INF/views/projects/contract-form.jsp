<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>合同表单</title>
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
<form id="contract_form" action="" method="post">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">合同编号<font style="color: red">*</font></th>
			<td><input type="text" id="ispcode" name="ispcode" class="easyui-validatebox"
					readonly="readonly" value="${contract.ispcode }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">合同名称<font style="color: red">*</font></th>
			<td><input type="text" id="title" name="title" class="easyui-validatebox"
					required="true" missingMessage="不能为空"
					value="${contract.title }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">卖方手机号</th>
			<td><input type="text" id="sellertel" name="sellertel" maxlength="200" value="${contract.sellertel }" />
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">买方手机号</th>
			<td><input type="text" id="buyertel" name="buyertel" maxlength="200" value="${contract.buyertel }" />
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">经纪人手机号</th>
			<td><input type="text" id="agenttel" name="agenttel" value="${contract.agenttel }" maxlength="200"/>
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">店东手机号</th>
			<td><input type="text" id="storetel" name="storetel" value="${contract.storetel }" maxlength="200"/>
			</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">专员手机号</th>
			<td><input type="text" id="officertel" name="officertel" value="${contract.officertel }" maxlength="200"/>
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>
