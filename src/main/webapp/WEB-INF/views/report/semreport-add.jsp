<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>走访信息管理</title>
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

<link href="${pageContext.request.contextPath}/static/uploadify/uploadify.css" rel="stylesheet" type="text/css" />
  <%-- <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify/jquery-1.4.2.min.js"></script> --%>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify/swfobject.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify/jquery.uploadify.js"></script>
<style type="text/css">

th{
	font-size: 12px;
  	padding: 5px 10px;
}

.datagrid-header td{
	text-align: center;
}
</style>
</head>
<body>
<fieldset>
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">添加走访信息</legend>
	
	<form id="report_form" action="" method="post" >
	<input  id="psize" name="psize" type="hidden" value="${psize}"/>
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">集团编码<font style="color: red">*</font></th>
			<td>
			<input  type="text" id="corpid" name="corpid"  value="" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="集团编码不能为空"/>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">走访日期<font style="color: red">*</font></th>
				<td><input type="text" id="adddate" name="adddate" class="easyui-datebox"  value="" />
				</td>
		</tr>
		
		<c:forEach var="bean" items="${pList}" varStatus="status">
			 <tr class="thclass" name="tr_prod"  style="height: 40px">
				<th style="width: 130px;">${bean.title}<font style="color: red">*</font></th>
				<td><input class="easyui-numberbox" name="${bean.id}"   id="pval_${status.index+1}"  value="0" />
				</td>
			</tr>
		</c:forEach>
		
		<tr class="thclass" style="height: 40px">
			<td colspan="2" style="text-align: right">
				<a id="saveTopicBtn"
					class="easyui-linkbutton" data-options="iconCls:'icon-add'"
					href="javascript:" onclick="saveReport();">保存</a> 
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
function saveReport(){
	//console.log($("#report_form").serialize());$("input[name='adddate']").val()  
	//alert($("input[name='adddate']").val() );
	//return ;
 	var valsArray = new Array();
	var psize = $("#psize").val();
	for (var a = 0; a < psize; a++) {
		var result={
			productid:$("#pval_"+(a+1)).attr("textboxname"),
			smereult:$("#pval_"+(a+1)).val()
		};
		valsArray.push(result);
	} 
	var semreport={
		corpid:$("#corpid").val(),
		adddateStr:$("input[name='adddate']").val(),
		results:valsArray
	};
	
	var valid = $("#report_form").form('validate');
	if(!valid){
		return;
	}
	$.ajax({
		url: basepath+'/report/create',
		data:JSON.stringify(semreport), 
		type : 'POST',
		dataType : 'json',
		contentType:"application/json",               
	    success: function(result){
		   $.messager.show({
				title : '提示',
				msg : result.msg,
				timeout : 3000,
				showType : 'slide'
			}); 
		 	if (result.success) {
			 document.location = basepath+'/report/item';
			}
	    }
	}); 
}
function BackIndex(){
	document.location = basepath+'/report/item';
}

</script>
</body>
</html>
