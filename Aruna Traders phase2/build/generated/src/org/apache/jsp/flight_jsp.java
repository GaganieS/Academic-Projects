package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class flight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Flight Details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/backup/product.css\">        \n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("       <!-- <div class=\"back\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"staffdashboard.jsp\" method=\"POST\">\n");
      out.write("                 <input class=\"back\" type=\"submit\" value=\"BACK\">\n");
      out.write("        </form>\n");
      out.write("</div>-->\n");
      out.write("       <div class=\"all\">\n");
      out.write("        <h1>Add Product Details</h1>\n");
      out.write("        <form action=\"flight\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Product ID:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"id\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Item Name:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"itemname\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Quantity:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"quantity\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Manufacture Date:</td>\n");
      out.write("                        <td><input required type=\"date\" class=\"input-date\" name=\"date\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Cost:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"cost\" value=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn1\" value=\"Submit Product\" />\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("        </form>\n");
      out.write("                </center> \n");
      out.write("    </div>\n");
      out.write("      <footer>\n");
      out.write("<p class=\"copyright\">Copyright©   ARUNA TRADERS  2022</p>\n");
      out.write("</footer> \n");
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
