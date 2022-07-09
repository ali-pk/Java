import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/qualification"})
public class qualification extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("login.html");
            }
            else{
                out.print("<!DOCTYPE html>");
                out.print("<html>");
                out.print("<title>qualification</title>");
                out.print("<meta charset=\'UTF-8\'>");
                out.print("<meta name=\'viewport\' content=\'width=device-width, initial-scale=1.0\'>");
                out.print("<link rel=\"stylesheet\" href=\'al.css\'>");
                out.print("</head>");
                out.print("<body>");
                out.print("<div class='topnav'>");
                out.print("<a href='profile'>Profile</a>");
                out.print("<a href='contact'>Contact</a>");
                out.print("<a href='aboutUs'>About Us</a>");
                out.print("<a class=\'active\' href='#'>Qualification</a>");
                out.print("<a href='login.html'>LOGIN</a>");
                out.print("<a href='logout'>LOGOUT</a>");
                out.print("</div>");
                out.print("<div style='padding-left:16px'>");
                out.print("<h2>Qualification</h2>");     //ends nav html
                out.print("<div>");                      //starts inner qualification html
                out.print("<table class='table table-bordered'>");
                out.print("<tr>");
                out.print("<th width='30%'>Bechelors Degree in</th>");
                out.print("<td width='20%'>:</td>");
                out.print("<td>Computer Science</td>");
                out.print("<tr>");
                out.print("<th width='30%'>Masters in</th>");
                out.print("<td width='20%'>:</td>");
                out.print("<td>Computer Science</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<th width='30%'>Side Skills</th>");
                out.print("<td width='20%'>:</td>");
                out.print("<td>JavaScript,MySQL,Java,andriod development,.Net,#C</td>");
                out.print("</tr>");
                out.print("</table>");
                out.print("</div>");
                out.print("</div>");
                out.print("</body>");
                out.print("</html>");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
 }
}