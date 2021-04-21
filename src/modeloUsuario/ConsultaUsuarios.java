package modeloUsuario;

import MODELO.Conexion;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConsultaUsuarios extends Conexion {
    
     public boolean registrar(Usuario usu){
        
            ps = null;
            con = getConnection(); 
            String sql="INSERT INTO Usuario (idUsuario,clave, nombre, apellido, fechaNacimiento,preguntaSeguridad,respuesta,tipoUsuario,dni)"
                    + " VALUES(?,?,?,?,?,?,?,?,?)";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, usu.getIdUsuario());
                ps.setString(2, usu.getClave());
                ps.setString(3, usu.getNombre());
                ps.setString(4, usu.getApellido());
                ps.setString(5, usu.getFechaNacimiento().toString());
                ps.setString(6, usu.getPreguntaSeguridad());
                ps.setString(7, usu.getRespuesta());
                ps.setString(8, usu.getTipoUsuario());
                ps.setInt(9, usu.getDni());
                ps.execute();
                return true;
                
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
    
     public boolean modificar(Usuario usu){
        
            ps = null;
            con = getConnection(); 
            String sql="UPDATE  Usuario SET idUsuario=?,clave=?, nombre=?, apellido=?, fechaNacimiento=?,preguntaSeguridad=?,"
                    + "respuesta=?,tipoUsuario=?,dni=? WHERE idUsuario=?";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, usu.getIdUsuario());
                ps.setString(2, usu.getClave());
                System.out.println(usu.getClave()+" esta es la clave al modificar");
                ps.setString(3, usu.getNombre());
                ps.setString(4, usu.getApellido());
                ps.setString(5, usu.getFechaNacimiento());
                ps.setString(6, usu.getPreguntaSeguridad());
                ps.setString(7, usu.getRespuesta());
                ps.setString(8, usu.getTipoUsuario());
                ps.setInt(9, usu.getDni());
                ps.setInt(10, usu.getCodigo());
                ps.execute();
                return true;
                
            }catch (SQLException ex) { 
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
            finally{
                try {
                    con.close();
                    System.out.println("conexion cerrada en metodo modificar");
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
    
     public boolean eliminar(Usuario usu){
        
            ps = null;
            con = getConnection(); 
            String sql="DELETE FROM Usuario WHERE idUsuario=?";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, usu.getIdUsuario());
                ps.execute();
                return true;
                
            }catch (SQLException ex) { 
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
      
     public boolean buscar(Usuario usu){
        
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT * FROM Usuario WHERE idUsuario=?";
            
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, usu.getIdUsuario());
                rs = ps.executeQuery();
               
               if(rs.next()){
                   usu.setClave(rs.getString("clave"));
                   usu.setNombre(rs.getString("nombre"));
                   usu.setApellido(rs.getString("apellido"));
                   usu.setFechaNacimiento(rs.getString("fechaNacimiento"));
                   usu.setPreguntaSeguridad(rs.getString("preguntaSeguridad"));
                   usu.setRespuesta(rs.getString("respuesta"));
                   usu.setTipoUsuario(rs.getString("tipoUsuario"));
                   usu.setDni(rs.getInt("dni"));
                   
                   
                   return true;
                   
               }
                return false;
                
            }catch (SQLException ex) { 
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
     
     public boolean iniciarSesion(Usuario usu){
        
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT idUsuario, clave,tipoUsuario,nombre,apellido FROM Usuario WHERE idUsuario=? and clave=?";
            
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, usu.getIdUsuario());
                ps.setString(2,usu.getClave());
                
               rs = ps.executeQuery();
               
               if(rs.next()){ 
                   usu.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
                   usu.setTipoUsuario(rs.getString("tipoUsuario"));
                   usu.setNombre(rs.getString("nombre"));
                   usu.setApellido(rs.getString("apellido"));
                   
                   
                   return true;
                   
               }
                return false;
                
            }catch (SQLException ex) { 
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return false;
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
     
}
