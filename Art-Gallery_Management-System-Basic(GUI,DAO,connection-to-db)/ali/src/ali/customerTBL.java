package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent 

public class customerTBL extends JFrame implements ActionListener {

    JLabel lA,lB,lC,lD,lE,lz,lY;
    JTextField tA,tB,tC,tD,tE,tz;
    JButton b7,b8,b9,ba;

    customerTBL() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());
        
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
        lz = new JLabel("Password");
        tz = new JTextField(20);
       
        b7 = new JButton("Insert In customer table");
        b8 = new JButton("Update In customer table");
        b9 = new JButton("Delete In customer table");
        ba = new JButton("Back");
        lY = new JLabel("");
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
        add(lz);
        add(tz);
        add(b7);
        add(b8);
        add(b9);
        add(ba);
        add(lY);

        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b7) {
                customer cs = new customer();
                DAOArtGallery dao = new DAOArtGallery();
                cs.Customer_ID = Integer.parseInt(tA.getText());
                cs.Name = tB.getText();
                cs.Description = tC.getText();
                cs.PhoneNo = Integer.parseInt(tD.getText());
                cs.Address = tE.getText();
                cs.Password = tz.getText();
                int res = dao.Insert(cs);
                if (res > 0) {
                    tA.setText("");
                    tB.setText("");
                    tC.setText("");
                    tD.setText("");
                    tE.setText("");
                    tz.setText("");
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
                cs.Password = tz.getText();
                int res = dao.Update(cs);
                if (res > 0) {
                    tA.setText("");
                    tB.setText("");
                    tC.setText("");
                    tD.setText("");
                    tE.setText("");
                    tz.setText("");
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
        customerTBL obj = new customerTBL();
    }
}
