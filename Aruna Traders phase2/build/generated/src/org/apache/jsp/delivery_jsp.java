package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class delivery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Client Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/backup/delivery.css\">\n");
      out.write("        <title>Filter Flights</title>\n");
      out.write("        <style>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    p.copyright {\n");
      out.write("        position: absolute;\n");
      out.write("        width: 100%;\n");
      out.write("        left: 0%;\n");
      out.write("        color: #fff;\n");
      out.write("        line-height: 40px;\n");
      out.write("        font-size: 0.7em;\n");
      out.write("        text-align: center;\n");
      out.write("        bottom:0;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--        <div class=\"back\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"./\" method=\"POST\">\n");
      out.write("                 <input class=\"back\" type=\"submit\" value=\"BACK\">\n");
      out.write("        </form>\n");
      out.write("</div>-->\n");
      out.write("        \n");
      out.write("  <div class=\"all\">\n");
      out.write("        <center><h1>Add Delivery Details</h1></center>\n");
      out.write("        <form action=\"delivery\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Delivery ID:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"id\" value=\"\" /><br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Customer Name:</td>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"customername\" value=\"\" /><br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                                     \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address:</td>\n");
      out.write("                        <td><input required type=\"text\" class=\"input-box\" name=\"address\" value=\"\" /><br><br></td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Payment Method:</label></td>\n");
      out.write("                       <td> <input type=\"radio\" class=\"gender\" name=\"payment\" value=\"cash\" /><label>Cash:</label>\n");
      out.write("                        <input type=\"radio\" class=\"gender\" name=\"payment\" value=\"card\" /><label>Card:</label></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Delivery Charges:</td>\n");
      out.write("                        <td><input required type=\"text\" class=\"input-box\" name=\"charges\" value=\"\" placeholder=\"delivery charge\" min=\"200.00\" max=\"300.00\"/></br></br></td>\n");
      out.write("                        <p>*Note: Rs.200.00 within colombo & Rs.300 out of colombo*</p>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn1\" value=\"Submit Delivery\" /><br><br>\n");
      out.write("                         \n");
      out.write("                        \n");
      out.write("        </form>\n");
      out.write("         </div>\n");
      out.write("               <script>\n");
      out.write("var myInput = document.getElementById(\"psw\");\n");
      out.write("var letter = document.getElementById(\"letter\");\n");
      out.write("var capital = document.getElementById(\"capital\");\n");
      out.write("var number = document.getElementById(\"number\");\n");
      out.write("var length = document.getElementById(\"length\");\n");
      out.write("\n");
      out.write("myInput.onfocus = function() {\n");
      out.write("  document.getElementById(\"message\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("myInput.onblur = function() {\n");
      out.write("  document.getElementById(\"message\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("myInput.onkeyup = function() {\n");
      out.write("  \n");
      out.write("  var lowerCaseLetters = /[a-z]/g;\n");
      out.write("  if(myInput.value.match(lowerCaseLetters)) {  \n");
      out.write("    letter.classList.remove(\"invalid\");\n");
      out.write("    letter.classList.add(\"valid\");\n");
      out.write("  } else {\n");
      out.write("    letter.classList.remove(\"valid\");\n");
      out.write("    letter.classList.add(\"invalid\");\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  var upperCaseLetters = /[A-Z]/g;\n");
      out.write("  if(myInput.value.match(upperCaseLetters)) {  \n");
      out.write("    capital.classList.remove(\"invalid\");\n");
      out.write("    capital.classList.add(\"valid\");\n");
      out.write("  } else {\n");
      out.write("    capital.classList.remove(\"valid\");\n");
      out.write("    capital.classList.add(\"invalid\");\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  var numbers = /[0-9]/g;\n");
      out.write("  if(myInput.value.match(numbers)) {  \n");
      out.write("    number.classList.remove(\"invalid\");\n");
      out.write("    number.classList.add(\"valid\");\n");
      out.write("  } else {\n");
      out.write("    number.classList.remove(\"valid\");\n");
      out.write("    number.classList.add(\"invalid\");\n");
      out.write("  }\n");
      out.write("  if(myInput.value.length >= 6) {\n");
      out.write("    length.classList.remove(\"invalid\");\n");
      out.write("    length.classList.add(\"valid\");\n");
      out.write("  } else {\n");
      out.write("    length.classList.remove(\"valid\");\n");
      out.write("    length.classList.add(\"invalid\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<!--        <footer>\n");
      out.write("<p class=\"copyright\">Copyright© 2021 Surge Web Bros - Phoenix Airlines  </p>\n");
      out.write("</footer>-->\n");
      out.write("        </center>   \n");
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
