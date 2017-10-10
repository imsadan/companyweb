<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信普管理中心 - 文章列表 </title>
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
  <li><a href="/companyweb/product"><i class="product"></i><em>产品信息列表</em></a></li>
 </ul>
  <ul>
  <li class="cur"><a href="/companyweb/article"><i class="article"></i><em>新闻列表</em></a></li>
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
<div id="urHere">管理中心<b>></b><strong>新闻列表</strong> </div>  
 <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
        <h3><a href="/companyweb/addarticle" class="actionBtn add">添加新闻</a>新闻列表</h3>
    <div id="list">
    <form name="action" method="post" action="product.php?rec=action">
    <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">
      <tr>
        <th width="40" align="center">编号</th>
        <th align="left" width="200">新闻标题</th>
        <th align="left" width="200">新闻插图</th>
        <th width="150" align="center">新闻副文</th>
		<th width="150" align="center">新闻主体</th>
       <th width="80" align="center">添加日期</th>
        <th width="80" align="center">操作</th>
      </tr>
      <c:forEach items="${requestScope.pagemsg2.lists}" var="news" >
      <tr>
        <td align="center">${news.id}</td>
        <td>${news.newname}</td>
        <td><img src="${news.image}" style="width:150px;height:100px;"/></td>
        <td align="center"><p style="width:200px;height:150px;overflow: hidden;">${news.newtext}</p></td>
		<td align="center"><p style="width:200px;height:150px;overflow: hidden;">${news.maintext}</p></td>
        <td align="center">${news.newdate}</td>
        <td align="center">
            <a href="javascript:void(0)" onclick="click_pop(this)" class="click_pop" id="${news.id}">编辑</a> | <a  href="javascript:void(0)" onclick="remove_pop(this)" class="remove_pop" id="${news.id}">删除</a>
        </td>
      </tr>     			
      </c:forEach>
		 <table border="0" cellspacing="0" cellpadding="0" width="100%">
			<tr>
				<td class="td2" style="font-size:10px;"><span style="font-size:20px;">第${requestScope.pagemsg2.currPage }/
						${requestScope.pagemsg2.totalPage}页</span>&nbsp;&nbsp; <span style="font-size:20px;">总记录数：${requestScope.pagemsg2.totalCount }&nbsp;&nbsp;</span>&nbsp;&nbsp;
					<span> <c:if
								test="${requestScope.pagemsg2.currPage != 1}">
							<a
								href="${pageContext.request.contextPath }/article?currentPage=1" style="font-size:20px;">[首页]</a>&nbsp;&nbsp;
                                  <a
								href="${pageContext.request.contextPath }/article?currentPage=${requestScope.pagemsg2.currPage-1}" style="font-size:20px;">[上一页]</a>&nbsp;&nbsp;
                                  </c:if> <c:if
							    test="${requestScope.pagemsg2.currPage != requestScope.pagemsg2.totalPage}">
							<a
								href="${pageContext.request.contextPath }/article?currentPage=${requestScope.pagemsg2.currPage+1}" style="font-size:20px;">[下一页]</a>&nbsp;&nbsp;
                                  <a
								href="${pageContext.request.contextPath }/article?currentPage=${requestScope.pagemsg2.totalPage}" style="font-size:20px;">[尾页]</a>&nbsp;&nbsp;
                                  </c:if>
					</span></td>
			</tr>
		  </table>
    </table>
    </form>
    </div>
    <div class="clear"></div>
    <!--遮罩层-->
<div class="bgPop"></div>

<div class="pop" style="width:800px;height:700px;margin-top:10px;">
    <div class="pop-top">
        <h2>客户信息</h2>
        <span class="pop-close">Ｘ</span>
    </div>
    <div class="pop-content" style="height:550px;">
        <div class="pop-content-left">
            <img src="" alt="" class="teathumb">
        </div>
        <div class="pop-content-right">
<!--         <form id="newsAddForm" class="itemForm" method="post" style="height:auto;">
	    
	    <table cellpadding="5" id="conntab"> 

	    </table>        
	   </form>  -->
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
 </div>
