<%@page import="java.sql.DriverManager"%>
<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>
<%
    //After Pressing Update btn, after fetching
    student s = new student();
    studentDao dao = new studentDao();

    if (request.getParameter("updatebtn") != null) {
        s.UserName = request.getParameter("UserName");
        s.Name = request.getParameter("Name");
        s.Passwd = request.getParameter("Passwd");
        s.Cnic = Integer.parseInt(request.getParameter("Cnic"));
        s.ContactNo = Integer.parseInt(request.getParameter("ContactNo"));
        s.Gender = request.getParameter("Gender");
        s.Nationality = request.getParameter("Nationality");

        int res = dao.Update(s); %>
<p>Updated Successfully</p>
<% } %>

<!DOCTYPE html>
<html>
    <head>
        <title>edit</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <% 
            //FOR EDIT/fetching
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/fnldb";
                Connection con = DriverManager.getConnection(url, "root", "ali8080");

                s.UserName = request.getParameter("UserName");

                //ArrayList<student> list = dao.foredit();
                //ArrayList<student> list1 = (ArrayList<student>)request.getAttribute("UserName");
                PreparedStatement psta = con.prepareStatement("select * from fnll where UserName = ?");
                psta.setString(1, s.UserName);
                ResultSet rs = psta.executeQuery();
                while (rs.next()) {
        %>

        <form method  = "post" action="">  
            <%--  for (student sa : list1) { --%>
            Username:<input type="text" value ="<%=rs.getString(1)%>" name="UserName" /> <br>  
            Name: <input type="text" value ="<%=rs.getString(2)%>" name="Name" /> <br>  
            Password: <input type="Password" value ="<%=rs.getString(3)%>" name="Passwd" /> <br>  
            Cnic: <input type="text" value ="<%=rs.getString(4)%>" name="Cnic" /> <br>   
            Contact#: <input type="text" value ="<%=rs.getString(5)%>" name="ContactNo" /> <br> 

            Gender: <input type="radio"  name="Gender" value="Male"/> Male <br> <%--value ="<%=rs.getString(6)%>"--%> 
            <input type="radio"  name="Gender" value="Female"/> Female <br>  
            <input type="radio"  name="Gender" value="Other"/> Other<br>  
            <br>   
            Nationality:  <select value ="<%=rs.getString(7)%>" name ="Nationality">  
                <option  value="Nationality">Choose</option>  
                <option value="Pakistani">Pakistani</option>  
                <option value="English">English</option>  
                <option value="Australian">Australian</option>  
                <option value="American">American</option>  
                <option value="Italian">Italian</option>  
                <option value="Arabian">Arabian</option>  
            </select>     
            <%  }%> 
            <input type = "submit" name ="updatebtn" value = "UPDATE EDITS">

        </form>  
    </body>
</html>





















