<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
 try{
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
        <title>Sign Up</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method  = "post" action="action.jsp">  
            Username:<input type="text" name="UserName" /> <br>  
            Name: <input type="text" name="Name" /> <br>  
            Password: <input type="Password" name="Passwd" /> <br>  
            Cnic: <input type="text" name="Cnic" /> <br>   
            Contact#: <input type="text" name="ContactNo" /> <br> 
            Gender: <input type="radio" name="Gender" value="Male"/> Male <br>  
            <input type="radio" name="Gender" value="Female"/> Female <br>  
            <input type="radio" name="Gender" value="Other"/> Other<br>  
            <br>   
            Nationality:  <select name ="Nationality">  
                <option value="Nationality">Choose</option>  
                <option value="Pakistani">Pakistani</option>  
                <option value="English">English</option>  
                <option value="Australian">Australian</option>  
                <option value="American">American</option>  
                <option value="Italian">Italian</option>  
                <option value="Arabian">Arabian</option>  
            </select>     
            <input type = "submit" name ="signUpbtn" value = "SIGNUP">
        </form>  

    </body>
</html>       
        <%    }  
    }catch (Exception ex)
        {
            System.out.println(ex.toString());
    }
%>
