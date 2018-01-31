<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信息化数据上报</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
 <script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script> 
<%-- <script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script> --%>

	<link href="${pageContext.request.contextPath}/static/uploadify1/uploadify.css" rel="stylesheet" type="text/css" />
<%--  <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify/jquery-1.4.2.min.js"></script> --%> 
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/static/uploadify/swfobject.js"></script>  --%>
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
	<legend style="font-weight: bold; font-size: 16pt; color: #E3393C;">信息化数据上报</legend>
<form id="product_form" action="" method="post">



	<table cellspacing="0" cellpadding="0">
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">集团通讯录上传<font style="color: red">*</font></th>
			<td   style="padding-top: 10px;"><input type="file" name="uploadify" id="contact"/>
				<!-- <div id="contactfileQueue"></div> -->
			</td>
			<td style="padding-left: 100px;"><a href="${pageContext.request.contextPath}/static/data/txl.xlsx">集团通讯录模板下载</a>
			</td>
		</tr>
		
	<!-- 	<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">集团通讯录上传<font style="color: red">*</font></th>
			<td><span id="btn_upload"></span>
			</td>
			
		</tr> -->
		
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">专线数据上传<font style="color: red">*</font></th>
			<td><input type="file" name="uploadify" id="specline"/>
				<!-- <div id="speclinefileQueue"></div> -->
			</td>
			<td style="padding-left: 100px;"><a href="${pageContext.request.contextPath}/static/data/zx.xlsx">专线数据模板下载</a>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">信息化摸底数据上传<font style="color: red">*</font></th>
			<td><input type="file" name="uploadify" id="info"/>
				<!-- <div id="infofileQueue"></div> -->
			</td>
			<td style="padding-left: 100px;"><a href="${pageContext.request.contextPath}/static/data/md.xlsx">信息化摸底数据模板下载</a>
			</td>
		</tr>
		<tr class="thclass" style="height: 40px">
			<th style="width: 130px;">日常信息上传<font style="color: red">*</font></th>
			<td><input type="file" name="uploadify" id="report"/>
				<!-- <div id="reportfileQueue"></div> -->
			</td>
			<td style="padding-left: 100px;"><a href="${pageContext.request.contextPath}/static/data/sb.xlsx">日常信息上传模板下载</a>
			</td>
		</tr>
		
	</table>
</form>
</fieldset>
<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";


$(document).ready(function(){
	
	$('#contact').uploadify({
		        uploader: basepath+'/data/contact',            // 服务器处理地址
		          swf: basepath+'/static/uploadify1/uploadify.swf',
		         buttonText: "选择文件",                  //按钮文字
		          height: 24,                             //按钮高度
		        width: 120,                              //按钮宽度
		         fileTypeExts: "*.xls;*.xlsx;",           //允许的文件类型
		         fileTypeDesc: "请选择表格文件",           //文件说明   
		         formData: { "imgType": "normal" }, //提交给服务器端的参数
		         onUploadSuccess: function (file, data, response) {   //一个文件上传成功后的响应事件处理
		        	 //var json = $.parseJSON(response);
		             alert("上传成功");
		         }
		     });
	
	$('#info').uploadify({
        uploader: basepath+'/data/info',            // 服务器处理地址
          swf: basepath+'/static/uploadify1/uploadify.swf',
         buttonText: "选择文件",                  //按钮文字
          height: 24,                             //按钮高度
        width: 120,                              //按钮宽度
         fileTypeExts: "*.xls;*.xlsx;",           //允许的文件类型
         fileTypeDesc: "请选择表格文件",           //文件说明   
         formData: { "imgType": "normal" }, //提交给服务器端的参数
         onUploadSuccess: function (file, data, response) {   //一个文件上传成功后的响应事件处理
        	 //var json = $.parseJSON(response);
             alert("上传成功");
         }
     });

	$('#specline').uploadify({
        uploader: basepath+'/data/specline',            // 服务器处理地址
          swf: basepath+'/static/uploadify1/uploadify.swf',
         buttonText: "选择文件",                  //按钮文字
          height: 24,                             //按钮高度
        width: 120,                              //按钮宽度
         fileTypeExts: "*.xls;*.xlsx;",           //允许的文件类型
         fileTypeDesc: "请选择表格文件",           //文件说明   
         formData: { "imgType": "normal" }, //提交给服务器端的参数
         onUploadSuccess: function (file, data, response) {   //一个文件上传成功后的响应事件处理
        	 //var json = $.parseJSON(response);
             alert("上传成功");
         }
     });

	$('#report').uploadify({
        uploader: basepath+'/data/report',            // 服务器处理地址
          swf: basepath+'/static/uploadify1/uploadify.swf',
         buttonText: "选择文件",                  //按钮文字
          height: 24,                             //按钮高度
        width: 120,                              //按钮宽度
         fileTypeExts: "*.xls;*.xlsx;",           //允许的文件类型
         fileTypeDesc: "请选择表格文件",           //文件说明   
         formData: { "imgType": "normal" }, //提交给服务器端的参数
         onUploadSuccess: function (file, data, response) {   //一个文件上传成功后的响应事件处理
        	 //var json = $.parseJSON(response);
             alert("上传成功");
         }
     });

	
});


</script>
</body>
</html>
