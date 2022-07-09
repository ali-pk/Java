<%@page import="java.sql.DriverManager"%>
<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
    try {
        HttpSession session1 = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("index.html");
            }
            else{ 
            student s = new student();
            s.UserName = request.getParameter("UserName");
            studentDao dao=new studentDao();
            
            int res = dao.Delete(s); %>
<p> Deleted Successfully </p>
<%
        }
} 
     catch (Exception ex) {
        System.out.println(ex.toString());
}%>
            