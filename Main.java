//GUI and DATABASE CONNECTOR
//You are going to suffer


//import statements
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

//main class with all code

public class Main implements ActionListener{
    //atomic componets
    JLabel j1, j2, j3;
    JTextField t1;
    JButton b1;
    JPasswordField p1;
    //intermediate level
    JPanel jp;
    //top level
    JFrame jf;

    Main(){
        j1 = new JLabel("Emp No: " );
        j2 = new JLabel("Emp Name: ");
        j3 = new JLabel(" ");
        p1 = new JPasswordField(20);
        t1 = new JTextField(20);
        b1 = new JButton("Submit");
        b1.addActionListener(this);
        jp = new JPanel();
        jp.setLayout(new GridLayout(3, 2));
        jp.add(j1);
        jp.add(t1);
        jp.add(j2);
        jp.add(p1);
        jp.add(j3);
        jp.add(b1);

        jf = new JFrame();
        jf.setSize(600, 500);
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();

    }
    public static void main(String[] args){
        new Main();
    }

    public void actionPerformed(ActionEvent e){
        String connector = "jdbc:mysql://localhost:3306/javadatabasenew";
        String username = "root";
        String password = "Upenquincy03";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadatabasenew","root", "Upenquincy03");
            PreparedStatement ps = connection.prepareStatement("Select * From  employee where UID = ? And password = ?");
            ps.setInt(1, Integer.parseInt(t1.getText()));
            ps.setInt(2, Integer.parseInt(p1.getText()));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("UID: "+rs.getString(1));
                System.out.println("Name: "+rs.getString(3));
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }

}

