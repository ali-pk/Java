package ali;
 // DO USER LOGIN WITH PASSWORD AND ADMIN LOGIN
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.*;    //for using ResultSet Function (present in DAO) 

public class login extends JFrame implements ActionListener {

    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3;

    login() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        l1 = new JLabel("ID");
        t1 = new JTextField(20);
        l2 = new JLabel("Password");
        t2 = new JTextField(20);
        
        b1 = new JButton("Login as Admin");
        b2 = new JButton("Login as Customer");
        b3 = new JButton("SignUp for Customer");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                admin a = new admin();
                DAOArtGallery dao = new DAOArtGallery();
                a.Admin_ID = Integer.parseInt(t1.getText());
                a.Password = t2.getText();
                ResultSet res = dao.logininfo(a);
                if(res.next())
                {
                    dispose();
                    ArtGalleryHome home = new ArtGalleryHome();
                    home.show();
                }
                else {
                    JOptionPane.showMessageDialog(this,"Invalid Admin ID or Password");
                    t1.setText("");
                    t2.setText("");        
                }
            }   
            else if (ae.getSource() == b2) {
                customer c = new customer();
                DAOArtGallery dao = new DAOArtGallery();
                c.Customer_ID = Integer.parseInt(t1.getText());
                c.Password = t2.getText();
                ResultSet res = dao.logininfo(c);
                if(res.next())
                {
                    dispose();
                    ArtGalleryCustomerHome custmr = new ArtGalleryCustomerHome();
                    custmr.show(); 
                }
                else {
                    JOptionPane.showMessageDialog(this,"Invalid Customer ID or Password");
                    t1.setText("");
                    t2.setText("");        
                }
            } 
            else if (ae.getSource() == b3) {
                    dispose();
                    customerSignUp snup = new customerSignUp();
                    snup.show(); 
                }
               
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public static void main(String args[])
    {
        login obj = new login();
    }
}
