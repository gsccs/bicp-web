<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ICT项目</title>
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
            <div data-options="region:'north',title:''" style="height: 50px; background: #F4F4F4;">
                <form id="searchForm">
                    <table>
                        <tr>
                            <th>项目名称：</th>
                            <td>
                                <input id="notice_title" name="title" value=""/></td>
                            <th>状态：</th>
                            <td><select id="state" name="state">
									<option value="1">进行中</option>
									<option value="0">结束</option>
									<option value="-1">关闭</option>
								</select>
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
				</div>
			<div>
    </div>
	
	<div id="dd"></div>
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
			url : basepath+'/ictproj/datagrid',
			remoteSort : false,
			fitColums : true,
			checkOnSelect : true,
			//singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			idField: 'id',
			columns : [ [ {
				field : 'id',
				title : '编号',
				width : 150,
				checkbox : true
			}, {
				field : 'name',
				title : '项目名称',
				width : 150
			}, {
				field : 'planstartdateStr',
				title : '项目开始时间',
				width : 150
			}, {
				field : 'planenddateStr',
				title : '项目结束时间',
				width : 150
			}, {
				field : 'ussm',
				title : '项目金额',
				width : 150
			}, {
				field : 'telephone',
				title : '联系电话',
				width : 150
			}, {
				field : 'statusname',
				title : '状态',
				width : 100
				
			}, {
				field : 'remark',
				title : '备注说明',
				width : 200
			}] ],
			toolbar : '#toobar',
			pageSize : 15,
			pageList : [10, 15 ]
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 10,				//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],	//可以设置每页记录条数的列表 
			beforePageText : '第',		//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		}); 
		
		//添加
		function addFun() {
	    	document.location = basepath+'/ictproj/dataform';
	    }

		//编辑
		function editFun(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			if(checkedRows.length == 1) {
				document.location = basepath+'/ictproj/dataform?id='+checkedRows[0].id;
			}else if(checkedRows.length > 1) {
				$.messager.show({
					title : '提示',
					msg : '只能选择一条信息编辑!',
					timeout : 3000,
					showType : 'slide'
				});
			}else if(checkedRows.length < 1){
				$.messager.show({
					title : '提示',
					msg : '请勾选想要编辑的信息!',
					timeout : 3000,
					showType : 'slide'
				});
			}else {
				$.messager.show({
					title : '提示',
					msg : '请勾选想要编辑的信息!',
					timeout : 3000,
					showType : 'slide'
				});
			}
		}
		
		function addFun() {
			document.location = basepath+'/ictproj/dataform';
		}
		
		
		//记录删除
		function delFun(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			if(checkedRows.length == 1) {
				$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
					if(r) {
						$.ajax({
							url : basepath+'/proj/delete',
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
			var param = $("#searchForm").serialize();
			var noticeobj={
					content:$("#notice_title").val()
			};
	        $("#list_data").datagrid("load",noticeobj);
	    }
	    //点击清空按钮出发事件
	    function clearSearch() {
	        $("#list_data").datagrid("load", {});
	        $("#searchForm").find("input").val("");
	    }
	</script>
</body>

</html>
