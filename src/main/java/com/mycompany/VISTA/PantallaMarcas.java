package VISTA;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PantallaMarcas {

  public JFrame ventMarcas;
    public JLabel etiIdMarca, etiDescripcion;
    public JTextField txtIdMarca, txtDescripcion,txtCodigo;
    public JButton btnNuevo, btnCargar, btnModificar, btnConsultar,btnBuscar,btnActualizar,btnCancelar,btnVolver;
    
    public PantallaMarcas(){
        ventMarcas= new JFrame();
        
        txtCodigo= new JTextField();
        txtCodigo.setBounds(130, 0, 200, 30);
        txtCodigo.setEditable(false);
        ventMarcas.add(txtCodigo);
        
        etiIdMarca= new JLabel("Id Marca:");
        etiIdMarca.setBounds(30, 30, 200, 30);
        ventMarcas.add(etiIdMarca);
        
        txtIdMarca= new JTextField();
        txtIdMarca.setBounds(130, 30, 200, 30);
        ventMarcas.add(txtIdMarca);
        
        etiDescripcion= new JLabel("Descripcion:");
        etiDescripcion.setBounds(30, 70, 200, 30);
        ventMarcas.add(etiDescripcion);
        
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 70, 200, 30);
        ventMarcas.add(txtDescripcion);
        
        
        btnNuevo= new JButton("Nuevo");
        btnNuevo.setBounds(30, 430, 100, 30);
        ventMarcas.add( btnNuevo);
          
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(140, 430, 100, 30);
        ventMarcas.add(btnCargar);
        
        btnModificar= new JButton("Modificar");
        btnModificar.setBounds(250, 430, 100, 30);
        ventMarcas.add( btnModificar);
          
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(360, 430, 100, 30);
        ventMarcas.add(btnConsultar);
        
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(350, 30, 100, 30);
        ventMarcas.add( btnBuscar);
          
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(350, 70, 100, 30);
        ventMarcas.add(btnActualizar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(350, 110, 100, 30);
        ventMarcas.add(btnCancelar);
        
        btnVolver= new JButton("Atras");
        btnVolver.setBounds(360, 480, 100, 30);
        ventMarcas.add(btnVolver);
        
    
        
        ventMarcas.setSize(600,600);
        ventMarcas.setLayout(null);
        ventMarcas.setDefaultCloseOperation(3);
//        ventEmpleado.setResizable(false);
        ventMarcas.setVisible(false);
        ventMarcas.setTitle("Marcas");
        
        botonCancelar();
        limitar();
        sletras(txtDescripcion);
        snumeros(txtIdMarca);
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
    btnVolver.setEnabled(false);
    txtDescripcion.setEnabled(true);
    txtIdMarca.setEnabled(true);
    txtIdMarca.requestFocus();
    
    
    }
    public void botonCancelar(){
    txtIdMarca.setEnabled(false);
    txtDescripcion.setEnabled(false);
    
    txtIdMarca.setText("");
    txtDescripcion.setText("");
    
    btnNuevo.setEnabled(true);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnBuscar.setVisible(true);
    btnCargar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnModificar.setEnabled(true);
    btnCancelar.setEnabled(false);
    btnVolver.setEnabled(true);
        
    }
    public void botonBuscarConsulta(){
    txtIdMarca.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnVolver.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtIdMarca.requestFocus();
    
    
    }
    
    public void limpiar(){
    txtIdMarca.setText("");
    txtDescripcion.setText("");
    }
    
    public void activarBuscar(){
    txtIdMarca.setEnabled(true);
    btnBuscar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnConsultar.setEnabled(false);
    btnVolver.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtIdMarca.requestFocus();
    }
    public void desbloquear(){
    txtIdMarca.setEnabled(true);
    txtDescripcion.setEnabled(true);
    btnBuscar.setEnabled(false);
    btnActualizar.setEnabled(true);
    btnModificar.setEnabled(false);
    txtCodigo.setText(txtIdMarca.getText());
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
        txtIdMarca.setDocument(new LimitarCaracter(txtIdMarca,8));
        txtDescripcion.setDocument(new LimitarCaracter(txtDescripcion,60));
    }
    
    public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventMarcas.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventMarcas.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    
    public static void main(String [] args){
        PantallaMarcas p= new PantallaMarcas();
        p.ventMarcas.setVisible(true);
      
    }
    
}

    

    

