package org.apache.jsp.hello;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta name=\"description\" content=\"A layout example that shows off a responsive pricing table.\">\r\n");
      out.write("  <title>Wei Che Jian</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://yui.yahooapis.com/pure/0.3.0/pure-min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://purecss.io/combo/1.9.5?/css/main-grid.css&/css/layouts/pricing.css\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pure-menu pure-menu-open pure-menu-horizontal\">\r\n");
      out.write("    <a href=\"#\" class=\"pure-menu-heading\">Logo xxx</a>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li class=\"pure-menu-selected item\">\r\n");
      out.write("        <a  href=\"/\">\r\n");
      out.write("          <i class=\"home icon\"></i> Home\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\" item\">\r\n");
      out.write("        <a  href=\"/\">\r\n");
      out.write("          <i class=\"home icon\"></i> Contact Us\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\" item\">\r\n");
      out.write("        <a href=\"/\">\r\n");
      out.write("          <i class=\"home icon\"></i> TODO\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"banner\">\r\n");
      out.write("    <h1 class=\"banner-head\">\r\n");
      out.write("        å¾®è½¦é´<br>\r\n");
      out.write("        Try before you buy.\r\n");
      out.write("    </h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"l-content\">\r\n");
      out.write("    <div class=\"pricing-tables pure-g\">\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-3\">\r\n");
      out.write("            <div class=\"pricing-table pricing-table-free\">\r\n");
      out.write("                <div class=\"pricing-table-header\">\r\n");
      out.write("                    <h2>Personal</h2>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"pricing-table-price\">\r\n");
      out.write("                        $5 <span>per month</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"pricing-table-list\">\r\n");
      out.write("                    <li>Free setup</li>\r\n");
      out.write("                    <li>Custom sub-domain</li>\r\n");
      out.write("                    <li>Standard customer support</li>\r\n");
      out.write("                    <li>1GB file storage</li>\r\n");
      out.write("                    <li>1 database</li>\r\n");
      out.write("                    <li>Unlimited bandwidth</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"button-choose pure-button\">Choose</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-3\">\r\n");
      out.write("            <div class=\"pricing-table pricing-table-biz pricing-table-selected\">\r\n");
      out.write("                <div class=\"pricing-table-header\">\r\n");
      out.write("                    <h2>Small Business</h2>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"pricing-table-price\">\r\n");
      out.write("                        $25 <span>per month</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"pricing-table-list\">\r\n");
      out.write("                    <li>Free setup</li>\r\n");
      out.write("                    <li>Use your own domain</li>\r\n");
      out.write("                    <li>Standard customer support</li>\r\n");
      out.write("                    <li>10GB file storage</li>\r\n");
      out.write("                    <li>5 databases</li>\r\n");
      out.write("                    <li>Unlimited bandwidth</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"button-choose pure-button\">Choose</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-3\">\r\n");
      out.write("            <div class=\"pricing-table pricing-table-enterprise\">\r\n");
      out.write("                <div class=\"pricing-table-header\">\r\n");
      out.write("                    <h2>Enterprise</h2>\r\n");
      out.write("\r\n");
      out.write("                    <span class=\"pricing-table-price\">\r\n");
      out.write("                        $45 <span>per month</span>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"pricing-table-list\">\r\n");
      out.write("                    <li>Free setup</li>\r\n");
      out.write("                    <li>Use your own domain</li>\r\n");
      out.write("                    <li>Premium customer support</li>\r\n");
      out.write("                    <li>Unlimited file storage</li>\r\n");
      out.write("                    <li>25 databases</li>\r\n");
      out.write("                    <li>Unlimited bandwidth</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"button-choose pure-button\">Choose</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> \r\n");
      out.write("\r\n");
      out.write("    <div class=\"information pure-g\">\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-2\">\r\n");
      out.write("            <div class=\"l-box\">\r\n");
      out.write("                <h3 class=\"information-head\">Get started today</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-2\">\r\n");
      out.write("            <div class=\"l-box\">\r\n");
      out.write("                <h3 class=\"information-head\">Pay monthly or annually</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ullamco laboris nisi ut aliquip ex ea commodo\r\n");
      out.write("                    consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-2\">\r\n");
      out.write("            <div class=\"l-box\">\r\n");
      out.write("                <h3 class=\"information-head\">24/7 customer support</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"pure-u-1 pure-u-med-1-2\">\r\n");
      out.write("            <div class=\"l-box\">\r\n");
      out.write("                <h3 class=\"information-head\">Cancel your plan anytime</h3>\r\n");
      out.write("                <p>\r\n");
      out.write("                    Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n");
      out.write("                    cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div> \r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<div class=\"footer l-box\">\r\n");
      out.write("    <p>\r\n");
      out.write("        <a href=\"#\">Try now</a> for 14 days. No credit card required. Header image courtesy of <a href='http://unsplash.com/'>Unsplash</a>.\r\n");
      out.write("    </p>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"/public//js/main.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
