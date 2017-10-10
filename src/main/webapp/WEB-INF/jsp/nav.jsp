<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 产品页面导航栏 </title>
<meta name="Copyright" content="Douco Design." />
<link href="css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/jquery.tab.js"></script>
<link rel="stylesheet" type="text/css" href="css/delete.css" />
</head>
<body>
<div id="dcWrap">
 <div id="dcHead">
 <div id="head">
  <div class="logo"><a href="index.html"></a></div>
  <div class="nav">
   <ul>
    <li class="M"><a href="JavaScript:void(0);" class="topAdd">新建</a>
     <div class="drop mTopad">
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
   <li class="cur"><a href="/nav.jsp"><i class="nav"></i><em>产品信息导航栏</em></a></li>
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
 <div id="dcMain">
   <!-- 当前位置 -->
<div id="urHere">管理中心<b>></b><strong>自定义导航栏</strong> </div>  
<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
<div class="navList" >
     <table width="100%" border="0" cellpadding="10" cellspacing="0" class="tableBasic" id="conn">
      <tr>
       <th width="30%" align="center">导航名称</th>
       <th width="30%" align="center">排序</th>
       <th width="30%" align="center">操作</th>
      </tr>
   </table>
</div>
</div>
<div class="pop2">
    <div class="popMain2">
        <div class="popTop2"></div>
        <div class="popMiddle2">
            <p>是否确认删除？</p>
        </div>
        <div class="popBottom2">
            <span class="confirm">确认</span>
            <span class="cancel">取消</span>
        </div>
    </div>
</div>
</div>
 <div class="clear"></div>
<div class="clear"></div> </div>
<script type="text/javascript">
     $.ajax({
               type:'post',
               url:'get/workname',
               success:function(data){
               var result=eval(data);
               var table="";
               for(var i=0;i<result.length;i++){
                  table+="<tr>";
                  table+="<td>"+result[i].name+"</td>";
                  table+="<td align='center'>"+result[i].workid+"</td>";
                  table+="<td align='center'><a  href='javascript:void(0)' onclick='remove_pop(this)' class='remove_pop' id='"+result[i].workid+"'>删除</a></td>";
                  table+="</tr>";
               }
             $("#conn").append(table);
         }         
      }); 
     
      //删除
     function remove_pop(temp){
    	 var workid=temp.id;
    	 $(".pop2").fadeIn('fast');
         $(".popBottom2").on('click', 'span', function(event) {
             event.preventDefault();
             if($(this).hasClass('confirm')){
            	 $.ajax({
            		 type:'post',
                     url:'nav/delete',
                     data:{workid:workid},
                     success:function(data){
                    	 window.location.href="http://xp.whoisyun.com/companyweb/nav";
                     }
            	 });
                 $(".pop2").fadeOut();
             }else{
                 $(".pop2").fadeOut();
             }
         });
     }
     
</script>
</body>
</html>