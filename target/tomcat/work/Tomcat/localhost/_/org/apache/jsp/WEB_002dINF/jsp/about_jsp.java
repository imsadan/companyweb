/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-18 09:16:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<title>信普科技</title>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/abouts.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/bootstrap.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style2.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/osblogger.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.6.4.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://api.map.baidu.com/api?v=2.0&ak=Bkouc68KR1O3UaRtXKo5lRC9Uz4GUPP9\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/main.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/main2.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#allmap{width:100%;height:350px;}\r\n");
      out.write("\t.anchorBL{ \r\n");
      out.write("        display:none; \r\n");
      out.write("     }\r\n");
      out.write("   .cancel{\r\n");
      out.write("    width:60px;\r\n");
      out.write("\theight:60px;\r\n");
      out.write("\tposition:fixed;\r\n");
      out.write("\ttop:8%;\r\n");
      out.write("\tright:2%;\r\n");
      out.write("\tz-index:9999;\r\n");
      out.write("\tbackground:url(../images/cancel.png);\r\n");
      out.write("\tdisplay:none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body oncontextmenu=self.event.returnValue=false onselectstart=\"return false\"> \r\n");
      out.write("<header>\r\n");
      out.write("\t<nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t   \t<div id=\"flags\">     \t   \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse navbar-right navbar-main-collapse top-menu\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\t\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll active\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/\" id=\"#home\">HOME</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#service\">服务</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/about\">关于我们</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/works\">案例展示</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/reads\">新闻中心</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"page-scroll\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"/login\">管理员登录入口</i></a>\r\n");
      out.write("\t\t\t\t\t</li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</header>\r\n");
      out.write("<div id=\"top_pic\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t<br><br><br><br>\r\n");
      out.write("\t\t      <h1><p align=\"center\">ABOUT US<br></p></h1>\r\n");
      out.write("\t          <h3><p align=\"center\"> 关于我们</p></h3>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"about_js\" >\r\n");
      out.write("   <div id=\"js_text\" >\r\n");
      out.write("     <h1><p align=\"center\">企业介绍</p></h1>\r\n");
      out.write("   </div>\r\n");
      out.write("    <div id=\"pic_js\">\r\n");
      out.write("     \t<div id=\"sec2_right\"  style=\"margin-top:5%;height:60%;\">\r\n");
      out.write("\t    <div id=\"right2_title\">\r\n");
      out.write("\t\t  <br>\r\n");
      out.write("\t\t  <h1><font style=\"color:#fff;\">嘉兴信普信息科技有限公司</font></h1>\r\n");
      out.write("\t\t  <h2>\r\n");
      out.write("\t\t   <font style=\"color:#fff;\"> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp专注于各行业基于物联网“智慧化”改造和移动</font><br>\r\n");
      out.write("\t\t   <font style=\"color:#fff;\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp设备APP的研究开发，形成了针对政府，企业等</font><br>\r\n");
      out.write("\t\t   <font style=\"color:#fff;\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp不同行业，不同规模，不同应用的产品和针对性</font><br>\r\n");
      out.write("\t\t   <font style=\"color:#fff;\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp解决方案，是一家具有强大技术力量的信息化技</font><br>\r\n");
      out.write("\t\t   <font style=\"color:#fff;\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp术提供商。</font>\r\n");
      out.write("         </h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div id=\"sec2_left\" >\r\n");
      out.write("\t    <img src=\"images/about.png\" style=\"width:100%;height:100%;\" id=\"about\"/>\r\n");
      out.write("\t  </div>\r\n");
      out.write("   </div> \r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"about_js_text\">\r\n");
      out.write("    <div style=\"width:100%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t<br/>\r\n");
      out.write("\t   <h1><p align=\"center\">理念与初衷</p></h1><br/>\r\n");
      out.write("\t   <p align=\"center\">“创新，将新技术转化为生产力”是信普信息的核心竞争力。<br/><br/>\r\n");
      out.write("\t    凭借对物联网和互联网行业的深刻理解，<br/><br/>\r\n");
      out.write("\t\t信普信息将物联网技术与互联网应用相结合，将领先业界的产品理念和丰富的产品开发经验相结合，<br/><br/>\r\n");
      out.write("\t\t为用户提供简单，方便，安全，实用的协同应用软件产品和解决方案<br/><br/>\r\n");
      out.write("\t\t帮助客户实现低成本，低风险，快起步，高效率的信息化目标。<p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"about_video\" >\r\n");
      out.write("\t  <!--          点击播放视屏          -->\r\n");
      out.write("\t <div >\r\n");
      out.write("\t    <div> \r\n");
      out.write("\t\t    <br><br><br>\r\n");
      out.write("     \t\t<h2 style=\"line-height:2;margin-top:5%;\">一切从现在开始<br>信普科技未来的方向</h2>\r\n");
      out.write("\t\t\t  <img src=\"images/begin2.png\" id=\"begin\" style=\"width:60px;\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t <!--          背景遮罩层         --> \r\n");
      out.write("\t<div class=\"mask\"></div>\r\n");
      out.write("\t <!--          视频播放          -->\r\n");
      out.write("\t<div class=\"begin-voide\">\r\n");
      out.write("\t       <h4 style=\"margin-left:15px;\">物联网开放平台 OneNET</h4>\r\n");
      out.write("\t\t   <video  id=\"play\" style=\"width:100%;\" controls=\"controls\" loop=\"loop\" src=\"https://upfiles.heclouds.com/other_files/OneNet++.mp4\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"cancel\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t  <br/>\r\n");
      out.write("\t  <h1><p align=\"center\">我们的团队</p></h1><br/>\r\n");
      out.write("\t  <p align=\"center\">拥有由优秀管理人员组成的管理团队和由年轻活力的IT工程师组成的技术团队，<br><br/>\r\n");
      out.write("\t\t帮助客户实现低成本，低风险，快起步，高效率的信息化目标。<br><br>\r\n");
      out.write("\t    成员中有海外工作经历的，有资深急速研发的，有专业客服运维的。<br><br/>\r\n");
      out.write("\t\t对生活，对工作我们充满热情，对人，对事我们是有“态度的”。<br><br/>\r\n");
      out.write("\t\t我们在产品开发，推广和维护方面默契合作，<br><br/>\r\n");
      out.write("\t\t深刻理解“以客户为中心”的含义，将“服务”贯穿于公司运作和管理的每一个细节<br><br/>\r\n");
      out.write("\t\t，赢得客户广泛的信任和支持。<p>\r\n");
      out.write("\t  </p>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div id=\"about_team\">\r\n");
      out.write("\t  <div class=\"labels\">\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  \r\n");
      out.write("\t<div class=\"description\"><p></p><a class=\"close\">X</a></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"about_map\">\r\n");
      out.write("\t   <div id=\"allmap\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br><br/>\r\n");
      out.write("<div style=\"width:100%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("    <div style=\"width:130px;height:20px;margin-left:45%; margin-top:-15px;\">\r\n");
      out.write("          <div id=\"top\"><img src=\"images/TOP.png\" style=\"width:100%; height:100%\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t<!--尾-->\r\n");
      out.write("\t   <div id=\"footer\">\r\n");
      out.write("\t      <div id=\"footer_flag\"></div>\r\n");
      out.write("\t\t  <div id=\"footer_addr\">\r\n");
      out.write("\t\t     <br>\r\n");
      out.write("\t\t    <p align=\"center\">地址：<br>\r\n");
      out.write("\t\t\t   嘉兴余北大街渔谣路\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p align=\"center\">电话：<br>\r\n");
      out.write("\t\t\t  0573-83018563\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<p align=\"center\">邮箱：<br>\r\n");
      out.write("\t\t\t   25634893@qq.com\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div id=\"footer_home\">\r\n");
      out.write("\t\t    <br>\r\n");
      out.write("\t\t\t<p align=\"center\">关于我们</p>\r\n");
      out.write("\t\t\t<p align=\"center\"><a href=\"\" style=\"text-decoration:none;\">公司简介</a></p>\r\n");
      out.write("\t\t\t<p align=\"center\"><a href=\"\" style=\"text-decoration:none;\">团队介绍</a></p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div id=\"footer_name\">\r\n");
      out.write("\t\t  <br>\r\n");
      out.write("\t\t     <h4><p align=\"center\">加入我们</p></h4>\r\n");
      out.write("\t\t\t <p align=\"center\">英才招聘</p><br>\r\n");
      out.write("\t\t\t <p align=\"center\">姓名 NAME\r\n");
      out.write("\t\t\t    <div style=\"width:80%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t <P align=\"center\">邮箱 E-MAIL\r\n");
      out.write("\t\t\t    <div style=\"width:80%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("\t\t\t </P>\r\n");
      out.write("\t\t\t <p align=\"center\">电话 TEL\r\n");
      out.write("\t\t\t    <div style=\"width:80%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("\t\t\t </p>\r\n");
      out.write("\t\t\t <P align=\"center\">信息 INFORMATION\r\n");
      out.write("\t\t\t    <div style=\"width:80%;height:1px; background:#E0E0E0;\"></div>\r\n");
      out.write("\t\t\t </P>\r\n");
      out.write("\t\t\t <div style=\"float:right;\" id=\"button_pic\">\r\n");
      out.write("\t\t\t    <p align=\"center\"><a href=\"\">发送 </a></p>\r\n");
      out.write("\t\t\t </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t   </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(\"#top\").click(function(){\r\n");
      out.write("\t\t  $(\"html,body\").animate({scrollTop:0}, 500);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t$(\"#begin\").click(function(){\r\n");
      out.write("\t\t$(\".mask\").show();\r\n");
      out.write("\t\t$(\".begin-voide\").show();\r\n");
      out.write("\t\t$(\".cancel\").show();\r\n");
      out.write("\t\t\t document.getElementById(\"play\").play();\r\n");
      out.write("\t\t});\t\t\r\n");
      out.write("\t$(\".cancel\").click(function(){\r\n");
      out.write("\t\t $(\".mask\").hide();\r\n");
      out.write("\t\t $(\".begin-voide\").hide();\r\n");
      out.write("\t\t $(\".cancel\").hide();\r\n");
      out.write("\t\t\tdocument.getElementById(\"play\").pause();\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t });\r\n");
      out.write("\t\r\n");
      out.write("\t// 百度地图API功能\r\n");
      out.write("\tvar map = new BMap.Map(\"allmap\");\r\n");
      out.write("\tmap.centerAndZoom(new BMap.Point(120.822815,30.67598),15);\r\n");
      out.write("\tmap.enableScrollWheelZoom();   //启用滚轮放大缩小\r\n");
      out.write("\tmap.enableContinuousZoom(); \r\n");
      out.write("    $.ajax({\r\n");
      out.write("        async:true, \r\n");
      out.write("        type:'post',\r\n");
      out.write("        url:'/maps',\r\n");
      out.write("        success:function(data){\r\n");
      out.write("           var s=eval(data);\r\n");
      out.write("           for(var i=0;i<s.length;i++){\r\n");
      out.write("                var point=new BMap.Point(s[i].x,s[i].y);\r\n");
      out.write("              var marker = new BMap.Marker(point); \r\n");
      out.write("              map.addOverlay(marker); \r\n");
      out.write("              \tvar opts = {\r\n");
      out.write("\t\t\t\t  width : 100,     // 信息窗口宽度\r\n");
      out.write("\t\t\t\t  height: 80,     // 信息窗口高度\r\n");
      out.write("\t\t\t\t  title : s[i].name , // 信息窗口标题\r\n");
      out.write("\t\t\t\t  enableMessage:true,//设置允许信息窗发送短息\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tvar infoWindow = new BMap.InfoWindow(s[i].address, opts);  // 创建信息窗口对象 \r\n");
      out.write("\t\t\t\tmarker.addEventListener(\"click\", function(){          \r\n");
      out.write("\t\t\t\t\tmap.openInfoWindow(infoWindow,point); //开启信息窗口\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("           }\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("        }\r\n");
      out.write("    \r\n");
      out.write("    });\r\n");
      out.write("</script>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/about.jsp(139,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/about.jsp(139,6) '${teams}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${teams}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/about.jsp(139,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("team");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write(" \t\t<a id=\"label");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"label\" href=\"#\"> \r\n");
          out.write("\t\t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.image}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" style=\"width:100px;height:100px;border-radius:50px;margin-top:-30px;\"/>\r\n");
          out.write("\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("<br>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${team.intro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("        </a>\r\n");
          out.write("\t  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
