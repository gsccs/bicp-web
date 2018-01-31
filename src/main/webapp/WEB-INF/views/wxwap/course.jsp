<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>微课堂</title>
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
	$(function(){
		$(".course-tab").click(function(){
			  $(".course-tab").removeClass("active");
			  $(this).addClass("active");
			  var tabid = $(this).attr("data-id");
			  $(".apply-form").hide();
			  $("#"+tabid).show();
			});
	});
</script>
<script type="text/javascript">
		var subflag = false;
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
        
        function editContent(){
        	subflag = false;
        }
 
        //手机号验证
        function vld_cm(v) {
    		var mobile13 = /^13[4-9]\d{8}$/;
    		var mobile15 = /^15[012789]\d{8}$/;
    		var mobile14 = /^14[7]\d{8}$/;
    		var mobile18 = /^18[2378]\d{8}$/;
    		return (mobile13.test(v) || mobile15.test(v) || mobile14.test(v) || mobile18
    				.test(v));
    	}

        //图片上传
        function UPloadimg(obj, span) {
            //alert($(".img-btn:eq(0)").html());
            //alert($(span).val());
            var value = $('#' + obj).val();
            if (value=='') {
                $('#' + obj).click();
            }
            else {
                $('#' + obj).val('');
                $(span).html('');
                $(span).html('+');
            }
        }
        
        function showReplay(id){
        	$("#replay_"+id).show();
        }
        
        function Submit(obj) {
        	if (subflag){
        		alert("请不要重复提交！");
        	}
            /* //提交的时候提示
            $(obj).attr("disabled", "none");
            var txtname = $.trim($("#txtname").val());
            var phone = $.trim($("#txtphone").val());
            var content = $.trim($("#txtcontent").val());
            if (txtname == "" || phone == "" || content == "") {
                $(obj).removeAttr("disabled");
                alert("请填写完整信息！");
                return;
            } */
            submitfirst(obj);
        }
    </script>
    <script type="text/javascript">
	    //学习心得回复提交
	    function rep_submit(courseid,unitid,parid) {
	        var name = $.trim($("#rep_name_"+parid).val());
	        var content = $.trim($("#rep_content_"+parid).val());
	       
	        if (name == "" || content == "") {
	            alert("提交失败，信息不完整");
	            return;
	        }
	        
	        //$("#replay_"+parid).hide(); 
	        
	        //提交数据到服务器上
	        $.ajax({
	            url: "${wxApp.domain}/web/fed.html",
	            type: "post",
	            data: {"unitid":unitid,"courseid":courseid,"parid":parid,"name": name, "content": content},
	            dataType: "json",
	            success: function (op) {
	            	 alert("信息提交成功，感谢参与！");
	            	 var html_ = "<div class=\"list-item list-repeat\">"
	                    +"<p class=\"p-say\">"
	                    +"<span class=\"color-red\">"+name+"： </span>"+content+"</p>"
	                    +"<div class=\"p-time\"></div>"
	             		+"</div>";
	             	$("#replay_"+parid).before(html_);
	             	$("#replay_"+parid).hide();
	            },
	            error: function (op) {
	            	 alert("信息提交成功，感谢参与！");
	            	 var html_ = "<div class=\"list-item list-repeat\">"
	                    +"<p class=\"p-say\">"
	                    +"<span class=\"color-red\">"+name+"： </span>"+content+"</p>"
	                    +"<div class=\"p-time\"></div>"
	             		+"</div>";
	             	$("#replay_"+parid).before(html_);
	             	$("#replay_"+parid).hide();
	            }
	        });
	    }    
    </script>
