import java.io.IOException;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/validation"})
public class validation extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String str1 = request.getParameter("t1");
            String str2 = request.getParameter("t2");
            HttpSession Session = request.getSession();
            Session.setAttribute("t1",str1);
            Session.setAttribute("t2",str2);
            response.sendRedirect("profile");
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
 }
}