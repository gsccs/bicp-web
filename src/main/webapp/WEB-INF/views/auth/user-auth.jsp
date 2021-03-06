<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title></title>
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
</head>
<body>
<table id="auth_list_data" cellspacing="0" cellpadding="0">
	<thead>
		<tr>
			<th field="id" width="100">ID</th>
			<th field="code" width="100">角色标识</th>
			<th field="title" width="100">角色描述</th>
			<th field="resourceIds" width="100">拥有的资源</th>
			<th field="state" width="100">状态</th>
		</tr>
	</thead>		
</table>

<script type="text/javascript">
var basepath="${pageContext.request.contextPath}";
$('#auth_list_data').datagrid({
	height : 'auto',
	nowrap : false,
	striped : true,
	border : true,
	collapsible : false,//是否可折叠的 
	fit : true,//自动大小 
	loadMsg : '数据加载中请稍后……',
	url : basepath+'/role/datagrid',
	remoteSort : false,
	fitColums : true,
	checkOnSelect : true,
	//singleSelect : false,//是否单选 
	pagination : true,//分页控件 
	rownumbers : true,//行号 
	columns : [ [ {
		field : 'id',
		title : '编号',
		width : 150,
		checkbox : true
	},{
		field : 'code',
		title : '角色标识',
		width : 150
	},{
		field : 'title',
		title : '角色描述',
		width : 150
	}] ],
	onLoadSuccess:function(row){
		var rows = $("#auth_list_data").datagrid("getRows"); 
		var roleids = ${roleids};
		for(var i=0;i<rows.length;i++){
			var rolekey = rows[i].role;
			if (roleids){
				for(var r=0;r<roleids.length;r++){
					if(rolekey == roleids[r]){
						//rows[i].id
						$('#auth_list_data').datagrid('selectRow',i);	
					}
				}
			}
		}
	}
});
//设置分页控件 
var p = $('#auth_list_data').datagrid('getPager');
$(p).pagination({
	pageSize : 10,//每页显示的记录条数，默认为10 
	pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
	beforePageText : '第',//页数文本框前显示的汉字 
	afterPageText : '页    共 {pages} 页',
	displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
});
</script>
</body>
</html>