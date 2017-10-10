<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心</title>
<link href="css/public.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/style_admin.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script  src="js/Chart.js"></script>
<script src="js/jquery.leoweather.min.js"></script>
<style type="text/css">
	#txt { font:14px/1.5 微软雅黑; text-align:center; }
	.demo { width:100px; min-width:100px; max-width:100px; }
	#demo { width:100%; background:#72af3c; color:#FFF; padding:50px 0 100px 0; overflow:hidden; border-radius:5000px;margin-top:50px; }
	#demo i { background: no-repeat top left; display:inline-block; height:128px; line-height:128px; margin:0 auto 20px auto; font-size:70px; padding-left:150px; font-style:normal; text-align:center; font-weight:bold; }
	#demo i.icon-xiaoyu { background-image:url(images/xiaoyu.png); }
	#demo i.icon-zhongyu { background-image:url(images/zhongyu.png); }
	#demo i.icon-dayu { background-image:url(images/dayu.png); }
	#demo i.icon-qing { background-image:url(images/qing.png); }
	#demo i.icon-duoyun { background-image:url(images/duoyun.png); }
	#demo i.icon-yin { background-image:url(images/yin.png); }
	#demo i.icon-zhenyu { background-image:url(images/zhongyu.png); }
	#demo p { background:rgba(0,0,0,.3); margin:0 200px; padding:20px; border-radius:1000px; font-size:16px; }
	#demo p span { margin:0 15px; }
</style>
</head>
<body>
<div id="dcWrap"> 
<div id="dcHead">
 <div id="head">
  <div class="logo"><a href="index.html"></a></div>
  <div class="nav">
   <ul>
    <li class="M"><a href="JavaScript:void(0);" class="topAdd">新建</a>
     <div class="drop mTopad" style="z-index:9999;">
	   <a href="/companyweb/product">产品信息</a> 
	   <a href="/companyweb/article">新闻</a> 
	   <a href="/companyweb/nav">信息导航栏</a> 
	   <a href="/companyweb/show">首页幻灯广告</a> 
	   <a href="/companyweb/page">首页客户信息轮播</a> 
	   <a href="/companyweb/manager">管理员</a>
	 </div>
    </li>
    <li><a href="index.php?rec=clear_cache">清除缓存</a></li>
   </ul>
   <ul class="navRight">
    <li class="M noLeft"><a href="JavaScript:void(0);">您好，${ sessionScope.get('userLogin').name}</a>
     <div class="drop mUser">
      <a href="/companyweb/edit/manager?id=${sessionScope.get('userLogin').id}">编辑我的个人资料</a>
      <a href="/companyweb/manager">设置账户</a>
     </div>
    </li>
    <li class="noRight"><a href="/companyweb/user/exit" onclick="loginOut();">退出</a></li>
   </ul>
   <script type="text/javascript">
      function loginOut(){
        alert("注销成功!");
      }
   </script>
  </div>
 </div>
</div>
<!-- dcHead 结束 --> 
<div id="dcLeft">
<div id="menu">
 <ul class="top">
  <li><a href="/companyweb/admin"><i class="home"></i><em>管理首页</em></a></li>
 </ul>
 <ul>
  <li><a href="/companyweb/show"><i class="show"></i><em>首页幻灯广告</em></a></li>
  <li><a href="/companyweb/page"><i class="page"></i><em>首页客户信息轮播</em></a></li>
 </ul>
   <ul>
   <li><a href="/companyweb/nav"><i class="nav"></i><em>产品信息导航栏</em></a></li>
  <li><a href="/companyweb/product"><i class="product"></i><em>产品信息列表</em></a></li>
 </ul>
  <ul>
  <li><a href="/companyweb/article"><i class="article"></i><em>新闻列表</em></a></li>
 </ul>
 <ul>
   <li><a href="/companyweb/team"><i class="theme"></i><em>团队信息</em></a></li>
 </ul>  
   <ul class="bot">
  <li><a href="/companyweb/manager"><i class="manager"></i><em>网站管理员</em></a></li>
 </ul>
</div>
</div>
</div>
 <div id="dcMain"> <!-- 当前位置 -->
<div id="urHere">管理中心</div>  
<div id="index" class="mainBox" style="padding-top:18px;height:auto!important;height:550px;min-height:550px;">
     <div style="width:100%;height:120px;top:10px;">
                <div class="metro-nav">
                    <div class="metro-nav-block nav-block-orange">
                        <a data-original-title="" href="/companyweb/manager" id="one">                            
                            <div class="status">管理员用户人数</div>
                        </a>
                    </div>
                    <div class="metro-nav-block nav-olive">
                        <a data-original-title="" href="/companyweb/product" id="two">
                            <div class="status">展示产品数量</div>
                        </a>
                    </div>
                    <div class="metro-nav-block nav-block-yellow">
                        <a data-original-title="" href="/companyweb/article" id="three">
                            <div class="status">新闻条目</div>
                        </a>
                    </div>
                    <div class="metro-nav-block nav-block-green double">
                        <a data-original-title="" href="/companyweb/team" id="four">
                            <div class="status">团队人数</div>
                        </a>
                    </div>
                    <div class="metro-nav-block nav-block-red">
                        <a data-original-title="" href="/companyweb/page" id="five">
                            <div class="status">合作客户</div>
                        </a>
                    </div>
                </div>
     </div>
     <div style="width:100%;height:400px;margin-top:10px;">
        <canvas id="myChart" style="width:100%; height:400px;"></canvas>
     </div>
     
     <div style="width:50%;height:550px;float:left;position:absolute;margin-top:20px;">
		<div class="list-group" id="news">
			<a class="list-group-item active"  >
				<h4 class="list-group-item-heading">
					添加的新闻
				</h4>
			</a>
		</div>
		<div class="list-group" id="custom">
			<a class="list-group-item active">
				<h4 class="list-group-item-heading">
					客户信息栏目
				</h4>
			</a>
		</div>
    </div>
