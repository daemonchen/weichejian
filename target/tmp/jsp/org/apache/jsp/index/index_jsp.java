package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/common/mainHeader.jsp");
    _jspx_dependants.add("/common/mainFooter.jsp");
  }

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
      response.setContentType("text/html;charset=utf-8");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta name=\"description\" content=\"wei che jian.\">\n");
      out.write("  <title>Wei Che Jian</title>\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/png\" href=\"public/images/logo.ico\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"public/css/index.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body class=\"landing site features\">\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<div class=\"navbar\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/\"><img src=\"/public/images/logo.png\" width=\"48\" alt=\"Inc\"></a>\r\n");
      out.write("        <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=");
if(request.getAttribute("controllerName").equals("index")){
      out.write("active ");
}
      out.write("\r\n");
      out.write("            ><a href=\"/features/\" class=\"nav-features\">主页</a></li>\r\n");
      out.write("            <li><a href=\"/pricing/\" class=\"nav-pricing\">案例</a></li>\r\n");
      out.write("            <li><a href=\"/about/\" class=\"nav-about\">套餐</a></li>\r\n");
      out.write("            <li class=\"sep\"></li>\r\n");
      out.write("            <li><a href=\"http://blog.sendtoinc.com/\">关于我们</a>\r\n");
      out.write("            <li class=\"sep\"></li>\r\n");
      out.write("            ");
if(request.getAttribute("user") !=null){ 
      out.write("\r\n");
      out.write("            <li><a href=\"/admin\">");
      out.print( request.getAttribute("user") );
      out.write("</a></li>\r\n");
      out.write("            \r\n");
      out.write("            ");
}else{ 
      out.write("\r\n");
      out.write("            <li><a href=\"/accounts/login/\">登录</a></li>\r\n");
      out.write("            <li class=\"signup\"><a href=\"/accounts/signup/\" class=\"btn signup-link\">注册</a></li>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"bg\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col col-xs-5 col-md-offset-1\">\n");
      out.write("                <div class=\"text\">\n");
      out.write("                    <h1>微车间</h1>\n");
      out.write("                    <p>创新 专注</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col col-lg-10\">\r\n");
      out.write("                <img src=\"public/images/logo.png\" alt=\"Inc\" width=\"42\" style=\"opacity:0.65\">\r\n");
      out.write("                <a href=\"/about/\">About</a>\r\n");
      out.write("               \r\n");
      out.write("                <a href=\"mailto:daemon@weichejian.cn\">Contact Us</a>\r\n");
      out.write("                <div style=\"padding:0 20px; vertical-align:middle; display:inline-block\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col col-lg-2\">\r\n");
      out.write("                <span>&copy 2014 - weichejian</span>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/public/js/main.js\" type=\"text/javascript\" charset=\"utf-8\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
