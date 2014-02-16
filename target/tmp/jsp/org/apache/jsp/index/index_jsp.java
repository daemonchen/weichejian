package org.apache.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body class=\"landing site\">\n");
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"/\"><img src=\"/public/images/logo.png\" width=\"48\" alt=\"Inc\"></a>\n");
      out.write("        <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"/features/\" class=\"nav-features\">主页</a></li>\n");
      out.write("            <li><a href=\"/pricing/\" class=\"nav-pricing\">案例</a></li>\n");
      out.write("            <li><a href=\"/about/\" class=\"nav-about\">套餐</a></li>\n");
      out.write("            <li class=\"sep\"></li>\n");
      out.write("            <li><a href=\"http://blog.sendtoinc.com/\">关于我们</a>\n");
      out.write("            <li class=\"sep\"></li>\n");
      out.write("            \n");
      out.write("            <li><a href=\"/accounts/login/\">登录</a></li>\n");
      out.write("            <li class=\"signup\"><a href=\"/accounts/signup/\" class=\"btn signup-link\">注册</a></li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
      out.write("            <div class=\"col col-xs-5 col-md-offset-1\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                <h3>注册</h3>\n");
      out.write("                <a href=\"/login/google-oauth2/\" class=\"gapps\"><span>使用微信账号</span></a>\n");
      out.write("                <form action=\".\" method=\"POST\"><input type='hidden' name='' value='' />\n");
      out.write("                    <label>或者用邮箱注册</label>\n");
      out.write("                    <input type=\"text\" name=\"email\" placeholder=\"Enter your email\">\n");
      out.write("                    <input type=\"submit\" class=\"btn\" value=\"Sign Up\">\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <footer>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col col-lg-10\">\n");
      out.write("                <img src=\"public/images/logo.png\" alt=\"Inc\" width=\"42\" style=\"opacity:0.65\">\n");
      out.write("                <a href=\"/about/\">About</a>\n");
      out.write("                <a href=\"http://blog.sendtoinc.com/\">Blog</a>\n");
      out.write("                <a href=\"/pricing/\">Pricing</a>\n");
      out.write("                <a href=\"/apps/\">Apps</a>\n");
      out.write("                <a href=\"/help/\">Help</a>\n");
      out.write("                <a href=\"/terms/\">Terms</a>\n");
      out.write("                <a href=\"/privacy/\">Privacy</a>\n");
      out.write("                <a href=\"mailto:hello@sendtoinc.com\">Contact Us</a>\n");
      out.write("                <div style=\"padding:0 20px; vertical-align:middle; display:inline-block\"><a href=\"https://twitter.com/sendtoinc\" class=\"twitter-follow-button\" data-show-count=\"false\">Follow @sendtoinc</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col col-lg-2\">\n");
      out.write("                <span>&copy 2014 - Kippt Inc.</span>\n");
      out.write("                <div class=\"mixpanel\">\n");
      out.write("                    <a href=\"https://mixpanel.com/f/partner\"><img src=\"//cdn.mxpnl.com/site_media/images/partner/badge_light.png\" alt=\"Mobile Analytics\" /></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("  <script src=\"/public/js/main.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n");
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
