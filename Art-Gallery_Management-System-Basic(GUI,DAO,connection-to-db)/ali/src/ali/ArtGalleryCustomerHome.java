package ali;
 // DO USER LOGIN WITH PASSWORD AND ADMIN LOGIN
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent

public class ArtGalleryCustomerHome extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1,b2,b3,b4,bz;
    ArtGalleryCustomerHome() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        l1 = new JLabel("Welcome To Customer Portal of Art Gallery Exhibition ");
        b1 = new JButton("Update your info");
        b2 = new JButton("Show Artist Details");
        b3 = new JButton("Show ArtWork Details");
        b4 = new JButton("Show Exhibition Details");
        bz = new JButton("Logout");
        add(l1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(bz);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        bz.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
               dispose();
               customer_Cst cst = new customer_Cst();
               cst.show();
            }          
            else if (ae.getSource() == b2) {
               dispose();
               artist_Cst artst = new artist_Cst();
               artst.show();
            }       
            else if (ae.getSource() == b3) {
               dispose();
               artwork_Cst art = new artwork_Cst();
               art.show();     
            }
            else if (ae.getSource() == b4) {
               dispose();
               exhibition_Cst exhb = new exhibition_Cst();
               exhb.show();
            }
            else if (ae.getSource() == bz) {
               dispose();
               login lgn = new login();
               lgn.show();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }
    public static void main(String args[])
    {
        ArtGalleryCustomerHome obj = new ArtGalleryCustomerHome();
    }
}
