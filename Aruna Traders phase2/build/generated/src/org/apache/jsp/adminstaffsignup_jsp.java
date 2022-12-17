package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminstaffsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin-Staff Add</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/adminstaffsignup.css\">        \n");
      out.write("        <style>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    p.copyright {\n");
      out.write("        position: fixed;\n");
      out.write("        width: 100%;\n");
      out.write("        left: 0%;\n");
      out.write("        \n");
      out.write("        opacity: 0.95;\n");
      out.write("        color: #fff;\n");
      out.write("        line-height: 50px;\n");
      out.write("        font-size: 0.7em;\n");
      out.write("        text-align: center;\n");
      out.write("        bottom:-2%;\n");
      out.write("        z-index: 9999;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("<div class=\"back\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"admindashboard.jsp\" method=\"POST\">\n");
      out.write("                 <input class=\"back\" type=\"submit\" value=\"BACK\">\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("        <center>\n");
      out.write("<div class=\"all\">\n");
      out.write("         <h1><b> EMPLOYEE </b></h1>\n");
      out.write("\n");
      out.write("     \n");
      out.write("       \n");
      out.write("        <form action=\"adminstafff\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"fname\" value=\"\" placeholder=\"        First Name\" /> <br><br></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                    <td><input type=\"text\" class=\"input-box\" name=\"sname\" value=\"\" placeholder=\"        Surname Name\"  /> <br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td><input required type=\"email\" class=\"input-box\" name=\"email\" value=\"\" placeholder=\"        www@mail.com\" /><br> <br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td><input required type=\"password\" class=\"input-box\" name=\"spassword\" value=\"\" placeholder=\"        Password\"/> <br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"telephone\" value=\"\" placeholder=\"        Contact Number\"/> <br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                    \n");
      out.write("                        <td><br><br><br></br><input type=\"submit\" class=\"book\" value=\"ADD\" /></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write(" </div>\n");
      out.write("             </center>\n");
      out.write("       <footer>\n");
      out.write("<p class=\"copyright\">Copyright©   Phoenix Airlines 2022 </p>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
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
