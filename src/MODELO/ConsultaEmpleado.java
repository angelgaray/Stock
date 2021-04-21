package MODELO;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConsultaEmpleado extends Conexion {
    
     public boolean registrar(Empleado emp){
        
            ps = null;
            con = getConnection(); 
            String sql="INSERT INTO empleado (idEmpleado,apellido, primerNombre, segundoNombre, fechaNacimiento,jefe,descripcion,telefono,fechaAlta,fechaBaja)"
                    + " VALUES(?,?,?,?,?,?,?,?,?,?)";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, emp.getIdEmpleado());
                ps.setString(2, emp.getApellido());
                ps.setString(3, emp.getNombre());
                ps.setString(4, emp.getSegundoNombre());
                ps.setString(5, emp.getFechaNacimiento());
                ps.setString(6, emp.getJefe());
                ps.setString(7, emp.getDescripcion());
                ps.setString(8, emp.getTelefono());
                ps.setString(9, emp.getFechaAlta());
                ps.setString(10, emp.getFechaBaja());
                
                
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
    
     public boolean modificar(Empleado emp){
        
            ps = null;
            con = getConnection(); 
            String sql="UPDATE  empleado SET idEmpleado=?,apellido=?, primerNombre=?, segundoNombre=?, fechaNacimiento=?,jefe=?,"
                    + "descripcion=?,telefono=?,fechaAlta=?, fechaBaja=? WHERE idEmpleado=?";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, emp.getIdEmpleado());
                ps.setString(2, emp.getApellido());
                ps.setString(3,emp.getNombre());
                ps.setString(4, emp.getSegundoNombre());
                ps.setString(5, emp.getFechaNacimiento());
                ps.setString(6, emp.getJefe());
                ps.setString(7, emp.getDescripcion());
                ps.setString(8, emp.getTelefono());
                ps.setString(9, emp.getFechaAlta());
                ps.setString(10, emp.getFechaBaja());
                ps.setInt(11, emp.getCodigo());
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
    
//     public boolean eliminar(Empleado emp){
//        
//            ps = null;
//            con = getConnection(); 
//            String sql="DELETE FROM Usuario WHERE idUsuario=?";
//            try {
//            ps= con.prepareStatement(sql);
//          
//                ps.setInt(1, usu.getIdUsuario());
//                ps.execute();
//                return true;
//                
//            }catch (SQLException ex) { 
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//                return false;
//            }
//            finally{
//                try {
//                    con.close();
//                } catch (SQLException ex) {
//                   System.out.println(ex);
//                }
//            }
//    }
      
     public boolean buscar(Empleado empleado){
        
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT * FROM empleado WHERE idEmpleado=?";
            
            try {
            ps= con.prepareStatement(sql);
          
                ps.setInt(1, empleado.getIdEmpleado());
                rs = ps.executeQuery();
               
               if(rs.next()){
                   empleado.setIdEmpleado(rs.getInt("idEmpleado"));
                   empleado.setApellido(rs.getString("apellido"));
                   empleado.setNombre(rs.getString("primerNombre"));
                   empleado.setSegundoNombre(rs.getString("segundoNombre"));
                   empleado.setFechaNacimiento(rs.getString("fechaNacimiento"));
                   empleado.setJefe(rs.getString("jefe"));
                   empleado.setDescripcion(rs.getString("descripcion"));
                   empleado.setTelefono(rs.getString("telefono"));
                   empleado.setFechaAlta(rs.getString("fechaAlta"));
                   empleado.setFechaBaja(rs.getString("fechaBaja"));
                  
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
     
//     public boolean iniciarSesion(Usuario usu){
//        
//            ps = null;
//            rs=null;
//            con = getConnection(); 
//            String sql="SELECT idUsuario, clave,tipoUsuario,nombre,apellido FROM Usuario WHERE idUsuario=? and clave=?";
//            
//            try {
//            ps= con.prepareStatement(sql);
//          
//                ps.setInt(1, usu.getIdUsuario());
//                ps.setString(2,usu.getClave());
//                
//               rs = ps.executeQuery();
//               
//               if(rs.next()){ 
//                   usu.setIdUsuario(Integer.parseInt(rs.getString("idUsuario")));
//                   usu.setTipoUsuario(rs.getString("tipoUsuario"));
//                   usu.setNombre(rs.getString("nombre"));
//                   usu.setApellido(rs.getString("apellido"));
//                   
//                   
//                   return true;
//                   
//               }
//                return false;
//                
//            }catch (SQLException ex) { 
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//                return false;
//            }
//            finally{
//                try {
//                    con.close();
//                } catch (SQLException ex) {
//                   System.out.println(ex);
//                }
//            }
//    }
     
}
