package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.ResultSet;

public class artist_Cst extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,lW;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,ba;

    artist_Cst() {
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
        
        b1 = new JButton("Search Artist Details by ID");
        b2 = new JButton("Show all Artist Details");
        ba = new JButton("Back");
        lW = new JLabel("");
        
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
        add(ba);
        add(lW);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        ba.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                artist a = new artist();
                a.Artist_ID = Integer.parseInt(t1.getText());
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectById(a);
                while(rs.next())
                {
                    t1.setText(""+rs.getString(1));
                    t2.setText(""+rs.getString(2));
                    t3.setText(""+rs.getString(3));
                    t4.setText(""+rs.getString(4));
                    t5.setText(""+rs.getString(5));
                    lW.setText("Details granted.");
                }
            }          
            else if (ae.getSource() == b2) {
                DAOArtGallery dao = new DAOArtGallery();
                ResultSet rs = dao.SelectAllartist();
                while(rs.next())
                {
                    t1.setText(""+rs.getString(1));
                    t2.setText(""+rs.getString(2));
                    t3.setText(""+rs.getString(3));
                    t4.setText(""+rs.getString(4));
                    t5.setText(""+rs.getString(5));
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
        artist_Cst obj = new artist_Cst();
    }
}
