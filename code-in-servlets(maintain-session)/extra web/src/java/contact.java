import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/contact"})
public class contact extends HttpServlet {
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
                out.print("<title>contact</title>");
                out.print("<meta charset=\'UTF-8\'>");
                out.print("<meta name=\'viewport\' content=\'width=device-width, initial-scale=1.0\'>");
                out.print("<link rel=\"stylesheet\" href=\'al.css\'>");
                out.print("</head>");
                out.print("<body>");
                out.print("<div class='topnav'>");
                out.print("<a href='profile'>Profile</a>");
                out.print("<a class=\'active\' href='#'>Contact</a>");
                out.print("<a href='aboutUs'>About Us</a>");
                out.print("<a href='qualification'>Qualification</a>");
                out.print("<a href='login.html'>LOGIN</a>");
                out.print("<a href='logout'>LOGOUT</a>");
                out.print("</div>");
                out.print("<div style='padding-left:16px'>");
                out.print("<h2>CONTACT</h2>");           //ends nav html
                out.print("<div>");                     //starts inner contact html
                out.print("<table class='table table-bordered'>");
                out.print("<tr>");
                out.print("<th width='30%'>Address</th>");
                out.print("<td width='2%'>:</td>");
                out.print("<td>Bakramandi,Kamalabad,Dhowk Sayedan Road, Rawalpindi</td>");
                out.print("<tr>");
                out.print("<th width='30%'>Phone</th>");
                out.print("<td width='2%'>:</td>");
                out.print("<td>0320-0000001</td>");
                out.print("</tr>");
                out.print("<tr>");
                out.print("<th width='30%'>Email</th>");
                out.print("<td width='2%'>:</td>");
                out.print("<td>mali.thr09@gmail.com</td>");
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