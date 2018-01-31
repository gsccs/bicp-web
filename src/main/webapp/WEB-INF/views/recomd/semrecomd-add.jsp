<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>日常上报推荐信息管理</title>
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
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">添加推荐信息</legend>
	
	<form id="report_form" action="" method="post" >
	<input  id="psize" type="hidden" value="${psize}"/>
	
	<input id="reportid" name="reportid" type="hidden" value="${report.id}"/>
	<input id="corpid" name="corpid" type="hidden" value="${report.corpid}"/>
	
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">走访企业<font style="color: red">*</font></th>
			<td>${report.corptitle}</td>
		</tr>
		
		<c:forEach var="bean" items="${pList}" varStatus="status">
			 <tr class="thclass" name="tr_prod"  style="height: 40px">
				<th style="width: 130px;">${bean.title}<font style="color: red">*</font></th>
				<td><%-- <input  name="${bean.id}"   id="pval_${status.index+1}"  
					value="" /> --%>
					<select name="${bean.id}" id="pval_${status.index+1}"  style="width:165px;">
						<c:forEach var="bean1" items="${itemList}" varStatus="status1">
							<option value="${bean1.id }" >${bean1.title }</option>
						</c:forEach>
					</select>
					
				</td>
			</tr>
		
		</c:forEach>
		
		<tr class="thclass" style="height: 40px">
			<td colspan="2" style="text-align: right">
				<a id="saveTopicBtn"
					class="easyui-linkbutton" data-options="iconCls:'icon-add'"
					href="javascript:" onclick="saveRecomd();">保存</a> 
				<a id="btnBack" class="easyui-linkbutton" data-options="iconCls:'icon-back'"
					href="javascript:" onclick="BackIndex()">返回</a>
					
		</tr>
	</table>
	</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";
function saveRecomd(){
 	var valsArray = new Array();
	var psize = $("#psize").val();
	for (var a = 0; a < psize; a++) {
		var result={
			productid:$("#pval_"+(a+1)).attr("name"),
			remresult:$("#pval_"+(a+1)).val()
		};
		valsArray.push(result);
	} 
	
	var recomds={
		corpid:$("#corpid").val(),
		reportid:$("#reportid").val(),
		results:valsArray
	};
	
	
	 $.ajax({
		url: basepath+'/recomd/create',
		data:JSON.stringify(recomds), 
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
