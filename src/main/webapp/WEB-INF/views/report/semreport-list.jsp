<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>信息日常上报</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/syUtil.js"
	charset="utf-8"></script>
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

<body style="margin: 0px;">
<div class="easyui-layout" fit="true" border="false">
	<div data-options="region:'north',title:''" style="height: 50px; background: #F4F4F4;">
		<form id="searchForm">
			<table>
			  <tr>
	              <th>集团编码：</th>
	              <td><input id="ispcode" name="ispcode" value=""/></td>
	              <th>客户经理：</th>
	              <td>
	              	<select id="amuserid" name="amuserid">
	              		<c:forEach items="${userList }" var="user">
	              		<option value="${user.id }">${user.title }</option>
	              		</c:forEach>
	              	</select>
	              <th>业务地域：</th>
	              <td><input id="areacode" name="areacode" value=""/></td>
	          	  <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
	          </tr>                     
			</table>
		</form>                                    
	</div>            
	<div data-options="region:'center',split:false">
		 <div class="easyui-layout" fit="true" border="false">
			<div data-options="region:'west',title:''" style="width:65%;">
				<table id="list_data" cellspacing="0" cellpadding="0">
				</table>
			</div>
			<div data-options="region:'east'" style="width:36%;">
				<table id="recomd_list_data" cellspacing="0" cellpadding="0"></table>
			</div>
		</div>
	</div>
	<div id="toobar" style="padding:5px;height:auto">
		<div style="margin-bottom:5px">
			<shiro:hasPermission name="corp:create">
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"  onClick="addFun()">新增</a>
			</shiro:hasPermission>
			<%-- <shiro:hasPermission name="corp:update">
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editFun()">修改</a>
			</shiro:hasPermission> --%>
			<shiro:hasPermission name="corp:delete">
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delFun()">删除</a>
			</shiro:hasPermission>
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"  onClick="addRecomdFun()">新增推荐信息</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editRecomdFun()">修改推荐信息</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delRecomdFun()">删除推荐信息</a>
		</div>
</div>
<div id="report_window"></div>