<!--      <div style="width:40%;height:450px;float:right;margin-top:20px;">
        <div id="txt">
		<div id="demo">
			<script>$('#demo').leoweather({format:'<i class="icon-{图标}">{气温}℃</i><p>{城市}<span>|</span>{天气}<span>|</span>{风向}{风级}级</p>'});</script>
		</div>
		</div> 
     </div>
     <div style="width:100%;height:550px;"></div> -->
     <script type="text/javascript">
        /*
                           管理首页顶部各数量统计
        */
        $.ajax({
            type:'post',
	        url:'admin/statistic',
	        success:function(data){
	           var sum=eval(data);
	           var one="";
	           var two="";
	           var three="";
	           var four="";
	           var five="";
	           for(var i=0;i<(sum.length)/5;i++){
	                one+="<div class='info'>+"+sum[i]+"</div>";	
	                two+="<div class='info'>"+sum[i+1]+"</div>";	
	                three+="<div class='info'>"+sum[i+2]+"</div>";	  
	                four+="<div class='info'>+"+sum[i+3]+"</div>";	 
	                five+="<div class='info'>"+sum[i+4]+"</div>";	        
	           }
	           
	           $("#one").append(one);
	           $("#two").append(two);
	           $("#three").append(three);
	           $("#four").append(four);
	           $("#five").append(five);
	        }
        });
        
		//统计数据表	
         $.ajax({
            type:'post',
            url:'get/adminSum',
            success:function(data){
            var re=[];
            var re2=[];
            var s=eval(data);
               var ctx = $("#myChart").get(0).getContext("2d");
			   var myNewChart = new Chart(ctx);
			   for(var i=0;i<s.length;i++){
				   re.push(s[i].comedata);
				   re2.push(s[i].comesum);
               }
			   var data = {
            labels: re,
            datasets: [
	            {
	            label: "日浏览量",
	            fillColor: "rgba(151,187,205,0.2)",
	            strokeColor: "rgba(151,187,205,1)",
	            pointColor: "rgba(151,187,205,1)",
	            pointStrokeColor: "#fff",
	            pointHighlightFill: "#fff",
	            pointHighlightStroke: "rgba(220,220,220,1)",
	            data: re2
	            }
            ]
            };
			   myNewChart.Line(data);
            }
         });        
           
           //简单展现模块
           $.ajax({
              type:'post',
              url:'get/article',
              success:function(data){
                var s=eval(data);
                var tab="";
                if(s.length>3){
                  for(var i=0;i<3;i++){
                   tab+="<a href='/article' class='list-group-item'>";
						tab+="<h4 class='list-group-item-heading'>"+s[i].newname+"</h4>";
						tab+="<p class='list-group-item-text'>"+s[i].newtext+"</p>";
					tab+="</a>";
                  }   
                  $("#news").append(tab);
                               
                }else{
                   for(var i=0;i<s.length;i++){
	                   tab+="<a href='/article' class='list-group-item'>";
							tab+="<h4 class='list-group-item-heading'>"+s[i].newname+"</h4>";
							tab+="<p class='list-group-item-text'>"+s[i].newtext+"</p>";
						tab+="</a>";
                  }   
                  
                  $("#news").append(tab);
                } 

              }
           });
           
           
           $.ajax({
              type:'post',
              url:'get/custom',
              success:function(data){
                var ss=eval(data);
                var table="";
                if(ss.length>3){
                  for(var i=0;i<3;i++){
                   table+="<a href='/page' class='list-group-item'>";
						table+="<h4 class='list-group-item-heading'>"+ss[i].name+"</h4>";
						table+="<p class='list-group-item-text'>"+ss[i].other+"</p>";
					table+="</a>";
                  }   
                  $("#custom").append(table);
                               
                }else{
                   for(var i=0;i<ss.length;i++){
	                   table+="<a href='/page' class='list-group-item'>";
							table+="<h4 class='list-group-item-heading'>"+ss[i].name+"</h4>";
							table+="<p class='list-group-item-text'>"+ss[i].other+"</p>";
						table+="</a>";
                  }   
                  
                  $("#custom").append(table);
                } 

              }
           });
     </script>
</div>      
<div class="clear"></div> </div>
</body>
</html>