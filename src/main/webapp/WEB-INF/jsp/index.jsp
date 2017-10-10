<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8">
<title>嘉兴信普科技有限公司</title>
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/index_tab.js"></script>
<script src="js/main2.js"></script>
<!--视觉效果  -->
<!-- <script src="js/index.js"></script> -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/style2.css">
<link rel="stylesheet" href="css/supersized.css" media="screen" />
<link rel="stylesheet" href="css/index.css"/>
<link rel="icon" type="image/png" href="images/logo-top-.png">
<!-- 字体 -->
<link rel="stylesheet" href="css/font.css"/>

<style>

#h1txt{
   text-shadow:1px 0px 3px #FFF;
   float:left;
}

</style>
</head>
<body id="page-top" data-spy="scroll" data-target=".navbar-custom"  onLoad="$('#num').val(1);">

<div class="body">

<!-- Header -->
<header>
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container" style="width:80%;">
		   	<div id="flags">    	   
	        </div>
			<div class="collapse navbar-collapse navbar-right navbar-main-collapse top-menu">
				<ul class="nav navbar-nav">	
					<li class="page-scroll active">
						<a href="/companyweb">HOME</a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/service">服务</a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/about">关于我们</a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/works">案例展示</a>
					</li>
					<li class="page-scroll">
						<a href="/companyweb/reads">新闻中心</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
</header>
<section class="intro" id="home" >
    <div id="top_txt">
		<img src="images/flag4.png" style="width:100%;height:100%;" />
	</div>
		<div class="all_pic" id='cs'>
			<div class="screen">
		        <ul>
		            <li><img src="images/flag1.png" width="100%" height="100%" /></li>
		            <li><img src="images/flag2.png" width="100%" height="100%" /></li>
		            <li><img src="images/flag3.png" width="100%" height="100%" />   
		            </li>
		        </ul>
		    </div>
		    <ol>
			       
		    </ol>
		</div>
	<div id="button_scro">
	  <img src="images/button.png" style="width:100%;height:100%;" id="scro" class="scro" onclick="scroPic()"/>
	</div>
	<!-- 左侧2图标信息 -->
   <div style="width:50px;height:50px;position:absolute;bottom:230px;left:30px;" >
     <img src="images/phone.png" style="width:100%;height:100%;" id="1"/>
   </div>
	<div class="panel panel-info" style="bottom:210px;left:85px;position:absolute;display:none;" id="1_pic">
	    <div class="panel-heading">
	        <h3 class="panel-title">联系电话</h3>
	    </div>
	    <div class="panel-body">
	        <p style="color:#000;">0573-83018563</p>
	    </div>
	</div>
   <div style="width:50px;height:50px;position:absolute;bottom:170px;left:30px;"  id="2">
     <img src="images/wechat.png" style="width:100%;height:100%;"/>
   </div>  
     <div id="2_pic" style="width:200px;height:200px;bottom:170px;left:85px;position:absolute;display:none;">
        <img src="images/weixin.jpg" style="width:100%;height:100%;"/>
     </div>
   <script type="text/javascript">
     
         $("#1").mousemove(function(){
            $("#1_pic").css("display", "block");
         });
         $("#1").mouseleave(function(){
            $("#1_pic").css("display", "none");
         });
          $("#2").mousemove(function(){
            $("#2_pic").css("display", "block");
         });
         $("#2").mouseleave(function(){
            $("#2_pic").css("display", "none");
         });
   </script>
</section>

