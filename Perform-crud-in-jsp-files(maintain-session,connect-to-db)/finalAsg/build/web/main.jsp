<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
 try {
            HttpSession session1 = request.getSession();
            if(session.getAttribute("t1")==null)
            {
                response.sendRedirect("index.html");
            }
            else{ %>
<html>
    <head>
        <title>Main</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                background-color: activecaption;
            }
            .links{
                background-color: cornflowerblue;
                margin-top:150px;
                padding: 60px;
            }
        </style>
    </head>
    <body>
    <center>
        <form method  = "post" action="signup.jsp">
            <div class="links">
                <p>Signed in as Admin</p>
                <a href="index.html">Sign In</a><br>
                <a href="signup.jsp">Add Account</a><br>
                <a href="viewRecord.jsp">View Records/Edit/Delete</a><br>
                <a href="logout.jsp">Sign Out</a>
            </div>
        </form>
    </center>
</body>
</html>         
        <%    }  
    }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
%>