package ali;
import javax.swing.*;   //for JFrame -> JLabel,JTextField,JButton etc,,,, for setSize,setLayout etc
import java.awt.*;   //for FlowLayout 
import java.awt.event.*;  //for ActionListener -> b1.addActionListener(this) -> ActionEvent
import java.sql.*;    //for using ResultSet Function (present in DAO) 

public class exhibitionTBL extends JFrame implements ActionListener {

    JLabel lF,lG,lH,lI,lJ,lZ ;
    JTextField tF,tG,tH,tI,tJ;
    JButton bA,bB,bC,bD,bE,ba;

    exhibitionTBL() {
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
       
        bD = new JButton("Search by ID in exhibition table");
        bA = new JButton("Insert In exhibition table");
        bB = new JButton("Update In exhibition table");
        bC = new JButton("Delete In exhibition table"); 
        bE = new JButton("show all from exhibition table"); 
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
        add(bA);
        add(bB);
        add(bC);
        add(bE);
        add(ba);
        add(lZ);
        bA.addActionListener(this);
        bB.addActionListener(this);
        bC.addActionListener(this);
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
        exhibitionTBL obj = new exhibitionTBL();
    }
}
