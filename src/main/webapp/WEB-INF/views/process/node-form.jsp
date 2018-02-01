<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>流程节点表单</title>
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
	<form id="node_form" action="" method="post">
	<input type="hidden" id="defid" name="defid" value="${defid }">
    <input type="hidden" id="id" name="id" value="${processNode.id}">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">节点名称<font style="color: red">*</font></th>
			<td>
				<input  type="text" id="tname" name="tname"  value="${processNode.tname }" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="不能为空"/>
			</td>
			<th style="width: 130px;">节点编码<font style="color: red">*</font></th>
			<td>
				<input  type="text" id="tcode" name="tcode"  value="${processNode.tcode }" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="不能为空"/>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">是否通知<font style="color: red">*</font></th>
			<td>
				<select name="hasline" style="width:165px;">
					<c:choose>
						<c:when test="${processNode.iswxmsg==1}">
								<option value="1" selected="selected">是</option>
								<option value="0" >否</option>
						</c:when>
						<c:otherwise>
								<option value="1" >是</option>
								<option value="0" selected="selected">否</option>
						</c:otherwise>
					</c:choose>
				</select>	
			</td>
		
			<th style="width: 130px;">负责人<font style="color: red">*</font></th>
			<td>
				<select name="isptype" style="width:165px;">
					<c:forEach var="bean" items="${userList}" varStatus="status">
						<c:choose>
							<c:when test="${bean.id== processNode.userid}">
							<option value="${bean.id }" selected="selected">${bean.realname }</option>
							</c:when>
							<c:otherwise>
							<option value="${bean.id }" >${bean.realname }</option>
							</c:otherwise>
						</c:choose>
						
					</c:forEach>
				</select>	
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">备注说明</th>
			<td colspan="3"><textarea rows="" cols="" name="remark" style="width: 300px;height:70px;">${processNode.remark}</textarea>  </td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">排序</th>
			<td colspan="3"><input  type="text" id="tname" name="tname"  value="${processNode.ordernum }" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="集团编码不能为空"/>  </td>
		</tr>
	</table>
	</form>
</body>
</html>
