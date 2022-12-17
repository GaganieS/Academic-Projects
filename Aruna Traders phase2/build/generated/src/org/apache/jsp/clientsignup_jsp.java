package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clientsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Client Registration</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/backup/customerregistration.css\">\n");
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
      out.write("   <div class=\"all\">     \n");
      out.write("        <center>\n");
      out.write("        <h1>CUSTOMER REGISTRATION</h1>\n");
      out.write("        \n");
      out.write("<!--        <center><div class=\"box\"> </div> </center>-->\n");
      out.write("        <br>\n");
      out.write("        <form action=\"clientservlet\" method=\"POST\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                <tbody>\n");
      out.write("<!--                    <tr>\n");
      out.write("                        <td><select name=\"ddltitle\" class=\"dropdown\" required><option value=\"\">Choose Title</option>\n");
      out.write("<option value=\"REV\">Rev</option>\n");
      out.write("<option value=\"PROF\">PROF</option>\n");
      out.write("<option value=\"DR\">Dr</option>\n");
      out.write("<option value=\"HON\">Hon</option>\n");
      out.write("<option value=\"MR\">Mr</option>\n");
      out.write("<option value=\"MRS\">Mrs</option>\n");
      out.write("<option value=\"MS\">Ms</option>\n");
      out.write("<option value=\"EXC\">Exc</option>\n");
      out.write("<option value=\"VEN\">Ven</option>\n");
      out.write("<option value=\"MISS\">Miss</option>\n");
      out.write("<option value=\"MAST\">Master</option>\n");
      out.write("<option value=\"ADMI\">Admiral</option>\n");
      out.write("<option value=\"MAJO\">Major</option>\n");
      out.write("<option value=\"CAPT\">Capt</option>\n");
      out.write("<option value=\"PHRA\">PhraKhru</option>\n");
      out.write("<option value=\"PHRM\">Phramaha</option>\n");
      out.write("<option value=\"PHRX\">Phra</option>\n");
      out.write("<option value=\"RTRV\">Rt Revd</option>\n");
      out.write("<option value=\"MREV\">Most Revd</option>\n");
      out.write("</select></td>\n");
      out.write("                    </tr>-->\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input required type=\"text\" class=\"input-box\" name=\"fname\" value=\"\" placeholder=\"First Name\" /></br></br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                    <td><input required type=\"text\" name=\"sname\" class=\"input-box\" value=\"\" placeholder=\"Last Name \"/></br></br></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td><input required type=\"text\" class=\"input-box\" name=\"address\" value=\"\" placeholder=\"Address \" /></br></br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input required type=\"email\" class=\"input-box\" name=\"email\" value=\"\" placeholder=\"Email Address\" pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\" /></br></br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><label>Gender:</label>\n");
      out.write("                        <input type=\"radio\" class=\"gender\" name=\"gender\" value=\"male\" /><label>Male:</label>\n");
      out.write("                        <input type=\"radio\" class=\"gender\" name=\"gender\" value=\"female\" /><label>Female:</label></td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" class=\"input-box\" name=\"telephone\"  pattern=\"[0-9]{3}-[0-9]{7}\" value=\"\" title=\"Format 077-1111111\"placeholder=\"Telephone No\" maxlength=\"11\" required/>\n");
      out.write("                        </br></br></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("<!--                     <tr>\n");
      out.write("                        <td><label>Gender:</label>\n");
      out.write("                        <input type=\"radio\" class=\"gender\" name=\"gender\" value=\"male\" /><label>Male:</label>\n");
      out.write("                        <input type=\"radio\" class=\"gender\" name=\"gender\" value=\"female\" /><label>Female:</label></td>\n");
      out.write("                    </tr>-->\n");
      out.write("<!--                    <tr>\n");
      out.write("                        <td><input required type=\"checkbox\" class=\"gender\" name=\"agree\" value=\"ON\" />\n");
      out.write("I agree to the Phoenix Airlines terms and conditions </td>\n");
      out.write("                    </tr>-->\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" class=\"btn1\" value=\"ADD\" /></td>\n");
      out.write("<!--                        <td><input type=\"reset\" class=\"btn2\" value=\"Cancel\" /></td>-->\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div >\n");
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
