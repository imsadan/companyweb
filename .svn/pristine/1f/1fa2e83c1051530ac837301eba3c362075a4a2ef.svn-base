		//邮件发送
     function send_pop(temp){
    	 $(".pop2").fadeIn('fast');
         $(".popBottom2").on('click', 'span', function(event) {
             event.preventDefault();
             if($(this).hasClass('confirm')){
            	 $.post("/companyweb/send/mail", $("#formMail").serialize(),function(data){
	          			if (data.status == 200) {
	          				alert("感谢您的信赖！");
	          			} else {
	          				alert("登录失败，原因是：" + data.msg);
	          			}
	          		});
                 $(".pop2").fadeOut();
             }else{
                 $(".pop2").fadeOut();
             }
         });
     }
	