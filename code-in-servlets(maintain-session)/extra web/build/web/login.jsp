<%@page import="librariess.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
 try{
            PrintWriter ot = response.getWriter();
            HttpSession session1 = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("index.html");
            }
            else{ 
                student s = new student();
                studentDao dao = new studentDao();
                s.Username = request.getParameter("Username");
                s.Password = request.getParameter("Password");
                ResultSet res = dao.login(s);
                if(res.next())
                {
                   response.sendRedirect("main.jsp");
                }
 }  
    }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
%>