<section class="welcome-content lazy" id="#service" >
    <br>
     <h1><p align="center" id="ft_tp"><font color="#000">What We Do</font></p></h1>
       <h3><p align="center" id="ft_tp_36">我们的服务</p></h3> 
    <div style="width:100%;height:1px; background:#E0E0E0;"></div>
    <div style="width:10%;height:5px; background:#5ca0c5; margin-left:45%;"></div> 
    <h4><p align="center" id="ft_tp_28"><font style="line-height:2;color:#000">专注于各行业基于物联网的“智慧化”改造和移动设备APP的研究开发，<br>形成了针对政府，企业等不同行业，不同规模，不同产品和针对性解决方案，<br>是一加具有强大技术力量的信息化技术提供商。</font></p></h4>	
  <div id="service">	
	<div id="text_01">
        <img src="images/1.png" width="100" height="100" style="margin-left:35%;margin-top:15px;">
		<h4><p align="center" id="ft_tp_24">网站设计，手机移动端开发</p></h4>
        <h4><p align="center" id="ft_tp_20">高端品牌网站设计，<br>响应式网站设计，<br>信息平台门户网站，<br>移动手机网站建设，<br>定制开发各类APP，<br>微信小程序和<br>公众号开发。</p></h4>
    </div> 
    <div id="text_02">
         <img src="images/2.png" width="100" height="100" style="margin-left:35%;margin-top:15px;">  
          <h4><p align="center" id="ft_tp_24">智慧工厂</p></h4>
       <h4><p align="center" id="ft_tp_20">利用物联网技术和监控技<br>术加强信息管理，服务；<br>提高生产过程可控性，减<br>少生产线人工干预，以及<br>合理计划排程。</p></h4>
     </div>  
     <div id="text_03">
         <img src="images/3.png" width="100" height="100" style="margin-left:35%;margin-top:15px;">  
          <h4><p align="center" id="ft_tp_24">智慧教育</p></h4>
       <h4><p align="center" id="ft_tp_20">打造学校，学生，家长，<br>三位一体基于物联网的智<br>慧化校园系统。</p></h4>
     </div> 
     <div id="text_04">
          <img src="images/4.png" width="100" height="100" style="margin-left:35%;margin-top:15px;">  
          <h4><p align="center" id="ft_tp_24">智能家居数据服务</p></h4>
       <h4><p align="center" id="ft_tp_20">打造智能家居数据平台，<br>提供智能产品数据统计以<br>及分析一体化解决方案。</p></h4>
     </div> 
     <div id="text_05">
        <img src="images/5.png" width="100" height="100" style="margin-left:35%;margin-top:15px;">  
          <h4><p align="center" id="ft_tp_24">ERP，MES系统定制开发</p></h4>
       <h4><p align="center" id="ft_tp_20">为企业提供量身定制的<br>MES系统和ERP系统，<br>解决企业实际运营中的一<br>些情况，提高经营效率，<br>扩大产能。</p></h4> 
     </div>
   </div>
</section>

<section class="facts-content" id="about">
    <div id="sec_all">
	  <div id="sec_center">
	     <div id="sec_right">
	        <div id="screen1">
	            <div id="sub-title" class="ft_pf_36">嘉兴信普信息科技有限公司
	            </div>
	            <div id="sub-details">
			                       专注于各行业基于物联网“智慧化”改造和移动
					设备APP的研究开发，形成了针对政府，企业等
					不同行业，不同规模，不同应用的产品和针对性
					解决方案，是一家具有强大技术力量的信息化技
					术提供商。
	            </div>
	            <div id="sub-btn">
	               <a href="javascript:void(0)" onclick="subgo()" style="text-decoration:none;color:#fff;">了解更多</a>
	            </div>
	        </div>
	     </div>
	     <div id="sec_left">
	       <img src="images/about.png" style="width:100%;height:100%;" id="about"/>
	     </div>
	     <div id="sec_about">
	        <img src="images/about_text.png" style="width:100%;height:100%;" />
	     </div>
	  </div>
	  <!-- <img src="images/N1.png" style="width:100%;height:100%;"/> -->
	  <img class="lazy"  width="100%" height="100%" data-original="images/N1.png" />
	</div>
		
</section>

