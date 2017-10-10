<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 添加商品 </title>
<link href="css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.1/themes/icon.css" />
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
  <li class="cur"><a href="/product"><i class="product"></i><em>产品信息列表</em></a></li>
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
<div id="urHere"> 管理中心<b>></b><strong>添加商品</strong> </div>   <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
            <h3><a href="/companyweb/product" class="actionBtn">商品列表</a>添加商品</h3>
    <form id="worktAddForm" class="worktAddForm">
     <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
       <tr>
       <td align="right"><font size="4">编号</font></td>
       <td>
        <input type="text" name="textid" value="" size="10" class="inpMain" />
       </td>
      </tr>
      <tr>
       <td align="right"><font size="4">所在导航</font></td>
       <td>
     	<select name="workid" data-options="required:true" style="width:156px;">
		  <option selected="true" disabled="true">请选择</option>
		  <option value="2">智能工厂</option>
		  <option value="3">智能教育</option>
		  <option value="4">智能家居服务数据</option>
		  <option value="5">ERP，MES系统定制开发</option>
		</select>
       </td>
      </tr>
      <tr>
       <td align="right"><font size="4">产品名</font></td>
       <td>
        <input type="text" name="textname" value="" size="40" class="inpMain" />
       </td>
      </tr>
      <tr>
       <td align="right"><font size="4">插图:</font></td>
          <td>
          	 <a href="javascript:void(0)" class="easyui-linkbutton picFileUpload">上传图片</a>
          	 <input type="hidden" name="image"/>
          </td>
      </tr>
      <tr>
       <td align="right"><font size="4">简单描述</font></td>
       <td>
        <input type="text" name="diec" value="" size="90" class="inpMain" />
       </td>
      </tr>
      <tr>
       <td align="right"><font size="4">操作</font></td>
       <td>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">添加</a>
       </td>
      </tr>
     </table>
    </form>
</div>
</div>
<script type="text/javascript">
var custAddEditor ;
	//页面初始化完毕后执行此方法
	$(function(){
		//初始化类目选择和图片上传器
		TAOTAO.init({fun:function(node){
			//根据商品的分类id取商品 的规格模板，生成规格信息
			TAOTAO.changeItemParam(node, "worktAddForm");
		}});
	});
	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#worktAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
        var workid=$('option:selected').val();
		$.post("/companyweb/worktext/save",$("#worktAddForm").serialize(),function(data){
			if(data.status == 200){
				$.messager.alert('提示','添加产品成功!',undefined,function(){
         			window.location.href="http://xp.whoisyun.com/companyweb/product";
         		 });
			}
		});
	}
	
	function clearForm(){
		$('#worktAddForm').form('reset');
		worktAddForm.html('');
	}

</script>
</body>
</html>