</head>
<body style="background-color: rgb(254, 251, 243);" verify_mobile="0">
	<div class="header">
		<ul class="clearfix">
			<li class="course-tab active" data-id="c_main"><a href="javascript:void(0);"><i></i>课程内容</a></li>
        	<li class="course-tab" data-id="c_user"><a href="javascript:void(0);"><i></i>参加人员</a></li>
           	<li class="course-tab" data-id="c_feed"><a href="javascript:void(0);"><i></i>学习心得</a></li>
            <li class="course-tab" data-id="c_book"><a href="javascript:void(0);"><i></i>线上学习</a></li>
        </ul>
	</div>
	<!-- 课程内容 -->
	<div id="c_main" class="apply-form" >
		<div class="label clearfix">
			<span class="label-left">学习主题</span>
			<div class="label-right">${course.name }</div>
		</div>
		<div class="label clearfix">
			<span class="label-left">学习时间</span>
			<div class="label-right">${course.addtimestr }</div>
		</div>
		<div class="label clearfix">
			<span class="label-left">应到人数</span>
			<div class="label-right">${course.plannum }人</div>
		</div>
		<div class="label clearfix">
			<span class="label-left">实到人数</span>
			<div class="label-right">${course.realnum }人</div>
		</div>
		<div class="label clearfix">
			<span class="label-left">会议地点</span>
			<div class="label-right">${course.address }</div>
		</div>
		<div class="label clearfix" style="border: none;">
			<span class="label-left">学习内容</span>
			<div class="label-right">
				${course.content }
			</div>
		</div>
	</div>
	
	<!-- 参加人员 -->
	<div id="c_user" class="apply-form" style="display: none;">
		<c:forEach items="${memberList }" var="member">
		<div class="label clearfix">
			<span class="label-left" style="width: 77%;">${member.name } </span>
			<span class="label-right" style="width: 23%;">现场学习</span>
		</div>
		</c:forEach>
	</div>
	<!-- 参加人员结束 -->
	
	<!-- 线上学习 -->
	<div id="c_book" class="apply-form chief-list" style="display: none;">
		<ul id="ulist">
			<c:forEach items="${feedList }" var="feed">
                <li>
                    <div class="list-head">
                        <span class="p-name">${feed.name }</span>
                        <span class="p-state">
                            <u class="color-green"></u>
                        </span>
                    </div>
                    <div class="list-con">
                        <div class="list-item" onclick="showReplay('${feed.id}')">
                            <p class="p-say">${feed.content }</p>
                            <div class="label-left" style="width: 77%;">
                            <div class="img-btns">
                            	<c:forEach items="${feed.albums }" var="album">
								<span type="img-1" class="img-btn">+
								<a rel="gallery" href="${wxAppDomain}/${album }"><img src="${wxAppDomain}/${album }" style="height: 50px;width: 50px;"></a>
								</span>
								</c:forEach>
							</div>
							</div>
                            <div class="p-time">${feed.addtimestr }</div>
                        </div>
                        
                        <c:forEach items="${feed.replyList }" var="apply">
                        <div class="list-item list-repeat">
                            <p class="p-say"><span class="color-red">
                            <c:if test="${not empty apply.name}">${apply.name }：</c:if>
                            </span>${apply.content }</p>
                            <div class="label-left" style="width: 77%;">
	                            <div class="img-btns">
	                            	<c:forEach items="${apply.albums }" var="album">
									<span type="img-1" class="img-btn">+
									<a rel="gallery" href="${wxAppDomain}/${album }"><img src="${wxAppDomain}/${album }" style="height: 50px;width: 50px;"></a>
									</span>
									</c:forEach>
								</div>
							</div>
                            <div class="p-time">${apply.addtimestr }</div>
                        </div>
                        </c:forEach>
                        <div id="replay_${feed.id }" style="display: none;">
                        	<div class="label clearfix">
								<span class="label-left">姓名</span>
								<div class="label-right">
									<input id="rep_name_${feed.id }" name="name" class="name" type="text" value=""
										placeholder="请输入您的姓名(必填)" style="margin-top: 5px;">
								</div>
							</div>
							<div class="label clearfix" style="border: none;">
								<span class="label-left">内容</span>
								<div class="label-right">
									<textarea id="rep_content_${feed.id }" name="content" class="content"
										placeholder=""></textarea>
								</div>
							</div>
							<div class="sub-btn" onclick="rep_submit('${feed.courseid }','${feed.unitid }','${feed.id }')">提 交</div>
                        </div>
                    </div>
                </li>
                </c:forEach>
            </ul>
	</div>
	<!-- 线上学习结束 -->
	
	<!-- 学习心得 -->
	<div id="c_feed" class="apply-form" style="display: none;">
		<input type="hidden" id="courseid" name="courseid" value="${course.id }">
		<input type="hidden" id="unitid" name="unitid" value="${course.unitid }">
		<div class="label clearfix">
			<span class="label-left">姓名</span>
			<div class="label-right">
				<input id="txtname" name="name" class="name" type="text" value="${member.name }"
					placeholder="请输入您的姓名(必填)" style="margin-top: 5px;">
			</div>
		</div>
		<div class="label clearfix">
			<span class="label-left">手机号</span>
			<div class="label-right">
				<input id="txtphone" name="tel" class="mobile-input" type="tel"
					value="${member.phone }" placeholder="请输入您的手机号(必填)" style="margin-top: 5px;">
			</div>
		</div>
		
		<div class="label clearfix" style="border: none;">
			<span class="label-left">内容</span>
			<div class="label-right">
				<textarea id="txtcontent" name="content" class="content"
					placeholder="" onchange="editContent();"></textarea>
			</div>
		</div>
		<div class="label clearfix"
			style="height: 58px; line-height: 58px; overflow: hidden; border: none;">
			<span class="label-left" style="line-height: 64px;">上传图片</span>
			<div class="label-right">
				<form id="fm1" enctype="multipart/form-data" action="" method="post">
					<div class="img-btns">
						 <span type="img-1" class="img-btn" onclick="UPloadimg('file2',this)">+ </span>
						 <span type="img-2" class="img-btn" onclick="UPloadimg('file3',this)">+</span> 
						 <span type="img-3" class="img-btn" onclick="UPloadimg('file4',this)">+</span>
						 <span type="img-4" class="img-btn" onclick="UPloadimg('file5',this)">+</span>
					</div>
					<input id="file2" name="imgfile" class="img-file img-1 " type="file">
					<input id="file3" name="imgfile" class="img-file img-2" type="file">
					<input id="file4" name="imgfile" class="img-file img-3" type="file">
					<input id="file5" name="imgfile" class="img-file img-4" type="file">
				</form>
			</div>
		</div>
		<div class="sub-btn" onclick="Submit(this)">提 交</div>
		<div id="progressbar" class="graph" style="display: none;">
			<strong id="bar" style="width: 1%;"></strong>
		</div>
	</div>
	<!-- 学习心得结束 -->
	
	<script type="text/javascript">
		function submitfirst(obj) {
	        $(obj).attr("disabled", "none");
	        var txtname = $.trim($("#txtname").val());
	        var phone = $.trim($("#txtphone").val());
	        var content = $.trim($("#txtcontent").val());
	        var courseid = $("#courseid").val();
	        var unitid = $("#unitid").val();
	        
	        if (txtname == "" || phone == "" || content == "") {
	            $(obj).removeAttr("disabled");
	            alert("请填写完整信息！");
	            return;
	        }
	        
	        
	       
	        //提交数据到服务器上
	        $("#fm1").ajaxSubmit({
	            url: "${wxApp.domain}/web/fed.html?" + new Date(),
	            type: "post",
	            data: {"unitid":unitid,"courseid":courseid,"name": txtname, "content": content},
	            dataType: "json",
	            success: function (op) {
	            	 op=JSON.stringify(op);  
	            	 subflag = true;
	            	 alert("恭喜你提交成功，谢谢你的参与！");
	            	 window.location.href = window.location.href;
	            	 $(obj).removeAttr("disabled");
	                 /* $("#txtname").val(''); 
	                 $("#txtphone").val(''); 
	                 $("#txtcontent").val('');
	                 $(".img-btn").html('+'); */
	            },
	            error: function (op) {
	            	op=JSON.stringify(op);  
	            	 subflag = true;
	            	 alert("恭喜你提交成功，谢谢你的参与！");
	            	 window.location.href = window.location.href;
	            	 $(obj).removeAttr("disabled");
	                 /* $("#txtname").val(''); 
	                 $("#txtphone").val(''); 
	                 $("#txtcontent").val('');
	                 $(".img-btn").html('+'); */
	            }
	        });
	    }
	</script>
</body>
</html>