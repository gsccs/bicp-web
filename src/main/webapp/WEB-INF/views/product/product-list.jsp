<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>产品列表</title>
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

<body>
<div class="easyui-layout" fit="true" border="false">
	<div data-options="region:'north'" style="height: 50px; background: #F4F4F4;">
		<form id="searchForm">
			<table>
			  <tr>
	              <th>产品名称：</th>
	              <td><input id="title" name="title" value="" class="textbox textbox_indent" style="height: 20px"/></td>
	              <th>状态：</th>
	              <td>
	              	<select id="status" name="status" class="textbox textbox_indent">
	              		<option value="">----- 请选择-----</option>
	              		<option value="1">   正常    </option>
	              		<option value="0">   下线     </option>
	              	</select>
	              </td>
	               <th>是否参与摸底产品：</th>
	              <td>
	              	<select id="ismodi" name="ismodi" class="textbox textbox_indent">
	              		<option value="">----- 请选择-----</option>
	              		<option value="1">   是    </option>
	              		<option value="0">   否     </option>
	              	</select>
	              </td>
	               <th>是否成员营销产品：</th>
	              <td>
	              	<select id="issem" name="issem" class="textbox textbox_indent">
	              		<option value="">----- 请选择-----</option>
	              		<option value="1">   是    </option>
	              		<option value="0">   否     </option>
	              	</select>
	              </td>
	          	  <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
	              <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="clearSearch();">清空</a></td>
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
					<div data-options="region:'east'" style="width:35%;">
						<table id="prop_list_data" cellspacing="0" cellpadding="0"></table>
					</div>
				</div>
            </div>
	<div id="toobar" style="padding:5px;height:auto">
		<div style="margin-bottom:5px">
			<shiro:hasPermission name="corp:create">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true"  onClick="addFun()">新增</a>
			</shiro:hasPermission>
			<shiro:hasPermission name="corp:update">
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editFun()">修改</a>
			</shiro:hasPermission>
			<shiro:hasPermission name="corp:delete">
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delFun()">删除</a>
			</shiro:hasPermission>
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onClick="addPropFun()">添加属性</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onClick="editPropFun()">编辑属性</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onClick="delPropFun()">删除属性</a>
		</div>
	<div>
</div>
<div id="product_window"></div>


