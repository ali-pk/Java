import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/LOGOUT"})
public class LOGOUT extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            if(session.getAttribute("t1")!=null)
            {
                session.setAttribute("t1",null);
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("<title>Profile</title>");
                out.print("<meta charset=\'UTF-8\'>");
                out.print("<meta name=\'viewport\' content=\'width=device-width, initial-scale=1.0\'>");
                out.print("<style>");
                out.print("body{background:#ADD8E6;}");
                out.print("ul.nav {");
                out.print("margin:0;");
                out.print("padding:0;");
                out.print("list-style:none;");
                out.print("height:36px; line-height:36px;");
                out.print("background:#0d7963; /* you can change the backgorund color here. */");
                out.print("font-family:Arial, Helvetica, sans-serif;");
                out.print("font-size:13px;");
                out.print("}");
                out.print("ul.nav li {");
                out.print("border-right:1px solid #189b80; /* you can change the border color matching to your background color */");
                out.print("float:left;");
                out.print("}");
                out.print("ul.nav a.active{");
                out.print("background:#086754;");
                out.print("}");
                out.print("ul.nav a {");
                out.print("display:block;");
                out.print("padding:0 28px;");
                out.print("color:#ccece6;");
                out.print("text-decoration:none;");
                out.print("}");
                out.print("ul.nav a:hover,");
                out.print("ul.nav li.active{");
                out.print("background:#086754;");
                out.print("}");
                out.print("</style>");
                out.print("</head>");
                out.print("<body>");
                out.print("<ul class='nav'>");
                out.print("<li><a href='PROFILE'>Profile</a></li>");
                out.print("<li><a href='QUALIFICATION'>Qualification</a></li>");
                out.print("<li><a href='ABOUTUS'>About Us</a></li>");
                out.print("<li><a href='CONTACT'>Contact</a></li>");
                out.print("<li><a class='active' href='index.html'>Login</a></li>");
                out.print("</ul>");
                out.print("<div style='padding-top: 5px'>");
                out.print("<label>Logged Out");
                out.print("</div>");
                out.print("</body>"); 
                out.print("</html>"); 
            }
            else{
               response.sendRedirect("index.html");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
 }
}