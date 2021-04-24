
package VISTA;

//import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PantallaEmpleado{
    
    public JFrame ventEmpleado;
    public JLabel etiIdEmpleado, etiApellido, etiPrimerNombre, etiSegundoNombre, etiFecNacimiento, 
            etiJefe, etiDescripcion, etiTelefono,etiFechaAlta,etiFechaBaja;
    public JTextField txtIdEmpleado, txtApellido, txtPrimerNombre, txtSegundoNombre,
            txtJefe, txtDescripcion, txtTelefono,txtCodigo;
    public JButton btnNuevo, btnCargar, btnModificar, btnConsultar,btnBuscar,btnBuscarConsulta,btnActualizar,btnCancelar,btnVolver;
    
      public JDateChooser fechaNacimiento,fechaAlta,fechaBaja;
      
    int xet=30;
    int xtxt=130;
    public PantallaEmpleado(){
        ventEmpleado= new JFrame();
        
        txtCodigo= new JTextField();
        txtCodigo.setBounds(130, 0, 200, 30);
        txtCodigo.setEditable(false);
        ventEmpleado.add(txtCodigo);
        
        etiIdEmpleado= new JLabel("Id Empleado");
        etiIdEmpleado.setBounds(30, 30, 200, 30);
        ventEmpleado.add(etiIdEmpleado);
        
        txtIdEmpleado= new JTextField();
        txtIdEmpleado.setBounds(130, 30, 200, 30);
        ventEmpleado.add(txtIdEmpleado);
        
        etiApellido= new JLabel("Apellido:");
        etiApellido.setBounds(30, 70, 200, 30);
        ventEmpleado.add( etiApellido);
        
        txtApellido= new JTextField();
        txtApellido.setBounds(130, 70, 200, 30);
        ventEmpleado.add(txtApellido);
        
        etiPrimerNombre= new JLabel("Primer Nombre:");
        etiPrimerNombre.setBounds(30, 110, 200, 30);
        ventEmpleado.add(etiPrimerNombre);
        
        txtPrimerNombre= new JTextField();
        txtPrimerNombre.setBounds(130, 110, 200, 30);
        ventEmpleado.add(txtPrimerNombre);
        
        etiSegundoNombre= new JLabel("Segundo Nombre:");
        etiSegundoNombre.setBounds(30, 150, 200, 30);
        ventEmpleado.add(etiSegundoNombre);
        
        txtSegundoNombre= new JTextField();
        txtSegundoNombre.setBounds(130, 150, 200, 30);
        ventEmpleado.add(txtSegundoNombre);
        
        etiFecNacimiento= new JLabel("Fecha Nacimiento:");
        etiFecNacimiento.setBounds(30, 190, 200, 30);
        ventEmpleado.add( etiFecNacimiento);
        
        fechaNacimiento= new JDateChooser();
        fechaNacimiento.setBounds(130, 190, 200, 30);
        ventEmpleado.add(fechaNacimiento);
        
        etiJefe= new JLabel("Subcontratista:");
        etiJefe.setBounds(30, 230, 200, 30);
        ventEmpleado.add( etiJefe);
        
        txtJefe= new JTextField();
        txtJefe.setBounds(130, 230, 200, 30);
        ventEmpleado.add(txtJefe);
        
        etiDescripcion= new JLabel("Descripcion");
        etiDescripcion.setBounds(30, 270, 200, 30);
        ventEmpleado.add( etiDescripcion);
          
        txtDescripcion= new JTextField();
        txtDescripcion.setBounds(130, 270, 200, 30);
        ventEmpleado.add(txtDescripcion);
        
        etiTelefono= new JLabel("Telefono");
        etiTelefono.setBounds(30, 310, 200, 30);
        ventEmpleado.add( etiTelefono);
          
        txtTelefono= new JTextField();
        txtTelefono.setBounds(130, 310, 200, 30);
        ventEmpleado.add(txtTelefono);
        
        etiFechaAlta= new JLabel("Fecha Alta:");
        etiFechaAlta.setBounds(30, 350, 200, 30);
        ventEmpleado.add( etiFechaAlta);
        
        fechaAlta= new JDateChooser();
        fechaAlta.setBounds(130, 350, 200, 30);
        ventEmpleado.add(fechaAlta);
        
        etiFechaBaja= new JLabel("Fecha Baja:");
        etiFechaBaja.setBounds(30, 390, 200, 30);
        ventEmpleado.add( etiFechaBaja);
        
        fechaBaja= new JDateChooser();
        fechaBaja.setBounds(130, 390, 200, 30);
        ventEmpleado.add(fechaBaja);
        
        btnNuevo= new JButton("Nuevo");
        btnNuevo.setBounds(30, 430, 100, 30);
        ventEmpleado.add( btnNuevo);
          
        btnCargar= new JButton("Cargar");
        btnCargar.setBounds(140, 430, 100, 30);
        ventEmpleado.add(btnCargar);
        
        btnModificar= new JButton("Modificar");
        btnModificar.setBounds(250, 430, 100, 30);
        ventEmpleado.add( btnModificar);
          
        btnConsultar= new JButton("Consultar");
        btnConsultar.setBounds(360, 430, 100, 30);
        ventEmpleado.add(btnConsultar);
        
        btnBuscar= new JButton("Buscar");
        btnBuscar.setBounds(350, 30, 100, 30);
        ventEmpleado.add( btnBuscar);
        
        btnBuscarConsulta = new JButton("Buscar Consulta");
        btnBuscarConsulta.setBounds(450, 30, 130, 30);
        ventEmpleado.add(btnBuscarConsulta);
          
        btnActualizar= new JButton("Actualizar");
        btnActualizar.setBounds(350, 70, 100, 30);
        ventEmpleado.add(btnActualizar);
        
        btnCancelar= new JButton("Cancelar");
        btnCancelar.setBounds(350, 110, 100, 30);
        ventEmpleado.add(btnCancelar);
        
        btnVolver= new JButton("Atras");
        btnVolver.setBounds(360, 480, 100, 30);
        ventEmpleado.add(btnVolver);
        
    
        
        ventEmpleado.setSize(600,600);
        ventEmpleado.setLayout(null);
        ventEmpleado.setDefaultCloseOperation(3);
//        ventEmpleado.setResizable(false);
        ventEmpleado.setVisible(false);
        ventEmpleado.setTitle("EMPLEADOS");
        
        botonCancelar();
        limitar();
        sletras(txtApellido);
        sletras(txtJefe);
        sletras(txtPrimerNombre);
        sletras(txtSegundoNombre);
        snumeros(txtIdEmpleado);
        snumeros(txtTelefono);
        mayuscula(txtApellido);
        mayuscula(txtJefe);
        mayuscula(txtPrimerNombre);
        mayuscula(txtSegundoNombre);
        mayuscula(txtDescripcion);
        
        
    } 
    public void botonNuevo(){
//    txtIdEmpleado.setEnabled(false);
//    txtApellido.setEnabled(false);
//    txtPrimerNombre.setEnabled(false);
//    txtSegundoNombre.setEnabled(false);
//    fechaNacimiento.setEnabled(false);
//    txtJefe.setEnabled(false);
//    txtDescripcion.setEnabled(false);
//    txtTelefono.setEnabled(false);
    
    btnNuevo.setEnabled(false);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnBuscarConsulta.setEnabled(false);
    btnCargar.setEnabled(true);
    btnConsultar.setEnabled(false);
    btnModificar.setEnabled(false);
    btnCancelar.setEnabled(true);
    btnVolver.setEnabled(false);
    fechaAlta.setEnabled(true);
    fechaBaja.setEnabled(true);
    fechaNacimiento.setEnabled(true);
    txtApellido.setEnabled(true);
    txtDescripcion.setEnabled(true);
    txtIdEmpleado.setEnabled(true);
    txtJefe.setEnabled(true);
    txtPrimerNombre.setEnabled(true);
    txtSegundoNombre.setEnabled(true);
    txtTelefono.setEnabled(true);
    txtIdEmpleado.requestFocus();
    
    
    }
    public void botonCancelar(){
    txtIdEmpleado.setEnabled(false);
    txtApellido.setEnabled(false);
    txtPrimerNombre.setEnabled(false);
    txtSegundoNombre.setEnabled(false);
    fechaNacimiento.setEnabled(false);
    txtJefe.setEnabled(false);
    txtDescripcion.setEnabled(false);
    txtTelefono.setEnabled(false);
    fechaAlta.setEnabled(false);
    fechaBaja.setEnabled(false);
    
    btnNuevo.setEnabled(true);
    btnActualizar.setEnabled(false);
    btnBuscar.setEnabled(false);
    btnBuscar.setVisible(true);
    btnBuscarConsulta.setEnabled(false);
    btnBuscarConsulta.setVisible(false);
    btnCargar.setEnabled(false);
    btnConsultar.setEnabled(true);
    btnModificar.setEnabled(true);
    btnCancelar.setEnabled(false);
    btnVolver.setEnabled(true);
        
    }
    public void botonBuscarConsulta(){
    txtIdEmpleado.setEnabled(true);
    btnBuscar.setVisible(false);
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnConsultar.setEnabled(false);
    btnVolver.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtIdEmpleado.requestFocus();
    
    
    }
    
    public void limpiar(){
    txtIdEmpleado.setText("");
    txtApellido.setText("");
    txtDescripcion.setText("");
    txtJefe.setText("");
    txtPrimerNombre.setText("");
    txtSegundoNombre.setText("");
    txtTelefono.setText("");
    fechaNacimiento.setDate(null);
    fechaAlta.setDate(null);
    fechaBaja.setDate(null);
    }
    
    public void activarBuscar(){
    txtIdEmpleado.setEnabled(true);
    btnBuscar.setEnabled(true);
    btnNuevo.setEnabled(false);
    btnModificar.setEnabled(false);
    btnConsultar.setEnabled(false);
    btnVolver.setEnabled(false);
    btnCancelar.setEnabled(true);
    txtIdEmpleado.requestFocus();
    btnBuscarConsulta.setVisible(false);
    }
    public void desbloquear(){
    txtIdEmpleado.setEnabled(true);
    txtApellido.setEnabled(true);
    txtPrimerNombre.setEnabled(true);
    txtSegundoNombre.setEnabled(true);
    fechaNacimiento.setEnabled(true);
    txtJefe.setEnabled(true);
    txtDescripcion.setEnabled(true);
    txtTelefono.setEnabled(true);
    fechaAlta.setEnabled(true);
    fechaBaja.setEnabled(true);
    btnBuscar.setEnabled(false);
    btnActualizar.setEnabled(true);
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
        txtIdEmpleado.setDocument(new LimitarCaracter(txtIdEmpleado,8));
        txtApellido.setDocument(new LimitarCaracter(txtApellido,60));
        txtJefe.setDocument(new LimitarCaracter(txtJefe,60));
        txtDescripcion.setDocument(new LimitarCaracter(txtDescripcion, 60));
        txtPrimerNombre.setDocument(new LimitarCaracter(txtPrimerNombre,60));
        txtSegundoNombre.setDocument(new LimitarCaracter(txtSegundoNombre,60));
        txtTelefono.setDocument(new LimitarCaracter(txtTelefono, 10));
    }
    
    public void sletras(JTextField a){ //el q vamos a usar 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando  
               if(!Character.isLetter(c) && !Character.isSpaceChar(c)){
                   ventEmpleado.getToolkit().beep();
                   e.consume();//no permite ingresr numero
      }}});}
       
    public void snumeros(JTextField a){ // el tipo dobjeto que vamos a usar + una variable 
           a.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();//variable que estemos ingresando
                 if(!Character.isDigit(c)){
                   ventEmpleado.getToolkit().beep();
                   e.consume();//no permite ingresar letras
      }}});}
    
    public static void main(String [] args){
        PantallaEmpleado p= new PantallaEmpleado();
        p.ventEmpleado.setVisible(true);
      
    }
    
}
