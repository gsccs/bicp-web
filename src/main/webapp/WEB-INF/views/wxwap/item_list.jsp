<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link href="${pageContext.request.contextPath}/static/web/css/css.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/web/css/base.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/web/css/style.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/static/web/js/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/static/web/js/jquery.easyui.min.js" type="text/javascript"></script>

    <link href="${pageContext.request.contextPath}/static/web/css/fullscreenstyle.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/static/web/css/pagestyle.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/static/web/js/jquery.fullscreenslides.js" type="text/javascript"></script>
    <script type="text/javascript">
        function showbigimg() {
            $('img').fullscreenslides();
            var $container = $('#fullscreenSlideshowContainer');
            $container
                    .bind("init", function () {
                        $container
                                .append('<div class="ui" id="fs-close">&times;</div>')
                                .append('<div class="ui" id="fs-loader">Loading...</div>')
                                .append('<div class="ui" id="fs-prev">&lt;</div>')
                                .append('<div class="ui" id="fs-next">&gt;</div>')
                                .append('<div class="ui" id="fs-caption"><span></span></div>');

                        $('#fs-prev').click(function () {
                            $container.trigger("prevSlide");
                        });

                        $('#fs-next').click(function () {
                            $container.trigger("nextSlide");
                        });

                        $('#fs-close').click(function () {
                            $container.trigger("close");
                        });

                    })

                    .bind("startLoading", function () {
                        $('#fs-loader').show();
                    })

                    .bind("stopLoading", function () {
                        $('#fs-loader').hide();
                    })

                    .bind("startOfSlide", function (event, slide) {

                        $('#fs-caption span').text(slide.title);
                        $('#fs-caption').show();
                    })

                    .bind("endOfSlide", function (event, slide) {
                        $('#fs-caption').hide();
                    });
            //上面的是现实大图
        }
    </script>
    <style type="text/css">

        .label-right {
            overflow: hidden;
            float: left;
            width: 77%;
        }
        .img-btns {
            width: 200%;
        }
        /*小图的UI */
        .img-btn {
            margin-top: 6px;
            display: block;
            width: 50px;
            height: 50px;
            float: left;
            border: 1px dashed #ccc;
            background-color: #f9f9f9;
            text-align: center;
            line-height: 44px;
            font-size: 40px;
            color: #cfcfcf;
            margin-right: 5px;
            position: relative;
            margin-left: 2px;
        }

        .img-btn img {
            position: absolute;
            width: 100%;
            height: 100%;
            left: 0;
            top: 0;
            background-color: #eee;
        }
        .img-btn i {
            position: absolute;
            width: 12px;
            height: 12px;
            overflow: hidden;
            border-radius: 12px;
            background-color: red;
            color: #fff;
            text-align: center;
            line-height: 12px;
            font-size: 14px;
            right: -3px;
            top: -3px;
            z-index: 1000;
        }
    </style>
</head>
    <body>
        <div id="dvlink" class="header">
            <ul class="clearfix">
                <li id="llb" class="active"><a id="aliebiao" href="${pageContext.request.contextPath}/web/gbList.html"><i></i>列表</a></li>
                <li><a id="afabu" href="${pageContext.request.contextPath}/web/gbAdd.html"><i></i>发布</a></li>
                <li><a id="achaxu" href="${pageContext.request.contextPath}/web/gbQuery.html"><i></i>查询</a></li>
                <li><a id="atongji" href="${pageContext.request.contextPath}/web/vote.html"><i></i>评价</a></li>
            </ul>
        </div>
        <div class="chief-list">
            <ul id="ulist">
            	<c:forEach items="${guestbookList }" var="guestbook">
                <li>
                    <div class="list-head" onclick="clicklink('201608070008')">
                        <span class="p-name">${guestbook.name }</span>
                        <span class="p-state">
                            <u class="color-green">
                            	<c:if test="${guestbook.state=='1' }">已受理</c:if>
                            	<c:if test="${guestbook.state=='0' }">待受理</c:if>
                            </u>
                        </span>
                    </div>
                    <div class="list-con">
                        <div class="list-item">
                            <p class="p-say">${guestbook.content }</p>
                            <div class="label-left" style="width: 77%;">
	                            <div class="img-btns">
	                            	<c:forEach items="${guestbook.albums }" var="album">
									<span type="img-1" class="img-btn">+
									<a rel="gallery" href="${album }"><img src="${album }" style="height: 50px;width: 50px;" /></a>
									</span>
									</c:forEach>
								</div>
							</div>
                            <div class="p-time">${guestbook.addtimeStr }</div>
                        </div>
                        <c:forEach items="${guestbook.replyList }" var="apply">
                        <div class="list-item list-repeat">
                            <p class="p-say">
                            	<span class="color-red">回复：</span>${apply.content }
                            </p>
                            <div class="p-time">${apply.addtimeStr }</div>
                        </div>
                        </c:forEach>
                    </div>
                </li>
                </c:forEach>
            </ul>
        </div>
        <div id="dvmore" class="sub-btn list-more" style="display: none;" onclick="getlist()">更多</div>
        <div id="fullscreenSlideshowContainer" style="display: none; position: absolute; top: 0px; left: 0px; width: 100%; text-align: center; background-color: rgb(0, 0, 0);"></div>
    </body>
</html>