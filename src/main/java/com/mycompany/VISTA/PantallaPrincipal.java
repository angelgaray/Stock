package VISTA;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DAVID
 */
public class PantallaPrincipal {
    
    public JFrame ventPrincipal;
    public JButton btnEmpleados,btnProductos,btnCategoriaProductos,btnMovimientosProductos,btnMarcas, btnProveedores,btnUsuarios;
 
    public PantallaPrincipal(){
    
        ventPrincipal= new JFrame();
        
        btnEmpleados= new JButton("Empleados");
        btnEmpleados.setBounds(175, 40, 180, 30);
        ventPrincipal.add(btnEmpleados);
        
        btnProductos= new JButton("Productos");
        btnProductos.setBounds(175, 80, 180, 30);
        ventPrincipal.add(btnProductos);
        
       
        btnCategoriaProductos= new JButton("Categoria Productos");
        btnCategoriaProductos.setBounds(175, 120, 180, 30);
        ventPrincipal.add(btnCategoriaProductos);
        
        btnMovimientosProductos = new JButton("Entradas-Salidas Productos");
        btnMovimientosProductos.setBounds(175, 160, 180, 30);
        ventPrincipal.add(btnMovimientosProductos);
        
        btnMarcas= new JButton("Marcas");
        btnMarcas.setBounds(175, 200, 180, 30);
        ventPrincipal.add(btnMarcas);
        
        btnProveedores= new JButton("Proveedores");
        btnProveedores.setBounds(175, 240, 180, 30);
        ventPrincipal.add(btnProveedores);
        
        btnUsuarios= new JButton("Usuarios");
        btnUsuarios.setBounds(175, 280, 180, 30);
        ventPrincipal.add(btnUsuarios);
        
        
        
        
        ventPrincipal.setLayout(null);
        ventPrincipal.setDefaultCloseOperation(3);
        ventPrincipal.setSize(500,500);
        ventPrincipal.setVisible(true);
        
        
    }   
    
    public static void main(String[] args) {
        PantallaPrincipal pn= new PantallaPrincipal();
    
}}
