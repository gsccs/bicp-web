<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="hb-loaded" style="font-size: 40px;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="yes">
    <title>党员认证</title>
	<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.min.js"
	type="text/javascript"></script>
	<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.form.js"
	type="text/javascript"></script>
	<link
	href="${pageContext.request.contextPath}/static/web/css/jquery.alert.css"
	rel="stylesheet" type="text/css">
	<script src="${pageContext.request.contextPath}/static/web/js/jquery.alert.js"
	type="text/javascript"></script>
	
	
    <link rel="stylesheet" 
    href="${pageContext.request.contextPath}/static/weui/css/bootstrap.css">
    <link rel="stylesheet" 
    href="${pageContext.request.contextPath}/static/weui/css/avatar.css">
    <link rel="stylesheet" 
    href="${pageContext.request.contextPath}/static/weui/css/common.css">
    <link rel="stylesheet" 
    href="${pageContext.request.contextPath}/static/weui/css/main.css">
    <!-- [if lt IE 9]-->
    <script 
    src="${pageContext.request.contextPath}/static/weui/js/html5shiv.min.js"></script>
    <!-- [endif]-->
    <script type="text/javascript" 
    src="${pageContext.request.contextPath}/static/weui/js/blog_mobile.js"></script>
    <style type="text/css">
	    .sub-btn {
		    height: 40px;
		    line-height: 40px;
		    background-color: #3c3;
		    color: #fff;
		    text-align: center;
		    border-radius: 3px;
		    margin-top: 10px;
		    font-size: 14px;
		}
		#authtype {
	        width: 160px;
	        height: 26px;
	        font-size: 16px;
	    }
	    dd, dt, dl {
	    line-height: 2.5;
	    font-weight: normal;
	    font-size: 19px;
	    }
	    option {
	    font-size: 14px;
	    }
	    input {
		    outline: none;
		    height: 26px;
		    line-height: 10px;
		}
    </style>
    
    <script type="text/javascript">
    function submit1(obj) {
    	//提交的时候提示
        $(obj).attr("disabled", "none");
        var openid = $("#openid").val();
        var authtype = $("#authtype").val();
        var phone = $.trim($("#phone").val());
        var idcode = $.trim($("#idcode").val());
        if (authtype=="1"){	
        	if(phone==""){
        		$(obj).removeAttr("disabled");
        		alert("手机号码不能为空");
        		return;
        	}
        }
        if (authtype=="2"){
        	if(idcode==""){
        		$(obj).removeAttr("disabled");
        		alert("身份证号不能为空");
        		return;
        	}
        }
        
      	//提交数据到服务器上
        $.ajax({
            url: "${wxapp.domain}/web/authDo.html",
            type: "post",
            data: {"openid":openid,"phone":phone,"idcode":idcode,"authtype": authtype},
            //dataType: "json",
            success: function (op) {
            	console.log(op);
            	alert("信息提交成功，感谢参与！");
            	window.location.href = window.location.href;
            }
        });
    }
    
    
    function selectAuthType(obj){
    	var authtype = $(obj).val();
    	if (authtype=="1"){
    		$("#idcodetype").hide();
    		$("#phonetype").show();
    	}
    	
		if (authtype=="2"){
    		$("#idcodetype").show();
    		$("#phonetype").hide();
    	}
    }
    </script>
</head>
<body>
<script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/main.js"></script>

<div class="blog_main">
      <div class="blog_top_wrap">
        <div class="blog_top">
        	<i id="menu_J" class="iconfont icon_l"></i>
          	<h2 class="blog_top_t">
          	党员认证
          	</h2>
        </div>
      </div>
      <div class="main_list">
        <div class="blog_article">
          <div class="blog_article_t">
            <div class="article_l"><a href="#"><img src="${member.img }" alt="img"></a>
                <a href="#" class="article_user">${member.name }</a></div>
            <div class="article_r">
                <i class="iconfont expert"></i><span>
                <c:if test="${empty member.realid }">
                       未认证
                </c:if>
                <c:if test="${not empty member.realid }">
                       已认证
                </c:if>       
                </span>
            </div>
          </div>
          <div class="blog_article_c clearfix">
          	<form style="margin-top: 50px;margin-bottom: 50px;"enctype="multipart/form-data" action="" method="post">
          		<input type="hidden" id="openid" name="openid" value="${member.id }">
          		<dl>
          			<dt style="float: left;">请选择认证方式:&nbsp;&nbsp;</dt>
          			<dd><select name="authtype" id="authtype" onchange="selectAuthType(this);">
          				<option value="1">手机号码</option>
          				<option value="2">身份证号</option>
          				</select> 
          			</dd>
          		</dl>
          		<dl></dl>
          		<dl id="phonetype">
          			<dt>手机号码</dt>
          			<dd><input type="tel" name="phone" id="phone"> </dd>
          		</dl>
          		
          		<dl id="idcodetype" style="display: none;">
          			<dt>身份证号</dt>
          			<dd><input type="text" name="idcode" id="idcode" value="" > </dd>
          		</dl>
          		<br>
          		<div class="sub-btn" onclick="submit1(this)">提交认证</div>
            </form>
          </div>
        </div>
      	
      </div>
	  <jsp:include page="${pageContext.request.contextPath}/widget/sidebar.jsp"/>		
    </div>

    
   	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
    <div class="blog_footer">©2016 ${wxApp.title }</div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
</body>
</html>
