<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 客户信息列表 </title>
<link href="css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
<link rel="stylesheet" type="text/css" href="css/page.css" />
<link rel="stylesheet" type="text/css" href="css/delete.css" />
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<link href="js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/kindeditor-4.1.10/lang/zh_CN.js"></script>

<style>	

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
  <li class="cur"><a href="/companyweb/page"><i class="page"></i><em>首页客户信息轮播</em></a></li>
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
 <div id="dcMain">
 <!-- 当前位置 -->
<div id="urHere">管理中心<b>></b><strong>首页客户图片轮播</strong></div>   
<div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
    <h3><a href="/companyweb/addpage" class="actionBtn">添加新合作客户</a>客户列表</h3>
   <div class="page" id="connpage">
   </div>
</div>
</div>
</div>
 <div class="clear"></div>
<div class="clear"></div>

<!--遮罩层-->
<div class="bgPop"></div>
<!--弹出框-->
<div class="pop">
    <div class="pop-top">
        <h2>客户信息</h2>
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content">
        <div class="pop-content-left">
            <img src="" alt="" class="teathumb">
        </div>
        <div class="pop-content-right">
            <form id="customForm" class="customForm" method="post" style="height:auto;">
	        <table cellpadding="5" id="conntab">
      
	    </table>        
	   </form>
        </div>
    </div>
    <div class="pop-foot">
        <input  value="更新" class="pop-cancel" onclick="submitForm()"/>
        <input  value="重置" class="pop-ok" onclick="clearForm()"/>
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
<script type="text/javascript">
    
    //page页面对象
    $.ajax({
               type:'post',
               url:'index/custom',
               success:function(data){
               var result=eval(data);
               var table="";
               for(var i=0;i<result.length;i++){
                  table+="<dl style='width:200px;height:200px;background:url("+result[i].image+") no-repeat;background-size:100% 100%;'>";
                  table+="<dt style='margin-top:50px;'><b><font color='#000' size='3'>"+result[i].name+"</font></b><p><b><font color='#000' size='3'>"+result[i].other+"</font></b></p></dt>";
                  table+="<dd><a href='javascript:void(0)' onclick='click_pop(this)' class='click_pop' id='"+result[i].id+"'><b><font color='#000' size='3'>编辑</font></b></a> | <a  href='javascript:void(0)' onclick='remove_pop(this)' class='remove_pop' id='"+result[i].id+"'><b><font color='#000' size='3'>删除</font></b></a></dd>";
                  table+="</dl>";
               }
              $("#connpage").append(table);
        }         
      }); 
    
    //关闭编辑框
    $(".pop-close").click(function () {
        $('.bgPop,.pop').hide();
        window.location.href="http://xp.whoisyun.com/companyweb/page";
    });
      
    //id查找当年修改的对象
     function click_pop(obj){
    	 var id=obj.id;
    	 $.ajax({
     		 type:'post',
             url:'custom/edit',
             data:{id:id},
             success:function(data){
            	 var s=JSON.parse(data);          	 
            	 var tab="";            	 
            	 for(var i=0;i<1;i++){
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>标题:</font></td>";
            		    tab+="<td><input class='easyui-textbox' type='text' name='name' value='"+s.name+"' style='width:250px;height:50px;' data-options='required:true'/></td>";
            		    tab+="</tr>";
            	        tab+="<tr>";
            	        tab+="<td><font size='5'>插图:</font></td>";
            	        tab+="<td>";
            	        	tab+="<a href='javascript:void(0)' class='easyui-linkbutton picFileUpload'>上传图片</a>";
            	        	tab+="<input type='hidden' name='image'/>";
         	            tab+="</td>";
         	            tab+="</tr>";	
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>编号:</font></td>";
            		    tab+="<td>";
            		    	tab+="<input class='easyui-textbox' type='text' name='id' value='"+s.id+"'  data-options='required:true' style='width: 80px;' readonly='readonly'/>";
            		    tab+="</td>";
            		    tab+="</tr>";
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>其他:</font></td>";
            		    tab+="<td>";
            		      tab+="<input class='easyui-textbox' type='text' name='other' value='"+s.other+"' style='width:250px;height:50px;'/>";
            		    tab+="</td>";
            		    tab+="</tr>";	 
            	 }
            	 $("#conntab").append(tab);
            	 $.parser.parse(); 
             	 	TAOTAO.init({fun:function(node){
            	 		TAOTAO.changeItemParam(node, "customForm");
            	 	}});
            	  
             }
     	});
    	 
    	  $(".bgPop,.pop").show(); 
     }
     
     //删除
     function remove_pop(temp){
    	 var id=temp.id;
    	 $(".pop2").fadeIn('fast');
         $(".popBottom2").on('click', 'span', function(event) {
             event.preventDefault();
             if($(this).hasClass('confirm')){
            	 $.ajax({
            		 type:'post',
                     url:'page/delete',
                     data:{id:id},
                     success:function(data){
                    	 window.location.href="http://xp.whoisyun.com/companyweb/page";
                     }
            	 });
                 $(".pop2").fadeOut();
             }else{
                 $(".pop2").fadeOut();
             }
         });
     }
     
         
    
 	//初始化类目选择和图片上传器
 	TAOTAO.init({fun:function(node){
 		TAOTAO.changeItemParam(node, "customForm");
 	}});
 	
 	//提交表单
 	function submitForm(){
 		//有效性验证
 		if(!$('#customForm').form('validate')){
 			$.messager.alert('提示','表单还未填写完成!');
 			return ;
 		}
 		$.post("/companyweb/custom/update",$("#customForm").serialize(),function(data){
 			if(data.status == 200){
 				$.messager.alert('提示','更新客户信息成功!',undefined,function(){
         			window.location.href="http://xp.whoisyun.com/companyweb/page";
         		 });
 			}else{
 			    $.messager.alert('提示','程序出错!');
 			}
 		});
 	}
 	
 	function clearForm(){
 		$('#customForm').form('reset');
 		customForm.html('');
 	}  
 	
</script>

<div class="clear"></div> </div>
</body>
</html>