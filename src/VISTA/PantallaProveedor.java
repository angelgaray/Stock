package VISTA;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PantallaProveedor {
    
    public JFrame ventProveedor;
    public JLabel etiIdProveedor, etiRazonSocial, etiDescripcion, etiDireccion, etiTelefonoo;
    public JTextField txtIdProveedor, txtRazonSocial, txtDescripcion, txtDireccion,txtTelefono,txtCodigo;
    public JButton btnNuevo, btnCargar, btnModificar, btnConsultar,btnBuscar,btnActualizar,btnCancelar,btnVolver;
    
    public PantallaProveedor(){
        ventProveedor= new JFrame();
        
        txtCodigo= new JTextField();
        txtCodigo.setBounds(130, 0, 200, 30);
        txtCodigo.setEditable(false);
        ventProveedor.add(txtCodigo);
        
        etiIdProveedor= new JLabel("Id Proveedor:");
        etiIdProveedor.setBounds(30, 30, 200, 30);
        ventProveedor.add(etiIdProveedor);
        
        txtIdProveedor= new JTextField();
        txtIdProveedor.setBounds(130, 30, 200, 30);
        ventProveedor.add(txtIdProveedor);
        
        etiRazonSocial= new JLabel("Razon Social:");
        etiRazonSocial.setBounds(30, 70, 200, 30);
        ventProveedor.add(etiRazonSocial);
        
        txtRazonSocial= new JTextField();
        txtRazonSocial.setBounds(130, 70, 200, 30);
        ventProveedor.add(txtRazonSocial);
        
        etiDescripcion= new JLabel("Descripcion:");
        etiDescripcion.setBounds(30, 110, 200, 30);
        ventProveedor.add(etiDescripcion);
        
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 110, 200, 30);
        ventProveedor.add(txtDescripcion);
        
        etiDireccion= new JLabel("Direccion:");
        etiDireccion.setBounds(30, 150, 200, 30);
        ventProveedor.add(etiDireccion);
        
        txtDireccion= new JTextField();
        txtDireccion.setBounds(130, 150, 200, 30);
        ventProveedor.add(txtDireccion);
        
        etiTelefonoo= new JLabel("Telefono:");
        etiTelefonoo.setBounds(30, 190, 200, 30);
        ventProveedor.add(etiTelefonoo);
        
        txtTelefono= new JTextField();
        txtTelefono.setBounds(130, 190, 200, 30);
        ventProveedor.add(txtTelefono);
        
        btnNuevo= new JButton("Nuevo");
        btnNuevo.setBounds(30, 430, 100, 30);
        ventProveedor.add( btnNuevo);
          
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(140, 430, 100, 30);
        ventProveedor.add(btnCargar);
        
        btnModificar= new JButton("Modificar");
        btnModificar.setBounds(250, 430, 100, 30);
        ventProveedor.add( btnModificar);
          
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(360, 430, 100, 30);
        ventProveedor.add(btnConsultar);
        
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(350, 30, 100, 30);
        ventProveedor.add( btnBuscar);
          
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(350, 70, 100, 30);
        ventProveedor.add(btnActualizar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(350, 110, 100, 30);
        ventProveedor.add(btnCancelar);
        
        btnVolver= new JButton("Atras");
        btnVolver.setBounds(360, 480, 100, 30);
        ventProveedor.add(btnVolver);
        
    
        
        ventProveedor.setSize(600,600);
        ventProveedor.setLayout(null);
        ventProveedor.setDefaultCloseOperation(3);
//        ventEmpleado.setResizable(false);
        ventProveedor.setVisible(false);
        ventProveedor.setTitle("PROVEEDORES");
        
        botonCancelar();
        limitar();
        snumeros(txtTelefono);
        sletras(txtDescripcion);
        snumeros(txtIdProveedor);
        snumeros(txtTelefono);
        mayuscula(txtRazonSocial);
        mayuscula(txtTelefono);
        mayuscula(txtDescripcion);
        mayuscula(txtDireccion);
        
        
    } 
    public void botonNuevo(){
    btnNuevo.setEnabled(false);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnCargar.setEnabled(true);
    btnConsultar.setEnabled(false);
    btnModificar.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnVolver.setEnabled(false);
    txtRazonSocial.setEnabled(true);
    txtIdProveedor.setEnabled(true);
    txtTelefono.setEnabled(true);
    txtDescripcion.setEnabled(true);
    txtDireccion.setEnabled(true);
    txtTelefono.setEnabled(true);
    txtIdProveedor.requestFocus();
    
    
    }
    public void botonCancelar(){
    txtIdProveedor.setEnabled(false);
    txtRazonSocial.setEnabled(false);
    txtDescripcion.setEnabled(false);
    txtDireccion.setEnabled(false);
    txtTelefono.setEnabled(false);
    
    
    btnNuevo.setEnabled(true);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnBuscar.setVisible(true);
    btnCargar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnModificar.setEnabled(false);
    btnCancelar.setEnabled(false);
    btnVolver.setEnabled(true);
        
    }
    public void botonBuscarConsulta(){
    txtIdProveedor.setEnabled(true);
    btnBuscar.setVisible(true);
    btnBuscar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnConsultar.setEnabled(false);
    btnVolver.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtIdProveedor.requestFocus();
    
    
    }
    
    public void limpiar(){
    txtIdProveedor.setText("");
    txtRazonSocial.setText("");
    txtTelefono.setText("");
    txtDescripcion.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    }
    
//    public void activarModificar(){
//    txtIdProveedor.setEnabled(true);
//    btnNuevo.setEnabled(false);
//    btnModificar.setEnabled(false);
//    btnConsultar.setEnabled(false);
//    btnVolver.setEnabled(false);
//    btnCancelar.setEnabled(true);
//    btnActualizar.setEnabled(true);
//    txtIdProveedor.requestFocus();
//    }
    public void desbloquear(){
    txtIdProveedor.setEnabled(true);
    txtRazonSocial.setEnabled(true);
    txtDescripcion.setEnabled(true);
    txtDireccion.setEnabled(true);
    txtTelefono.setEnabled(true);
    txtTelefono.setEnabled(true);
    btnBuscar.setEnabled(false);
    btnActualizar.setEnabled(true);
    btnModificar.setEnabled(false);
    }
    
     public void mayuscula(JTextField a){
           a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando          
                 if(Character.isLowerCase(c)){
                   String cad=(""+c).toUpperCase();
                   c=cad.charAt(0);
                   e.setKeyChar(c);
                   }}});}
    public void limitar(){       
        txtIdProveedor.setDocument(new LimitarCaracter(txtIdProveedor,8));
        txtRazonSocial.setDocument(new LimitarCaracter(txtRazonSocial,60));
        txtTelefono.setDocument(new LimitarCaracter(txtTelefono,60));
        txtDescripcion.setDocument(new LimitarCaracter(txtDescripcion,60));
        txtDireccion.setDocument(new LimitarCaracter(txtDireccion,60));
        txtTelefono.setDocument(new LimitarCaracter(txtTelefono, 10));
    }
    
    public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventProveedor.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventProveedor.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    
    public static void main(String [] args){
        PantallaProveedor p= new PantallaProveedor();
        p.ventProveedor.setVisible(true);
      
    }
    
}

    

