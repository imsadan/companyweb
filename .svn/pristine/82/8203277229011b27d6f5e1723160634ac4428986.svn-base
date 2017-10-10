<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 首页幻灯广告 </title>
<link href="../css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/global.js"></script>
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="../js/jquery-easyui-1.4.1/themes/icon.css" />
<script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript" src="../js/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="../js/common.js"></script>
<link href="../js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/lang/zh_CN.js"></script>
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
  <li><a href="/companyweb/product"><i class="product"></i><em>产品信息列表</em></a></li>
 </ul>
  <ul>
  <li><a href="/companyweb/article"><i class="article"></i><em>新闻列表</em></a></li>
 </ul>
 <ul>
   <li><a href="/companyweb/team"><i class="theme"></i><em>团队信息</em></a></li>
 </ul>  
   <ul class="bot">
  <li class="cur"><a href="/companyweb/manager"><i class="manager"></i><em>网站管理员</em></a></li>
 </ul>
</div>
</div>
 <div id="dcMain">
   <!-- 当前位置 -->
<div id="urHere">管理中心<b>></b><strong>网站管理员</strong> </div>  
 <div class="mainBox imgModule">
    <div>
       <h3 align="center">编辑个人账户</h3>
       <form id="userupdateForm" class="userupdateForm" method="post" style="height:200px;">
       <div style="margin:0 auto;height:100%;width:400px;">
	    <c:forEach items="${updateUser}" var="user">  
	        <table cellpadding="5" >
	        <tr>
	            <td><font size="5">账号编号:</font></td>
	            <td><input class="easyui-textbox" type="text" name="id" value="${user.id}" style="width:80px;" readonly="readonly"/></td>
	        </tr>
	        <tr>
	            <td><font size="5">用户名:</font></td>
	            	<td><input class="easyui-textbox" type="text" name="name" value="${user.name}" style="width:180px;height:50px;"/></td>
	        </tr>
	        <tr>
	            <td><font size="5">重置密码:</font></td>
	            <td>
	            	<input class="easyui-textbox" type="password" name="password" value="${user.password}" data-options="required:true" style="width: 180px;"/>
	            </td>
	        </tr>        	        
	    </table>       
	    </c:forEach>  
	    </div>
	   </form>
	   <br>
    <div style="padding:10px;text-align:center;">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">更新</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
    </div>
 </div>
 </div>
 <div class="clear"></div>
<div class="clear"></div> </div>
<script type="text/javascript">
//初始化类目选择和图片上传器
	TAOTAO.init({fun:function(node){
		//根据商品的分类id取商品 的规格模板，生成规格信息
		TAOTAO.changeItemParam(node, "userupdateForm");
	}});
	
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#userupdateForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		$.post("/companyweb/user/update",$("#userupdateForm").serialize(),function(data){
			if(data.status == 200){
				$.messager.alert('提示','更新个人信息成功!',undefined,function(){
        			 window.location.href="http://xp.whoisyun.com/companyweb/admin";
        		 });
			}else{
			    $.messager.alert('提示','程序出错!');
			}
		});
	}
	
	function clearForm(){
		$('#userupdateForm').form('reset');
		advupdateForm.html('');
	}  
</script>
</body>
</html>