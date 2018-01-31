<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>设备列表</title>
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
            <div data-options="region:'north'" style="height: 50px; background: #F4F4F4;">
                <form id="searchForm">
                    <table>
                        <tr>
                            <th>商户号：</th>
                            <td><input id="q_mchno" name="mchno" value=""/></td>
                            <th>序列号：</th>
                            <td><input id="q_tersn" name="tersn" value=""/></td>
                            <th>客户经理：</th>
                            <td><select id="q_userid" name="userid" class="textbox textbox_indent">
				              		<option value="">----- 请选择-----</option>
				              		<c:forEach items="${userList }" var="user">
				              		<option value="${user.id }" > ${user.title }</option>
				              		</c:forEach>
				              	</select>
                            </td>
                            <th>变更类型：</th>
                            <td><select id="q_edittype" name="edittype">
                            		<option value="">----请选择-----</option>
                            		<option value="1001">商户号变更</option>
									<option value="1002">终端号变更</option>
									<option value="1003">程序版本变更</option>
									<option value="2001">领用、归还</option>
								</select>
                            </td>
                            <td><a class="easyui-linkbutton" href="javascript:void(0);" onclick="searchFunc();">查找</a></td>
                        </tr>
                    </table>
                </form>
            </div>
            
            <div data-options="region:'center',split:false">
                <table id="list_data" cellspacing="0" cellpadding="0"></table>
            </div>
    </div>
	
	<div id="ictprog_window"></div>
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
			url : basepath+'/terhis/datagrid',
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
	    		width : 50,
	    		checkbox : true
	    	},{
	    		field : 'edittimeStr',
	    		title : '变更时间',
	    		width : 150
	    	},{
	    		field : 'mchno',
	    		title : '商户号',
	    		width : 150
	    	},{
	    		field : 'terno',
	    		title : '终端号',
	    		width : 100
	    	},{
	    		field : 'pgmv',
	    		title : '程序版本',
	    		width : 150
	    	},{
	    		field : 'userid',
	    		title : '客户经理',
	    		width : 100
	    	}, {
				field : 'edittype',
				title : '变更内容',
				width : 120,
				formatter:function(value,row){
			    	var str = "";
			    	if(value=="1001"){
			    		str = "<font style='color:red'>商户号变更 </font>";
			    	}else if(value=="1002"){
			    		str = "<font style='color:red'>终端号变更</font>";
			    	}else if(value=="1003"){
			    		str = "<font style='color:red'>程序版本变更</font>";
			    	}else if(value=="2001"){
			    		str = "<font style='color:red'>设备领用</font>";
			    	}else if(value=="2002"){
			    		str = "<font style='color:red'>设备归还</font>";
			    	}
			    	 return str;
				} 
			},{
	    		field : 'remark',
	    		title : '备注信息',
	    		width : 200
	    	},{
	    		field : 'userid',
	    		title : '经办人',
	    		width : 100
	    	}] ],
			pageSize : 20,
			pageList : [20, 30, 50],
			onClickRow:function () {
		        var projrow = $('#list_data').datagrid("getSelected");
		        //loadHisDataDg(projrow.id);
		    }
		});
		//设置分页控件 
		var p = $('#list_data').datagrid('getPager');
		$(p).pagination({
			pageSize : 20,				//每页显示的记录条数，默认为10 
			pageList : [ 20, 30, 50],	//可以设置每页记录条数的列表 
			beforePageText : '第',		//页数文本框前显示的汉字 
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		}); 
		
		function searchFunc() {
			//var param = $("#searchForm").serialize();
			var param={
				mchno:$("#q_mchno").val(),
				tersn:$("#q_tersn").val(),
				userid:$("#q_userid").val(),
				edittype:$("#q_edittype").val()
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
