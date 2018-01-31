//表单验证
function formCheck(){
	if($.trim($("#name").val())==""){
		$("#nameHelp").html("必须填写");
		$("#nameDiv").addClass("error");
		$("#name").focus();
		return false;
	}else{
		$("#nameHelp").html("");
		$("#nameDiv").removeClass("error");
	}
	return true;
}
//添加根栏目
function addOne(){
	openWindow('添加根栏目','menuEdit.do',500,410,'false');
}
//添加下级
function addTwo(){
	if(isCheckOne()){
		openWindow('添加下级栏目','menuEdit.do?type=addSon&parId='+getCheckOneValue(),500,410,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}
//编辑
function edit(){
	if(isCheckOne()){
		openWindow('编辑栏目','menuEdit.do?id='+getCheckOneValue(),500,310,'false');
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择一条数据"); 
	}
}

//删除
function del(){
	if(isCheck()){
		var confirm = $.scojs_confirm({
		content: "确定删除操作么?此操作无法回退!",
		action: function() {
				location.href="menuDel.do?id="+getCheckOneValue();
			}
		});
		confirm.show();
		$("#errorDiv").fadeOut("slow"); 
	}else{
		$("#errorDiv").fadeIn("slow"); 
		$("#errorInfo").html("请选择数据"); 
	}
}
//发布
function send(){
	var confirm = $.scojs_confirm({
		content: "确定发布菜单么?此操作会覆盖掉原菜单!",
		action: function() {
				location.href="menuSend.do";
			}
		});
		confirm.show();
}