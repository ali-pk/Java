package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent

public class artistTBL extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,lW;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,ba;

    artistTBL() {
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
        
        b1 = new JButton("Insert In artist table");
        b2 = new JButton("Update In artist table");
        b3 = new JButton("Delete In artist table");
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
        add(b3);
        add(ba);
        add(lW);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        ba.addActionListener(this);
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
            else if (ae.getSource() == ba) {
               dispose();
               ArtGalleryHome home = new ArtGalleryHome();
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
        artistTBL obj = new artistTBL();
    }
}
