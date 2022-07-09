<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
 try {
            PrintWriter ot = response.getWriter();
            HttpSession session1 = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("index.html");
            }
            else{ %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Record</title>
    </head>
    <body>
        <%  studentDao dao = new studentDao();
              ArrayList<student> list1 = dao.SearchAll();  %>
        <form method = "post" action = "delete.jsp">
        <table border='1', width = '100%'>
            <tr><th>UserName</th><th>Name</th><th>Password</th><th>Cnic</th><th>Contact#</th><th>Gender</th><th>Nationality</th></tr>
                    <%  for (student s : list1) {%>
            <tr><td><%=s.UserName%></td><td><%=s.Name%></td><td><%=s.Passwd%></td><td><%=s.Cnic%></td><td><%=s.ContactNo%></td><td><%=s.Gender%></td><td><%=s.Nationality%></td><td><a href="edit.jsp?UserName=<%=s.UserName%>">Edit</a></td><td><a href="delete.jsp?UserName=<%=s.UserName%>">Delete</a></td></tr>
            <%  }%>
        </table>
        </form>
    </body>
</html>
        <%    }  
    }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
%>