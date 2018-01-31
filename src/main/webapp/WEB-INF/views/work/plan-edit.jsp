<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="static/js/jquery.js"></script>
<script type="text/javascript" src="static/js/jquery.idTabs.min.js"></script>
<script type="text/javascript" src="static/js/select-ui.min.js"></script>
<script type="text/javascript" src="static/editor/kindeditor.js"></script>

<script type="text/javascript">
    KE.show({
        id : 'content7',
        cssPath : './index.css'
    });
  </script>

<script type="text/javascript">
$(document).ready(function(e) {
    $(".select1").uedSelect({
		width : 345			  
	});
	$(".select2").uedSelect({
		width : 167  
	});
	$(".select3").uedSelect({
		width : 100
	});
});
</script>
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">系统设置</a></li>
		</ul>
	</div>

	<div class="formbody">


		<div id="usual1" class="usual">

			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">基本设置</a></li>
					<li><a href="#tab2">扩展属性</a></li>
					<li><a href="#tab3">规格</a></li>
					<li><a href="#tab4">详细参数</a></li>
					<li><a href="#tab5">购物必填信息</a></li>
				</ul>
			</div>

			<div id="tab1" class="tabson">

				<div class="formtext">
					欢迎您试用信息发布功能！
				</div>

				<ul class="forminfo">
					<li><label>类型名称<b>*</b></label><input name="" type="text"
						class="dfinput" value="请填写类型名称" style="width: 518px;" /></li>
					<li><label>类型别名<b></b></label><input name="" type="text"
						class="dfinput" value="请填写类型名称" style="width: 518px;" /></li>
					<li><label>关联品牌<b></b></label>
						<div class="vocation">
							<select class="select1">
								<option>UI设计师</option>
								<option>交互设计师</option>
								<option>前端设计师</option>
								<option>其他</option>
							</select>
						</div></li>
					
					<li><label>是否启用小数类型库存</label><input name="" type="radio" value=""
						checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input name=""
						type="radio" value="" />否</cite></li>
				</ul>

			</div>


			<div id="tab2" class="tabson">
				<ul class="seachform">
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="添加一个扩展属性" /></li>
				</ul>


				<table class="tablelist">
					<thead>
						<tr>
							<th>编号<i class="sort"><img src="static/images/px.gif" /></i></th>
							<th>属性名</th>
							<th>属性别名</th>
							<th>前台列表页表现类型 </th>
							<th>选择项可选值</th>
							<th>显示</th>
							<th>多选</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>20130908</td>
							<td>书</td>
							<td>admin</td>
							<td></td>
							<td></td>
							<td>是</td>
							<td>是</td>
							<td><a href="#" class="tablelink"> 删除</a></td>
						</tr>

						
						<tr>
							<td>20130908</td>
							<td><input name="" type="text" value="" /></td>
							<td><input name="" type="text" value="" /></td>
							<td><select name="">
								<option></option>
								<option></option>
							</select> </td>
							<td><input name="" type="button" value="增加可选项" /></td>
							<td><input name="" type="checkbox" value="" /></td>
							<td><input name="" type="checkbox" value="" /></td>
							<td><a href="#" class="tablelink">删除</a></td>
						</tr>

					</tbody>
				</table>
			</div>
			<div id="tab3" class="tabson">
				<ul class="seachform">
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="选择规格" /></li>
				</ul>
			</div>
			<div id="tab4" class="tabson">
				<ul class="seachform">
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="添加一个参数组" /></li>
				</ul>
			</div>
			<div id="tab5" class="tabson">
				<ul class="seachform">
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="添加一个可选项" /></li>
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="添加一个单行输入框" /></li>
					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="添加一个多行输入框" /></li>
				</ul>
			</div>
			<div>
				<label>&nbsp;</label><input name="" type="button"
						class="btn" value="保存" />
			</div>
		</div>

		<script type="text/javascript"> 
      $("#usual1 ul").idTabs(); 
    </script>

		<script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>





	</div>


</body>

</html>
