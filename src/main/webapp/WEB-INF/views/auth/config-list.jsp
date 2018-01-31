<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>全局配置项</title>
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="static/js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#goods_spec_add").click(function() {
			//$(".tip").fadeIn(200);
			$("#goods_spec").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			//$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
	
	
	function forwardToTypeForm(){
		//隐藏第一步窗口
		$("#goods_type_step_1").fadeOut(100);
		//显示第二步窗口
		//$("#goods_type_step_2").fadeIn(200);
		//window.location.href="http://baidu.com";
		window.location.href="forward?path=goods_type_form";
	}
</script>


</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">数据表</a></li>
			<li><a href="#">基本内容</a></li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">
				<li id="goods_spec_add" class="click"><span><img src="static/images/t01.png" /></span>添加</li>
				<li id="goods_type_update" class="click"><span><img src="static/images/t02.png" /></span>修改</li>
				<li><span><img src="static/images/t03.png" /></span>删除</li>
				<li><span><img src="static/images/t04.png" /></span>统计</li>
			</ul>


			<ul class="toolbar1">
				<li><span><img src="static/images/t05.png" /></span>设置</li>
			</ul>

		</div>


		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" checked="checked" /></th>
					<th>编号<i class="sort"><img src="static/images/px.gif" /></i></th>
					<th>类型名称</th>
					<th>实体商品</th>
					<th>小数型库存</th>
					<th>发布时间</th>
					<th>是否审核</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130908</td>
					<td>电脑</td>
					<td>admin</td>
					<td></td>
					<td>2013-09-09 15:05</td>
					<td>已审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink"> 删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130907</td>
					<td>手机</td>
					<td>是</td>
					<td></td>
					<td>2013-09-08 14:02</td>
					<td>未审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130906</td>
					<td>衣服</td>
					<td>是</td>
					<td></td>
					<td>2013-09-07 13:16</td>
					<td>未审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130905</td>
					<td>水杯</td>
					<td>是</td>
					<td></td>
					<td>2013-09-06 10:36</td>
					<td>已审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130904</td>
					<td>包</td>
					<td>是</td>
					<td></td>
					<td>2013-09-05 13:25</td>
					<td>已审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130903</td>
					<td>鞋</td>
					<td>是</td>
					<td></td>
					<td>2013-09-04 12:00</td>
					<td>已审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130902</td>
					<td>书</td>
					<td>是</td>
					<td></td>
					<td>2013-09-03 00:05</td>
					<td>未审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130901</td>
					<td>凳子</td>
					<td>是</td>
					<td></td>
					<td>2013-09-02 15:05</td>
					<td>未审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>

				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>20130900</td>
					<td>桌子</td>
					<td>是</td>
					<td></td>
					<td>2013-09-01 10:26</td>
					<td>已审核</td>
					<td><a href="#" class="tablelink">查看</a> <a href="#"
						class="tablelink">删除</a></td>
				</tr>
			</tbody>
		</table>


		<div class="pagin">
			<div class="message">
				共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span
						class="pagepre"></span></a></li>
				<li class="paginItem"><a href="javascript:;">1</a></li>
				<li class="paginItem current"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><span
						class="pagenxt"></span></a></li>
			</ul>
		</div>

		
		<!-- 商品规格:选择项 -->
		<div id="goods_spec" class="tip">
			<div class="tiptop">
				<span>商品规格</span><a></a>
			</div>

			<div class="formbody">
				<ul class="forminfo">
					<li><label>是否为实体商品</label><input name="" type="radio" value=""
						checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input name=""
						type="radio" value="" />否</cite></li>
					<li><label>是否与品牌关联</label><input name="" type="radio" value=""
						checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input name=""
						type="radio" value="" />否</cite></li>
					<li><label>是否启用商品扩展属性</label><cite><input name=""
							type="radio" value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input
							name="" type="radio" value="" />否</cite></li>
					<li><label>是否启用商品参数表</label><input name="" type="radio"
						value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input
						name="" type="radio" value="" />否</cite></li>
					<li><label>是否启用购物必填信息</label><input name="" type="radio"
						value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input
						name="" type="radio" value="" />否</cite></li>
				</ul>


			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" onclick="forwardToTypeForm();"/>&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>

		</div>
		
		
		

	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>

</html>
