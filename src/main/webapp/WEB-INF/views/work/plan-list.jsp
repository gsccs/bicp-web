<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>社区工作计划</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
</head>


<body>
<div class="easyui-layout" fit="true" border="false">
            <div data-options="region:'north',title:'社区工作计划'" style="height: 100px; background: #F4F4F4;">
                <form id="searchForm">
                    <table>
                        <tr>
                            <th>标题：</th>
                            <td><input id="plan_title" name="title" value=""/></td>
                        
                            <th>状态：</th>
                            <td>
                            <select id="plan_state">
                            	<option value="">-----请选择-----</option>
                            	<option value="0">未执行</option>
                            	<option value="1">正在进行</option>
                            	<option value="2">已完成</option>
                            </select> 
                            </td>
                            <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
                            <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="clearSearch();">清空</a></td>
                        </tr>
                    </table>
                </form>
            </div>
            <div data-options="region:'center',split:false">
                <table id="list_data" cellspacing="0" cellpadding="0">
					<thead>
						<tr>
							<th field="id" width="100">ID</th>
							<th field="title" width="100">标题</th>
							<th field="content" width="100">计划内容</th>
							<th field="assigner" width="100">责任人</th>
							<th field="joinusers" width="100">参与者</th>
							<th field="addtimestr" width="100">制定时间</th>
							<th field="pstartstr" width="100">计划开始时间</th>
							<th field="pendstr" width="100">计划完成时间</th>
							<th field="address" width="100">地点</th>
							<th field="state" width="100">状态</th>
						</tr>
					</thead>
				</table>
            </div>
    </div>
	
	<div id="dd"></div>
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
		$('#list_data').datagrid({
			title : '社区工作计划',
			height : 'auto',
			nowrap : false,
			striped : true,
			border : true,
			collapsible : false,//是否可折叠的 
			fit : true,//自动大小 
			loadMsg : '数据加载中请稍后……',
			url : basepath+'/plan/datagrid',
			remoteSort : false,
			fitColums : true,
			checkOnSelect : true,
			//singleSelect : false,//是否单选 
			pagination : true,//分页控件 
			rownumbers : true,//行号 
			frozenColumns : [ [ {
				field : 'ck',
				checkbox : true
			} ] ],
			toolbar : [ {
				text : '添加',
				iconCls : 'icon-add',
				handler : function() {
					//openDialog("add_dialog", "add");
					addFun();
				}
			}, '-', {
				text : '修改',
				iconCls : 'icon-edit',
				handler : function() {
					//openDialog("add_dialog", "edit");
					editFun();
				}
			}, '-', {
				text : '删除',
				iconCls : 'icon-remove',
				handler : function() {
					delAppInfo();
				}
			} ]
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 10,//每页显示的记录条数，默认为10 
			pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
			beforePageText : '第',//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		/*onBeforeRefresh:function(){
		    $(this).pagination('loading');
		    alert('before refresh');
		    $(this).pagination('loaded');
		}*/
		});

		
		function editFun(){
		var plan_edit_dialog = $('#dd').dialog({
			    title: '修改工作计划',
			    width: 600,
			    height:400,
			    closed: false,
			    cache: false,
			    href: basepath+'/plan/edit',
			    modal: true,
			    buttons : [ {
					text : '添加',
					handler : function() {
						$('#notice_editForm').form('submit', {
							url : basepath+'/plan/edit',
							type: 'POST',
							success : function(data) {
								var json = $.parseJSON(data);
									if (json.success) {
										$('#list_data').datagrid('load');
										plan_edit_dialog.dialog('close');
									}
									$.messager.show({
										title : '提示',
										msg : json.msg,
										timeout : 3000,
										showType : 'slide'
									});
							}
						});
					}
				} ]
			});
		}
		function addFun() {
		var plan_edit_dialog = $('#dd').dialog({
			    title: '新增工作计划',
			    width: 600,
			    height:400,
			    closed: false,
			    cache: false,
			    href: basepath+'/plan/add',
			    modal: true,
			    buttons : [ {
					text : '添加',
					handler : function() {
						$('#notice_editForm').form('submit', {
							url : basepath+'/plan/edit',
							type: 'POST',
							success : function(data) {
								var json = $.parseJSON(data);
									if (json.success) {
										$('#list_data').datagrid('load');
										plan_edit_dialog.dialog('close');
									}
									$.messager.show({
										title : '提示',
										msg : json.msg,
										timeout : 3000,
										showType : 'slide'
									});
							}
						});
					}
				} ]
			});
		}
		
		
		function searchFunc() {
			var param = $("#searchForm").serialize();
			var noticeobj={
				title:$("#plan_title").val(),
				state:$("#plan_state").val()
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
