<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>摸底数据录入</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/easyui/themes/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/easyui/easyui-lang-zh_CN.js"></script>

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
    	<div data-options="region:'north'," style="height: 40px; background: #F4F4F4;">
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
			<div class="easyui-layout" fit="true" border="false">
				<div data-options="region:'west',title:''" style="width:45%;">
					<table id="corp_list_data" cellspacing="0" cellpadding="0"></table>
				</div>
				<div data-options="region:'east'" style="width:55%;">
					<div class="easyui-layout" fit="true" border="false">
						<div data-options="region:'west',title:''" style="width:45%;">
							<table id="product_list_data" cellspacing="0" cellpadding="0"></table>
						</div>
						<div data-options="region:'east'" style="width:55%;">
							<table id="prop_list_data" class="easyui-propertygrid" cellspacing="0" cellpadding="0"></table>
						</div>
					</div>
				</div>
			</div>
        </div>
    </div>
	
	<script type="text/javascript">
		var basepath="${pageContext.request.contextPath}";
		var corpid;
		var productid;
		$(function() {
			$("#corp_list_data").datagrid({
				height : 'auto',
				nowrap : false,
				striped : true,
				border : true,
				collapsible : false,//是否可折叠的 
				fit : true,//自动大小 
				loadMsg : '数据加载中请稍后……',
				url : basepath+'/corp/datagrid',
				remoteSort : false,
				fitColums : true,
				checkOnSelect : true,
				singleSelect : true,//是否单选 
				pagination : true,//分页控件 
				rownumbers : true,//行号
				idField: 'ispcode',
				frozenColumns : [ [ {
					field : 'ck',
					checkbox : true
				} ] ],
				columns : [ [ {
					field : 'ispcode',
					title : '集团编码',
					width : 150
				}, {
					field : 'title',
					title : '集团名称',
					width : 250
				}] ],
				toolbar : '#toobar',
				pageSize : 15,
				pageList : [10, 15 ],
				onClickRow:function () {
			        var corprow = $('#corp_list_data').datagrid("getSelected");
			        corpid = corprow.ispcode;
			        selectPropVal();
			    }
			});
			var p = $('#corp_list_data').datagrid('getPager');
			$(p).pagination({
				pageSize : 15,//每页显示的记录条数，默认为10 
				pageList : [ 5, 10, 15 ],//可以设置每页记录条数的列表 
				beforePageText : '第',//页数文本框前显示的汉字 
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
			});
			
			$('#product_list_data').datagrid({
		    	height : 'auto',
		    	nowrap : false,
		    	striped : true,
		    	border : false,
		    	collapsible : false,//是否可折叠的 
		    	fit : true,//自动大小 
		    	loadMsg : '数据加载中请稍后……',
		    	url : basepath+'/product/datagrid?',
		    	remoteSort : false,
		    	fitColums : true,
		    	checkOnSelect : true,
		    	singleSelect : true,//是否单选 
		    	columns : [ [ {
		    		field : 'id',
		    		title : '编号',
		    		width : 50,
		    		checkbox : true
		    	},{          
		    		field : 'title',
		    		title : '产品名称',
		    		width : 200
		    	}] ],
		    	onClickRow:function () {
			        var productRow = $('#product_list_data').datagrid("getSelected");
			        productid = productRow.id;
			        selectPropVal();
			    }
			});
		});	
			
		function selectPropVal(){
			if (productid=="" || corpid==""){
				return;
			}
			var url = basepath+'/survey/getPropval?productid='+productid+"&corpid="+corpid;
			$('#prop_list_data').propertygrid({  
                url : url, 
                method:'get',
                //fit : true, 
                border : false,  
                //showGroup: true,
                scrollbarSize: 0,
                //rows:json.rows
                columns: [[
                   		{field:'name',title:'摸底项',width:100,sortable:true},
               		    {field:'value',title:'结果',width:100,resizable:false},
               		 	{field:'corpid',title:'客户',width:0,hidden:true},
               		 	{field:'productid',title:'产品',width:0,hidden:true},
               		 	{field:'propid',title:'属性',width:0,hidden:true}
                ]],
                toolbar : [{
			        text: '保存', 
			        iconCls: 'icon-save', 
			        handler: function () {
			            //使用JSON序列化datarow对象，发送到后台。
			            var rows = $("#prop_list_data").propertygrid('getRows');
			            var propvallist = new Array();
			            if (rows.length>0){
			            	for(var i=0;i<rows.length;i++){
			            		var propval= {
			            			productid:productid,
			            			corpid:corpid,
			            			propid:rows[i].propid,
			            			propval:rows[i].value
			            		};
			            		propvallist.push(propval);
			            	}
			            }
			            
			            console.log("propvallist:",propvallist);
			            if(propvallist.length>0){
			            	var postdata = JSON.stringify(propvallist);
			            	$.ajax({  
				                type: "post", // 请求方式  
				                url: basepath+"/propv/save", //url地址
				                data:postdata, //数据  
				                contentType: "application/json",  
				                dataType: "json",  
				                success: function (response, ifo) {  
				                    $("#prop_list_data").datagrid('reload');
				                    $.messager.show({
				            			title : '提示',
				            			msg : '数据保存成功!',
				            			timeout : 3000,
				            			showType : 'slide'
				            		});
				                }, error: function () {  
				                	$.messager.show({
				            			title : '提示',
				            			msg : '数据保存失败!',
				            			timeout : 3000,
				            			showType : 'slide'
				            		});
				                }  
				            }); 
			            }
			        }
			    }]
            }); 
		}
	</script>
</body>
</html>
