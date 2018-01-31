<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>发布</title>
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.form.js"
	type="text/javascript"></script>

<link
	href="${pageContext.request.contextPath}/static/web/css/zAlert.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/static/web/js/zAlert.js"
	type="text/javascript"></script>
	
<link href="${pageContext.request.contextPath}/static/web/css/base.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/css.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/style.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.json-2.3.min.js"
	type="text/javascript"></script>
<style type="text/css">
	select {
		line-height: 35px;
		font-size: 14px;
	}
	
	img {
		width: 49px;
		height: 49px;
	}
	
	.graph {
		width: 95%;
		border: 1px solid #F8B3D0;
		height: 25px;
	}
	
	#bar {
		display: block;
		background: #FFE7F4;
		float: left;
		height: 100%;
		text-align: center;
	}
	
	#barNum {
		position: absolute;
	}
</style>
<script type="text/javascript">
	$(function() {
		var show = "1";
		if (show == 0) {
			$("#llb").hide();
		}
		$("#progressbar").hide();
		//上传图片的操作
		$(".img-file").on("change", function() {
			var fid = this.id;
			var files = !!this.files ? this.files : [];
			if (!files.length || !window.FileReader)
				return;
			if (/^image/.test(files[0].type)) {
				var reader = new FileReader();
				reader.readAsDataURL(files[0]);
				reader.onloadend = function() {
					var id = fid.substring(4);
					var obj = ".img-btn:eq(" + id + ")";
					$(obj).append("<img />")
					$(obj).append("<i>-</i>")
					$(obj + "> img").attr("src", this.result);
				}
			} else {
				$('#' + fid).val('');
			}

		});

	});
	function getUrlParam(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
		var r = window.location.search.substr(1).match(reg); //匹配目标参数
		if (r != null)
			return unescape(r[2]);
		return null; //返回参数值
	}

	function checkPhone(mo) {
		var phone = mo;
		if (!(/^1[3|4|5|7|8]\d{9}$/.test(phone))) {
			alert("手机号码有误，请重填");
			return false;
		} else {
			return true;
		}
	}

	function GetRandomNum(Min, Max) {
		var Range = Max - Min;
		var Rand = Math.random();
		return (Min + Math.round(Rand * Range));
	}

	function Submit(obj) {
		//提交的时候提示
		$(obj).attr("disabled", "none");
		var txtname = $.trim($("#txtname").val());
		var phone = $.trim($("#txtphone").val());
		var content = $.trim($("#txtcontent").val());
		if (txtname == "" || phone == "" || content == "") {
			$(obj).removeAttr("disabled");
			alert("请填全信息！");
			return;
		}
		
		if (!checkPhone(phone)) {
			return;
		}
		if (!vld_cm(phone)) {
			$(obj).text("网络拥堵,正在上传数据，请等待...");
			var num = GetRandomNum(1, 15000);
			setTimeout(function() {
				submitfirst(obj);
				$(obj).text("提 交");
			}, num);
			$(obj).show();
		} else {
			submitfirst(obj);
		}
	}

	function vld_cm(v) {
		var mobile13 = /^13[4-9]\d{8}$/;
		var mobile15 = /^15[012789]\d{8}$/;
		var mobile14 = /^14[7]\d{8}$/;
		var mobile18 = /^18[2378]\d{8}$/;
		return (mobile13.test(v) || mobile15.test(v) || mobile14.test(v) || mobile18
				.test(v));
	}

	function UPloadimg(obj, span) {
		//  alert($(".img-btn:eq(0)").html());
		// alert($(span).val());
		var value = $('#' + obj).val();
		if (value == '') {
			$('#' + obj).click();
		} else {
			$('#' + obj).val('')
			$(span).html('');
			$(span).html('+');
		}
	}
