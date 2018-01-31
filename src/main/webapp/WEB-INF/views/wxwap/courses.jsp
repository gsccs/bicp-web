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
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/blog_mobile.js"></script>
</head>
<body>
	<div class="blog_main">
	      <div class="blog_top_wrap">
	        <div class="blog_top">
	        	<i id="menu_J" class="iconfont icon_l"></i>
	          	<h2 class="blog_top_t">党课学习</h2>
	        </div>
	      </div>
	
	      <div class="main_list">
	        <div class="new_hot">
				<a href="${site.sitedomain }/web/courses.html?openid=${member.id}&type=own" class="blog_new  <c:if test="${empty type || type=='own' }">blog_red</c:if> ">我的</a>
				<a href="${site.sitedomain }/web/courses.html?openid=${member.id}&type=all" class="blog_hot  <c:if test="${type=='all' }">blog_red</c:if>">全部</a>
	        </div>
			
			<c:forEach items="${courseList }" var="course">
			<dl class="m_list clearfix">
	              <dt><a href="${site.sitedomain }/web/course-${course.id}.html?openid=${member.id}">${course.name }</a></dt>
	              <dd>
	                <label>
	                    <a href="#" class="username">地点:${course.address }</a>
	                </label>
	                <span><em>时间:${course.addtimestr }</em></span>
	              </dd>
			</dl>
			</c:forEach>
		</div>
	    <!-- nav -->
	    <jsp:include page="${pageContext.request.contextPath}/widget/sidebar.jsp"/>
		
	</div>    
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/columnarticlelist.js"></script>
   	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
   	<div class="blog_footer">©2016 ${wxApp.title }</div>
   	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
</body>
</html>
