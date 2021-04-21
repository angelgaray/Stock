package MODELO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class consultaProveedor extends Conexion{
    
     public boolean registrar(Proveedor proveedor){
        
            ps = null;
            con = getConnection(); 
            String sql="INSERT INTO proveedor (idproveedor,razonSocial, descripcion, direccion,telefono)"
                    + " VALUES(?,?,?,?,?)";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setDouble(1, proveedor.getIdProveedor());
                ps.setString(2, proveedor.getRazonSocial());
                ps.setString(3, proveedor.getDescripcion());
                ps.setString(4, proveedor.getDireccion());
                ps.setString(5, proveedor.getTelefono());
                
                
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
    
     public boolean modificar(Proveedor proveedor){
        
            ps = null;
            con = getConnection(); 
            String sql="UPDATE  proveedor SET idProveedor=?,razonSocial=?, descripcion=?, direccion=?, telefono=? WHERE idProveedor=?";
            try {
            ps= con.prepareStatement(sql);
          
                ps.setDouble(1, proveedor.getIdProveedor());
                ps.setString(2,proveedor.getRazonSocial());
                ps.setString(3,proveedor.getDescripcion());
                ps.setString(4, proveedor.getDireccion());
                ps.setString(5, proveedor.getTelefono());
                ps.setDouble(6, proveedor.getCodigo());
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
      
     public boolean buscar(Proveedor proveedor){
        
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT * FROM proveedor WHERE idProveedor=?";
            
            try {
            ps= con.prepareStatement(sql);
          
                ps.setDouble(1, proveedor.getIdProveedor());
                rs = ps.executeQuery();
               
               if(rs.next()){
                   proveedor.setIdProveedor(rs.getDouble("idProveedor"));
                   proveedor.setRazonSocial(rs.getString("razonSocial"));
                   proveedor.setDescripcion(rs.getString("descripcion"));
                   proveedor.setDireccion(rs.getString("direccion"));
                   proveedor.setTelefono(rs.getString("telefono"));
                                     
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

    

