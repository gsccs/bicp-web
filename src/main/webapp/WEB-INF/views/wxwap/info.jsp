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
<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/async_new.js"></script>
<script language="JavaScript" type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/jquery.cookie.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/main.js"></script>
<script type="text/javascript">
$(function(){
	$.ajax({
        url : "${wxApp.domain}/web/infoClick.html",
        type : "POST",
        data : {
        	id:${content.id }
        },
        success:function() {
      
        }
    });
})
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/digg.js"></script>
	<div class="blog_main">
      <div class="blog_top_wrap">
        <div class="blog_top">
        	<i id="menu_J" class="iconfont icon_l"></i>
          	<h2 class="blog_top_t">${channel.name }</h2>
        </div>
      </div>
      <div class="main_list">
        <div class="blog_article">
	          <div class="blog_article_t">
	            <div class="article_l">
	                <a href="#" class="article_user">${content.addtimeStr }</a>
	            </div>
	            <div class="article_r">
	                <i class="iconfont expert"></i><span>${content.clicknum }人阅读</span>
	            </div>
	          </div>
	          <div class="blog_article_c clearfix">
	          	<div class="article_t" style="text-align: center;padding: 10px 0px;font-size: 1rem;">
					${content.title }
				</div>
				<div class="article_c">
					${content.content }
				</div>
	          </div>
        </div>
      </div>
		<!-- nav -->
	    <jsp:include page="${pageContext.request.contextPath}/widget/sidebar.jsp"/>
    </div>

    <!-- 
    <div class="blog_handle">
        <span id="digg" style="cursor:pointer" onclick=""><i class="iconfont"></i><em>收藏</em></span>
        <span style="cursor:pointer"><a href="#"><i class="iconfont"></i></a><em>62</em></span>
        <span id="share_btn" style="cursor:pointer"><a href="javascript:;"><i class="iconfont"></i></a><em>分享</em></span>
    </div> 
    -->
    <!--分享弹窗：-->
    <div class="popup_cover"></div>
    <div class="sharePopup_box">
		<div class="sharePopup">
	        <!--JiaThis Button BEGIN-->
	        <div class="jiathis_style_32x32">
	        	<a class="jiathis_button_weixin" title="分享到微信"><span class="jiathis_txt jiathis_separator jtico jtico_weixin"><b><i class="iconfont"></i></b><em>微信分享</em></span></a>
	        	<a class="jiathis_button_tsina" title="分享到微博"><span class="jiathis_txt jiathis_separator jtico jtico_tsina"><b><i class="iconfont"></i></b><em>新浪微博</em></span></a>
	        	<a class="jiathis_button_cqq" title="分享到QQ好友"><span class="jiathis_txt jiathis_separator jtico jtico_cqq"><b><i class="iconfont"></i></b><em>QQ好友</em></span></a>
	        	<a class="jiathis_button_qzone" title="分享到QQ空间"><span class="jiathis_txt jiathis_separator jtico jtico_qzone"><b><i class="iconfont"></i></b><em>QQ空间</em></span></a>
	        </div>
	        <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/jia.js" charset="utf-8"></script>
	        <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/plugin.client.js" charset="utf-8"></script>
	        <!--JiaThis Button END-->
		</div>
      	<div class="sharePopup_cancel">取 消</div>
    </div>
    <script>
      $(function(){
        $('#share_btn').click(function(){
          $('.popup_cover').stop().show();
          $('.sharePopup_box').stop().slideDown();
        });
        $('.sharePopup_cancel').click(function(){
          $('.popup_cover').stop().hide();
          $('.sharePopup_box').stop().slideUp();
        });
      })
	</script>

   	<div class="backToTop" style="display: none;"><img src="${pageContext.request.contextPath}/static/weui/images/iconfont-up.png" alt="img"></div>
    <div class="blog_footer">©2016 ${wxApp.title }</div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/fontSize.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/weui/js/tracking.js" charset="utf-8" ></script>
</body>
</html>