<script type="text/javascript">
	var basepath="${pageContext.request.contextPath}";
	
	$(document).ready(function(){
		$('#areacode').combotree({
		    url: basepath+'/area/tree',
		    valueField:'id',
		    textField:'name',
		    method:'post'
		}); 
		createReport();
	});	
	
	function createReport(){
        $.ajax({  
            url : basepath+'/report/item/dghead',  
            //dateType : 'json',  
            type : 'post',  
            success : function(json) {  
                $('#list_data').datagrid({  
                    url : basepath+'/report/item/datagrid',  
                    fit : true,  
                    border : false,  
                    pagination : true,  
                    rownumbers : true,  
                    fitColumns : false, 
                    singleSelect : true,//是否单选
                    columns : json,
                    toolbar : '#toobar',
        			pageSize : 15,
        			pageList : [10, 15 ],
        			onClickRow:function () {
        		        var wayrow = $('#list_data').datagrid("getSelected");
        		        selectRecomd(wayrow.id);
        		    }
                }); 
                var p = $('#list_data').datagrid('getPager');
        		$(p).pagination({
        			pageSize : 10,				//每页显示的记录条数，默认为10 
        			pageList : [ 5, 10, 15 ],	//可以设置每页记录条数的列表 
        			beforePageText : '第',		//页数文本框前显示的汉字 
        			afterPageText : '页    共 {pages} 页',
        			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
        		});
            }  
        });  
        
	}
	
	function searchFunc(){
		var paramobj={
			title:$("#title").val(),
			code:$("#code").val(),
			classid:$("#classid").val(),
			corpid:$("#corpid").val(),
			state:$("#state").val()
		};
        $("#list_data").datagrid("load",paramobj);
	}
	
	//点击清空按钮出发事件
    function clearSearch() {
        $("#list_data").datagrid("load", {});
        $("#searchForm").find("input").val("");
    }	
	
  	//添加走访信息
	function addFun() {
    	document.location = basepath+'/report/dataform';
    }

    //删除走访信息
    function delFun(){
    	var checkedRows = $("#list_data").datagrid('getChecked');
    	if(checkedRows.length == 1) {
    		$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
    			if(r) {
    				$.ajax({
    					url : basepath+'/report/delete',
    					data : {
    						id : checkedRows[0].id
    					},
    					type:'POST',
    					dataType : 'json',
    					success : function(json) {
    						if (json.success) {
    							$("#list_data").datagrid('load');
    							selectRecomd(0);
    						}
    						$.messager.show({
    							title : '提示',
    							msg : json.msg
    						});
    					}
    				});
    			}
    		});
    	} else if(checkedRows.length > 1) {
    		$.messager.show({
    			title : '提示',
    			msg : '只能选择一个记录删除!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}else {
    		$.messager.show({
    			title : '提示',
    			msg : '请勾选想要删除的记录!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}
    }
	
  
	
    window.onload = function () { 
    	selectRecomd(0);
    };
	//获得走访推荐信息
	function selectRecomd(cid){
		$('#recomd_list_data').datagrid({
    	height : 'auto',
    	nowrap : false,
    	striped : true,
    	border : true,
    	collapsible : false,//是否可折叠的 
    	fit : true,//自动大小 
    	loadMsg : '数据加载中请稍后……',
    	url : basepath+'/recomd/datagrid?reportid='+cid,
    	remoteSort : false,
    	fitColums : true,
    	checkOnSelect : true,
    	//singleSelect : false,//是否单选 
    	pagination : true,//分页控件 
    	rownumbers : true,//行号 
    	columns : [ [ {
    		field : 'id',
    		title : '编号',
    		width : 50,
    		checkbox : true
    	},{
    		field : 'producttitle',
    		title : '产品名称',
    		width : 100
    	},{
    		field : 'recomresult',
    		title : '推荐结果',
    		width : 100
    	}] ],
		pageSize : 20,
    	pageList : [ 10, 20, 30 ]
    });
    //设置分页控件 
    var p = $('#recomd_list_data').datagrid('getPager');
    $(p).pagination({
    	pageSize : 10,//每页显示的记录条数，默认为10 
    	pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
    	beforePageText : '第',//页数文本框前显示的汉字 
    	afterPageText : '页    共 {pages} 页',
    	displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
    });
}
	
	
	//添加走访推荐信息
	function addRecomdFun() {
		var checkedRows = $("#list_data").datagrid('getChecked');
    	if (checkedRows.length == 1) {
    		document.location = basepath+'/recomd/dataform?reportid='+checkedRows[0].id;
    		//document.location = basepath+'/recomd/dataform?reportid=1';
    	} else if(checkedRows.length > 1) {
    		$.messager.show({
    			title : '提示',
    			msg : '只能选择一条上报记录添加其推荐信息!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}else {
    		$.messager.show({
    			title : '提示',
    			msg : '请勾选想要添加推荐信息的上报记录!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	} 
    }
	
	//编辑走访推荐信息
	function editRecomdFun() {
		 var checkedRows = $("#recomd_list_data").datagrid('getChecked');
    	if (checkedRows.length == 1) { 
    		
			var recomd_window_dialog = $('#report_window').dialog({
			title : '走访推荐信息编辑',
			width : 400,
			height : 200,
			closed : false,
			cache : false,
			href : basepath+'/recomd/dataform?id='+checkedRows[0].id,
			modal : true,
			buttons : [ {
				text : '保   存',
				handler : function() {
					$('#recomd_form').form('submit',{
						url : basepath+'/recomd/update',
						success : function(data) {
							var result = $.parseJSON(data);
							if (result.success) {
								$('#recomd_list_data').datagrid('load');
								recomd_window_dialog.dialog('close');
							}
							$.messager.show({
								title : '提示',
								msg : result.msg,
								timeout : 3000,
								showType : 'slide'
							});
						}
					});
				}
			} ]
		});
    	 } else if(checkedRows.length > 1) {
    		$.messager.show({
    			title : '提示',
    			msg : '只能选择一条推荐信息进行编辑!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}else {
    		$.messager.show({
    			title : '提示',
    			msg : '请勾选想要编辑推荐记录!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	} 
    }
	
	//删除走访信息
    function delRecomdFun(){
    	var checkedRows = $("#recomd_list_data").datagrid('getChecked');
    	if(checkedRows.length == 1) {
    		$.messager.confirm('确认', '您是否要删除当前选中的信息？', function(r) {
    			if(r) {
    				
    				$.ajax({
    					url : basepath+'/recomd/delete',
    					data : {
    						ids : checkedRows[0].id
    					},
    					type:'POST',
    					dataType : 'json',
    					success : function(json) {
    						if (json.success) {
    							$("#recomd_list_data").datagrid('load');
    						}
    						$.messager.show({
    							title : '提示',
    							msg : json.msg
    						});
    					}
    				});
    			}
    		});
    	} else if(checkedRows.length > 1) {
    		$.messager.show({
    			title : '提示',
    			msg : '只能选择一个记录删除!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}else {
    		$.messager.show({
    			title : '提示',
    			msg : '请勾选想要删除的记录!',
    			timeout : 3000,
    			showType : 'slide'
    		});
    	}
    }
</script>
</body>
</html>
