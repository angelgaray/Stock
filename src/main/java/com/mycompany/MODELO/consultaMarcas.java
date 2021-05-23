package com.mycompany.MODELO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class consultaMarcas extends Conexion{
    
    public int cont;
    public Object [] arrayMarcas;
     public boolean registrar(Marcas marcas) {

        ps = null;
        con = getConnection();
        String sql = "INSERT INTO Marcas (idMarca,descripcion)"
                + " VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, marcas.getIdMarca());
            ps.setString(2, marcas.getDescripcion());

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

    public boolean modificar(Marcas marcas) {

        ps = null;
        con = getConnection();
        String sql = "UPDATE  marcas SET idMarca=?,descripcion=? WHERE idMarca=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, marcas.getIdMarca());
            ps.setString(2, marcas.getDescripcion());
            ps.setDouble(3, marcas.getCodigo());
           
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
    public boolean buscar(Marcas marcas) {

        ps = null;
        rs = null;
        con = getConnection();
        String sql = "SELECT * FROM marcas WHERE idMarca=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, marcas.getIdMarca());
            rs = ps.executeQuery();

            if (rs.next()) {
                marcas.setIdMarca(rs.getInt("idMarca"));
                marcas.setDescripcion(rs.getString("descripcion"));
                
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
     public void contarMarcas(){
            cont=0;
            ps = null;
            rs=null;
            con = getConnection(); 
            String sql="SELECT count(*) as total from marcas";
            
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
    public boolean cargarMarcasProductos(){
            ps = null;
            rs=null;
            con = getConnection(); 
            int o=0;
            String sqll="Select * from marcas";
            
            try {
              
               arrayMarcas= new Object[cont];
               ps=con.prepareStatement(sqll);
               rs=ps.executeQuery();
               while(rs.next()){
                  arrayMarcas[o]=rs.getString("descripcion");
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
    
     public boolean buscarIdMarca(Marcas marca) {

        ps = null;
        rs = null;
        con = getConnection();
        String sql = "SELECT idMarca FROM marcas WHERE descripcion=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, marca.getDescripcion());
            rs = ps.executeQuery();

            if (rs.next()) {
                marca.setIdMarca(rs.getInt("idMarca"));
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
}
