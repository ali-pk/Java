package library;

import java.sql.*;
import java.util.*;

public class studentDao {

    Connection con = null;

    public void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fnldb";
            con = DriverManager.getConnection(url, "root", "ali8080");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public int Insert(student s) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into fnll values (?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, s.UserName);
            pst.setString(2, s.Name);
            pst.setString(3, s.Passwd);
            pst.setInt(4, s.Cnic);
            pst.setInt(5, s.ContactNo);
            pst.setString(6, s.Gender);
            pst.setString(7, s.Nationality);
            
            res = pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }

    public int Update(student s) {
        int res = 0;
        try {
            Connection();
            PreparedStatement pst = con.prepareStatement("update fnll set Name = ?,Passwd =?,Cnic= ?,ContactNo= ?,Gender= ?,Nationality= ? where UserName = ?");
            pst.setString(1, s.Name);
            pst.setString(2, s.Passwd);
            pst.setInt(3, s.Cnic);
            pst.setInt(4, s.ContactNo);
            pst.setString(5, s.Gender);
            pst.setString(6, s.Nationality);
            pst.setString(7, s.UserName);
            res = pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }

    public int Delete(student s) {
        int res = 0;
        try {
            Connection();
            PreparedStatement psta = con.prepareStatement("delete from fnll where UserName = ?");
            psta.setString(1, s.UserName);
            res = psta.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }

    public ArrayList<student> SearchAll() {
        ArrayList<student> list1 = new ArrayList<student>();
        ResultSet rs = null;
        try {
            Connection();
            String qry = "Select * from fnll";
            Statement st = con.createStatement();
            rs = st.executeQuery(qry);
            while (rs.next()) {
                student s = new student();
                s.UserName = rs.getString(1);
                s.Name = rs.getString(2);
                s.Passwd = rs.getString(3);
                s.Cnic = rs.getInt(4);
                s.ContactNo = rs.getInt(5);
                s.Gender = rs.getString(6);
                s.Nationality = rs.getString(7);
                list1.add(s);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return list1;
    }
    
        public ArrayList<student> foredit() {
        ArrayList<student> list1 = new ArrayList<student>();
       
        ResultSet rs = null;
        try {
            Connection();
            String qry = "select * from fnll where UserName= ?";
            PreparedStatement pst = con.prepareStatement(qry);
            //Statement st = con.createStatement();
            //  rs = st.executeQuery(qry);
            student s = new student();
            pst.setString(1, s.UserName);
            rs = pst.executeQuery(qry);
            while (rs.next()) {
                 
                s.UserName = rs.getString(1);
                s.Name = rs.getString(2);
                s.Passwd = rs.getString(3);
                s.Cnic = rs.getInt(4);
                s.ContactNo = rs.getInt(5);
                s.Gender = rs.getString(6);
                s.Nationality = rs.getString(7);
                list1.add(s);  
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return list1;
    } 
        
    public ArrayList<student> logininfo() {
        ArrayList<student> list1 = new ArrayList<student>();
        ResultSet rs = null;
        try {
            student s = new student();
            Connection();
            String qry = "Select * from fnll where UserName = ? and Passwd = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, s.UserName);
            pst.setString(2, s.Passwd);
            rs = pst.executeQuery();
            list1.add(s);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return list1;
    }
}