<section class="team-content" id="works" >
     <!-- 下半部分 -->
	<div id="sec_last">
	  <div id="last_01">
		   <div id="last_pic01">
		     <p id="ft_tp_36">PROJECT CASE</p>
			 <p id="ft_tp_36">项目案例</p>
			 <div style="width:40%;height:8px; background:#5ca0c5; margin-left:0;"></div>
			 <br><br><br>
			 <div id="text2">
			    <p id="wr_20" style="text-align:center;"><a href="/companyweb/works" style="text-decoration:none;color:#000;">更多案例</a></p>			 
			 </div>
		   </div>
		   <!-- <img src="images/back.png" style="width:100%;height:100%;"/> -->
		   <img class="lazy"  width="100%" height="100%" data-original="images/back.png" />
	  </div>	
	<div class="content2">
		<figure class="pic_custom">
            <img src="images/app.png" class="img_custom" />
            <figcaption>
                <div class="text_custom">
                    <p id="pic_txt_custom">绥云APP</p>
                </div>
            </figcaption>
        </figure>
        
        <figure class="pic_custom">
            <img src="images/ld.png" class="img_custom" />
            <figcaption>
                <div class="text_custom">
                    <p id="pic_txt_custom">乐动LeMontion网站</p>
                </div>
            </figcaption>
        </figure>
        <figure class="pic_custom">
            <img src="images/fq.png" class="img_custom" />
            <figcaption>
                <div class="text_custom">
                    <p id="pic_txt_custom">番茄智能网站</p>
                </div>
            </figcaption>
        </figure>
	</div>
	</div>
</section>
<section class="services-content">
      <div id="service_txt">
	    <p align="center" id="wr_36"><font color="#fff">PROVID ONE-STOP SERVICE</font></p>
		<p align="center" id="wr_24"><font color="#fff">严谨专业的设计流程，用心对待每一个项目</font></p>
	  </div>
	  <div style="width:100%;margin-top:200px;position:absolute;"><img src="images/wl.png"/></div>
	  <div style="width:80%;height:200px;margin-top:150px;margin-left:10%;position:absolute;">
	    <img src="images/bl.png" style="width:100%;heigth:100%;position:absolute;"/>
	    <img src="images/by.png" style="margin-left:2.55%;margin-top:-20px;position:absolute;"/>  
	    <img src="images/by.png" style="margin-left:20.5%;margin-top:-20px;position:absolute;"/> 
	    <img src="images/by.png" style="margin-left:38%;margin-top:-20px;position:absolute;"/> 
	    <img src="images/by.png" style="margin-left:55.5%;margin-top:-20px;position:absolute;"/> 
	    <img src="images/by.png" style="margin-left:73.5%;margin-top:-20px;position:absolute;"/> 
	    <img src="images/by.png" style="margin-left:91%;margin-top:-20px;position:absolute;"/> 
	  </div>
	  <div id="ser_01">
	                   需求分析<br>ANALYSS	
	  </div>
	  <div id="ser_02">
	                   需求确定<br>DETERMINE
	  </div>
	  <div id="ser_03">
	                    软件界面开发及软件功能开发<br>DEVELOPMENT
	  </div>
	  <div id="ser_04">
	                    软件测试<br>TEST
	  </div>
	  <div id="ser_05">
	                    安装部署<br>DEPLOYMENT
	  </div>	  
	  <div id="ser_06">
	                    培训维护<br>MAINTEMANCE
	  </div>
</section>

<section class="portfolio-wrap" id="works">
     <div id="b3_text">
       <p align="center" id="wr_36">OUR CUSTOMERS</p>
       <p align="center" id="wr_24">我们追求完美，更关注客户的满意程度</p>
       <div style="width:100%;height:1px; background:#E0E0E0;"></div>
        <div style="width:10%;height:5px; background:#5ca0c5; margin-left:45%;"></div>
     </div> 
    <div style="width:100%;height:350px;">
        <div style="width:100px;height:150px;position:absolute;margin-top:5%;">
			<ul class="num2">
				<li class="on2">&nbsp;</li>
				<li>&nbsp;</li>
				<li>&nbsp;</li>
			</ul>
		</div>
	    <div id="scrollPics2"  style="width:80%;height:350px;margin-left:20%;">
	        <ul class="pic2">  
	        </ul>	        
	    </div>
	</div>
</section>

