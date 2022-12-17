package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.DBcon;

public final class productedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Connection connection = null; 
      out.write('\n');
 Statement st = null ; 
      out.write('\n');
 ResultSet rs = null; 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"CSS/flightdetails.css\">\n");
      out.write("        <title>Filter Products</title>\n");
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
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"back\">                        \n");
      out.write("         \n");
      out.write("             <form action=\"staffdashboard.jsp\" method=\"POST\">\n");
      out.write("                 <input class=\"back\" type=\"submit\" value=\"Staff Dashboard\">\n");
      out.write("        </form>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("        <h1>Edit Products</h1>\n");
      out.write("        <div class=\"tbl-header\">\n");
      out.write("       <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("            <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Product ID</th>\n");
      out.write("                <th>Item Name</th>                \n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Cost</th>\n");
      out.write("                <th>Update</th>\n");
      out.write("                <th>Delete</th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("       </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"tbl-content\">\n");
      out.write("              <table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    ");

                        DBcon con = new DBcon();
                        st = con.Connection().createStatement();
                        String sql = "SELECT * from flight";
                        rs = st.executeQuery(sql);
                        while(rs.next())
                        {
                     
      out.write("\n");
      out.write("            <img src=\"../../../../../../../AppData/Local/Temp/download.jpg\" alt=\"\"/>\n");
      out.write("                     <td>");
      out.print( rs.getString("id"));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString("itemname") );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString("quantity") );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString("date") );
      out.write("</td>\n");
      out.write("                     <td>");
      out.print( rs.getString("cost") );
      out.write("</td>\n");
      out.write("                     \n");
      out.write("                     <td><form action=\"updateFlight.jsp\">\n");
      out.write("                     <input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getString("id"));
      out.write("\">\n");
      out.write("                    <input type=\"submit\" value=\"UPDATE\" />\n");
      out.write("                    </form></td>\n");
      out.write("                    <td>\n");
      out.write("                    <form action=\"deleteFlight\" method=\"POST\">\n");
      out.write("                        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getString("id") );
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name=\"task\" value=\"Flight Deleted\" />\n");
      out.write("                        <input type=\"hidden\" name=\"date\" value=\"");
      out.print((new java.util.Date()).toLocaleString());
      out.write("\"/>\n");
      out.write("                    <input type=\"submit\" value=\"DELETE\" />\n");
      out.write("                    </form>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                     ");
 } 
      out.write(" \n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("            <form action=\"admindashboard.jsp\" method=\"POST\">\n");
      out.write("                 <input class=\"back\" type=\"submit\" value=\"Admin Dashboard\">\n");
      out.write("        </form>         \n");
      out.write("                     \n");
      out.write("    <footer>\n");
      out.write("<p class=\"copyright\">Copyright© 2021 Surge Web Bros - Phoenix Airlines  </p>\n");
      out.write("</footer>                 \n");
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
