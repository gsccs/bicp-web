<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="hb-loaded" style="font-size: 40px;">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-status-bar-style" content="yes">
    <script src="${pageContext.request.contextPath}/static/common/js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <!--link( rel="stylesheet" href="http://c.csdnimg.cn/public/common/toolbar/css/index.css" )-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/avatar.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/common.css">
    <!-- [if IE 7]-->
    <!--link( rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" )-->
    <!-- [endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/main.css">
    <!-- [if lt IE 9]-->
    <script src="${pageContext.request.contextPath}/static/weui/js/html5shiv.min.js"></script>
    <!-- [endif]-->
    <title></title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/blog_mobile.js"></script>
    
    
    <script type="text/javascript">
    	function wxUserBind(){
    		//$("#fm_bind").submit();
    		$.ajax({
    	        url: "${pageContext.request.contextPath}/web/${appid }/wxUserBindP",
    	        type: "POST",
    	        //data: "openid=${openid}&roleid="+$("#roleid").val(),
    	        //data:{openid:"${openid}",roleid:$("#roleid").val()},
    	        data:$("#fm_bind").serialize(),
    	        //dataType: "json",
    	        //dataType:'text', 
    	        success: function (op) {
    	        	alert("恭喜您，信息提交成功！谢谢您的评价。");
    	        }
    	    }); 
    	}
    </script>
    
    <style type="text/css">
    	.fm_input{
    		width: 100%
    	}
    	
    	
    	.fm_btn{
    		width: 50%;
    		height: 45px;
    	}
    
    </style>
</head>
<body>
	<div class="blog_main">
	      <div class="blog_top_wrap">
	        <div class="blog_top">
	        	<i id="menu_J" class="iconfont icon_l"></i>
	          	<h2 class="blog_top_t">完善会员信息</h2>
	        </div>
	      </div>
	
	      <div class="main_list">
	      	<form action="${pageContext.request.contextPath}/web/${appid }/wxUserBindP" id="fm_bind" method="post">
	      	<input type="hidden" name="openid" value="${openid }">
	      	<input type="hidden" name="appid" value="${appid }">
			<dl class="m_list clearfix">
	              <dt>真实姓名</dt>
	              <dd>
	                <input type="text" name="realname" id="realname" class="fm_input">
	              </dd>
			</dl>
			
			<dl class="m_list clearfix">
	              <dt>手机号码</dt>
	              <dd>
	                <input type="text" name="phone" id="phone" class="fm_input">
	              </dd>
			</dl>
			
			<dl class="m_list clearfix">
	              <dt>我是</dt>
	              <dd>
	                <input type="radio" name="roleid" value="2"> 卖家 
	                <input type="radio" name="roleid" value="3"> 买家 
	                <input type="radio" name="roleid" value="4"> 经纪人
	                <input type="radio" name="roleid" value="5"> 店东
	              </dd>
			</dl>
			
			<div class="new_hot">
				<button id="btn_bind" onclick="wxUserBind()" value="提     交" class="fm_btn"></button>
	        </div>
	        </form>
		</div>
		
	</div>    
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/columnarticlelist.js"></script>

   	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
   	<div class="blog_footer">©2016 ${wxApp.title }</div>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/tracking.js"></script>
</body>
</html>
