package VISTA;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PantallaUsuario {
    public JFrame ventanaUsuario;
    public JLabel etiUsua,etiNom,etiApe,etiDni,etiPregSeguridad,etiResp,etiContra, etiConContra,etiFecNac, etiTipoUsuario;
    public JTextField txtIdUsuario,txtNom,txtApe,txtDni,txtPreg,txtResp,txtCodigo,txtFecha;
    public JPasswordField txtContra,txtConContra;
    public JButton btnBuscar,btnCancelar,btnCargar,btnConsultar,btnActualizar,btnNRegistro,
            btnEliminar, btnVolver,btnRecuperar,btnCancelarRecu,btnGuardarCambiosUsuarios;
    public JComboBox cb;
    public JDateChooser fechaNacimiento;
    public int opcion;

    public PantallaUsuario() {
        
        ventanaUsuario= new JFrame();
        
        btnNRegistro= new JButton("Nuevo");
        btnNRegistro.setBounds(20, 480, 100, 30);
        ventanaUsuario.add(btnNRegistro);  
        
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(125, 480, 100, 30);
        ventanaUsuario.add(btnCargar);
        
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(230, 480, 100, 30);
        ventanaUsuario.add(btnConsultar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(335, 480, 100, 30);
        ventanaUsuario.add(btnCancelar);
        
        etiUsua= new JLabel("idUsuario:");
        etiUsua.setBounds(10, 50, 120, 30);
        ventanaUsuario.add(etiUsua);
        
        txtIdUsuario= new JTextField();
        txtIdUsuario.setBounds(140, 50, 250, 30);
        ventanaUsuario.add(txtIdUsuario);
                
        etiNom= new JLabel("Nombre:");
        etiNom.setBounds(10, 90, 120, 30);
        ventanaUsuario.add(etiNom);
        
        txtNom= new JTextField();
        txtNom.setBounds(140, 90, 250, 30);
        ventanaUsuario.add(txtNom);
        
        etiApe= new JLabel("Apellido:");
        etiApe.setBounds(10, 130, 120, 30);
        ventanaUsuario.add(etiApe);
        
        txtApe= new JTextField();
        txtApe.setBounds(140, 130, 250, 30);
        ventanaUsuario.add(txtApe);
        
        etiDni= new JLabel("Dni:");
        etiDni.setBounds(10, 170, 120, 30);
        ventanaUsuario.add(etiDni);
        
        txtDni= new JTextField(6);
        txtDni.setBounds(140, 170, 250, 30);
        ventanaUsuario.add(txtDni);
                
        etiPregSeguridad= new JLabel("Pregunta:");
        etiPregSeguridad.setBounds(10, 210, 120, 30);
        ventanaUsuario.add(etiPregSeguridad);
        
        txtPreg= new JTextField();
        txtPreg.setBounds(140, 210, 250, 30);
        ventanaUsuario.add(txtPreg);
        
        etiResp= new JLabel("Respuesta:");
        etiResp.setBounds(10, 250, 120, 30);
        ventanaUsuario.add(etiResp);
        
        txtResp= new JPasswordField();
        txtResp.setBounds(140, 250, 250, 30);
        ventanaUsuario.add(txtResp);
        
        etiContra= new JLabel("Contraseña:");
        etiContra.setBounds(10, 290, 120, 30);
        ventanaUsuario.add(etiContra);
        
        txtContra= new JPasswordField();
        txtContra.setBounds(140, 290, 250, 30);
        ventanaUsuario.add(txtContra);
        
        etiConContra= new JLabel("Confirmar Contraseña:");
        etiConContra.setBounds(10, 330, 140, 30);
        ventanaUsuario.add(etiConContra);
        
        txtConContra= new JPasswordField();
        txtConContra.setBounds(140, 330, 250, 30);
        ventanaUsuario.add(txtConContra);
        
        fechaNacimiento= new JDateChooser();
        fechaNacimiento.setBounds(140, 370, 250, 30);
        ventanaUsuario.add(fechaNacimiento);
        
        txtFecha= new JTextField();
        txtFecha.setBounds(440, 370, 250, 30);
        txtFecha.setVisible(false);
        ventanaUsuario.add(txtFecha);
        
        etiFecNac= new JLabel("Fecha Nacimiento:");
        etiFecNac.setBounds(10, 370, 140, 30);
        ventanaUsuario.add(etiFecNac);
        
        etiTipoUsuario= new JLabel("Tipo Usuario:");
        etiTipoUsuario.setBounds(10, 410, 140, 30);
        ventanaUsuario.add(etiTipoUsuario);
        
        cb= new JComboBox();
        cb.addItem("<Seleccione>");
        cb.addItem("Usuario");
        cb.addItem("Administrador");
        cb.setBounds(140, 410, 140, 30);
        ventanaUsuario.add(cb);
        
        txtCodigo= new JTextField();
        txtCodigo.setBounds(580, 40, 100, 30);
        txtCodigo.setVisible(false);
        ventanaUsuario.add(txtCodigo);
         
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(400, 50, 100, 30);
        ventanaUsuario.add(btnBuscar);
        
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(400, 90, 100, 30);
        ventanaUsuario.add(btnActualizar);
        
        btnEliminar= new JButton("Eliminar");
        btnEliminar.setBounds(400, 130, 100, 30);
        ventanaUsuario.add(btnEliminar);
        
        btnGuardarCambiosUsuarios= new JButton("Actualizar");
        btnGuardarCambiosUsuarios.setBounds(125, 480, 100, 30);
        ventanaUsuario.add(btnGuardarCambiosUsuarios);
                
        btnVolver= new JButton("Volver Atras");
        btnVolver.setBounds(550, 500, 130, 30);
        ventanaUsuario.add(btnVolver);
        
        btnRecuperar= new JButton("Recuperar Cuenta");
        btnRecuperar.setBounds(140, 500, 150, 30);
        ventanaUsuario.add(btnRecuperar);
        
        btnCancelarRecu= new JButton("Cancelar");
        btnCancelarRecu.setBounds(360, 500, 100, 30);
        btnCancelarRecu.setVisible(false);
        ventanaUsuario.add(btnCancelarRecu);
        
        sNumeros(txtIdUsuario);
        sNumeros(txtDni);
        sLetras(txtPreg);
        sLetras(txtNom);
        sLetras(txtApe);
        mayuscula(txtNom);
        mayuscula(txtApe);
        mayuscula(txtPreg);
        mayuscula(txtResp);
        mayuscula(txtContra);
        mayuscula(txtConContra);
        limitar();
        
        ventanaUsuario.setSize(700, 600);
        ventanaUsuario.setLayout(null);
        ventanaUsuario.setResizable(false);
        ventanaUsuario.setTitle("USUARIOS");
        ventanaUsuario.setVisible(false);  
        ventanaUsuario.setDefaultCloseOperation(3);
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
    
    public void ocultarBotones(){
        btnBuscar.setVisible(false);
        btnCancelar.setVisible(false);
        btnActualizar.setVisible(false);
        btnNRegistro.setVisible(false);
        btnCargar.setVisible(false);
        btnConsultar.setVisible(false);
        btnEliminar.setVisible(false);
        btnGuardarCambiosUsuarios.setVisible(true);    
    }
    
    public void mostrarBotones(){
        btnBuscar.setVisible(true);
        btnCancelar.setVisible(true);
        btnActualizar.setVisible(true);
        btnNRegistro.setVisible(true);
        btnCargar.setVisible(true);
        btnConsultar.setVisible(true);
        btnEliminar.setVisible(true);    
    }
    
    public void desactivarUsuario(){    
        txtIdUsuario.setEnabled(false);
        txtNom.setEnabled(false);
        txtApe.setEnabled(false);
        txtDni.setEnabled(false);
        txtPreg.setEnabled(false);
        txtResp.setEnabled(false);
        cb.setEnabled(false);
        txtNom.setEnabled(false);
        txtContra.setEnabled(false);
        txtConContra.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);  
        btnCargar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNRegistro.setEnabled(true);
        btnConsultar.setEnabled(true);
        fechaNacimiento.setDate(null);
        ventanaUsuario.setTitle("USUARIOS");
        btnVolver.setEnabled(true);
        btnGuardarCambiosUsuarios.setVisible(false);
        fechaNacimiento.setEnabled(false);
    }
    
    public void activarUsuario(){    
        txtIdUsuario.setEnabled(true);
        txtNom.setEnabled(true);
        txtApe.setEnabled(true);
        txtDni.setEnabled(true);
        cb.setEnabled(true);
        txtNom.setEnabled(true);
        btnBuscar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnConsultar.setEnabled(false);
        btnNRegistro.setEnabled(false);
        btnCargar.setEnabled(true);
        btnVolver.setEnabled(false);
        btnGuardarCambiosUsuarios.setVisible(false);
        fechaNacimiento.setEnabled(true);
    }
    
    public void activarConsulta(){
        txtIdUsuario.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnNRegistro.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnVolver.setEnabled(false);
        txtPreg.setText("");
        txtResp.setText("");
        txtContra.setText("");
        txtConContra.setText("");
        btnVolver.setEnabled(false);
        btnGuardarCambiosUsuarios.setVisible(false);
    }
    
     public void limitar(){        
        txtContra.setDocument(new LimitarCaracter(txtContra,30));
        txtNom.setDocument(new LimitarCaracter(txtNom, 45));
        txtApe.setDocument(new LimitarCaracter(txtApe, 45));
        txtDni.setDocument(new LimitarCaracter(txtDni, 8));
        txtIdUsuario.setDocument(new LimitarCaracter(txtIdUsuario, 8));            
   } 
     
    public void limpiar(){
        txtNom.setText("");
        txtApe.setText("");
        txtDni.setText("");
        txtContra.setText("");
        txtConContra.setText("");
        txtPreg.setText("");
        txtResp.setText("");
        fechaNacimiento.setDate(null);
        cb.setSelectedIndex(0);
        txtIdUsuario.setText("");
        btnGuardarCambiosUsuarios.setVisible(false);   
    }
    
    public void sLetras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
               @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventanaUsuario.getToolkit().beep();
                   e.consume();//no permite ingresr numero
       }}});}
       
    public void sNumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
               @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventanaUsuario.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
  

public static void main(String [] args){
   PantallaUsuario c= new PantallaUsuario();
   c.ventanaUsuario.setVisible(true);
    

}}

