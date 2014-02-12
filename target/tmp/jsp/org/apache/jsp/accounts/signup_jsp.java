package org.apache.jsp.accounts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <meta name=\"description\" content=\"wei che jian.\">\r\n");
      out.write("  <title>Wei Che Jian</title>\r\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/png\" href=\"/public/images/logo.ico\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/public/css/accounts.css\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"login signup\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<div id=\"login\">\r\n");
      out.write("    <img src=\"/public/images/logo.png\" height=\"72\" width=\"72\">\r\n");
      out.write("    \r\n");
      out.write("        <h1>Sign up to Inc</h1>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <a href=\"/login/google-oauth2/\" class=\"gapps\"><span>Sign Up with Google Apps</span></a>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <p>\r\n");
      out.write("            Or with your work email:\r\n");
      out.write("        </p>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div>\r\n");
      out.write("        <form action=\"/accounts/signuppost\" method=\"POST\">\r\n");
      out.write("            <input type='hidden' name='csrfmiddlewaretoken' value='GpfVAYNT0V2kB4TpWUgKoNiAK3LKZbz4' />\r\n");
      out.write("            <tr>\r\n");
      out.write("            \t<th><label for=\"id_email\">Email:</label></th>\r\n");
      out.write("            \t<td><input id=\"id_email\" maxlength=\"75\" name=\"email\" placeholder=\"Email\" type=\"text\" /></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><label for=\"id_password\">Password:</label></th>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<input id=\"id_password\" name=\"password\" placeholder=\"Password\" type=\"password\" />\r\n");
      out.write("\t\t\t\t<input id=\"id_invitation_key\" name=\"invitation_key\" type=\"hidden\" /></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("            <p><input type=\"submit\" value=\"Sign up\" class=\"btn btn-primary\"></p>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<p class=\"small\"><a href=\"/login/\">Already have an account? Log in</a></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"/public/js/main.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
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
