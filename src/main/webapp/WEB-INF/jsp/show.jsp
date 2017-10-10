<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 首页幻灯广告 </title>
<link href="css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
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
  <li class="cur"><a href="/show"><i class="show"></i><em>首页幻灯广告</em></a></li>
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
 <div id="dcMain">
   <!-- 当前位置 -->
<div id="urHere">管理中心<b>></b><strong>首页幻灯广告</strong> </div>  
 <div class="mainBox imgModule" >
    <h3>首页幻灯广告</h3>
    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
    <tr>
       <th>添加幻灯</th>
       <th>幻灯列表</th>
     </tr>
     <tr>
<td width="350px" valign="top">
    <form id="advAddForm" class="advForm" method="post" style="height:300px;">
	    <table cellpadding="5" >
	        <tr style="height:100px;">
	            <td>幻灯名称:</td>
	            <td><input class="easyui-textbox" type="text" name="advname" data-options="required:true" style="width:250px;"/></td>
	        </tr>
	        <tr style="height:100px;">
	            <td>插图:</td>
	            <td>
	            	 <a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
	            	 <input type="hidden" name="image"/>
	            </td>
	        </tr>
	        <tr style="height:100px;">
	            <td>排序:</td>
	            <td>
	            	<input class="easyui-textbox" type="text" name="id" data-options="required:true" style="width: 80px;"/>
	            </td>
	        </tr>
	        
	    </table>
	</form>
	<br>
	<div style="padding:10px;text-align:center;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</td>
      <td valign="top">
       <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableOnebor" id="conntr">
        <tr class="conntr">
         <td width="50" align="center">幻灯名称</td>
         <td width="150" align='center'>图片</td>
         <td width="50" align="center">排序</td>
         <td width="80" align="center">操作</td>
        </tr>
       </table>
      </td>
     </tr>
    </table>
   </div>
   <!-- 删除 -->
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
               url:'index/getTabPic1',
               success:function(data){
               var result=eval(data);
               var table="";
               for(var i=0;i<result.length;i++){
                  table+="<tr>";
                  table+="<td align='center'>"+result[i].advname+"</td>";
                  table+="<td align='center'><img src='"+result[i].image+"' style='width:150px;height:100px;'/></td>";
                  table+="<td align='center'>"+result[i].id+"</td>";
                  table+="<td align='center'><a href='edit?id="+result[i].id+"'>编辑</a> | <a  href='javascript:void(0)' onclick='remove_pop(this)' class='remove_pop' id='"+result[i].id+"'>删除</a></td>";
                  table+="</tr>";
               }
              $("#conntr").append(table);
            }
        });         



	//初始化类目选择和图片上传器
	TAOTAO.init({fun:function(node){
		TAOTAO.changeItemParam(node, "advForm");
	}});


	//初始化类目选择和图片上传器
	TAOTAO.init({fun:function(node){
		//根据商品的分类id取商品 的规格模板，生成规格信息
		TAOTAO.changeItemParam(node, "advForm");
	}});

	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#advAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("/companyweb/adv/save",$("#advAddForm").serialize(),function(data){
			if(data.status == 200){
				$.messager.alert('提示','删除内容成功!',undefined,function(){
        			 window.location.reload();
        		 });
			}
		});
	}
	
	function clearForm(){

		$('#advAddForm').form('reset');
		advAddForm.html('');
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
                     url:'adv/delete',
                     data:{id:id},
                     success:function(data){
                    	 window.location.href="http://xp.whoisyun.com/companyweb/show";
                     }
            	 });
                 $(".pop2").fadeOut();
             }else{
                 $(".pop2").fadeOut();
             }
         });
     }
		$('#advAddForm').form('reset');
		advAddForm.html(''); 
</script>
</body>
</html>