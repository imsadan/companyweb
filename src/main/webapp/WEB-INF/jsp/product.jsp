<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 商品列表 </title>
<link href="css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
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
   <li><a href="/companyweb/nav"><i class="nav"></i><em>产品信息导航栏</em></a></li>
  <li class="cur"><a href="/companyweb/product.jsp"><i class="product"></i><em>产品信息列表</em></a></li>
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
<div id="urHere">管理中心<b>></b><strong>产品列表</strong> </div>  
 <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
        <h3><a href="/companyweb/addproduct" class="actionBtn add">添加合作产品</a>产品列表</h3> 
       <!--select表单  -->
		<select id="s">
		   <option value="1">1</option>
		   <option value="2">2</option>
		   <option value="3">3</option>
		   <option value="4">4</option>
		   <option value="5">5</option>
		</select> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" id="selectbt">获取</a>
   <div id="list">
    <form name="action" method="post" action="product.php?rec=action">
    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic" id="tableok">   
    </table>
    </form>
    </div>
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
            <form id="worktextForm" class="worktextForm"  style="height:auto;">
	        <table cellpadding="5" id="conntab2">
        
	    </table>        
	   </form>
        </div>
    </div>
    <div class="pop-foot">
        <input  value="更新" class="pop-cancel"  onclick="submitForm()"/>
        <input  value="重置" class="pop-ok"  onclick="clearForm()"/>
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
 </div>
<script type="text/javascript">
$("#selectbt").click(function(){
    var workid=$('#s option:selected').val();  
     $("tr").remove("#tableok tr");     
        $.ajax({
           	 type:'post',
             url:'get/works',
             data:{workid:workid},
             success:function(data){
               var s=eval(data);
               var table="";
                   table+="<tr>";       
				   table+="<th width='60' align='center'>产品编号</th>";
				   table+="<th width='60' align='center'>对应导航编号</th>";
				   table+="<th width='100' align='center'>产品名</th>";
			       table+="<th width='150' align='center'>图片</th>";
				   table+="<th width='150' align='center'>主要描述</th>";
			       table+="<th width='80' align='center'>操作</th>";
			       table+="</tr>"; 
               for(var i=0;i<s.length;i++){
                   table+="<tr>";
			       table+="<td align='center'>"+s[i].textid+"</td>";
			       table+="<td align='center'>"+s[i].workid+"</td>";
			       table+="<td>"+s[i].textname+"</td>";
			       table+="<td><img src='"+s[i].image+"' style='width:150px;height:100px;'/></td>";
			       table+="<td>"+s[i].diec+"</td>";
                   table+="<td align='center'>";
                   table+="<a href='javascript:void(0)' onclick='click_pop(this)' class='click_pop' id='"+s[i].textid+"'>编辑</a> | <a  href='javascript:void(0)' onclick='remove_pop(this)' class='remove_pop' id='"+s[i].textid+"'>删除</a>";
                   table+="</td>";
                   table+="</tr>";                 
               }
               
               $("#tableok").append(table);
             }
        });
    });
    
   //删除
     function remove_pop(temp){
    	 var textid=temp.id;
    	 $(".pop2").fadeIn('fast');
         $(".popBottom2").on('click', 'span', function(event) {
             event.preventDefault();
             if($(this).hasClass('confirm')){
            	 $.ajax({
            		 type:'post',
                     url:'worktext/delete',
                     data:{textid:textid},
                     success:function(data){
                    	window.location.reload();
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
  		TAOTAO.changeItemParam(node, "worktextForm");
  	}}); 
   
   
   //id查找当年修改的对象
     function click_pop(obj){
    	 var textid=obj.id;
    	 $.ajax({
     		 type:'post',
             url:'worktext/edit',
             data:{textid:textid},
             success:function(data){
            	 var ss=eval(data);  
            	 var tab="";            	 
            	 for(var i=0;i<ss.length;i++){
	         		    tab+="<tr>";
	        		    tab+="<td><font size='5'>产品编号:</font></td>";
	        		    tab+="<td>";
	        		    	tab+="<input class='easyui-textbox' type='text' name='textid' value='"+ss[i].textid+"'  style='width: 80px;' readonly='readonly'/>";
	        		    tab+="</td>";
	        		    tab+="</tr>";            		 
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>产品名:</font></td>";
            		    tab+="<td><input class='easyui-textbox' type='text' name='textname' value='"+ss[i].textname+"' style='width:250px;height:50px;' data-options='required:true'/></td>";
            		    tab+="</tr>";
            		    tab+="<tr>";
            	        tab+="<td><font size='5'>插图:</font></td>";
            	        tab+="<td>";
            	        	tab+="<a href='javascript:void(0)' class='easyui-linkbutton picFileUpload'>上传图片</a>";
            	        	tab+="<input type='hidden' name='image'/>";
         	            tab+="</td>";
         	            tab+="</tr>";	
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>导航编号:</font></td>";
            		    tab+="<td>";
            		    	tab+="<input class='easyui-textbox' type='text' name='workid' value='"+ss[i].workid+"' readonly='readonly' style='width: 80px;'/>";
            		    tab+="</td>";
            		    tab+="</tr>";
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>描述:</font></td>";
            		    tab+="<td>";
            		      tab+="<input class='easyui-textbox' type='text' name='diec' value='"+ss[i].diec+"' style='width:250px;height:50px;'/>";
            		    tab+="</td>";
            		    tab+="</tr>";	 
            	 }
            	 $("#conntab2").append(tab);
            	 $.parser.parse();
            	  TAOTAO.init({fun:function(node){
            	  		TAOTAO.changeItemParam(node, "worktextForm");
            	  }}); 
            	 
             }
     	});
    	 
    	  $(".bgPop,.pop").show(); 
     }
   
     //关闭编辑框
     $(".pop-close").click(function () {
         $('.bgPop,.pop').hide();
          window.location.href="http://xp.whoisyun.com/companyweb/product"; 
     });
   
   //提交表单
  	function submitForm(){
  		//有效性验证
  		if(!$('#worktextForm').form('validate')){
  			$.messager.alert('提示','表单还未填写完成!');
  			return ;
  		}
  		
  		$.post("/companyweb/worktext/update",$("#worktextForm").serialize(),function(data){
  			if(data.status == 200){
 				$.messager.alert('提示','更新产品信息成功!',undefined,function(){
         			window.location.href="http://xp.whoisyun.com/companyweb/product";
         		 });
  			}else{
  			    $.messager.alert('提示','程序出错!');
  			}
  		});
  	}
  	
  	function clearForm(){
  		$('#worktextForm').form('reset');
  		worktextForm.html('');
  	}  

</script>
</body>
</html>
