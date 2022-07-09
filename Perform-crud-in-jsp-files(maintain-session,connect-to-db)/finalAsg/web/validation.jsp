<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
           <%
    try {
            String str1 = request.getParameter("t1");
            String str2 = request.getParameter("t2");
            HttpSession Session = request.getSession();
            Session.setAttribute("t1",str1);
            Session.setAttribute("t2",str2);
            if (request.getParameter("signUpbtn") != null) {
                response.sendRedirect("signup.jsp");  
            }
            response.sendRedirect("main.jsp");
        }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
%>


