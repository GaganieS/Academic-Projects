package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class admindashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminsession.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Session</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession s3 = request.getSession(false);
            if(s3.getAttribute("uid") != null)
            {
               
                
               
            } 
     
            else
            {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Only Admin Can Access This Site')");
                    out.println("location='adminlogin.jsp';");
                    out.println("</script>");
            }

        
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Administrator Dashboard </title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"AdminDashboard/admindash.css\">\n");
      out.write("        <style>\n");
      out.write("    footer\n");
      out.write("    {\n");
      out.write("        position: absolute;\n");
      out.write("        height: 300px;\n");
      out.write("        width: 100%;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p.copyright {\n");
      out.write("        position: fixed;\n");
      out.write("        width: 100%;\n");
      out.write("        color: #fff;\n");
      out.write("        line-height: 40px;\n");
      out.write("        font-size: 0.7em;\n");
      out.write("        text-align: center;\n");
      out.write("        bottom:0;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("<div class=\"one\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"adminstaffsignup.jsp\">\n");
      out.write("                 <input type=\"image\" src=\"Images/employee.jpg\" class=\"img1\">\n");
      out.write("        </form>\n");
      out.write("    <span class=\"title1\"><h1>Employee</h1></span>\n");
      out.write("</div>       \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div class=\"two\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"product.jsp\" method=\"POST\">\n");
      out.write("                 <input class=\"img2\" type=\"image\" src=\"Images/product.jpg\">\n");
      out.write("        </form>\n");
      out.write("<span class=\"title2\"><h1>Product</h1></span>\n");
      out.write("</div>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<div class=\"three\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"productedit.jsp\">\n");
      out.write("                 <input class=\"img3\" type=\"image\" src=\"Images/inventory.jpg\">\n");
      out.write("        </form>\n");
      out.write("    <span class=\"title3\"><h1>Inventory</h1></span>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"copyright\">Copyright© ARUNA TRADERS 2022 </p>\n");
      out.write("</footer>    -->\n");
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
