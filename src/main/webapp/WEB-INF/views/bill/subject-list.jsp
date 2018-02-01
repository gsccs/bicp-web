<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>缴费科目列表</title>
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
                            <th>科目名称：</th>
                            <td><input id="query_title" name="title" value=""/></td>
                            <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
                        </tr>
                    </table>
                </form>
            </div>
            <div data-options="region:'center',split:false">
                <table id="list_data" cellspacing="0" cellpadding="0"></table>
            </div>
            <div id="toobar" style="padding:5px;height:auto">
				<div style="margin-bottom:5px">
					<shiro:hasPermission name="corp:create">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"  onClick="addFun()">新增流程</a>
					</shiro:hasPermission>
					<shiro:hasPermission name="corp:update">
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editFun()">修改流程</a>
					</shiro:hasPermission>
					<shiro:hasPermission name="corp:delete">
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delFun()">删除流程</a>
					</shiro:hasPermission>
				</div>
    		</div>
	</div>
	<div id="form_window"></div>
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
		$('#list_data').datagrid({
			height : 'auto',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			fit : true,//自动大小 
			loadMsg : '数据加载中请稍后……',
			url : basepath+'/billkm/datagrid',
			remoteSort : false,
			fitColums : true,
			checkOnSelect : true,
			singleSelect : true,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			idField: 'id',
			columns : [ [ {
				field : 'id',
				title : '编号',
				width : 150,
				checkbox : true
			},{
				field : 'title',
				title : '科目编码',
				width : 150
			},{
				field : 'title',
				title : '流程名称',
				width : 150
			},{
				field : 'fee',
				title : '默认金额',
				width : 100
			},{
				field : 'groupid',
				title : '分组',
				width : 150
			},{
				field : 'addtimestr',
				title : '变更时间',
				width : 150
			},{
				field : 'status',
				title : '状态',
				width : 150
			}] ],
			toolbar : '#toobar',
			pageSize : 20,
			pageList : [20, 30, 50 ],
			onClickRow:function () {
		        //var wayrow = $('#list_data').datagrid("getSelected");
		    }
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 20,				//每页显示的记录条数，默认为10 
			pageList : [ 20, 30, 50 ],	//可以设置每页记录条数的列表 
			beforePageText : '第',		//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		}); 
		
		//添加
		function addFun() {
	    	var window_dialog = $('#form_window').dialog({
    			title : '新增缴费科目',
    			width : 600,
    			height : 400,
    			closed : false,
    			cache : false,
    			href : basepath+'/billkm/dataform',
    			modal : true,
    			buttons : [ {
    				text : '保   存',
    				handler : function() {
    					var valid = $("#billkm_form").form('validate');
    					if(!valid){
    						return;
    					}
    					$('#billkm_form').form('submit',{
    						url : basepath+'/billkm/save',
    						success : function(data) {
    							var result = $.parseJSON(data);
    							if (result.success) {
    								$('#list_data').datagrid('load');
    								window_dialog.dialog('close');
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
    			} ],
    			onLoad:function(){
    				//fmtDate();
    			}
    		});
	    }

	   
	    //编辑通讯录
	    function editFun() {
	    	var checkedRows = $("#list_data").datagrid('getChecked');
	    	
	    	if (checkedRows.length == 1) {
	    		var window_dialog = $('#form_window').dialog({
	    			title : '新增缴费科目',
	    			width : 600,
	    			height : 400,
	    			closed : false,
	    			cache : false,
	    			href : basepath+'/billkm/dataform?id='+checkedRows[0].id,
	    			modal : true,
	    			buttons : [ {
	    				text : '保   存',
	    				handler : function() {
	    					var valid = $("#billkm_form").form('validate');
	    					if(!valid){
	    						return;
	    					}
	    					$('#billkm_form').form('submit',{
	    						url : basepath+'/billkm/save',
	    						success : function(data) {
	    							var result = $.parseJSON(data);
	    							if (result.success) {
	    								$('#list_data').datagrid('load');
	    								window_dialog.dialog('close');
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
	    			} ],
	    			onLoad:function(){
	    				//fmtDate();
	    			}
	    		});
	    	} else if(checkedRows.length > 1) {
	    		$.messager.show({
	    			title : '提示',
	    			msg : '只能选择一个记录编辑!',
	    			timeout : 3000,
	    			showType : 'slide'
	    		});
	    	}else {
	    		$.messager.show({
	    			title : '提示',
	    			msg : '请勾选想要编辑的记录!',
	    			timeout : 3000,
	    			showType : 'slide'
	    		});
	    	}
	    }		

	    //记录删除
	    function delFun(){
	    	var checkedRows = $("#list_data").datagrid('getChecked');
	    	if(checkedRows.length == 1) {
	    		$.messager.confirm('确认', '您是否要删除当前选中的客户？', function(r) {
	    			if(r) {
	    				
	    				$.ajax({
	    					url : basepath+'/billkm/del',
	    					data : {
	    						id : checkedRows[0].id
	    					},
	    					type:'POST',
	    					dataType : 'json',
	    					success : function(json) {
	    						if (json.success) {
	    							$("#list_data").datagrid('load');
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
		
		function searchFunc() {
			var param={
				title:$("#query_title").val()
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
