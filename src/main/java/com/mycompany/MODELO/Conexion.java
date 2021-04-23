package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
     
    private String base="stockfinal";
    private String user="root";
    private String pass="38580982";
    private String url="jdbc:mysql://localhost:3306/"+base;
    
    private String driver="com.mysql.jdbc.Driver";
    public Connection con=null;
    public PreparedStatement ps = null;
    public ResultSet rs;
    
    public Connection getConnection(){
        try {
            Class.forName(driver);
            try {
                con=DriverManager.getConnection(this.url,this.user, this.pass);
                System.err.println("CONECTADO CORRECTAMENTE");
                
                
            } catch (SQLException ex) {
              System.out.println(ex.getMessage());
            }
            
        } catch (ClassNotFoundException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return con;
        
    }
    
}
