<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>摸底数据录入</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
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
	<div class="easyui-layout" fit="true" border="false">
    	<div data-options="region:'north'," style="height: 10px; background: #F4F4F4;">
        </div>
        <div data-options="region:'center',split:false">
        	<table id="list_data" class="easyui-propertygrid" cellspacing="0" cellpadding="0" style="width: 80%">
			</table>
        </div>
    </div>
	
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
createReport();
		
		function createReport(){
			var url = basepath+'/survey/getCorpData';  
	        $.ajax({  
	            url : url,  
	            dataType : 'json',  
	            type : 'get',  
	            success : function(json) {  
	                console.info(json);  
	                $('#list_data').propertygrid({  
	                    url : url, 
	                    method:'get',
	                    //fit : true, 
	                    border : false,  
	                    showGroup: true,
	                    scrollbarSize: 0,
	                    rows:json.rows
	                }); 
	                //$('#list_data').propertygrid('appendRow',json.columns);
	            }  
	        });  
		}
		
	</script>
</body>
</html>