<script type="text/javascript">
	var basepath = "${pageContext.request.contextPath}";
	$(function() {
		$("#list_data").datagrid({
			height : 'auto',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			fit : true,//自动大小 
			loadMsg : '数据加载中请稍后……',
			url : basepath+'/product/datagrid',
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
			}, {
				field : 'title',
				title : '产品名称',
				width : 150
			}, {
				field : 'status',
				title : '状态',
				width : 150,
				 formatter:function(value,row){
			    	var str = "";
			    	if(value=="1"){
			    		str = "<font style=''>正常</font>";
			    	}else{
			    		str = "<font style=''>下线</font>";
			    	}
			    	 return str;
				} 
			}, {
				field : 'ismodi',
				title : '是否参与摸底产品',
				width : 150,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=="1"){
			    		str = "<font style=''>是 </font>";
			    	}else{
			    		str = "<font style=''>否</font>";
			    	}
			    	 return str;
				}
				
			
			}, {
				field : 'issem',
				title : '是否成员营销产品',
				width : 150,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=="1"){
			    		str = "<font style=''>是</font>";
			    	}else{
			    		str = "<font style=''>否</font>";
			    	}
			    	 return str;
				}
			}, {
				field : 'remark',
				title : '备注',
				width : 150
			}  ] ],
			toolbar : '#toobar',
			pageSize : 15,
			pageList : [10, 15 ],
			onClickRow:function () {
		        var proprow = $('#list_data').datagrid("getSelected");
		        selectProp(proprow.id);
		       
		    }
		});
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 15,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
			beforePageText : '第',//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		});
	});

	/*产品添加*/
	function addFun() {
		document.location = basepath+'/product/dataform';
	}
	
	
	/*产品编辑*/
	function editFun() {
		var checkedRows = $("#list_data").datagrid('getChecked');
		if (checkedRows.length == 1) {
			document.location = basepath+'/product/dataform?id='+checkedRows[0].id;
		} else if(checkedRows.length > 1) {
			$.messager.show({
				title : '提示',
				msg : '只能选择一个记录!',
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
	//删除产品
	function delFun(){
		var checkedRows = $("#list_data").datagrid('getChecked');
		if(checkedRows.length == 1) {
			$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
				if(r) {
					$.ajax({
						url : basepath+'/product/delete',
						data : {
							ids : checkedRows[0].id
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
	
	//获取属性列表
	function getPropListFun() {
		var checkedRows = $("#list_data").datagrid('getChecked');
		if (checkedRows.length == 1) {
			self.location = basepath+'/prop/list?productid='+checkedRows[0].id;
		} else if(checkedRows.length > 1) {
			$.messager.show({
				title : '提示',
				msg : '只能选择一项产品!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请选择单条产品!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}
	
	
	
	
	/*添加产品属性*/
	function addPropFun() {
		var checkedRows = $("#list_data").datagrid('getChecked');
		if (checkedRows.length == 1) {
			var prop_window_dialog = $('#product_window').dialog({
			title : '产品属性编辑',
			width : 600,
			height : 400,
			closed : false,
			cache : false,
			href : basepath+'/prop/dataform?productid='+checkedRows[0].id,
			modal : true,
			buttons : [ {
				text : '保   存',
				handler : function() {
					$('#prop_form').form('submit',{
						url : basepath+'/prop/create',
						success : function(data) {
							var result = $.parseJSON(data);
							if (result.success) {
								$('#prop_list_data').datagrid('load');
								prop_window_dialog.dialog('close');
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
				msg : '只能选择一个产品添加其属性!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请勾选添加属性的相应产品!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}
	
	
	/*编辑产品属性*/
	function editPropFun() {
		var checkedRows = $("#prop_list_data").datagrid('getChecked');
		if (checkedRows.length == 1) {
			var prop_window_dialog = $('#product_window').dialog({
			title : '产品属性编辑',
			width : 600,
			height : 400,
			closed : false,
			cache : false,
			href : basepath+'/prop/dataform?id='+checkedRows[0].id,
			modal : true,
			buttons : [ {
				text : '保   存',
				handler : function() {
					$('#prop_form').form('submit',{
						url : basepath+'/prop/update',
						success : function(data) {
							var result = $.parseJSON(data);
							if (result.success) {
								$('#prop_list_data').datagrid('load');
								prop_window_dialog.dialog('close');
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
				msg : '只能选择一个产品添加其属性!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请勾选添加属性的相应产品!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}
	
	
	//删除产品
	function delPropFun(){
		var checkedRows = $("#prop_list_data").datagrid('getChecked');
		if(checkedRows.length == 1) {
			$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
				if(r) {
					$.ajax({
						url : basepath+'/prop/delete',
						data : {
							ids : checkedRows[0].id
						},
						type:'POST',
						dataType : 'json',
						success : function(json) {
							if (json.success) {
								$("#prop_list_data").datagrid('load');
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
				msg : '只能选择一个产品属性删除!',
				timeout : 3000,
				showType : 'slide'
			});
		}else {
			$.messager.show({
				title : '提示',
				msg : '请勾选想要删除的产品属性!',
				timeout : 3000,
				showType : 'slide'
			});
		}
	}
	
	
			
	function searchFunc(){
		var paramobj={
			title:$("#title").val(),
			ismodi:$("#ismodi").val(),
			issem:$("#issem").val(),
			state:$("#state").val()
		};
        $("#list_data").datagrid("load",paramobj);
	}
	
	//点击清空按钮出发事件
    function clearSearch() {
        $("#list_data").datagrid("load", {});
        $("#searchForm").find("input").val("");
    }
	
    window.onload = function () { 
    	//selectProp(null);
    }

function selectProp(pid){
	$('#prop_list_data').datagrid({
    	height : 'auto',
    	nowrap : false,
    	striped : true,
    	border : true,
    	collapsible : false,//是否可折叠的 
    	fit : true,//自动大小 
    	loadMsg : '数据加载中请稍后……',
    	url : basepath+'/prop/datagrid?productid='+pid,
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
    		field : 'title',
    		title : '属性名称',
    		width : 100
    	},{
    		field : 'propcode',
    		title : '属性编码',
    		width : 100
    	}] ]
    });
    //设置分页控件 
    var p = $('#prop_list_data').datagrid('getPager');
    $(p).pagination({
    	pageSize : 10,//每页显示的记录条数，默认为10 
    	pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
    	beforePageText : '第',//页数文本框前显示的汉字 
    	afterPageText : '页    共 {pages} 页',
    	displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
    });
}
	
	
/*编辑产品属性值*/
function editPropvFun() {
	var checkedRows = $("#propv_list_data").datagrid('getChecked');
	if (checkedRows.length == 1) {
		var propv_window_dialog = $('#product_window').dialog({
			title : '产品属性值编辑',
			width : 600,
			height : 400,
			closed : false,
			cache : false,
			href : basepath+'/propv/dataform?id='+checkedRows[0].id,
			modal : true,
			buttons : [ {
				text : '保   存',
				handler : function() {
					$('#propv_form').form('submit',{
						url : basepath+'/propv/update',
						success : function(data) {
							var result = $.parseJSON(data);
							if (result.success) {
								$('#propv_list_data').datagrid('load');
								propv_window_dialog.dialog('close');
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
			msg : '只能选择一个记录!',
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


</script>

</body>
</html>
