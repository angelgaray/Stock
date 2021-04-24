package VISTA;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DAVID angelgaray59@gmail.com
 */
public class PantallaProductos{

     public JFrame ventProductos;
    public JLabel etiIdProducto, etiDescripcion,etiMarca, etiStock, etiUnidadMedida, 
            etiCategoria, etiStockMinimo;
    public JTextField txtIdProducto, txtDescripcion, txtMarca, txtStock,txtStockMinimo,txtUMedida,txtIdCategoria;
    public JButton btnNuevo, btnCargar, btnModificar, btnConsultar,btnBuscar,btnActualizar,btnCancelar,btnAtras;
    public JComboBox categoria;
    
      
    int xet=30;
    int xtxt=130;
    public PantallaProductos(){
        ventProductos= new JFrame();
        
        etiIdProducto= new JLabel("Id Producto");
        etiIdProducto.setBounds(30, 30, 200, 30);
        ventProductos.add(etiIdProducto);
        
        txtIdProducto= new JTextField();
        txtIdProducto.setBounds(130, 30, 200, 30);
        ventProductos.add(txtIdProducto);
        txtIdProducto.setText("id ");
        
        etiDescripcion= new JLabel("Descripcion");
        etiDescripcion.setBounds(30, 70, 200, 30);
        ventProductos.add( etiDescripcion);
          
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 70, 200, 30);
        ventProductos.add(txtDescripcion);
       
       
        etiMarca= new JLabel("Marca:");
        etiMarca.setBounds(30, 110, 200, 30);
        ventProductos.add(etiMarca);
        
        txtMarca= new JTextField();
        txtMarca.setBounds(130, 110, 200, 30);
        ventProductos.add(txtMarca);
        
        etiStock= new JLabel("Stock Actual:");
        etiStock.setBounds(30, 150, 200, 30);
        ventProductos.add(etiStock);
        
        txtStock= new JTextField();
        txtStock.setBounds(130, 150, 200, 30);
        ventProductos.add(txtStock);
        
        etiUnidadMedida= new JLabel("U. Medida:");
        etiUnidadMedida.setBounds(30, 190, 200, 30);
        ventProductos.add(etiUnidadMedida);
        
        txtUMedida= new JTextField();
        txtUMedida.setBounds(130, 190, 200, 30);
        ventProductos.add(txtUMedida);
        
        
        etiCategoria= new JLabel("Categoria:");
        etiCategoria.setBounds(30, 230, 200, 30);
        ventProductos.add(etiCategoria);
        
        categoria= new JComboBox();
        categoria.setBounds(130, 230, 200, 30);
        categoria.addItem("<Seleccione>");
        ventProductos.add( categoria);
        
        txtIdCategoria= new JTextField();
        txtIdCategoria.setBounds(350, 230, 100, 30);
        ventProductos.add(txtIdCategoria);
        
        etiStockMinimo= new JLabel("Stock Minimo");
        etiStockMinimo.setBounds(30, 270, 200, 30);
        ventProductos.add(etiStockMinimo);
        
        txtStockMinimo= new JTextField();
        txtStockMinimo.setBounds(130, 270, 200, 30);
        ventProductos.add(txtStockMinimo);
        
        btnNuevo= new JButton("Nuevo");
        btnNuevo.setBounds(30, 430, 100, 30);
        ventProductos.add( btnNuevo);
          
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(140, 430, 100, 30);
        ventProductos.add(btnCargar);
        
        btnModificar= new JButton("Modificar");
        btnModificar.setBounds(250, 430, 100, 30);
        ventProductos.add( btnModificar);
          
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(360, 430, 100, 30);
        ventProductos.add(btnConsultar);
        
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(350, 30, 100, 30);
        ventProductos.add( btnBuscar);
          
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(350, 70, 100, 30);
        ventProductos.add(btnActualizar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(350, 110, 100, 30);
        ventProductos.add(btnCancelar);
        
        btnAtras= new JButton("Atras");
        btnAtras.setBounds(360, 470,100, 30);
        ventProductos.add(btnAtras);
        
        ventProductos.setLayout(null);
        ventProductos.setTitle("PRODUCTOS");
        ventProductos.setDefaultCloseOperation(3);
        ventProductos.setSize(500,600);
        ventProductos.setVisible(false);
        
//        
//        ventPrincipal.setDefaultCloseOperation(2);
//        ventPrincipal.setSize(500,500);
//        ventPrincipal.setVisible(true);
        
        
//        botonCancelar();

 
    
        limitar();
        sletras(txtMarca);
        snumeros(txtStock);
        snumeros(txtIdProducto);
        snumeros(txtStockMinimo);
        mayuscula(txtMarca);
        mayuscula(txtStock);
        mayuscula(txtDescripcion);
        
        
    } 
    public void botonNuevo(){
        
    btnNuevo.setEnabled(false);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnCargar.setEnabled(true);
    btnConsultar.setEnabled(false);
    btnModificar.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtDescripcion.setEnabled(true);
    txtIdProducto.setEnabled(true);
    categoria.setEnabled(true);
    txtMarca.setEnabled(true);
    txtStock.setEnabled(true);
    txtStockMinimo.setEnabled(true);
    txtUMedida.setEnabled(true);
    
    }
    public void botonCancelar(){
    txtIdProducto.setEnabled(false);
    txtMarca.setEnabled(false);
    txtStock.setEnabled(false);
    categoria.setEnabled(false);
    txtDescripcion.setEnabled(false);
    txtStockMinimo.setEnabled(false);
    txtUMedida.setEnabled(false);
    
    btnNuevo.setEnabled(true);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnCargar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnModificar.setEnabled(true);
    btnCancelar.setEnabled(false);
    
        
        
    }
    
    public void limpiar(){
    txtIdProducto.setText("");
    txtDescripcion.setText("");
    categoria.setSelectedIndex(0);
    txtMarca.setText("");
    txtStock.setText("");
    txtStockMinimo.setText("");
    }
    
     public void mayuscula(JTextField a){
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando          
                 if(Character.isLowerCase(c)){
                   String cad=(""+c).toUpperCase();
                   c=cad.charAt(0);
                   e.setKeyChar(c);
                   }}});}
    public void limitar(){       
        txtIdProducto.setDocument(new LimitarCaracter(txtIdProducto,8));
        txtDescripcion.setDocument(new LimitarCaracter(txtDescripcion, 60));
        txtMarca.setDocument(new LimitarCaracter(txtMarca,60));
        txtStock.setDocument(new LimitarCaracter(txtStock,60));
        txtStockMinimo.setDocument(new LimitarCaracter(txtStockMinimo, 10));
    }
    
    public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventProductos.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventProductos.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    
    public static void main(String [] args){
        PantallaProductos p= new PantallaProductos();
        p.txtIdProducto.setText("Id");
        p.txtMarca.setText("Marca");
        p.txtDescripcion.setText("descripcion");
        p.txtStock.setText("stock");
        p.txtStockMinimo.setText("minimo");
        p.ventProductos.setVisible(true);
      
    }
    
}
