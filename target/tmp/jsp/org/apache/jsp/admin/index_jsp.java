package org.apache.jsp.admin;

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
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <meta name=\"description\" content=\"wei che jian.\">\n");
      out.write("  <title>Wei Che Jian</title>\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/png\" href=\"/public/images/logo.ico\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"/public/css/bootstrap.css\" type=\"text/css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"/public/css/admin.css\" type=\"text/css\" />\n");
      out.write("  <link rel=\"stylesheet\" href=\"/public/css/font.css\" type=\"text/css\" />\n");
      out.write("   <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("   <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("   <!--[if lt IE 9]>\n");
      out.write("     <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("     <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("   <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body class=\"skin-blue wysihtml5-supported\" style=\"min-height: 375px;\">\n");
      out.write("        <!-- header logo: style can be found in header.less -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"index.html\" class=\"logo\">\n");
      out.write("                <!-- Add the class icon to your logo image or logo icon to add the margining -->\n");
      out.write("                Wei Che Jian\n");
      out.write("            </a>\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                <!-- Sidebar toggle button-->\n");
      out.write("                <a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                <span>Jane Doe <i class=\"caret\"></i></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <!-- User image -->\n");
      out.write("                                <li class=\"user-header bg-light-blue\">\n");
      out.write("                                    <img src=\"/public/images/logo.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                                    <p>\n");
      out.write("                                        Jane Doe - Web Developer\n");
      out.write("                                        <small>Member since Nov. 2012</small>\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Body -->\n");
      out.write("                                <li class=\"user-body\">\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Followers</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Sales</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Friends</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"wrapper row-offcanvas row-offcanvas-left\" style=\"min-height: 375px;\">\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"left-side sidebar-offcanvas\" style=\"min-height: 375px;\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"/public/images/logo.png\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Hello, Jane</p>\n");
      out.write("\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"seach\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                                <span>账号设置</span>\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"/admin/mp_info\" style=\"margin-left: 10px;\"><i class=\"fa fa-angle-double-right\"></i> 微信公众 账号</a></li>\n");
      out.write("                                <li><a href=\"/admin/show_change_pwd\" style=\"margin-left: 10px;\"><i class=\"fa fa-angle-double-right\"></i> 修改密码</a></li>\n");
      out.write("                                <li><a href=\"/\" style=\"margin-left: 10px;\"><i class=\"fa fa-angle-double-right\"></i> 修改个人信息</a></li>\n");
      out.write("                                <li><a href=\"/\" style=\"margin-left: 10px;\"><i class=\"fa fa-angle-double-right\"></i> 查看权限</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/\">\n");
      out.write("                                <i class=\"fa fa-calendar\"></i> <span>基础模块</span>\n");
      out.write("                                <small class=\"badge pull-right bg-red\">3</small>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"/\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i> <span>微网站</span>\n");
      out.write("                                <small class=\"badge pull-right bg-yellow\">12</small>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Right side column. Contains the navbar and content of the page -->\n");
      out.write("            <aside class=\"right-side\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("\n");
      out.write("                    <!-- Small boxes (Stat box) -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12 \">\n");
      out.write("                        </div>\n");
      out.write("                     </div>\n");
      out.write("                 </section>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </aside><!-- /.right-side -->\n");
      out.write("        </div><!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- add new calendar event modal -->     \n");
      out.write("<script src=\"/public/js/jQuery.js\" type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("</script>\n");
      out.write("<script src=\"/public/js/bootstrap.js\" type=\"text/javascript\" charset=\"utf-8\"></script> \n");
      out.write("\n");
      out.write("<script src=\"/public/js/admin.js\" type=\"text/javascript\" charset=\"utf-8\"></script> \n");
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
