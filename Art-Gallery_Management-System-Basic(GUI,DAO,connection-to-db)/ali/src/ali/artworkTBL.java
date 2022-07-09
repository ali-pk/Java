package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent

public class artworkTBL extends JFrame implements ActionListener {

    JLabel l6,l7,l8,l9,lX;
    JTextField t6,t7,t8,t9;
    JButton b4,b5,b6,ba;

    artworkTBL() {
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
        
        b4 = new JButton("Insert In artwork table");
        b5 = new JButton("Update In artwork table");
        b6 = new JButton("Delete In artwork table");  
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
        add(b4);
        add(b5);
        add(b6);
        add(ba);
        add(lX);

        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        ba.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) {
        try {
                if (ae.getSource() == b4) {
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
        artworkTBL obj = new artworkTBL();
    }
}