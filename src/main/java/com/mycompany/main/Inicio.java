package main;
import CONTROLADOR.Control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Inicio {
    
    public static void main(String[] args) {
        String base="stockfinal";
        String user="root";
        String pass="123";
        String url="jdbc:mysql://localhost:3306/"+base;
        String driver="com.mysql.jdbc.Driver";
        Connection con=null;
        PreparedStatement ps = null;
        ResultSet rs;
        try {
            Class.forName(driver);  
            try {
                con = DriverManager.getConnection(url,user, pass);
            } catch (Exception ex) {
              System.err.println(ex);
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        Control pn= new Control();
    }
}