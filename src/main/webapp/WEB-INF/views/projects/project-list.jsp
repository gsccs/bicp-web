<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>项目管理列表</title>
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
                            <th>名称：</th>
                            <td>
                                <input id="notice_title" name="title" value=""/></td>
                           
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
						<table id="task_list_data" cellspacing="0" cellpadding="0"></table>
					</div>
				</div>
            </div>
            <div id="toobar" style="padding:5px;height:auto">
				<div style="margin-bottom:5px">
					<shiro:hasPermission name="corp:create">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"  onClick="addFun()">新增</a>
					</shiro:hasPermission>
					<shiro:hasPermission name="corp:update">
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editFun()">修改</a>
					</shiro:hasPermission>
					<shiro:hasPermission name="corp:delete">
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delFun()">删除</a>
					</shiro:hasPermission>
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onClick="addWayFun()">新增联系方式</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editWayFun()">编辑联系方式</a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delWayFun()">删除联系方式</a>
				</div>
    		</div>
	</div>
	<div id="contact_window"></div>
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
			url : basepath+'/project/datagrid',
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
				field : 'pcode',
				title : '项目编号',
				width : 150
			},{
				field : 'title',
				title : '项目名称',
				width : 150
			},{
				field : 'needername',
				title : '需求人',
				width : 100
			},{
				field : 'addtimestr',
				title : '开始时间',
				width : 150
			},{
				field : 'status',
				title : '项目状态',
				width : 150
			}] ],
			toolbar : '#toobar',
			pageSize : 20,
			pageList : [20, 30, 50 ],
			onClickRow:function () {
		        var wayrow = $('#list_data').datagrid("getSelected");
		        selectCont(wayrow.id);
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
	    	var ictprog_window_dialog = $('#contact_window').dialog({
    			title : '创建项目',
    			width : 600,
    			height : 400,
    			closed : false,
    			cache : false,
    			href : basepath+'/project/dataform',
    			modal : true,
    			buttons : [ {
    				text : '保   存',
    				handler : function() {
    					var valid = $("#projcet_form").form('validate');
    					if(!valid){
    						return;
    					}
    					$('#project_form').form('submit',{
    						url : basepath+'/projcet/save',
    						success : function(data) {
    							var result = $.parseJSON(data);
    							if (result.success) {
    								$('#prog_list_data').datagrid('load');
    								$('#list_data').datagrid('load');
    								ictprog_window_dialog.dialog('close');
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
    				fmtDate();
    			}
    		});
	    }

	   
	    //编辑通讯录
	    function editFun() {
	    	var checkedRows = $("#list_data").datagrid('getChecked');
	    	if (checkedRows.length == 1) {
	    		document.location = basepath+'/project/dataform?id='+checkedRows[0].id;
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
	    					url : basepath+'/project/delete',
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
				name:$("#name").val()
			};
	        $("#list_data").datagrid("load",param);
	    }
	    //点击清空按钮出发事件
	    function clearSearch() {
	        $("#list_data").datagrid("load", {});
	        $("#searchForm").find("input").val("");
	    }
	    
	    window.onload = function () { 
	    	selectCont(null);
	    }

	function selectCont(cid){
		$('#task_list_data').datagrid({
	    	height : 'auto',
	    	nowrap : false,
	    	striped : true,
	    	border : true,
	    	collapsible : false,//是否可折叠的 
	    	fit : true,//自动大小 
	    	loadMsg : '数据加载中请稍后……',
	    	url : basepath+'/task/datagrid?pid='+cid,
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
	    		field : 'username',
	    		title : '处理人',
	    		width : 80
	    	},{
	    		field : 'remark',
	    		title : '任务概述',
	    		width : 100
	    	},{
	    		field : 'status',
	    		title : '任务状态',
	    		width : 100
	    	}] ]
	    });
	    //设置分页控件 
	    var p = $('#task_list_data').datagrid('getPager');
	    $(p).pagination({
	    	pageSize : 10,//每页显示的记录条数，默认为10 
	    	pageList : [ 20, 30, 50 ],//可以设置每页记录条数的列表 
	    	beforePageText : '第',//页数文本框前显示的汉字 
	    	afterPageText : '页    共 {pages} 页',
	    	displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	    });
	}
	    
	//添加联系方式
	function addWayFun(){
		var checkedRows = $("#list_data").datagrid('getChecked');
		if(checkedRows.length == 1) {
			var conway_window_dialog = $('#contact_window').dialog({
				title : '创建任务',
				width : 600,
				height : 400,
				closed : false,
				cache : false,
				href : basepath+'/task/dataform?cid='+checkedRows[0].id,
				modal : true,
				buttons : [ {
					text : '保   存',
					handler : function() {
						$('#way_form').form('submit',{
							url : basepath+'/task/save',
							success : function(data) {
								var result = $.parseJSON(data);
								if (result.success) {
									$('#task_list_data').datagrid('load');
									conway_window_dialog.dialog('close');
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
		}else if(checkedRows.length > 1) {
			$.messager.show({
				title : '提示',
				msg : '只能选择一条集团客户添加其联系方式!',
				timeout : 3000,
				showType : 'slide'
			});
		}else if(checkedRows.length < 1){
			$.messager.show({
				title : '提示',
				msg : '请勾选想要添加联系方式的集团客户!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请勾选想要添加联系方式的集团客户!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}

	
	//编辑联系方式
	function editWayFun(){
		var checkedRows = $("#task_list_data").datagrid('getChecked');
		if(checkedRows.length == 1) {
			var conway_window_dialog = $('#contact_window').dialog({
				title : '编辑任务',
				width : 600,
				height : 400,
				closed : false,
				cache : false,
				href : basepath+'/task/dataform?id='+checkedRows[0].id,
				modal : true,
				buttons : [ {
					text : '保   存',
					handler : function() {
						$('#way_form').form('submit',{
							url : basepath+'/task/save',
							success : function(data) {
								var result = $.parseJSON(data);
								if (result.success) {
									$('#task_list_data').datagrid('load');
									conway_window_dialog.dialog('close');
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
		}else if(checkedRows.length > 1) {
			$.messager.show({
				title : '提示',
				msg : '只能选择一条联系方式进行编辑!',
				timeout : 3000,
				showType : 'slide'
			});
		}else if(checkedRows.length < 1){
			$.messager.show({
				title : '提示',
				msg : '请勾选想要编辑的联系方式!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请勾选想要编辑的联系方式!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}
	    
	//记录删除
	function delWayFun(){
		var checkedRows = $("#task_list_data").datagrid('getChecked');
		if(checkedRows.length == 1) {
			$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
				if(r) {
					$.ajax({
						url : basepath+'/task/delete',
						data : {
							id : checkedRows[0].id
						},
						type:'POST',
						dataType : 'json',
						success : function(json) {
							if (json.success) {
								$("#task_list_data").datagrid('load');
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
