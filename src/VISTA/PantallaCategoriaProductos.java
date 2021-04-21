package VISTA;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PantallaCategoriaProductos {
     
    public JFrame ventCatProductos;
    public JLabel etiIdCategoria, etiDescripcion;
    public JTextField txtIdCategoria, txtDescripcion,txtCodigo;
    public JButton btnNuevo, btnCargar, btnModificar, btnConsultar,btnBuscar,btnActualizar,btnCancelar,btnAtras;
    
    public PantallaCategoriaProductos(){
        
        
        ventCatProductos= new JFrame();
        
        txtCodigo= new JTextField();
        txtCodigo.setBounds(120, 10, 200, 30);
        txtCodigo.setEnabled(false);
        ventCatProductos.add(txtCodigo);
        
        etiIdCategoria = new JLabel("Id Categoria:");
        etiIdCategoria.setBounds(30, 40, 200, 30);
        ventCatProductos.add(etiIdCategoria);
        
        txtIdCategoria = new JTextField();
        txtIdCategoria.setBounds(120, 40, 200, 30);
        ventCatProductos.add(txtIdCategoria);
        
         etiDescripcion = new JLabel("Descripcion:");
        etiDescripcion.setBounds(30, 80, 200, 30);
        ventCatProductos.add(etiDescripcion);
        
        txtDescripcion = new JTextField();
        txtDescripcion.setBounds(120, 80, 200, 30);
        ventCatProductos.add(txtDescripcion);
        
        
        
         btnNuevo= new JButton("Nuevo");
        btnNuevo.setBounds(30, 150, 100, 30);
        ventCatProductos.add( btnNuevo);
          
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(140, 150, 100, 30);
        ventCatProductos.add(btnCargar);
        
        btnModificar= new JButton("Modificar");
        btnModificar.setBounds(250, 150, 100, 30);
        ventCatProductos.add( btnModificar);
          
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(360, 150, 100, 30);
        ventCatProductos.add(btnConsultar);
        
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(350, 30, 100, 30);
        ventCatProductos.add( btnBuscar);
        
//        btnBuscarConsulta = new JButton("Buscar Consulta");
//        btnBuscarConsulta.setBounds(450, 30, 130, 30);
//        ventCatProductos.add(btnBuscarConsulta);
          
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(350, 70, 100, 30);
        ventCatProductos.add(btnActualizar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(350, 110, 100, 30);
        ventCatProductos.add(btnCancelar);
        
        btnAtras= new JButton("Atras");
        btnAtras.setBounds(360, 190, 100, 30);
        ventCatProductos.add(btnAtras);
        
        ventCatProductos.setLayout(null);
        ventCatProductos.setDefaultCloseOperation(3);
        ventCatProductos.setResizable(false);
        ventCatProductos.setSize(600,600);
        ventCatProductos.setVisible(false);
        
        cancelar();
        snumeros(txtIdCategoria);
        sletras(txtDescripcion);
       
        
    
    }
    public void nuevaCategoria(){
    txtIdCategoria.setEnabled(true);
    txtDescripcion.setEnabled(true);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
//    btnBuscarConsulta.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnCargar.setEnabled(true);
    btnConsultar.setEnabled(false);
    btnModificar.setEnabled(false);
    btnNuevo.setEnabled(false);
    btnAtras.setEnabled(false);
    txtIdCategoria.requestFocus();
    }
    public void activarModificaciones(){
    txtIdCategoria.setEnabled(true);
    btnBuscar.setEnabled(true);
    btnCancelar.setEnabled(true);
    btnAtras.setEnabled(false);
    txtIdCategoria.requestFocus();
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnActualizar.setEnabled(true);
    btnConsultar.setEnabled(false);
    txtDescripcion.setEnabled(true);
    
    }
    
    public void activarConsulta(){
     txtIdCategoria.setEnabled(true);
     btnBuscar.setEnabled(true);
     txtIdCategoria.requestFocus();
     btnConsultar.setEnabled(false);
     btnCancelar.setEnabled(true);
     btnNuevo.setEnabled(false);
     btnModificar.setEnabled(false);
     btnAtras.setEnabled(false);
     
     
    }
    
    public void cancelar(){
    txtIdCategoria.setEnabled(false);
    txtDescripcion.setEnabled(false);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnCancelar.setEnabled(false);
    btnCargar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnModificar.setEnabled(false);
    btnNuevo.setEnabled(true);
    btnAtras.setEnabled(true);
    txtCodigo.setText("");
    txtDescripcion.setText("");
    txtIdCategoria.setText("");
    
        
    }
    public void limpiar(){
        txtIdCategoria.setText("");
        txtDescripcion.setText("");
        txtCodigo.setText("");
    }
    
//    public void nuevo(){
//     btnNuevo.setEnabled(false);
//    btnActualizar.setEnabled(false);
//    btnBuscar.setEnabled(false);
//    btnCargar.setEnabled(true);
//    btnConsultar.setEnabled(false);
//    btnModificar.setEnabled(false);
//    btnCancelar.setEnabled(true);
//    txtDescripcion.setEnabled(true);
//    txtIdCategoria.setEnabled(true);
//    }
    
     public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventCatProductos.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventCatProductos.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    public static void main(String[] args) {
        PantallaCategoriaProductos p= new PantallaCategoriaProductos();
    }
}
