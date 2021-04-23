package VISTA;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PantallaEntradasSalidas {
public JFrame ventEntradaSalidasProductos;
public JMenuBar menuPrincipal;
public JMenu menu1;
public JMenuItem ItemEntradaProducto, ItemSalidaProducto;
    public JLabel etiFecha,etiBuscar,etiCantidad,etiProveedor,etiCategoria,etiMarca,etiDescripcion;
    public JTextField txtFecha,txtIdProducto,txtCantidad,txtDescripcion;
    public JRadioButton checkId,checkDescripcion;
    public JButton btnBBuscar,btnAtras,btnCargar, btnCancelar;
    public JComboBox categoria,proveedor,marcas;
    public ButtonGroup b;
    
      
    int xet=30;
    int xtxt=130;
    public PantallaEntradasSalidas(){
        ventEntradaSalidasProductos= new JFrame();
         
        menuPrincipal= new JMenuBar();
         menu1= new JMenu("Inicio");
         ItemEntradaProducto= new JMenuItem("Ingresar Producto");
         menu1.add(ItemEntradaProducto);
         menuPrincipal.add(menu1);
        menuPrincipal.setBounds(0, 0, 800, 30);
       ventEntradaSalidasProductos.add(menuPrincipal);
       
       
       
       
       checkId= new JRadioButton("Id");
       checkId.setBounds(110, 50, 100, 30);
       ventEntradaSalidasProductos.add(checkId);
       
       checkDescripcion= new JRadioButton("Descripcion");
       checkDescripcion.setBounds(220, 50, 100, 30);
       ventEntradaSalidasProductos.add(checkDescripcion);
       
       b= new ButtonGroup();
       b.add(checkId);
       b.add(checkDescripcion);
       
       
        etiBuscar= new JLabel("Buscar por:");
        etiBuscar.setBounds(30, 50, 200, 30);
        ventEntradaSalidasProductos.add(etiBuscar);
        
        etiFecha= new JLabel("Fecha:");
        etiFecha.setBounds(550, 50, 100, 30);
        ventEntradaSalidasProductos.add(etiFecha);
        
        txtFecha= new JTextField();
        txtFecha.setBounds(600, 50, 100, 30);
        txtFecha.setEditable(false);
        ventEntradaSalidasProductos.add(txtFecha);
        
        txtIdProducto= new JTextField();
        txtIdProducto.setBounds(130, 100, 200, 30);
        ventEntradaSalidasProductos.add(txtIdProducto);
        
        etiCantidad= new JLabel("Cantidad");
        etiCantidad.setBounds(30, 140, 100, 30);
        ventEntradaSalidasProductos.add(etiCantidad);
        
        txtCantidad= new JTextField();
        txtCantidad.setBounds(130, 140, 200, 30);
        ventEntradaSalidasProductos.add(txtCantidad);
        
        etiProveedor= new JLabel("Proveedor:");
        etiProveedor.setBounds(30, 180, 100, 30);
        ventEntradaSalidasProductos.add(etiProveedor);
        
        proveedor= new JComboBox();
        proveedor.setBounds(130, 180, 200, 30);
        proveedor.addItem("<Seleccione>");
        ventEntradaSalidasProductos.add(proveedor);
        
        btnBBuscar= new JButton("Buscar");
        btnBBuscar.setBounds(350, 100, 100, 30);
        ventEntradaSalidasProductos.add(btnBBuscar);
        
        etiCategoria= new JLabel("Categoria:");
        etiCategoria.setBounds(30, 220, 100, 30);
        ventEntradaSalidasProductos.add(etiCategoria);
        
        
        categoria= new JComboBox();
        categoria.setBounds(130, 220, 200, 30);
        categoria.addItem("<Seleccione>");
        ventEntradaSalidasProductos.add( categoria);
        
        etiMarca= new JLabel("Marca");
        etiMarca.setBounds(30, 260, 100, 30);
        ventEntradaSalidasProductos.add(etiMarca);
        
        marcas= new JComboBox();
        marcas.addItem("<Seleccione>");
        marcas.setBounds(130, 260, 200, 30);
        ventEntradaSalidasProductos.add(marcas);
        
        etiDescripcion= new JLabel("Descripcion");
        etiDescripcion.setBounds(30, 300, 100, 30);
        ventEntradaSalidasProductos.add(etiDescripcion);
        
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 300, 200, 30);
        ventEntradaSalidasProductos.add(txtDescripcion);
        
        btnCargar = new JButton("Cargar");
        btnCargar.setBounds(130, 380, 100, 30);
        ventEntradaSalidasProductos.add(btnCargar);
        
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(240, 380, 100, 30);
        ventEntradaSalidasProductos.add(btnCancelar);
        
        btnAtras= new JButton("Atras");
        btnAtras.setBounds(670, 500,100, 30);
        ventEntradaSalidasProductos.add(btnAtras);
        
        ventEntradaSalidasProductos.setLayout(null);
        ventEntradaSalidasProductos.setTitle("PRODUCTOS");
        ventEntradaSalidasProductos.setDefaultCloseOperation(3);
        ventEntradaSalidasProductos.setSize(800,600);
        ventEntradaSalidasProductos.setVisible(false);
    
        limitar();
        snumeros(txtIdProducto);
        cancelarTodo();
        
        
    } 
    public void botonNuevo(){
        
    btnBBuscar.setEnabled(true);
    txtIdProducto.setEnabled(true);
    btnBBuscar.setEnabled(true);
    btnCargar.setEnabled(false);
    txtCantidad.setEnabled(false);
    proveedor.setEnabled(false);
    categoria.setEnabled(false);
    marcas.setEnabled(false);
    txtDescripcion.setEnabled(false);
    
    
    }
    
    public void cancelarTodo(){
    checkDescripcion.setVisible(false);
    checkId.setVisible(false);
     
    etiBuscar.setVisible(false);
    etiCantidad.setVisible(false);
    etiCategoria.setVisible(false);
    etiDescripcion.setVisible(false);
    etiFecha.setVisible(false);
    etiMarca.setVisible(false);
    etiProveedor.setVisible(false);
    
    txtCantidad.setVisible(false);
    txtDescripcion.setVisible(false);
    txtFecha.setVisible(false);
    txtIdProducto.setVisible(false);
    
    proveedor.setVisible(false);
    marcas.setVisible(false);
    categoria.setVisible(false);
    
    btnBBuscar.setVisible(false);
    btnCancelar.setVisible(false);
    btnCargar.setVisible(false);
    }
    public void activarIngresoProducto(){
    checkDescripcion.setVisible(true);
    checkId.setVisible(true);
     
    etiBuscar.setVisible(true);
    etiCantidad.setVisible(true);
    etiCategoria.setVisible(true);
    etiDescripcion.setVisible(true);
    etiFecha.setVisible(true);
    etiMarca.setVisible(true);
    etiProveedor.setVisible(true);
    
    txtCantidad.setVisible(true);
    txtDescripcion.setVisible(true);
    txtFecha.setVisible(true);
    txtIdProducto.setVisible(true);
    
    proveedor.setVisible(true);
    marcas.setVisible(true);
    categoria.setVisible(true);
    
    btnBBuscar.setVisible(true);
    btnCancelar.setVisible(true);
    btnCargar.setVisible(true);
        
    
    }
    
    
    public void limpiar(){
    txtIdProducto.setText("");
    categoria.setSelectedIndex(0);
    proveedor.setSelectedIndex(0);
    marcas.setSelectedIndex(0);
    txtDescripcion.setText("");
    txtCantidad.setText("");
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
    }
    
    public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventEntradaSalidasProductos.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventEntradaSalidasProductos.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    
    public static void main(String [] args){
        PantallaEntradasSalidas p= new PantallaEntradasSalidas();
        p.ventEntradaSalidasProductos.setVisible(true);
        p.cancelarTodo();
      
    }
    
}
