$(function(){
	/*
	 * store auto reply text*/
	
	var senAutoReplyContent = function(url,method,data){
		$.ajax({
			url:url,
			type:method,
			data:data,
			success:function(e){
				if (e.success) {
					alert(e.success);
				} else {
					alert(e.failed);
				}
			},
			error:function(xhr,status,err){
				console.log("update pwd occur error:",err);
			}
		});
	}
	var replyFunctionMap = {
			"1":function(){//文本自动回复
				var content = $("#welcome-pannel .js_textArea .js_editorArea").html();
				var data = {"message_type":1,"content":content}
				senAutoReplyContent("/modules/welcome","POST",data);
			},
			"2":function(){//图片自动回复
				
			}
	}
	$("#welcome-pannel .js_textArea .js_editorArea").click(function(){
		var remainTextNumber = 600 - $(this).html().length
		$("#welcome-pannel .js_editorTip em").html(remainTextNumber);
	});
	
	$("#welcom-auto-reply-text").click(function(){
		var msgType = 1;//TODO change this value when switch tab;
		replyFunctionMap[msgType]();
		
	});
});