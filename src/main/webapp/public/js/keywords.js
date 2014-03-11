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
	};
	var replyFunctionMap = {
			"1":function(){//文本自动回复
				var content = $("#keywords-pannel .js_textArea .js_editorArea").html();
				var keywords = "1";//TODO get key words and rule's name
				var data = {"message_type":1,"content":content, "key_words":keywords};
				senAutoReplyContent("/modules/keywords","POST",data);
			},
			"2":function(){//图片自动回复
				
			}
	};
	$("#keywords-pannel .js_textArea .js_editorArea").click(function(){
		var remainTextNumber = 600 - $(this).html().length;
		$("#keywords-pannel .js_editorTip em").html(remainTextNumber);
	});
	
	$("#keywords-auto-reply-text").click(function(){
		var msgType = 1;//TODO change this value when switch tab;
		replyFunctionMap[msgType]();
		
	});
});