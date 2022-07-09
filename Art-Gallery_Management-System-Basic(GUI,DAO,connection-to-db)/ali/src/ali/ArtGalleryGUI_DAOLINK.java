package ali;
 // DO USER LOGIN WITH PASSWORD AND ADMIN LOGIN
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.*;    //for using ResultSet Function (present in DAO) 

public class ArtGalleryGUI_DAOLINK extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,lA,lB,lC,lD,lE,lF,lG,lH,lI,lJ,lW,lX,lY,lZ ;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,tA,tB,tC,tD,tE,tF,tG,tH,tI,tJ;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bA,bB,bC,bD,bE;

    ArtGalleryGUI_DAOLINK() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        l1 = new JLabel("Artist_ID");
        t1 = new JTextField(20);
        l2 = new JLabel("Name");
        t2 = new JTextField(20);
        l3 = new JLabel("Style");
        t3 = new JTextField(20);
        l4 = new JLabel("Email");
        t4 = new JTextField(20);
        l5 = new JLabel("Country");
        t5 = new JTextField(20);
        
        l6 = new JLabel("Art_ID");
        t6 = new JTextField(20);
        l7 = new JLabel("Year");
        t7 = new JTextField(20);
        l8 = new JLabel("Title");
        t8 = new JTextField(20);
        l9 = new JLabel("Price");
        t9 = new JTextField(20);
        
        lA = new JLabel("Customer_ID");
        tA= new JTextField(20);
        lB = new JLabel("Name");
        tB = new JTextField(20);
        lC = new JLabel("Description");
        tC = new JTextField(20);
        lD = new JLabel("PhoneNo");
        tD = new JTextField(20);        
        lE = new JLabel("Address");
        tE = new JTextField(20);

        lF = new JLabel("Exhibition_ID");
        tF= new JTextField(20);
        lG = new JLabel("Name");
        tG = new JTextField(20);
        lH = new JLabel("StartDate");
        tH = new JTextField(20);
        lI = new JLabel("EndDate");
        tI = new JTextField(20);        
        lJ = new JLabel("Gallery_Address");
        tJ = new JTextField(20);        
        
        b1 = new JButton("Insert In artist table");
        b2 = new JButton("Update In artist table");
        b3 = new JButton("Delete In artist table");
        b4 = new JButton("Insert In artwork table");
        b5 = new JButton("Update In artwork table");
        b6 = new JButton("Delete In artwork table");  
        b7 = new JButton("Insert In customer table");
        b8 = new JButton("Update In customer table");
        b9 = new JButton("Delete In customer table");
        bD = new JButton("Search by ID in exhibition table");
        bA = new JButton("Insert In exhibition table");
        bB = new JButton("Update In exhibition table");
        bC = new JButton("Delete In exhibition table"); 
        bE = new JButton("show all from exhibition table"); 
        
        lW = new JLabel("");
        lX = new JLabel("");
        lY = new JLabel("");
        lZ = new JLabel("");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(b1);
        add(b2);
        add(b3);
        add(lW);
        
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        add(l9);
        add(t9);
        add(b4);
        add(b5);
        add(b6);
        add(lX);

        add(lA);
        add(tA);
        add(lB);
        add(tB);
        add(lC);
        add(tC);
        add(lD);
        add(tD);
        add(lE);
        add(tE);
        add(b7);
        add(b8);
        add(b9);
        add(lY);

        add(lF);
        add(tF);
        add(lG);
        add(tG);
        add(lH);
        add(tH);
        add(lI);
        add(tI);
        add(lJ);
        add(tJ);
        add(bD);
        add(bA);
        add(bB);
        add(bC);
        add(lZ);
        add(bE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bA.addActionListener(this);
        bB.addActionListener(this);
        bC.addActionListener(this);
        bD.addActionListener(this);
        bE.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                artist a = new artist();
                DAOArtGallery dao = new DAOArtGallery();
                
                a.Artist_ID = Integer.parseInt(t1.getText());
                a.Name = t2.getText();
                a.Style = t3.getText();
                a.Email = t4.getText();
                a.Country = t5.getText();
                
                int res = dao.insert(a);
                if (res > 0) {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    lW.setText("Inserted in artist");
                }
            }          
            else if (ae.getSource() == b2) {
                artist a = new artist();
                DAOArtGallery dao = new DAOArtGallery();
                
                a.Artist_ID = Integer.parseInt(t1.getText());
                a.Name = t2.getText();
                a.Style = t3.getText();
                a.Email = t4.getText();                
                a.Country = t5.getText();
                
                int res = dao.Update(a);
                if (res > 0) {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    lW.setText("Updated in artist");
                }
            }       
            else if (ae.getSource() == b3) {
                artist a = new artist();
                DAOArtGallery dao = new DAOArtGallery();
                a.Artist_ID = Integer.parseInt(t1.getText());
                int res = dao.Delete(a);
                
                if (res > 0) {
                    t1.setText("");
                    lW.setText("Deleted in artist");
                }

            }
            else if (ae.getSource() == b4) {

                artwork ar = new artwork();
                DAOArtGallery dao = new DAOArtGallery();
                
                ar.Art_ID = Integer.parseInt(t6.getText());
                ar.Year = Integer.parseInt(t7.getText());
                ar.Title = t8.getText();
                ar.Price = Integer.parseInt(t9.getText());
                
                int res = dao.Insert(ar);
                if (res > 0) {
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    lX.setText("Inserted in artwork");
                }
            }
            else if (ae.getSource() == b5) {

                artwork ar = new artwork();
                DAOArtGallery dao = new DAOArtGallery();
                
                ar.Art_ID = Integer.parseInt(t6.getText());
                ar.Year = Integer.parseInt(t7.getText());
                ar.Title = t8.getText();
                ar.Price = Integer.parseInt(t9.getText());
                
                int res = dao.Update(ar);
                if (res > 0) {
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    lX.setText("Updated in artwork");
                }
            }             
            else if (ae.getSource() == b6) {

                artwork ar = new artwork();
                DAOArtGallery dao = new DAOArtGallery();
                ar.Art_ID = Integer.parseInt(t6.getText());
                int res = dao.Delete(ar);
                
                if (res > 0) {
                    t6.setText("");
                    lX.setText("Deleted from artwork");
                }
            }
            else if (ae.getSource() == b7) {
                customer cs = new customer();
                DAOArtGallery dao = new DAOArtGallery();
                cs.Customer_ID = Integer.parseInt(tA.getText());
                cs.Name = tB.getText();
                cs.Description = tC.getText();
                cs.PhoneNo = Integer.parseInt(tD.getText());
                cs.Address = tE.getText();
                int res = dao.Insert(cs);
                if (res > 0) {
                    tA.setText("");
                    tB.setText("");
                    tC.setText("");
                    tD.setText("");
                    tE.setText("");
                    lY.setText("Inserted in customer");
                }
            }
            else if (ae.getSource() == b8) {
                customer cs = new customer();
                DAOArtGallery dao = new DAOArtGallery();
                cs.Customer_ID = Integer.parseInt(tA.getText());
                cs.Name = tB.getText();
                cs.Description = tC.getText();
                cs.PhoneNo = Integer.parseInt(tD.getText());
                cs.Address = tE.getText();
                int res = dao.Update(cs);
                if (res > 0) {
                    tA.setText("");
                    tB.setText("");
                    tC.setText("");
                    tD.setText("");
                    tE.setText("");
                    lY.setText("Updated in customer");
                }
            }             
            else if (ae.getSource() == b9) {

                customer cs = new customer();
                DAOArtGallery dao = new DAOArtGallery();
                cs.Customer_ID = Integer.parseInt(tA.getText());
                int res = dao.Delete(cs);
                
                if (res > 0) {
                    tA.setText("");
                    lY.setText("Deleted from customer");
                }
            }   
            else if (ae.getSource() == bD) {
                exhibition eh = new exhibition();
                eh.Exhibition_ID = Integer.parseInt(tF.getText());
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectById(eh);
                while(rs.next())
                {
                    tF.setText(""+rs.getString(1));
                    tG.setText(""+rs.getString(2));
                    tH.setText(""+rs.getString(3));
                    tI.setText(""+rs.getString(4));
                    tJ.setText(""+rs.getString(5));
                    lZ.setText("Details granted.");
                }
            }
            else if (ae.getSource() == bA) {
                exhibition eh = new exhibition();
                DAOArtGallery dao = new DAOArtGallery();
                eh.Exhibition_ID = Integer.parseInt(tF.getText());
                eh.Name = tG.getText();
                eh.StartDate = tH.getText();
                eh.EndDate = tI.getText();
                eh.Gallery_Address = tJ.getText();
                int res = dao.Insert(eh);
                if (res > 0) {
                    tF.setText("");
                    tG.setText("");
                    tH.setText("");
                    tI.setText("");
                    tJ.setText("");
                    lZ.setText("Inserted in exhibition");
                }
            }
            else if (ae.getSource() == bB) {
                exhibition eh = new exhibition();
                DAOArtGallery dao = new DAOArtGallery();
                eh.Exhibition_ID = Integer.parseInt(tF.getText());
                eh.Name = tG.getText();
                eh.StartDate = tH.getText();
                eh.EndDate = tI.getText();
                eh.Gallery_Address = tJ.getText();
                int res = dao.Update(eh);
                if (res > 0) {
                    tF.setText("");
                    tG.setText("");
                    tH.setText("");
                    tI.setText("");
                    tJ.setText("");
                    lZ.setText("Updated in exhibition");
                }
            }             
            else if (ae.getSource() == bC) {
                exhibition eh = new exhibition();
                DAOArtGallery dao = new DAOArtGallery();
                eh.Exhibition_ID = Integer.parseInt(tF.getText());
                int res = dao.Delete(eh);
                if (res > 0) {
                    tF.setText("");
                    lZ.setText("Deleted from exhibition");
                }
            }  
             else if (ae.getSource()==bE)
            {
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectAll();
                while(rs.next())
                {
                    tF.setText(""+rs.getString(1));
                    tG.setText(""+rs.getString(2));
                    tH.setText(""+rs.getString(3));
                    tI.setText(""+rs.getString(4));
                    tJ.setText(""+rs.getString(5));
                }
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public static void main(String args[])
    {
        ArtGalleryGUI_DAOLINK obj = new ArtGalleryGUI_DAOLINK();
    }
}