<section class="testimonial-wrap" id="reads" data-slide="3">
    <div id="b3_footer">
       <p align="center" id="ft_tp_36">NEWS SENTER</p>
       <p align="center" id="ft_tp_36"><a href="javascript:void(0)" onclick="subgo2()" style="text-decoration:none;color:#000;">新闻中心</a></p>
       <div style="width:100%;height:1px; background:#E0E0E0;"></div>
       <div style="width:10%;height:5px; background:#5ca0c5; margin-left:45%;"></div>
    </div> 
	 <div id="b4_m">                		  
	      <div id="b4_pic">
		     <div id="b4_01">
			    <!-- <img src="images/N3.png" style="width:100%;height:100%;"/> -->
			    <img class="lazy"  width="100%" height="100%" data-original="images/N3.png" />
			 </div>
			 <div id="b4_02">
			    <!-- <img src="images/N2.png" style="width:100%;height:100%;"/> -->
			    <img class="lazy"  width="100%" height="100%" data-original="images/N2.png" />
			 </div>
			 <div id="b4_03">
                <div id="b4_text">
                   <p align="center" id="wr_40">我们被信赖，只因为我们更专业</p>
                   <p align="center" id="wr_40">We are srust,because we are more professional.</p><br>
               <div id="button_pic2">
                 <p align="center" id="wr_20"><a href="javascript:void(0)" onclick="subgo2()" style="text-decoration:none;color:#fff;">更多新闻</a></p>
               </div> 
                </div>
				<!-- <img src="images/N1.png" style="width:100%;height:100%;"/> -->
				<img class="lazy"  width="100%" height="100%" data-original="images/N1.png" />
             </div>
			 <div id="b4_04">
			   <br><br>
               <p align="center" id="wr_m_24">智慧能源+新型建材</p>
               <p align="center" id="wr_m_24">智能家居走入寻常百姓家</p><br>
               <p align="center" id="wr_24">内部环境舒适宜居，自带储能系统</p><br>
               <div id="button_pic3">
                 <p align="center" id="wr_20"><a href="javascript:void(0)" onclick="subgo2()" style="text-decoration:none;color:#000;">进入阅读</a></p>
               </div>  
             </div>
		  </div>
		  <!-- <img src="images/map.png" style="width:100%;height:100%;"/> -->
		  <img class="lazy"  width="100%" height="100%" data-original="images/map.png" />
	 </div>
	 <br><br>
	 <div style="width:100%;height:1px; background:#E0E0E0;"></div>
     <div style="width:130px;height:30px;margin-left:45%; margin-top:-15px;">
        <div id="top"><img src="images/TOP.png" style="width:100%; height:100%"></div>
     </div>
</section>

<section class="contact-wrap" id="contact">
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
</section>
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
		
/* 		$(".con").hover(function(){
		$(this).find(".txt").stop().animate({height:"310px"},200);
		$(this).find(".txt h3").stop().animate({paddingTop:"150px"},200);
	},function(){
		$(this).find(".txt").stop().animate({height:"100px"},200);
		$(this).find(".txt h3").stop().animate({paddingTop:"0px"},200);
	}); */
		
		//邮件发送
/*      function send_pop(temp){
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
     } */
	
	          //大广告
/* 	            $.ajax({
	                type:'post',
                    url:'/companyweb/index/getTabPic1',
                    success:function(data){
                    var result=eval(data);
                    var table="";
                    for(var i=0;i<result.length;i++){
                          table+="<li>";
                          table+="<img src='"+result[i].image+"' id='pic_size' />";
                          table+="</li>";
                      }
                      $(".pic").append(table);
                    }         
	            });     */
	            
	            
	            //底下客户产品信息    
	            $.ajax({
	              type:'post',
	              url:'index/custom',
	              success:function(data){
	                 var result2=eval(data);
	                 var tab="";
	                 for(var i=0;i<(result2.length)/3;i++){
	                      tab+="<li>";
                          tab+="<img src='"+result2[i].image+"' id='pic2_size'/>&nbsp;";
                          tab+="<img src='"+result2[i+1].image+"' id='pic2_size' />&nbsp;";
                          tab+="<img src='"+result2[i+2].image+"' id='pic2_size' />";
	                      tab+="</li>";
	                 }
	                 $(".pic2").append(tab);
	              }
	            
	            });
	            
