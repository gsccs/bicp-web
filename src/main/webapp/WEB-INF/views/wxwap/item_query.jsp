<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${pageContext.request.contextPath}/static/web/css/css.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/base.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/style.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.min.js"
	type="text/javascript"></script>
<script type="text/javascript">
function serach() {
	//查询
	var iclassid = $("#iclassid").val();
	location.href="${wxApp.domain}/web/gbQuery.html?iclassid="+iclassid+"&openid=${member.id}";
}
</script>

</head>
<body style="background-color: rgb(254, 251, 243);">
	<div class="header">
		<ul class="clearfix">
        	<li><a href="${wxApp.domain}/web/gbList.html"><i></i>列表</a></li>
           	<li><a href="${wxApp.domain}/web/gbAdd.html"><i></i>发布</a></li>
            <li class="active"><a href="${wxApp.domain}/web/gbQuery.html"><i></i>查询</a></li>
            <li><a href="${wxApp.domain}/web/vote.html"><i></i>评价</a></li>
        </ul>
	</div>
	<div class="search-require">
		
		<div class="label clearfix">
			<span class="label-left">事项类别</span>
			<div class="label-right">
				<select id="iclassid" name="iclassid" style="width: 100%; margin-top: 10px">
					<option value="">==请选择==</option>
					<c:forEach items="${iclassList }" var="iclass">
					<option value="${iclass.id }">${iclass.title }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="sub-btn" onclick="serach()">查 询</div>
	</div>
	<div id="dvresult" class="search-result" style="display:block;">
		<h2>我的反馈</h2>
		<div id="dvq" class="chief-list">
			<ul>
				<c:forEach items="${guestbookList }" var="guestbook">
                <li>
                    <div class="list-head">
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
	</div>
</body>
</html>