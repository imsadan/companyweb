<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>信普后台登录系统</title>
	<link rel="stylesheet" href="css/login.css">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <script src="js/jquery.js"></script>
</head>

<body>
    <h1>信普后台登录系统</h1>
    <div class="container w3">
        <h2>现在登录</h2>
		<form  method="post" id="formlogin" onsubmit="return false;">
			<div class="username">
				<span class="username" style="height:19px">用户:</span>
				<input type="text" name="name" class="name" placeholder="" required="" id="loginname">
				<div class="clear"></div>
			</div>
			<div class="password-agileits">
				<span class="username"style="height:19px">密码:</span>
				<input type="password" name="password" class="password" placeholder="" required="">
				<div class="clear"></div>
			</div>
			<div class="rem-for-agile">
				<a href="#">忘记了密码</a><br>
			</div>
			<div class="login-w3">
					<input type="submit" class="login" value="Login" id="loginsubmit">
			</div>
			<div class="clear"></div>
		</form>
	</div>
<script type="text/javascript">
	  
	  var redirectUrl = "${redirect}";      
	  var LOGIN = {
              doLogin:function() {
					$.post("/companyweb/user/login", $("#formlogin").serialize(),function(data){
						if (data.status == 200) {
							alert("登录成功！");
							if (redirectUrl == "") {
								location.href = "http://xp.whoisyun.com/companyweb/admin";
							} else {
								location.href = redirectUrl;
							}
						} else {
							alert("登录失败，原因是：" + data.msg);
							$("#loginname").select();
						}
					});
				},
				login:function() {			
						this.doLogin();
				}
			
		};
		$(function(){
			$("#loginsubmit").click(function(){
				LOGIN.login();
			});
		});
</script>
	<div class="footer-w3l">
		<p> 信普后台登录系统</p>
	</div>
</body>
</html>