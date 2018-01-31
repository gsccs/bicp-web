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
</head>
<body>
	<div class="blog_main">
	      <div class="blog_top_wrap">
	        <div class="blog_top">
	        	<i id="menu_J" class="iconfont icon_l"></i>
	          	<h2 class="blog_top_t">${channel.name }</h2>
	        </div>
	      </div>
	
	      <div class="main_list">
	        <div class="new_hot">
				<a href="${wxApp.domain }/web/c-${channel.id}.html?order=addtime&openid=${member.id}" class="blog_new blog_red">正在办理</a>
				<a href="${wxApp.domain }/web/c-${channel.id}.html?order=clicknum&openid=${member.id}" class="blog_hot">已办理</a>
	        </div>
			
			<c:forEach items="${list }" var="task">
			<dl class="m_list clearfix">
	              <dt><a href="/web/task.html?openid=${member.id}">【${channel.name }】${task.title }</a></dt>
	              <dd>
	                <!-- 
	                <label>
	                    <a href="#"><img src="" alt="Neacy_Zz"></a>
	                    <a href="#" class="username">Neacy_Zz</a>
	                </label> 
	                -->
	                <span><em>任务节点</em><em>|</em><a href="/web/task.html?openid=${member.id}">状态</a></span>
	              </dd>
			</dl>
			</c:forEach>
		</div>
		<!-- nav -->
	    <jsp:include page="/widget/sidebar.jsp"/>
	    
		
	</div>    
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/columnarticlelist.js"></script>

   	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
   	<div class="blog_footer">©2016 ${wxApp.title }</div>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/tracking.js"></script>
</body>
</html>