/* 	      $.stellar({
			  verticalOffset: 15,
			  showElement: function($element){
			    $element.fadeIn(2000);
			  },
			  hideElement: function(){
			    $element.fadeOut(2000);
			  }
			});   */    
	       
	      //访问量统计
	      $.ajax({
	    	  type:'post',
              url:'comeIn/index',
              success:function(data){
            	  
              }
	      });
	      
          //首页跳转各页面
          function subgo(){
       	      window.location.href="http://xp.whoisyun.com/companyweb/about";
          }
          
          function subgo2(){
        	  window.location.href="http://xp.whoisyun.com/companyweb/reads"; 
          }

     window.onload= function() {
        var box  = document.getElementById("cs");  //   获得大盒子
        var ul = box.children[0].children[0];  // 获取ul
        var ulLis = ul.children;  //  ul 里面的所有  li
        // 复习：  cloneNode()     克隆节点       追加a.appendChild(b)  把b 放到a 的最后面
        //1.  ulLis[0].cloneNode(true)  克隆  节点
        ul.appendChild(ulLis[0].cloneNode(true));   // ul 是 a   ulLis[0].cloneNode(true) 是b

        //2. 插入 ol 里面的li
        var ol = box.children[1];  // 获得ol
        // 因为 我们要创建很多个 ol 里面的li 所以需要用到for 循环哦
        for(var i=0;i<ulLis.length-1;i++) {   // ul 里面的li  长度 要减去 1  因为我们克隆一个
            // 创建节点 li
            var li = document.createElement("li");
            li.innerHTML ="";   //  存在加1 的关系
            // a.appendChild(b);
            ol.appendChild(li);
        }
        var olLis = ol.children;  // 找到 ol 里面的li
        olLis[0].className = 'current';
        // 3. 动画部分  遍历小li ol
        for(var i=0;i<olLis.length;i++) {
            olLis[i].index = i;  // 赋予索引号
            olLis[i].onmouseover = function() {
                // 清除所有人
                for(var j=0;j<olLis.length;j++) {
                    olLis[j].className = "";
                }
                this.className = 'current';
                animate(ul,-this.index*ulLis[0].offsetWidth);
                key = square = this.index; // 鼠标经过 key square 要等于 当前的索引号
            }
        }
       // 4. 定时器部分  难点
        var timer = null;  // 定时器
        var key = 0; // 用来控制图片的播放的
        var square = 0;  // 用来控制小方块的
        timer = setInterval(autoplay,4000);   // 每隔3s 调用一次 autoplay
        function autoplay() {
            key++;   // key == 1  先 ++
            
            if(key > ulLis.length-1)
            {
               // alert('停下');
                ul.style.left = 0;
                key = 1;  // 因为第6张就是第一张，我们已经播放完毕了， 下一次播放第2张
                // 第2张的索引号是1
            }
            animate(ul,-key*ulLis[0].offsetWidth);
            // 小方块的做法
            square++;  // 小方块自加1
            square = square>olLis.length-1 ? 0 : square;
            /// 清除所有人
            for(var i=0;i<olLis.length;i++) {
                olLis[i].className = "";
            }
            olLis[square].className = "current";   // 留下当前自己的

        }


        // 鼠标经过和停止定时器
        box.onmouseover = function() {
            clearInterval(timer);
        }

        box.onmouseout = function() {
            timer = setInterval(autoplay,4000);  // 一定这么开
        }



        //  基本封装
        function animate(obj,target) {
            clearInterval(obj.timer);  // 要开启定时器，先清除以前定时器
            // 有2个参数 第一个 对象谁做动画  第二 距离 到哪里
            // 如果 offsetLeft 大于了  target 目标位置就应该反方向
            var speed = obj.offsetLeft < target ? 15 : -15;
            obj.timer = setInterval(function() {
                var result = target - obj.offsetLeft;  //  他们的值 等于 0 说明完全相等
                // 动画的原理
                obj.style.left = obj.offsetLeft + speed  + "px";
                if(Math.abs(result) <= 15) {
                    obj.style.left = target + "px";   //抖动问题
                    clearInterval(obj.timer);
                }
            },10);
        }

    }; 
</script>
<script src="js/jquery.lazyload.js"></script>
<script type="text/javascript">

$("img.lazy").lazyload({
    threshold : 300
});

</script>
</body>
</html>
