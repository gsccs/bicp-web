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
input {
	width: 200px;
}

.thclass {
	height: 50px;
}
</style>

<body>
<fieldset>
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">添加ICT项目</legend>
	<form id="proj_form" action="" method="post">
		<input type="hidden" name="id" value="${projInfo.id }">
		<table class="tableForm" style="margin-top: 10px;">
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">项目名称：<font style="color: red">*</font></th>
				<td colspan="3"><input type="text" name="name" class="easyui-validatebox" required="true" missingMessage="项目名称不能为空"
					  size="28" maxlength="200"
					value="${projInfo.name}" /></td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">集团编码：<font style="color: red">*</font></th>
				<td>
					<input  type="text" id="ispcode" name="ispcode"  value="" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="集团编码不能为空"/>
				</td>
				<th style="width: 130px;text-align: right;">项目金额：<font style="color: red">*</font></th>
				<td><input type="text" name="ussm" class="easyui-numberbox"
					  size="28"
					value="${projInfo.ussm}" />元</td>
			</tr>
			 <tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">中标时间：<font style="color: red">*</font></th>
				<td>
					<input class="easyui-datebox" 
					id="winnindate" name="winnindate" data-options="showSeconds:true "
					data-options="formatter:ww3,parser:w3" 
					 value="${projInfo.winnindate}"/>
				</td>
				<th style="width: 130px;text-align: right;">签约时间：<font style="color: red">*</font></th>
				<td>
					<input class="easyui-datebox" 
					id="signdate" name="signdate" data-options="showSeconds:true "
					data-options="formatter:ww3,parser:w3" 
					 value="${projInfo.signdate}"/>
				</td>
			</tr> 
			
			<!-- data-options="formatter:ww3,parser:w3" -->
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">计划开始时间：<font style="color: red">*</font></th>
				<td>
					<input class="easyui-datebox" 
					id="planstartdate" name="planstartdate" data-options="showSeconds:true "
					data-options="formatter:ww3,parser:w3" 
					 value="${projInfo.planstartdate}"/>
				</td>
				<th style="width: 130px;">计划完工时间<font style="color: red">*</font></th>
				<td><input  class="easyui-datebox" data-options="showSeconds:true " 
				 name="planenddate"  id="planenddate" value="${projInfo.planenddate}" />
				</td>
			</tr> 
			
		    <tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">工期：<font style="color: red">*</font></th>
				<td><input type="text" name="builddays" class="easyui-numberbox"
					  size="28"
					value="${projInfo.builddays}" />天</td>
			
				<th style="width: 130px;text-align: right;">联系电话：<font style="color: red">*</font></th>
				<td><input type="text" name="telephone" class="easyui-validatebox"
					  size="28"
					value="${projInfo.telephone}" /></td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">客户经理：<font style="color: red">*</font></th>
				<td>
				<select name="amuserid" style="width:165px;">
					<c:forEach var="bean" items="${userList}" varStatus="status">
						<option value="${bean.id }" >${bean.title }</option>
					</c:forEach>
				</select>
				</td>
				<th style="width: 130px;text-align: right;">状态：<font style="color: red">*</font></th>
				<td>
					<select name="status">
						<option value="0">未开始</option>
						<option value="1">进行中</option>
						<option value="-1">关闭</option>
					</select>
				</td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">项目简介：</th>
				<td colspan="3">
					<textarea rows="" cols="" name="brief" style="width: 80%;height: 80px;">${projInfo.remark}</textarea>
				</td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">建设内容：</th>
				<td colspan="3">
					<textarea rows="" cols="" name="buildcontent" style="width: 80%;height: 80px;">${projInfo.remark}</textarea>
				</td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">备注：</th>
				<td colspan="3">
					<textarea rows="" cols="" name="remark" style="width: 80%;height: 80px;">${projInfo.remark}</textarea>
				</td>
			</tr>
			<tr class="thclass" style="height: 40px">
				<td colspan="4" style="text-align: right">
					<a id="saveTopicBtn"
						class="easyui-linkbutton" data-options="iconCls:'icon-add'"
						href="javascript:" onclick="saveIctproj();">保存</a> 
					<a id="btnBack" class="easyui-linkbutton" data-options="iconCls:'icon-back'"
						href="javascript:" onclick="BackIndex()">返回</a>
			</tr>
		</table>
	</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";
$(document).ready(function(){
	$('.easyui-datebox').attr("readonly","readonly");
	$('.easyui-datebox').datebox({
	    formatter: function(date){ 
	    	if(date){
	    		var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
	    		var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"+ (date.getMonth() + 1);
	    		return date.getFullYear()+'-'+month+'-'+day;
	    	}
	    },
	    parser: function(date){ 
	    	if(date){
	    	return new Date(Date.parse(date.replace(/-/g,"/")));
	    	}
	    }
	});
});	
function saveIctproj(){
	var valid = $("#proj_form").form('validate');
	if(!valid){
		return;
	}
	$.ajax({
		url: basepath+'/ictproj/create',
		data : $("#proj_form").serialize(),
		dataType : 'json',
		type : 'POST',
	   success: function(result){
		   $.messager.show({
				title : '提示',
				msg : result.msg,
				timeout : 3000,
				showType : 'slide'
			}); 
		 	if (result.success) {
				document.location = basepath+'/ictproj';
	   		}
	   }
	});
}
function BackIndex(){
	document.location = basepath+'/ictproj';
}
</script>
</body>

</html>
