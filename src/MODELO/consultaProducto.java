package MODELO;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class consultaProducto extends Conexion {

    public boolean registrar(Producto pro) {

        ps = null;
        con = getConnection();
        String sql = "INSERT INTO producto (idProducto,descripcion,marca, stock,unidadMedida,idCategoria,stockMinimo)"
                + " VALUES(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, pro.getIdProducto());
            ps.setString(2, pro.getDescripcion());
            ps.setDouble(3, pro.getStock());
            ps.setString(4, pro.getuMedida());
            ps.setInt(5, pro.getIdCategoria());
            ps.setDouble(6, pro.getStockMinimo());

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

    public boolean modificar(Producto pro) {

        ps = null;
        con = getConnection();
        String sql = "UPDATE  producto SET idProducto=?,descripcion=?, marca=?, stock=?, unidadMedida=?,idCategoria=?,"
                + "stockMinimo=? WHERE codigo=?";
        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, pro.getIdProducto());
            ps.setString(2, pro.getDescripcion());
            ps.setDouble(3, pro.getStock());
            ps.setString(4, pro.getuMedida());
            ps.setInt(5, pro.getIdCategoria());
            ps.setDouble(6, pro.getStockMinimo());
            ps.setInt(7, pro.getCodigo());

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
    public boolean buscar(Producto pro) {

        ps = null;
        rs = null;
        con = getConnection();
        String sql = "SELECT * FROM producto WHERE idProducto=?";

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, pro.getIdProducto());
            rs = ps.executeQuery();

            if (rs.next()) {
                pro.setIdProducto(rs.getInt("idProducto"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setStock(rs.getDouble("stock"));
                pro.setuMedida(rs.getString("unidadMedida"));
                pro.setIdCategoria(rs.getInt("idCategoria"));
                pro.setStockMinimo(rs.getDouble("stockMinimo"));

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
