package MODELO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class consultaCategoriaProductos extends Conexion {
    
    public Object datos[];
    public Object[] arrayCategoria;
    public int cont;
    

    public boolean registrar(categoriaProductos catePro) {

        ps = null;
        con = getConnection();
        String sql = "INSERT INTO categoriaproductos (idCategoria,descripcion) VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, catePro.getIdCategoria());
            ps.setString(2, catePro.getDescripcion());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    public boolean modificar(categoriaProductos catePro) {

        ps = null;
        con = getConnection();
        String sql = "UPDATE  categoriaproductos SET idCategoria=?,descripcion=? WHERE idCategoria=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, catePro.getIdCategoria());
            ps.setString(2, catePro.getDescripcion());
            ps.setInt(3, catePro.getCodigo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally {
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
    public boolean buscar(categoriaProductos catePro) {

        ps = null;
        rs = null;
        con = getConnection();
        String sql = "SELECT * FROM categoriaproductos WHERE idcategoria=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, catePro.getIdCategoria());
            rs = ps.executeQuery();

            if (rs.next()) {
                catePro.setIdCategoria(rs.getInt("idcategoria"));
                catePro.setDescripcion(rs.getString("descripcion"));
                return true;

            }
            return false;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
    
    // METODOS PARA LLENAR COMBO BOX CON CONSULTA A MYSQL parte 1
     public void contar(){
            cont=0;
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT count(*) as total from categoriaProductos";
            
            try {
                ps= con.prepareStatement(sql);
                rs = ps.executeQuery();
              
               if(rs.next()){
                   cont=rs.getInt("Total");
                  System.out.println(rs.getInt("total"));
               } 
            }catch (SQLException ex) { 
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                   System.out.println(ex);
                }
            }
    }
    // METODOS PARA LLENAR COMBO BOX CON CONSULTA A MYSQL parte 2
    public boolean cargarCategoriaProductos(){
            ps = null;
            rs=null;
            con = getConnection(); 
            int o=0;
            String sqll="Select * from categoriaProductos";
            
            try {
              
               arrayCategoria= new Object[cont];
               ps=con.prepareStatement(sqll);
               rs=ps.executeQuery();
               while(rs.next()){
                  arrayCategoria[o]=rs.getString("descripcion");
               o=o+1;
              } }
                                
            catch (SQLException ex) { 
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
        return false;
    }
    
    public boolean buscarIdCategoria(categoriaProductos catePro) {

        ps = null;
        rs = null;
        con = getConnection();
        String sql = "SELECT idCategoria FROM categoriaproductos WHERE descripcion=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, catePro.getDescripcion());
            rs = ps.executeQuery();

            if (rs.next()) {
                catePro.setIdCategoria(rs.getInt("idcategoria"));
//                catePro.setDescripcion(rs.getString("descripcion"));
                return true;

            }
            return false;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
////      public Object llenarCombo(categoriaProductos catePro) {
//        datos[2]= new Object();
//        ps = null;
//        rs = null;
//        con = getConnection();
//        String sql = "SELECT * FROM categoriaproductos";
//
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            
//            while (rs.next()) {
//                
//            
//            if (rs.next()) {
//                catePro.setIdCategoria(rs.getInt("idcategoria"));
//                datos[0]=catePro.setDescripcion(rs.getString("descripcion"));
//                return true;
//
//            }
//            }
//            return false;
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
////            return false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException ex) {
//                System.out.println(ex);
//            }
//        }
      
      


}