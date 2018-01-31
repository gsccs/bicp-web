<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目表单</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>

</head>

<body>
	<form id="project_form" action="" method="post">
		<input type="hidden" name="id" value="${project.id }" />
		<table cellspacing="0" cellpadding="0">
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">项目编号<font style="color: red">*</font></th>
					<td><input type="text" id="name" name="name" class="easyui-validatebox"
						required="true" missingMessage="姓名不能为空"
						value="${project.pcode}" />
					</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">项目名称<font style="color: red">*</font></th>
					<td><input type="text" id="duty" name="duty" class="easyui-validatebox"
						value="${project.title}" />
					</td>
			</tr>
			
			<%-- <tr class="thclass" style="height: 40px">
					<th style="width: 130px;">电话号码<font style="color: red">*</font></th>
					<td><input type="text" id="phone" name="phone" class="easyui-validatebox"
						value="${contacts.phone}" />
					</td>
			</tr> --%>
		
			<tr class="thclass" style="height: 40px">
					<th style="width: 130px;">商户号<font style="color: red">*</font></th>
					<td>
						<input type="text" id="mchno" name="mchno" class="easyui-validatebox"
						value="${project.mchno}" required="true" missingMessage="集团编码不能为空"/>	
					</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">需求信息：</th>
				<td>
					<textarea rows="" cols="" name="needs" style="width: 230px;height: 80px;">${project.needs}</textarea>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>
