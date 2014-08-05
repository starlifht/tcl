package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class metro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        body{font-family:\"微软雅黑\";}\r\n");
      out.write("\r\n");
      out.write("        /*a:link,a:visited{text-decoration:none;color: black}*/\r\n");
      out.write("        /*a:hover{text-decoration:a  }*/\r\n");
      out.write("        .master{width: 900px;height: 800px;text-align: center; line-height:120px;margin-right: auto;margin-left: auto; margin-top: 200px; }\r\n");
      out.write("        .pan{cursor:pointer;font-size: 33px;}\r\n");
      out.write("        .pan:hover{opacity:0.8;-webkit-box-shadow:  5px 5px 20px #909090;}\r\n");
      out.write("        .pan1{background: red;width: 200px;float:left;}\r\n");
      out.write("        .pan2{background: dodgerblue;float: left;width: 700px}\r\n");
      out.write("        .pan3{background: orange;width: 300px;float: left}\r\n");
      out.write("        .pan4{background: gold;width: 150px;float: left}\r\n");
      out.write("        .pan5{background: hotpink;width: 450px;float: left}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class =\"master\">\r\n");
      out.write("    <div class=\"pan pan1\" onclick=\"window.open('http://maven.lab.tclclouds.com/nexus/#welcome');\">MAVEN库</div>\r\n");
      out.write("    <div class=\"pan pan2\"  onclick=\"window.open('http://121.40.71.149:7990');\">GIT</div>\r\n");
      out.write("    <div class=\"pan pan3\">新浪</div>\r\n");
      out.write("    <div class=\"pan pan4\">阿里</div>\r\n");
      out.write("    <div class=\"pan pan5\">腾讯</div>\r\n");
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
