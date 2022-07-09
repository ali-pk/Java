package ali;
import java.sql.*;   //for PreparedStatement, ResultSet, Connection, DriverManager
class admin {
    int Admin_ID;
    String Password;
}
class artist {
    int Artist_ID;
    String Name;
    String Style;
    String Email;
    String Country;
}
class artwork {
    int Art_ID; 
    int Year;
    String Title;
    int Price;
}
class customer {
    int Customer_ID;
    String Name;
    String Description;    
    int PhoneNo;  
    String Address;
    String Password;
}
class exhibition {
    int Exhibition_ID;
    String Name;
    String StartDate;    
    String EndDate;  
    String Gallery_Address;
}
class DAOArtGallery {

    Connection con = null;

    void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bscs_5";
            con = DriverManager.getConnection(url, "root", "");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
    int insert(artist a) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into artist values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, a.Artist_ID);
            pst.setString(2, a.Name);
            pst.setString(3, a.Style);
            pst.setString(4, a.Email);
            pst.setString(5, a.Country);
            res = pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
    int Insert(artwork ar) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into artwork values (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setInt(1, ar.Art_ID);
            pst.setInt(2, ar.Year);
            pst.setString(3, ar.Title);
            pst.setInt(4, ar.Price);
            res = pst.executeUpdate(); 
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }   
        return res;
    }
    int Insert(customer cs) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into customer values (?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
           
            pst.setInt(1, cs.Customer_ID);
            pst.setString(2, cs.Name);
            pst.setString(3, cs.Description);
            pst.setInt(4, cs.PhoneNo);            
            pst.setString(5, cs.Address); 
            pst.setString(6, cs.Password); 
            res = pst.executeUpdate(); 
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }   
        return res;
    }
    int Insert(exhibition eh) {
        int res = 0;
        try {
            Connection();
            String qry = "insert into exhibition values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(qry);
           
            pst.setInt(1, eh.Exhibition_ID);
            pst.setString(2, eh.Name);
            pst.setString(3, eh.StartDate);
            pst.setString(4, eh.EndDate);            
            pst.setString(5, eh.Gallery_Address); 
            res = pst.executeUpdate(); 
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }   
        return res;
    }    
     int Update(artist a) {
        int res = 0;
        try {
            Connection();
            String qry = "update artist set Name = ?, Style = ?, Email = ?,Country = ? where Artist_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            pst.setString(1, a.Name);
            pst.setString(2, a.Style);
            pst.setString(3, a.Email);
            pst.setString(4, a.Country);
            pst.setInt(5, a.Artist_ID);
            res = pst.executeUpdate();            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }    
     int Update(artwork ar) {
        int res = 0;
        try {
            Connection();
            String qry = "update artwork set Year = ?, Title = ?,Price = ? where Art_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);  
            
            pst.setInt(1, ar.Year);
            pst.setString(2, ar.Title);
            pst.setInt(3, ar.Price);
            pst.setInt(4, ar.Art_ID);
            res = pst.executeUpdate();
        } 
        catch (Exception ex) {
            System.out.println(ex.toString());
        }

        return res;

    }
        int Update(customer cs) {
        int res = 0;
        try {
            Connection();
            String qry = "update customer set Name = ?, Description = ?,PhoneNo = ?,Address = ?,Password = ? where Customer_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
           
            pst.setString(1, cs.Name);
            pst.setString(2, cs.Description);
            pst.setInt(3, cs.PhoneNo);            
            pst.setString(4, cs.Address);
            pst.setInt(5, cs.Customer_ID);
            pst.setString(6, cs.Password);
            res = pst.executeUpdate(); 
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }   
        return res;
    }
        int Update(exhibition eh) {
        int res = 0;
        try {
            Connection();
            String qry = "update exhibition set Name = ?, StartDate = ?,EndDate = ?,Gallery_Address = ? where Exhibition_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
           
            pst.setString(1, eh.Name);
            pst.setString(2, eh.StartDate);
            pst.setString(3, eh.EndDate);            
            pst.setString(4, eh.Gallery_Address);
            pst.setInt(5, eh.Exhibition_ID);
            res = pst.executeUpdate(); 
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }   
        return res;
    }
     int Delete(artist a) {
        int res = 0;

        try {
            Connection();
            String qry = "delete from artist where Artist_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            
            pst.setInt(1, a.Artist_ID);
            res = pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
     int Delete(artwork ar) {
        int res = 0;

        try {
            Connection();
            String qry = "delete from artwork where Art_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            
            pst.setInt(1, ar.Art_ID);
            res = pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
     int Delete(customer cs) {
        int res = 0;

        try {
            Connection();
            String qry = "delete from customer where Customer_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            
            pst.setInt(1, cs.Customer_ID );
            res = pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }
     int Delete(exhibition eh) {
        int res = 0;

        try {
            Connection();
            String qry = "delete from exhibition where Exhibition_ID = ?";
            PreparedStatement pst = con.prepareStatement(qry);
            
            pst.setInt(1, eh.Exhibition_ID );
            res = pst.executeUpdate();
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return res;
    }     
     ResultSet SelectAll()  //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from exhibition";
             Statement st = con.createStatement();
             rs = st.executeQuery(qry);
         }
         catch(Exception ex)
         {
             System.out.println(ex.toString());
         }
         return rs;
     }
     ResultSet SelectById(exhibition eh) //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from exhibition where Exhibition_ID = ?";
             PreparedStatement pst = con.prepareStatement(qry);
             pst.setInt(1, eh.Exhibition_ID);
             rs = pst.executeQuery();
         }
         catch(Exception ex)
         {
            System.out.println(ex.toString()); 
         }
         return rs;
     }
     ResultSet SelectAllartist()  //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from artist";
             Statement st = con.createStatement();
             rs = st.executeQuery(qry);
         }
         catch(Exception ex)
         {
             System.out.println(ex.toString());
         }
         return rs;
     }
     ResultSet SelectById(artist a) //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from artist where Artist_ID = ?";
             PreparedStatement pst = con.prepareStatement(qry);
             pst.setInt(1, a.Artist_ID);
             rs = pst.executeQuery();
         }
         catch(Exception ex)
         {
            System.out.println(ex.toString()); 
         }
         return rs;
     }
     ResultSet SelectAllartwork()  //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from artwork";
             Statement st = con.createStatement();
             rs = st.executeQuery(qry);
         }
         catch(Exception ex)
         {
             System.out.println(ex.toString());
         }
         return rs;
     }
     ResultSet SelectById(artwork ar) //for exhibition table
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from artwork where Art_ID = ?";
             PreparedStatement pst = con.prepareStatement(qry);
             pst.setInt(1, ar.Art_ID);
             rs = pst.executeQuery();
         }
         catch(Exception ex)
         {
            System.out.println(ex.toString()); 
         }
         return rs;
     }
     ResultSet logininfo(admin a)
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from admin where Admin_ID = ? and Password = ?";
             PreparedStatement pst = con.prepareStatement(qry);
             pst.setInt(1, a.Admin_ID);
             pst.setString(2, a.Password);
             rs = pst.executeQuery();
         }
         catch(Exception ex)
         {
            System.out.println(ex.toString()); 
         }
         return rs;
     }
     ResultSet logininfo(customer c)
     {
         ResultSet rs = null;
         try
         {
             Connection();
             String qry = "Select * from customer where Customer_ID = ? and Password = ?";
             PreparedStatement pst = con.prepareStatement(qry);
             pst.setInt(1, c.Customer_ID);
             pst.setString(2, c.Password);
             rs = pst.executeQuery();
         }
         catch(Exception ex)
         {
            System.out.println(ex.toString()); 
         }
         return rs;
     }
}