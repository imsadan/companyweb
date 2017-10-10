<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<title>嘉兴信普科技有限公司</title>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="css/index.css"/>
<link rel="stylesheet" type="text/css" href="css/style2.css">
<link rel="stylesheet" type="text/css" href="css/work_list.css"/>
<!-- 字体 -->
<link rel="stylesheet" href="css/font.css"/>
<link rel="icon" type="image/png" href="images/logo-top-.png">
<script type="text/javascript" src="js/jquery-2.2.0.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/index_pic.js"></script>
<script src="js/main2.js"></script>
</head>
<body oncontextmenu=self.event.returnValue=false onselectstart="return false">

<div id="works_list">
<header>
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container" style="width:80%;">
		   	<div id="flags">     	   
	        </div>
			<div class="collapse navbar-collapse navbar-right navbar-main-collapse top-menu">
				<ul class="nav navbar-nav">	
					<li class="page-scroll">
						<a href="/companyweb" id="#home">HOME</i></a>
					</li>
					<li class="page-scroll">
						<a href="#service">服务</i></a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/about">关于我们</i></a>
					</li>
					<li class="page-scroll active">
						<a href="/companyweb/works">案例展示</i></a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/reads">新闻中心</i></a>
					</li>				
				</ul>
			</div>
		</div>
	</nav>
</header>
<div id="works_pic">
		<div>
		<br><br><br><br>
		      <p align="center" id="ft_about_60" style="color:#000;">PROJECT CASE<br></p>
	          <p align="center" id="wr_40" style="color:#000;">项目案例</p>
		</div>	
</div>
<div id="list_show">
  <c:forEach items="${desc}" var="des">
     <div id="show_left">
	    <p style="font:20px PingFang Medium;">-${des.textname}</p>
		<div style="width:100%;height:2px; background:black;"></div><br>
		<p style="font:18px PingFang Medium;">${des.diec}</p><br>
		<div id="show_back"><p>
		  <a href="/companyweb/works" style="font:20px PingFang Medium;color:#fff;">&lt;返回 </a>
		  </p>
		</div>
	 </div>
	 <div id="show_right"><img src="${des.image}" style="width:100%;height:100%"/></div>
   </c:forEach>	 
</div>
<br><br><br/>
<div style="width:100%;height:1px; background:#E0E0E0;"></div>
    <div style="width:130px;height:20px;margin-left:45%; margin-top:-15px;">
          <div id="top"><img src="images/TOP.png" style="width:100%; height:100%"></div>
    </div>
<!--尾-->
   <div id="footer">
	      <div id="footer_flag">
	       <p id="footer_flag_text">嘉兴信普科技有限公司</p> 
	      </div>
		  <div id="footer_addr">
		     <br>
		    <p align="center" id="foot_wr"><b>地址：</b><br>
			     嘉兴余北大街渔谣路
			</p>
			<p align="center" id="foot_wr"><b>电话：</b><br>
			  0573-83018563
			</p>
			<p align="center" id="foot_wr"><b>邮箱：</b><br>
			   25634893@qq.com
			</p>
		  </div>
		  <div id="footer_home">
		    <br>
			<p align="center" id="foot_wr"><b>关于我们</b></p>
			<p align="center" id="foot_wr"><a href="/companyweb" style="text-decoration:none;color:#000;">公司简介</a></p>
			<p align="center" id="foot_wr"><a href="/companyweb/about" style="text-decoration:none;color:#000;">团队介绍</a></p>
		  </div>
		  <div id="footer_name">
		   <div id="ft_name_btn">
		     <p id="foot_wr"><b>加入我们</b></p>
			 <p id="foot_wr">英才招聘</p>
			 <form method="post" id="formMail">
			    <p id="foot_wr">姓名 NAME</p>
			    <p><input type="text" id="fot_bord" name="username"/></p>
			    <p id="foot_wr">邮箱 E-MAIL</p>
			    <p><input type="text" id="fot_bord" name="email"/></p>
			    <p id="foot_wr">电话 TEL</p>
			    <p><input type="text" id="fot_bord" name="phone"/></p>
			    <p id="foot_wr">信息 INFORMATION</p>
			    <p><input type="text" id="fot_bord" style="width:200px;" name="information"/></p>
			    <button type="button" class="btn btn-default btn-sm" style="width:80px;height:35px;margin-left:60%;" id="mailsubmit" onclick="send_pop(this)"><p id="foot_wr2">发送</p></button>
			 </form>
			 </div>
		  </div>
	   </div>
<script src="js/email.js"></script>
<!-- 发送邮件确认表 -->
<div class="pop2">
    <div class="popMain2">
        <div class="popTop2"></div>
        <div class="popMiddle2">
            <p>是否确认发送？</p>
        </div>
        <div class="popBottom2">
            <span class="confirm">确认</span>
            <span class="cancel">取消</span>
        </div>
    </div>
</div>	   
</div>
<script type="text/javascript">    
	$("#top").click(function(){
		  $("html,body").animate({scrollTop:0}, 500);
	});
</script>
</body>
</html>