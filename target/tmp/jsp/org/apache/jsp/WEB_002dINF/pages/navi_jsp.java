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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>导航</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: \"微软雅黑\";\n");
      out.write("            background: black\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /*a:link,a:visited{text-decoration:none;color: black}*/\n");
      out.write("        /*a:hover{text-decoration:a  }*/\n");
      out.write("        .logo {\n");
      out.write("            color: grey;\n");
      out.write("            font-size: 80px;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .master {\n");
      out.write("            width: 900px;\n");
      out.write("            height: 800px;\n");
      out.write("            text-align: center;\n");
      out.write("            line-height: 120px;\n");
      out.write("            margin-right: auto;\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-top: 100px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan {\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 33px;\n");
      out.write("            color: whitesmoke;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin: 0 5px 5px 0\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan:hover {\n");
      out.write("            opacity: 0.8;\n");
      out.write("            -webkit-box-shadow: 0 0 20px #909090;\n");
      out.write("            -moz-box-shadow: 0 0 20px 909090\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan1 {\n");
      out.write("            background: red;\n");
      out.write("            width: 330px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan2 {\n");
      out.write("            background: dodgerblue;\n");
      out.write("            float: left;\n");
      out.write("            width: 560px\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan3 {\n");
      out.write("            background: orange;\n");
      out.write("            width: 300px;\n");
      out.write("            float: left\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan4 {\n");
      out.write("            background: gold;\n");
      out.write("            width: 200px;\n");
      out.write("            float: left\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pan5 {\n");
      out.write("            background: hotpink;\n");
      out.write("            width: 385px;\n");
      out.write("            float: left;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"/img/logo.ico\">\n");
      out.write("</head>\n");
      out.write("<body onload=\"if (window.navigator.userAgent.indexOf('MSIE') >= 0) {alert('Don\\'t Support IE');}\">\n");
      out.write("<div class=\"logo\">\n");
      out.write("    TCL\n");
      out.write("</div>\n");
      out.write("<div class=\"master\">\n");
      out.write("    <div class=\"pan pan1\" onclick=\"window.open('http://maven.lab.tclclouds.com/nexus/#welcome');\">MAVEN库</div>\n");
      out.write("    <div class=\"pan pan2\" onclick=\"window.open('http://121.40.71.149:7990');\">GIT</div>\n");
      out.write("    <div class=\"pan pan3\" onclick=\"window.open('http://121.40.71.149:8090/dashboard.action');\">WIKI文档</div>\n");
      out.write("    <div class=\"pan pan4\" onclick=\"window.open('http://jira.lab.tclclouds.com/secure/Dashboard.jspa');\">JIRA</div>\n");
      out.write("    <div class=\"pan pan5\">NULL</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
