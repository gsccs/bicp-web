<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fs" uri="/fs-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>评价</title>
<meta charset="UTF-8">
<meta name="viewport"
	content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${pageContext.request.contextPath}/static/web/css/style.css"
	rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/static/web/css/base.min.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/static/web/js/jquery.easyui.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/static/web/js/json2.js"
	type="text/javascript"></script>
<style type="text/css">
.g_button {
    background: #299ad3;
}

</style>
<script type="text/javascript">
var itemids = "";
function showVoteResult(){
	window.location.href="${pageContext.request.contextPath}/web/voteresult.html";
}
function addVoteResult(){
	var itemids = "";
	$("input[name='topicid']").each(function(){
		var topicid = $(this).val();
		var leg = $("input:radio[name='itemid_"+topicid+"']:checked").size();
	    if (leg==0){
	    	alert("请选择投票项");
	    	return;
	    }
	    var itemid = $("input:radio[name='itemid_"+topicid+"']:checked").val();
	    itemids = itemid+","+itemids;
	});
	$.ajax({
        url: "${wxApp.domain}/web/answer.html?" + new Date(),
        type: "post",
        data: "itemids="+itemids,
        //dataType: "json",
        success: function (op) {
        	alert("恭喜您，信息提交成功！谢谢您的评价。");
        	window.location.href="${wxApp.domain}/web/voteresult.html";
        }
    });
}
</script>
</head>
<body>
	<div>
		<div style="position: relative;">
			<h2 class="tit" style="bottom: 0px;">评价</h2>
			<img alt=""
				src="${pageContext.request.contextPath}/static/web/images/banner2.jpg"
				width="100%">
		</div>
		<div class="main" style="width: 100%;">
			<div>
				<ul id="ulist">
					<li><div class="list-head"></div></li>
				</ul>
			</div>

			<div class="middleCenter middleCenter496">
				<div class="formMiddleContent formMiddleContent496 moduleContent">
					<div class="vote" id="vote496">
						<c:forEach items="${voteList }" var="vote">
							<input type="hidden" name="topicid" value="${vote.topic.id }">
							<div class="voteSubject">
								<div class="voteSubjectText">${vote.topic.name }</div>
							</div>
							<div class="separator g_dashed"></div>
							<div id="voteItems2496" class="voteItems2496">
								<c:forEach items="${vote.itemList }" var="answers">
									<div class="voteItems wekitBox">
										<input id="voteItem_${vote.topic.id }" type="radio" name="itemid_${vote.topic.id }" value="${answers.id }" > 
										<label class="flex1 voteLab" for="voteItem2i30496">${answers.name }</label>
									</div>
								</c:forEach>
							</div>
							<div id="voteMsg2" class="voteMsg g_tip"></div>
						</c:forEach>

						<div class="voteOperate wekitBox">
							<div class="flex1">
								<input type="button" value="投票"  class="g_button voteBtn"
									onclick="addVoteResult()">
							</div>
							<div class="flex1">
								<input type="button" value="查看结果" class="g_button voteBtn"
									onclick="showVoteResult()">
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="more" style="display: block;">
				<span style="cursor: pointer;">点击查看更多</span>
			</div>
		</div>
	</div>
</body>
</html>