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

	<form id="proj_dataForm" method="post">
		<input type="hidden" name="id" value="${projInfo.id }">
		<table class="tableForm" style="margin-top: 10px;">
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">设备序列号：<font style="color: red">*</font></th>
				<td><input type="text" name="title" class="easyui-validatebox" size="28" value="${terminal.tersn}" /></td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">领用人：<font style="color: red">*</font></th>
				<td>
					<select id="userid" name="userid" class="textbox textbox_indent">
	              		<option value="">----- 请选择-----</option>
	              		<c:forEach items="${userList }" var="user">
	              		<option value="${user.id }"> ${user.title }</option>
	              		</c:forEach>
	              	</select>	
					
				</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">联系电话：<font style="color: red">*</font></th>
				<td><input type="text" name="linktel" class="easyui-validatebox"
					  size="28"
					value="${projInfo.linktel}" /></td>
			</tr>
			<!-- data-options="formatter:ww3,parser:w3" -->
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">计划开始时间：<font style="color: red">*</font></th>
				<td>
					<input class="easyui-datebox" 
					id="pstartday" name="pstartday"
					data-options="formatter:ww3,parser:w3" 
					required="true" missingMessage="不能为空" value="${projInfo.pstartdaystr}"/></td>
				</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">计划结束时间：<font style="color: red">*</font></th>
				<td>
				<input class="easyui-datebox" 
					data-options="formatter:ww3,parser:w3"
					name="pendday" 
					required="true" missingMessage="不能为空" value="${projInfo.penddaystr}"/>
				</td>
			</tr>
			
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">状态：<font style="color: red">*</font></th>
				<td>
					<select name="state">
						<option value="1" <c:if test="${projInfo.state=='1' }">selected="selected"</c:if>>进行中</option>
						<option value="0" <c:if test="${projInfo.state=='0' }">selected="selected"</c:if>>结束</option>
						<option value="-1" <c:if test="${projInfo.state=='-1' }">selected="selected"</c:if>>关闭</option>
					</select>
				</td>
			</tr>
		
			<tr class="thclass" style="height: 40px">
				<th style="width: 130px;text-align: right;">项目描述：</th>
				<td>
					<textarea rows="" cols="" name="remark" style="width: 230px;height: 80px;">${projInfo.remark}</textarea>
				</td>
			</tr>
		</table>
	</form>
<script type="text/javascript">
function ww3(date){  
    var y = date.getFullYear();  
    var m = date.getMonth()+1;  
    var d = date.getDate();  
    //var h = date.getHours();  
    //var min = date.getMinutes();  
    //var sec = date.getSeconds();  
    //var str = y+'/'+(m<10?('0'+m):m)+'/'+(d<10?('0'+d):d)+'/'+' '+(h<10?('0'+h):h)+':'+(min<10?('0'+min):min)+':'+(sec<10?('0'+sec):sec);
    var str = y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d)+'';
    //alert(str);
    return str;  
}  


function w3(s){  
    if (!s) return new Date();  
    var y = s.substring(0,4);  
    var m =s.substring(5,7);  
    var d = s.substring(8,10);  
    //var h = s.substring(11,14);  
    //var min = s.substring(15,17);  
    //var sec = s.substring(18,20);  
    /* if (!isNaN(y) && !isNaN(m) && !isNaN(d) && !isNaN(h) && !isNaN(min) && !isNaN(sec)){  
        return new Date(y,m-1,d,h,min,sec);  
    } else {  
        return new Date();  
    }   */
    if (!isNaN(y) && !isNaN(m) && !isNaN(d)){  
        return new Date(y,m-1,d);  
    } else {  
        return new Date();  
    }
}  
</script>
</body>

</html>
