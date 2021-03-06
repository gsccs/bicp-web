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
                <table id="list_data" cellspacing="0" cellpadding="0">
				</table>
            </div>
            <div id="toobar" style="padding:5px;height:auto">
				<div style="margin-bottom:5px">
					<shiro:hasPermission name="corp:create">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onClick="revertFun()">归还</a>
					</shiro:hasPermission>
				</div>
    </div>
	
	<div id="ictprog_window"></div>
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
		function fmtDate(){
			$('.easyui-datebox').attr("readonly","readonly");
			$('.easyui-datebox').datebox({
			    formatter: function(date){ 
			    	if(date){
			    		var day = date.getDate() > 9 ? date.getDate() : "0" + date.getDate();
			    		var month = (date.getMonth() + 1) > 9 ? (date.getMonth() + 1) : "0"+ (date.getMonth() + 1);
			    		return date.getFullYear()+'-'+month+'-'+day;
			    	}
			    },
			    parser: function(date){ 
			    	if(date){
			    	return new Date(Date.parse(date.replace(/-/g,"/")));
			    	}
			    }
			});
		}
		$(document).ready(function(){
			fmtDate();
		});	
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
	    		field : 'tchno',
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
	    	}] ],
			toolbar : '#toobar',
			pageSize : 15,
			pageList : [10, 15 ],
			onClickRow:function () {
		        var projrow = $('#list_data').datagrid("getSelected");
		        //loadHisDataDg(projrow.id);
		    }
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
		
		
		//设备借用
		function lendFun(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			if(checkedRows.length == 1) {
				var ictprog_window_dialog = $('#ictprog_window').dialog({
	    			title : '设备领用',
	    			width : 600,
	    			height : 400,
	    			closed : false,
	    			cache : false,
	    			href : basepath+'/terlend/dataform?parid='+checkedRows[0].id,
	    			modal : true,
	    			buttons : [ {
	    				text : '保   存',
	    				handler : function() {
	    					var valid = $("#prog_form").form('validate');
	    					if(!valid){
	    						return;
	    					}
	    					$('#prog_form').form('submit',{
	    						url : basepath+'/terlend/save',
	    						success : function(data) {
	    							var result = $.parseJSON(data);
	    							if (result.success) {
	    								$('#prog_list_data').datagrid('load');
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
			}else if(checkedRows.length > 1) {
				$.messager.show({
					title : '提示',
					msg : '只能选择一条ICT项目添加其项目进度!',
					timeout : 3000,
					showType : 'slide'
				});
			}else if(checkedRows.length < 1){
				$.messager.show({
					title : '提示',
					msg : '请勾选想要添加的ICT项目!',
					timeout : 3000,
					showType : 'slide'
				});
			}else {
				$.messager.show({
					title : '提示',
					msg : '请勾选想要添加的ICT项目!',
					timeout : 3000,
					showType : 'slide'
				});
			}
		}
		
		
		//记录删除
		function delFun(){
			var checkedRows = $("#list_data").datagrid('getChecked');
			if(checkedRows.length == 1) {
				$.messager.confirm('确认', '您是否要删除当前选中的记录？', function(r) {
					if(r) {
						$.ajax({
							url : basepath+'/terhis/delete',
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
