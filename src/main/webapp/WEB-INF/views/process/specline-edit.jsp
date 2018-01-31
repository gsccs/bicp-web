<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>专线信息管理</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/easyui-lang-zh_CN.js"></script> --%>
<link href="${pageContext.request.contextPath}/static/uploadify1/uploadify.css" rel="stylesheet" type="text/css" />
  <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify1/jquery.uploadify.js"></script>

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
<fieldset>
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">编辑专线信息</legend>
	<form id="specline_form" action="" method="post">
	<input type="hidden" id="agreeimg" name="agreeimg" 
				width="500"	value="${specline.agreeimg}">
	<input type="hidden" id="filenames" name="filenames" 
				width="500"	value="">
    <input type="hidden" id="id" name="id" 
				width="500"	value="${specline.id}">
	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">集团编码<font style="color: red">*</font></th>
				<td>
					<input  type="text" id="ispcode" name="ispcode"  value="${specline.ispcode }" style="width:165px;" required="true" class="easyui-validatebox" missingMessage="集团编码不能为空"/>
				</td>
				<th style="width: 130px;">客户经理<font style="color: red">*</font></th>
				<td>
					<select id="customer" name="customer">
						<c:forEach items="${userList }" var="user">
							<option value="${user.id }" <c:if test="${specline.customer==user.id}"> selected="selected"</c:if> >${user.title }</option>
						</c:forEach>
					</select>
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">是否使用专线<font style="color: red">*</font></th>
				<td>
					<select name="hasline" style="width:165px;">
						<c:choose>
							<c:when test="${pecline.hasline==1}">
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
		
				<th style="width: 130px;">运营商<font style="color: red">*</font></th>
				<td>
				<select name="isptype" style="width:165px;">
					<c:forEach var="bean" items="${ispList}" varStatus="status">
						<c:choose>
							<c:when test="${bean.id== specline.isptype}">
							<option value="${bean.id }" selected="selected">${bean.title }</option>
							</c:when>
							<c:otherwise>
							<option value="${bean.id }" >${bean.title }</option>
							</c:otherwise>
						</c:choose>
						
					</c:forEach>
				</select>	
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">专线类型<font style="color: red">*</font></th>
				<td>
					
					<select name="linetype" style="width:165px;">
					<c:forEach var="bean" items="${lineList}" varStatus="status">
						<c:choose>
							<c:when test="${bean.id== specline.linetype}">
							<option value="${bean.id }" selected="selected">${bean.title }</option>
							</c:when>
							<c:otherwise>
							<option value="${bean.id }" >${bean.title }</option>
							</c:otherwise>
						</c:choose>
						
					</c:forEach>
				</select>
				</td>
		
				<th style="width: 130px;">宽带</th>
				<td><input type="text" name="bitsize" class="easyui-validatebox"
					value="${specline.bitsize}" />M
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">月资费</th>
				<td><input type="text" name="feemonth" class="easyui-validatebox"
					value="${specline.feemonth}" />元
				</td>
				<th style="width: 130px;">缴费方式<font style="color: red">*</font></th>
				<td>
					
					<select name="paytype" style="width:165px;">
					<c:forEach var="bean" items="${payList}" varStatus="status">
						<c:choose>
							<c:when test="${bean.id== specline.paytype}">
							<option value="${bean.id }" selected="selected">${bean.title }</option>
							</c:when>
							<c:otherwise>
							<option value="${bean.id }" >${bean.title }</option>
							</c:otherwise>
						</c:choose>
						
					</c:forEach>
				</select>
				</td>
		</tr>
		
	 <tr class="thclass" style="height: 40px">
				<th style="width: 130px;">协定签订日期<font style="color: red">*</font></th>
				<td><input type="text" name="signdate" class="easyui-datebox" data-options="showSeconds:true" 
					value="${specline.signdate}" />
				</td>
				<th style="width: 130px;">到期日期<font style="color: red">*</font></th>
				<td><input  class="easyui-datebox" data-options="showSeconds:true"  name="enddate" 
					value="${specline.enddate}" />
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">本年度应缴费日期<font style="color: red">*</font></th>
				<td><input  class="easyui-datebox" data-options="showSeconds:true"  name="paydate" 
					value="${specline.paydate}" />
				</td>
				<th style="width: 130px;">年资费</th>
				<td><input type="text" id="yeartariff" name="yeartariff" class="easyui-numberbox"
					value="${specline.yeartariff}" />
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">合同编号</th>
				<td><input type="text" id="pactnumber" name="pactnumber" class="easyui-validatebox"
					value="${specline.pactnumber}" />
				</td>
				<th style="width: 130px;">合同名称</th>
				<td><input type="text" id="pactname" name="pactname" class="easyui-validatebox"
					value="${specline.pactname}" />
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">合同有效期</th>
				<td colspan="3"><input type="text" id="pactvalidity" name="pactvalidity" class="easyui-validatebox"
					value="${specline.pactvalidity}" />
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">计划建设平台工单编号</th>
				<td><input type="text" id="worknumber" name="worknumber" class="easyui-validatebox"
					value="${specline.worknumber}" />
				</td>
				<th style="width: 130px;">计划建设平台专线名称</th>
				<td><input type="text" id="speclinename" name="speclinename" class="easyui-validatebox"
					value="${specline.speclinename}" />
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">ESOP专线编号</th>
				<td><input type="text" id="esopnumber" name="esopnumber" class="easyui-validatebox"
					value="${specline.esopnumber}" />
				</td>
				<th style="width: 130px;">ESOP专线主题</th>
				<td><input type="text" id="esoptheme" name="esoptheme" class="easyui-validatebox"
					value="${specline.esoptheme}" />
				</td>
		</tr>
		
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">实际开通时间</th>
				<td><input  class="easyui-datebox"  id="opentime" data-options="showSeconds:true"  name="opentime" 
					value="${specline.opentime}" />
				</td>
				<th style="width: 130px;">BOSS计费号</th>
				<td><input type="text" id="bossnumber" name="bossnumber" class="easyui-validatebox"
					value="${specline.bossnumber}" />
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
				<th style="width: 130px;">首次收费时间</th>
				<td><input  class="easyui-datebox"  id="ftolltime" data-options="showSeconds:true"  name="ftolltime" 
					value="${specline.ftolltime}" />
				</td>
				<th style="width: 130px;">首次收费金额</th>
				<td><input type="text" id="ftollsum" name="ftollsum" class="easyui-numberbox"
					value="${specline.ftollsum}" />
				</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">扫描协议<font style="color: red">*</font></th>
			<td colspan="3">
				<div id="filename">${specline.filenames}</div>
				<input type="file" name="uploadify" id="uploadify"/>
				<div id="fileQueue"></div>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">备注说明</th>
			<td colspan="3"><textarea rows="" cols="" name="remark" style="width: 300px;height:70px;">${specline.remark}</textarea>  </td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<td colspan="4" style="text-align: right">
				<a id="saveTopicBtn"
					class="easyui-linkbutton" data-options="iconCls:'icon-add'"
					href="javascript:" onclick="saveSpecline();">保存</a> 
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
	$('#uploadify').uploadify({
        uploader: basepath+'/uploadify',            // 服务器处理地址
          swf: basepath+'/static/uploadify1/uploadify.swf',
         buttonText: "选择文件",                  //按钮文字
          height: 24,                             //按钮高度
        width: 120,                              //按钮宽度
         fileTypeExts: "*.jpg;*.png;",           //允许的文件类型
         fileTypeDesc: "请选择表格文件",           //文件说明   
         formData: { "imgType": "normal" }, //提交给服务器端的参数
         onUploadSuccess: function (file, data, response) {   //一个文件上传成功后的响应事件处理
        	
        	var str =  decodeURIComponent(data);
        	var arr = new Array();
        	arr = str.split("==");
             var agreeimg = $("#agreeimg").val();
             var filename = $("#filename").text(); 
             if(agreeimg.length < 1){
           	  agreeimg = arr[0];
             }else{
           	  agreeimg += ";"+arr[0];
             }
             
             if(filename.length < 1){
           	  filename = arr[1];
             }else{
           	  filename += ";"+ arr[1];
             }
             
             $("#agreeimg").val('').val(agreeimg);
             
             $("#filename").html('').html(filename);
             $("#filenames").val('').val(filename); 
         }
     });
});	
function saveSpecline(){
	var valid = $("#specline_form").form('validate');
	if(!valid){
		return;
	}
	console.log($("#specline_form").serialize());
	$.ajax({
		url: basepath+'/specline/update',
		data : $("#specline_form").serialize(),
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
		   		document.location = basepath+'/specline';
		   }
	   }
	});
}
function BackIndex(){
	document.location = basepath+'/specline';
}
</script>
</body>
</html>
