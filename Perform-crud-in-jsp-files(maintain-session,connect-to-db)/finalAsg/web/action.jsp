<%@page import="library.*,java.util.*,java.sql.*,java.io.IOException,javax.servlet.*,java.io.PrintWriter,javax.servlet.ServletException,javax.servlet.annotation.WebServlet,javax.servlet.http.*,javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse,javax.servlet.http.HttpSession;"contentType="text/html" pageEncoding="UTF-8"%>       
<%
    try {
        HttpSession session1 = request.getSession();
        if (session.getAttribute("t1") == null) {
            response.sendRedirect("index.html");
        } else {

            student s = new student();
            studentDao dao = new studentDao();
            if (request.getParameter("UserName") != null) {
                s.UserName = request.getParameter("UserName");
                s.Name = request.getParameter("Name");
                s.Passwd = request.getParameter("Passwd");
                s.Cnic = Integer.parseInt(request.getParameter("Cnic"));
                s.ContactNo = Integer.parseInt(request.getParameter("ContactNo"));
                s.Gender = request.getParameter("Gender");
                s.Nationality = request.getParameter("Nationality");
                if (request.getParameter("signUpbtn") != null) {
                    int res = dao.Insert(s); %>
<p> Signed Up Successfully </p>
<%
    }
//            if(request.getParameter("editbtn")!=null)
//            {
//                int res = dao.Edit(s); 
//           <p> Signed Up Successfully </p>

//                }
//    if (request.getParameter("updatebtn") != null) {
//                int res = dao.Update(s); %>
<!--<p> Updated Successfully </p>-->
<%
//    }
//    if (request.getParameter("deletebtn") != null) {
//                int res = dao.Delete(s); %>
<!--<p> Deleted Successfully </p>-->
<%
//            }
        }
}
    }catch (Exception ex) {
        System.out.println(ex.toString());
        }%>