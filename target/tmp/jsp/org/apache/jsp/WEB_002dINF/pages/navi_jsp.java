package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>导航</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: \"微软雅黑\";\r\n");
      out.write("            background: black\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /*a:link,a:visited{text-decoration:none;color: black}*/\r\n");
      out.write("        /*a:hover{text-decoration:a  }*/\r\n");
      out.write("        .logo {\r\n");
      out.write("            color: grey;\r\n");
      out.write("            font-size: 80px;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .master {\r\n");
      out.write("            width: 900px;\r\n");
      out.write("            height: 800px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            line-height: 120px;\r\n");
      out.write("            margin-right: auto;\r\n");
      out.write("            margin-left: auto;\r\n");
      out.write("            margin-top: 100px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan {\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            font-size: 33px;\r\n");
      out.write("            color: whitesmoke;\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            margin: 0 5px 5px 0\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan:hover {\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("            -webkit-box-shadow: 0 0 20px #909090;\r\n");
      out.write("            -moz-box-shadow: 0 0 20px 909090\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan1 {\r\n");
      out.write("            background: red;\r\n");
      out.write("            width: 330px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan2 {\r\n");
      out.write("            background: dodgerblue;\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 560px\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan3 {\r\n");
      out.write("            background: orange;\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            float: left\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan4 {\r\n");
      out.write("            background: gold;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            float: left\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .pan5 {\r\n");
      out.write("            background: hotpink;\r\n");
      out.write("            width: 385px;\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"/img/logo.ico\">\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"if (window.navigator.userAgent.indexOf('MSIE') >= 0) {alert('Don\\'t Support IE');}\">\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("    TCL<img src=\"/img/logo.ico\">\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"master\">\r\n");
      out.write("    <div class=\"pan pan1\" onclick=\"window.open('http://maven.lab.tclclouds.com/nexus/#welcome');\">MAVEN库</div>\r\n");
      out.write("    <div class=\"pan pan2\" onclick=\"window.open('http://121.40.71.149:7990');\">GIT</div>\r\n");
      out.write("    <div class=\"pan pan3\" onclick=\"window.open('http://121.40.71.149:8090/dashboard.action');\">WIKI文档</div>\r\n");
      out.write("    <div class=\"pan pan4\" onclick=\"window.open('http://jira.lab.tclclouds.com/secure/Dashboard.jspa');\">JIRA</div>\r\n");
      out.write("    <div class=\"pan pan5\">NULL</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