</script>
</head>
<body style="background-color: rgb(254, 251, 243);" verify_mobile="0">
	<div class="header">
		<ul class="clearfix">
			<li id="llb"><a id="aliebiao"
				href="${pageContext.request.contextPath}/web/gbList.html"><i></i>列表</a></li>
			<li class="active"><a id="afabu"
				href="${pageContext.request.contextPath}/web/gbAdd.html"><i></i>发布</a></li>
			<li><a id="achaxu"
				href="${pageContext.request.contextPath}/web/gbQuery.html"><i></i>查询</a></li>
			<li><a id="atongji"
				href="${pageContext.request.contextPath}/web/vote.html"><i></i>评价</a></li>
		</ul>
	</div>
	<div class="apply-form">
			<input type="hidden" id="memberid" name="memberid" value="${member.id}" />
			<div class="label clearfix">
				<span class="label-left">事项类型</span>
				<div class="label-right">
					<select id="iclassid" style="width: 100%; margin-top: 10px">
						<option value="0">==请选择==</option>
						<c:forEach items="${iclassList }" var="iclass">
						<option value="${iclass.id }">${iclass.title }</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="label clearfix">
				<span class="label-left">姓名</span>
				<div class="label-right">
					<input id="txtname" name="name" class="name" type="text" value="${member.name }"
						placeholder="请输入您的姓名(必填)">
				</div>
			</div>
			<div class="label clearfix">
				<span class="label-left">手机号</span>
				<div class="label-right">
					<input id="txtphone" name="tel" class="mobile-input" type="tel"
						value="${member.phone }" placeholder="请输入您的手机号(必填)">
				</div>
			</div>
			<div class="label clearfix" style="border: none;">
				<span class="label-left">内容</span>
				<div class="label-right">
					<textarea id="txtcontent" name="content" class="content"
						placeholder="请清楚地描述您要提交的问题(必填)"></textarea>
				</div>
			</div>
		</form>

		<div class="label clearfix"
			style="height: 58px; line-height: 58px; overflow: hidden; border: none;">
			<span class="label-left" style="line-height: 64px;">上传图片</span>
			<div class="label-right">
				<form id="fm1" enctype="multipart/form-data" action="" method="post">
					<div class="img-btns">
						 <span type="img-1" class="img-btn" onclick="UPloadimg('file0',this)">+ </span>
						 <span type="img-2" class="img-btn" onclick="UPloadimg('file1',this)">+</span> 
						 <span type="img-3" class="img-btn" onclick="UPloadimg('file2',this)">+</span>
						 <span type="img-4" class="img-btn" onclick="UPloadimg('file3',this)">+</span>
					</div>
					<input id="file0" name="imgfile" class="img-file img-1 " type="file">
					<input id="file1" name="imgfile" class="img-file img-2" type="file">
					<input id="file2" name="imgfile" class="img-file img-3" type="file">
					<input id="file3" name="imgfile" class="img-file img-4" type="file">
				</form>
			</div>
		</div>
		<div class="sub-btn" onclick="Submit(this)">提 交</div>
		<div id="progressbar" class="graph" style="display: none;">
			<strong id="bar" style="width: 1%;"></strong>
		</div>
	</div>
	<div class="success">
		<div class="suc-pic"></div>
		<p>请牢记以下受理代码</p>
		<div class="suc-code">
			<input type="text" value="">
		</div>
		<p class="suc-info">提示：点击序号进行复制或截取屏幕图</p>
	</div>

	<script id="header" type="text/html">
    {{each nav as value i}}
    <li><a href="{{nav[i].url}}"><i></i>{{nav[i].title}}</a></li>
    {{/each}}
	</script>
	<script id="say-info" type="text/html">
    <div class="say-info">
        <p>{{description}}</p>
    </div>
	</script>
	<div class="say-info">
		<p></p>
		<p>须知：</p>
		<p>1、请如实填写您需要办理事项内容&nbsp;</p>
		<p>2、提交成功后请记住您的受理代码和手机号，以便您查询受理情况</p>
		<p>3、我们将会安排工作人员在24小时内与您联系，请保持手机畅通</p>
		<p></p>
	</div>


	<script type="text/javascript">
		//提交验证
		function submitfirst(obj) {
			$(obj).attr("disabled", "none");
			var phone = $.trim($("#txtphone").val());
			var name = $.trim($("#txtname").val());
			var content = $.trim($("#txtcontent").val());
			var memberid = $("#memberid").val();
			var iclassid = $("#iclassid").val();
			if (phone == "" || content == "") {
				$(obj).removeAttr("disabled");
				alert("内容有误，信息不完整！");
				return;
			}
			if (!checkPhone(phone)) {
				alert("手机号码错误！");
				return;
			}
			//提交数据到服务器上
			$("#fm1").ajaxSubmit({
                url: "${wxApp.domain}/web/gbSave.html?" + new Date(),
                type: "post",
                data: {"iclassid":iclassid,"name":name,"memberid":memberid,"tel":phone, "content": content},
                dataType: "json",
                success: function (op) {
                	 subflag = true;
                	 alert("信息提交成功，感谢参与！");
                	 $(obj).removeAttr("disabled");
                     $("#txtphone").val(''); 
                     $("#txtcontent").val('');
                     $(".img-btn").html('+');
                }
            });
		}
	</script>
</body>
</html>