</div>
</div>
 <script type="text/javascript">
 //删除
 function remove_pop(temp){
	 var id=temp.id;
	 $(".pop2").fadeIn('fast');
     $(".popBottom2").on('click', 'span', function(event) {
         event.preventDefault();
         if($(this).hasClass('confirm')){
        	 $.ajax({
        		 type:'post',
                 url:'article/delete',
                 data:{id:id},
                 success:function(data){
                	 window.location.href="http://xp.whoisyun.com/companyweb/article";
                 }
        	 });
             $(".pop2").fadeOut();
         }else{
             $(".pop2").fadeOut();
         }
     });
 }
 
//关闭编辑框
 $(".pop-close").click(function () {
     $('.bgPop,.pop').hide();
     window.location.href="http://xp.whoisyun.com/companyweb/article";
 });
 
      //编辑框
     //id查找当年修改的对象
      function click_pop(obj){
    	 var id=obj.id;
    	 $.ajax({
     		 type:'post',
             url:'news/edit',
             data:{id:id},
             success:function(data){
            	 var s=eval(data);
            	 var tab="";
            	 for(var i=0;i<s.length;i++){
	                    tab+="<form id='newsAddForm' class='itemForm' method='post' style='height:auto;''>";
	             	    tab+="<table cellpadding='5' id='conntab'>"; 
	            		tab+="<tr>";
	         		    tab+="<td><font size='5'><p style='width:80px;'>编号:</p></font></td>";
	         		    tab+="<td><input class='easyui-textbox' type='text' name='id' value='"+s[i].id+"'readonly='readonly' style='width:80px;' id='uid'/></td>";
	         		    tab+="</tr>";
	         		    tab+="<tr>";
           	            tab+="<td><font size='5'>插图:</font></td>";
           	            tab+="<td>";
           	        	tab+="<a href='javascript:void(0)' class='easyui-linkbutton picFileUpload'>上传图片</a>";
           	        	tab+="<input type='hidden' name='image' id='uimage'/>";
        	            tab+="</td>";
        	            tab+="</tr>";
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>标题:</font></td>";
            		    tab+="<td><input class='easyui-textbox' type='text' name='newname' value='"+s[i].newname+"' data-options='required:true' style='width:200px;' id='uname'/></td>";
            		    tab+="</tr>";
            		    tab+="<tr>";
            		    tab+="<td><font size='5'>副文:</font></td>";
            		    tab+="<td>";
            		    	tab+="<input class='easyui-textbox' type='text' name='newtext' value='"+s[i].newtext+"' data-options='multiline:true' style='height:80px;width: 300px;' id='utext'/>";
            		    tab+="</td>";
            		    tab+="</tr>";
              		    tab+="<tr>";
            		    tab+="<td><font size='5'>描述:</font></td>";
            		    tab+="<td>";
            		        tab+="<textarea name='maintext' style='width:350px;height:300px;'>"+s[i].maintext+"</textarea>";
            		    tab+="</td>";
            		    tab+="</tr>";
            		    tab+="</table>";
            		    tab+="</form>";
            		   
            	 }             	 
            	 $(".pop-content-right").append(tab);
            	 $.parser.parse();
            	 	//创建富文本编辑器
        		TAOTAO.createEditor("#newsAddForm [name=maintext]");
          		//初始化类目选择和图片上传器
          		TAOTAO.init({fun:function(node){         			
          			TAOTAO.changeItemParam(node, "newsAddForm");
          		}});
            	 $.parser.parse();
             }
             
     	});
    	 
    	  $(".bgPop,.pop").show(); 
    	  
    	  
     } 
 	
 	//提交表单
	function submitForm(){
		//有效性验证
		if(!$('#newsAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		}
		
		var user={
				id:$("#uid").val(),
				image:$("#uimage").val(),
				newtext:$("#utext").val(),
				newname:$("#uname").val(),
				maintext:$("iframe").contents().find("body").html()
		};
		
		alert($("iframe").contents().find("body").html());
		$.ajax({
			type:'post',
            url:'news/update',
			data:user,
			success:function(data){
				if(data.status==200){
					$.messager.alert('提示','更新新闻成功!',undefined,function(){
	        			window.location.href="http://xp.whoisyun.com/companyweb/article";
	        		 });
				}
			}
		});
		
	}
	
	function clearForm(){
		$('#newsAddForm').form('reset');
		newsAddEditor.html('');
	}
</script>
</body>
</html>