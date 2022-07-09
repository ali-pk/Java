package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.*;

public class artwork_Cst extends JFrame implements ActionListener {

    JLabel l6,l7,l8,l9,lX;
    JTextField t6,t7,t8,t9;
    JButton b5,b6,ba;

    artwork_Cst() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        l6 = new JLabel("Art_ID");
        t6 = new JTextField(20);
        l7 = new JLabel("Year");
        t7 = new JTextField(20);
        l8 = new JLabel("Title");
        t8 = new JTextField(20);
        l9 = new JLabel("Price");
        t9 = new JTextField(20);
       
        b5 = new JButton("Search ArtWork Details by ID");
        b6 = new JButton("Show all ArtWork Details");
        ba = new JButton("Back"); 
        
        lX = new JLabel("");
        add(l6);
        add(t6);
        add(l7);
        add(t7);
        add(l8);
        add(t8);
        add(l9);
        add(t9);
        add(b5);
        add(b6);
        add(ba);
        add(lX);

        b5.addActionListener(this);
        b6.addActionListener(this);
        ba.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b5) {
                artwork ar = new artwork();
                ar.Art_ID = Integer.parseInt(t6.getText());
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectById(ar);
                while(rs.next())
                {
                    t6.setText(""+rs.getString(1));
                    t7.setText(""+rs.getString(2));
                    t8.setText(""+rs.getString(3));
                    t9.setText(""+rs.getString(4));
                    lX.setText("Details granted.");
                }
            }             
            else if (ae.getSource() == b6) {
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectAllartwork();
                while(rs.next())
                {
                    t6.setText(""+rs.getString(1));
                    t7.setText(""+rs.getString(2));
                    t8.setText(""+rs.getString(3));
                    t9.setText(""+rs.getString(4));
                }
            }
            else if (ae.getSource() == ba) {
               dispose();
               ArtGalleryCustomerHome home = new ArtGalleryCustomerHome();
               home.show();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public static void main(String args[])
    {
        artwork_Cst obj = new artwork_Cst();
    }
}