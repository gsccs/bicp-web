<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>按地域统计分析</title>
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
            <div data-options="region:'north'" style="height: 40px; background: #F4F4F4;">
                <form id="searchForm">
					<table>
					  <tr>
			              <th>客户名称：</th>
			              <td><input id="title" name="title" value="" class="textbox textbox_indent" style="height: 20px"/></td>
			              <th>所在地域：</th>
			              <td>
			              	<input id="areaid" name="areaid" /> 
			              </td>
			          	  <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
			          </tr>                     
					</table>
				</form>       
            </div>
            <div data-options="region:'center',split:false">
                <table id="list_data" cellspacing="0" cellpadding="0">
				</table>
            </div>
    </div>
	
	<div id="dd"></div>
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
		$(document).ready(function(){
			$('#areaid').combotree({
		        url: basepath+'/area/tree',
		        valueField:'id',
		        textField:'name',
		        method:'post'
		    });
			
			createReport();
		});
		
		function createReport(){
	        $.ajax({  
	            url : basepath+'/survey/datagridhead',  
	            //dateType : 'json',  
	            type : 'post',  
	            success : function(json) {  
	                //console.info(json.columns);  
	                $('#list_data').datagrid({  
	                    url : basepath+'/survey/datagrid', 
	                    fit : true,  
	                    striped : true,
	                    border : false,  
	                    pagination : true,  
	                    rownumbers : true, 
	                    showFooter:true,
	                    fitColumns : false,
	                    pageSize : 30,				 
	        			pageList : [ 30,40,50 ],
	                    columns : json     
	                }); 
	                var p = $('#list_data').datagrid('getPager');
	        		$(p).pagination({
	        			pageSize : 30,				//每页显示的记录条数，默认为10 
	        			pageList : [ 30,40,50 ],	//可以设置每页记录条数的列表 
	        			beforePageText : '第',		//页数文本框前显示的汉字 
	        			afterPageText : '页    共 {pages} 页',
	        			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	        		});
	            }  
	        });  
		}
		
		function searchFunc() {
			var param={
				title:$("#title").val(),
				acode:$("#areaid").combotree("getValue")
			};
	        $("#list_data").datagrid("load",param);
	    }
	    //点击清空按钮出发事件
	    function clearSearch() {
	        $("#list_data").datagrid("load", {});
	        $("#searchForm").find("input").val("");
	    }
	</script>
</body>

</html>
