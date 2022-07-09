package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.*;    //for using ResultSet Function (present in DAO) 

public class exhibition_Cst extends JFrame implements ActionListener {

    JLabel lF,lG,lH,lI,lJ,lZ ;
    JTextField tF,tG,tH,tI,tJ;
    JButton bD,bE,ba;

    exhibition_Cst() {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLayout(new FlowLayout());

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
       
        bD = new JButton("Search Exhibition Details by ID");
        bE = new JButton("Show all Exhibition Details");
        ba = new JButton("Back"); 
        lZ = new JLabel("");
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
        add(bE);
        add(ba);
        add(lZ);
        bD.addActionListener(this);
        bE.addActionListener(this);
        ba.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == bD) {
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
            else if (ae.getSource() == bE) {
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
        exhibition_Cst obj = new exhibition_Cst();
    }
}
