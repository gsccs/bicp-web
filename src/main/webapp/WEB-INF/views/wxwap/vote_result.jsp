<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> <%@
taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> <%@ taglib
prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${pageContext.request.contextPath}/static/web/css/style.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/base.min.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/static/web/js/jquery.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/web/js/json2.js" type="text/javascript"></script>

<link rel="stylesheet" type="text/css" href="http://mo.faisys.com/css/base.min.css?v=201608231558" title="default">
<link rel="stylesheet" type="text/css" href="http://mo.faisys.com/css/bannerAnimation.min.css?v=201511101951" title="">
<link rel="stylesheet" id="mobiStyleTemplateCss" type="text/css" href="http://mo.faisys.com/css/template/333.min.css?v=201601261936">
</head>
<body>
	<div>
		<div style="position: relative;">
			<h2 class="tit" style="bottom: 0px;">满意度调查</h2>
			<img alt="" src="${pageContext.request.contextPath}/static/web/images/banner2.jpg" width="100%" />
		</div>
		
		<c:forEach items="${voteList }" var="vote">
		<div class="vote">
			<div class="voteSubject">
				<div class="voteSubjectText">${vote.topic.name }</div>
			</div>
			<div class="separator g_dashed"></div>
			<c:forEach items="${vote.itemList }" var="answers">
			<div class="progressBar-box" id="voteResultItem3">
				<div class="voteItemName">${answers.name }：</div>
				<div class="voteItemShow wekitBox">
					<div class="progressBarBg flex1">
						<div class="progressBar" style="width: ${answers.ratenum }%;"></div>
					</div>
					<div class="voteItemCount ">&nbsp;${answers.selectnum }&nbsp;(${answers.ratenum }%)</div>
				</div>
			</div>
			</c:forEach>
		</div>
		</c:forEach>
	</div>
</body>
</html>