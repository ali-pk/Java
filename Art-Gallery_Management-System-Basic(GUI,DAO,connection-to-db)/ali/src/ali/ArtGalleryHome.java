package ali;
 // DO USER LOGIN WITH PASSWORD AND ADMIN LOGIN
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent

public class ArtGalleryHome extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1,b2,b3,b4,bz;
    ArtGalleryHome() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

        l1 = new JLabel("Welcome To Art Gallery Exhibition ");
        b1 = new JButton("Operate artist info");
        b2 = new JButton("Operate artwork info");
        b3 = new JButton("Operate customer info");
        b4 = new JButton("Operate exhibition info");
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
               artistTBL artst = new artistTBL();
               artst.show();
            }          
            else if (ae.getSource() == b2) {
               dispose();
               artworkTBL artwrk = new artworkTBL();
               artwrk.show();
            }       
            else if (ae.getSource() == b3) {
               dispose();
               customerTBL custmr = new customerTBL();
               custmr.show();     
            }
            else if (ae.getSource() == b4) {
               dispose();
               exhibitionTBL exhb = new exhibitionTBL();
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
        ArtGalleryHome obj = new ArtGalleryHome();
    }
}
