package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

 try{
            PrintWriter ot = response.getWriter();
            HttpSession session1 = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("index.html");
            }
            else{ 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method  = \"post\" action=\"action.jsp\">  \n");
      out.write("            Username:<input type=\"text\" name=\"UserName\" /> <br>  \n");
      out.write("            Name: <input type=\"text\" name=\"Name\" /> <br>  \n");
      out.write("            Password: <input type=\"Password\" name=\"Passwd\" /> <br>  \n");
      out.write("            Cnic: <input type=\"text\" name=\"Cnic\" /> <br>   \n");
      out.write("            Contact#: <input type=\"text\" name=\"ContactNo\" /> <br> \n");
      out.write("            Gender: <input type=\"radio\" name=\"Gender\" value=\"Male\"/> Male <br>  \n");
      out.write("            <input type=\"radio\" name=\"Gender\" value=\"Female\"/> Female <br>  \n");
      out.write("            <input type=\"radio\" name=\"Gender\" value=\"Other\"/> Other<br>  \n");
      out.write("            <br>   \n");
      out.write("            Nationality:  <select name =\"Nationality\">  \n");
      out.write("                <option value=\"Nationality\">Choose</option>  \n");
      out.write("                <option value=\"Pakistani\">Pakistani</option>  \n");
      out.write("                <option value=\"English\">English</option>  \n");
      out.write("                <option value=\"Australian\">Australian</option>  \n");
      out.write("                <option value=\"American\">American</option>  \n");
      out.write("                <option value=\"Italian\">Italian</option>  \n");
      out.write("                <option value=\"Arabian\">Arabian</option>  \n");
      out.write("            </select>     \n");
      out.write("            <input type = \"submit\" name =\"signUpbtn\" value = \"SIGNUP\">\n");
      out.write("        </form>  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>       \n");
      out.write("        ");
    }  
    }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }

      out.write('\n');
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
