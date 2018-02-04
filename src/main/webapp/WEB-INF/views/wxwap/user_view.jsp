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
    <!--link( rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome-ie7.min.css" )-->
    <!-- [endif]-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/weui/css/main.css">
    <!-- [if lt IE 9]-->
    <script src="${pageContext.request.contextPath}/static/weui/js/html5shiv.min.js"></script>
    <!-- [endif]-->
    <title></title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/blog_mobile.js"></script>
</head>
<body>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/blogarticlelist.js"></script>
	<script type="text/javascript">
	    var userid = '${wxUser.id}';
	    var openid = '${openid}';
	</script>

	<div class="blog_main">
	      <div class="blog_top_wrap">
	        <div class="blog_top">
	        	<i id="menu_J" class="iconfont icon_l"></i>
	          	<h2 class="blog_top_t">个人中心</h2>
	        </div>
	      </div>
	      <div class="main_list">
	        <dl class="personal clearfix">
	          <dt>
	          		<a href="#"><img src="${member.img }" alt="img"></a>
	              	<a href="#" class="per_user">${member.name }</a>
	          </dt>
	          <dd class="clearfix">
	            <ul class="personal_list">
	            	<c:if test="${empty member.realid }">
	              	<li><span><a href="${pageContext.request.contextPath}/web/wxa2e35b9927db7ae8/bind?openid=${openid}" class="per_user">党员认证</a></span></li>
	              	</c:if>
	              	<c:if test="${not empty member.realid }">
	              	<li><span><a href="${wxapp.domain }/web/auth.html?openid=${member.id}" class="per_user">已认证</a></span></li>
	              	</c:if>
	            </ul>
	          </dd>
	        </dl>
	        <div class="blog_wrap" page="2">
				<div class="total_blog">
	            	<label><span><a href="${pageContext.request.contextPath}/web/wxa2e35b9927db7ae8/bills?openid=${openid}">我的帐单</a></span><em>（0）</em></label>
	            	<i class="iconfont arrow_down"></i>
	          	</div>
	        </div>
	        <div class="blog_wrap" page="2">
				<div class="total_blog">
	            	<label><span><a href="${pageContext.request.contextPath}/web/wxa2e35b9927db7ae8/projects?openid=${openid}">我的合同</a></span><em>（0）</em></label>
	            	<i class="iconfont arrow_down"></i>
	          	</div>
	        </div>
	        <!-- <div class="blog_wrap" page="2">
				<div class="total_blog">
	            	<label><span>我的考试</span><em>（0）</em></label>
	            	<i class="iconfont arrow_down"></i>
	          	</div>
	        </div> -->
	        <div class="blog_wrap" page="2">
				<div class="total_blog">
	            	<label><span><a href="${wxApp.domain }/web/wxa2e35b9927db7ae8/gbQuery.html">代办任务</a></span><em>（0）</em></label>
	            	<i class="iconfont arrow_down"></i>
	          	</div>
	        </div>
	        
	        <div class="clearfix" style="margin-bottom: 0.5rem;"></div>
	        
	        <div class="blog_wrap" page="2">
				<div class="total_blog">
	            	<label><span><a href="${wxApp.domain }/web/gbQuery.html">我的咨询</a></span><em>（0）</em></label>
	          	</div>
			</div>
		</div>
	
		
	</div>   

	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
    <div class="blog_footer">©2016 ${wxApp.title }</div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
</body>
</html>
