package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import library.*;
import java.util.*;
import java.sql.*;
import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    student s = new student();
    studentDao dao = new studentDao();
//                Class.forName("com.mysql.jdbc.Driver");
//                String url = "jdbc:mysql://localhost:3306/fnldb";
//                Connection con = DriverManager.getConnection(url, "root", "ali8080");

    if (request.getParameter("updatebtn") != null) {
        s.UserName = request.getParameter("UserName");
        s.Name = request.getParameter("Name");
        s.Passwd = request.getParameter("Passwd");
        s.Cnic = Integer.parseInt(request.getParameter("Cnic"));
        s.ContactNo = Integer.parseInt(request.getParameter("ContactNo"));
        s.Gender = request.getParameter("Gender");
        s.Nationality = request.getParameter("Nationality");

        int res = dao.Update(s);
//                    PreparedStatement pst = con.prepareStatement("update fnll set Name = ?,Passwd =?,Cnic= ?,ContactNo= ?,Gender= ?,Nationality= ? where UserName = ?");
//                    pst.setString(1, s.Name);
//                    pst.setString(2, s.Passwd);
//                    pst.setInt(3, s.Cnic);
//                    pst.setInt(4, s.ContactNo);
//                    pst.setString(5, s.Gender);
//                    pst.setString(6, s.Nationality);
//                    pst.setString(7, s.UserName);
//                    pst.executeUpdate(); 
      out.write("\n");
      out.write("<p>Updated Successfully</p>\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>edit</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
 
            
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/fnldb";
                Connection con = DriverManager.getConnection(url, "root", "ali8080");

                s.UserName = request.getParameter("UserName");

                //ArrayList<student> list = dao.foredit();
                //ArrayList<student> list1 = (ArrayList<student>)request.getAttribute("UserName");
                PreparedStatement psta = con.prepareStatement("select * from fnll where UserName = ?");
                psta.setString(1, s.UserName);
                ResultSet rs = psta.executeQuery();
                while (rs.next()) {
        
      out.write("\n");
      out.write("\n");
      out.write("        <form method  = \"post\" action=\"\">  \n");
      out.write("            ");
      out.write("\n");
      out.write("            Username:<input type=\"text\" value =\"");
      out.print(rs.getString(1));
      out.write("\" name=\"UserName\" /> <br>  \n");
      out.write("            Name: <input type=\"text\" value =\"");
      out.print(rs.getString(2));
      out.write("\" name=\"Name\" /> <br>  \n");
      out.write("            Password: <input type=\"Password\" value =\"");
      out.print(rs.getString(3));
      out.write("\" name=\"Passwd\" /> <br>  \n");
      out.write("            Cnic: <input type=\"text\" value =\"");
      out.print(rs.getString(4));
      out.write("\" name=\"Cnic\" /> <br>   \n");
      out.write("            Contact#: <input type=\"text\" value =\"");
      out.print(rs.getString(5));
      out.write("\" name=\"ContactNo\" /> <br> \n");
      out.write("\n");
      out.write("            Gender: <input type=\"radio\"  name=\"Gender\" value =\"");
      out.print(rs.getString(6));
      out.write("\" value=\"Male\"/> Male <br>  \n");
      out.write("            <input type=\"radio\"  name=\"Gender\" value=\"Female\"/> Female <br>  \n");
      out.write("            <input type=\"radio\"  name=\"Gender\" value=\"Other\"/> Other<br>  \n");
      out.write("            <br>   \n");
      out.write("            Nationality:  <select value =\"");
      out.print(rs.getString(7));
      out.write("\" name =\"Nationality\">  \n");
      out.write("                <option  value=\"Nationality\">Choose</option>  \n");
      out.write("                <option value=\"Pakistani\">Pakistani</option>  \n");
      out.write("                <option value=\"English\">English</option>  \n");
      out.write("                <option value=\"Australian\">Australian</option>  \n");
      out.write("                <option value=\"American\">American</option>  \n");
      out.write("                <option value=\"Italian\">Italian</option>  \n");
      out.write("                <option value=\"Arabian\">Arabian</option>  \n");
      out.write("            </select>     \n");
      out.write("            ");
  }
      out.write(" \n");
      out.write("            <input type = \"submit\" name =\"updatebtn\" value = \"UPDATE EDITS\">\n");
      out.write("\n");
      out.write("        </form>  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
