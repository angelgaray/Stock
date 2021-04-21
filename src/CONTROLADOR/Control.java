package CONTROLADOR;

import MODELO.ConsultaEmpleado;
import MODELO.Empleado;
import MODELO.Marcas;
import MODELO.Producto;
import MODELO.Proveedor;
import MODELO.categoriaProductos;
import MODELO.consultaCategoriaProductos;
import MODELO.consultaMarcas;
import MODELO.consultaProducto;
import MODELO.consultaProveedor;
import VISTA.PantallaCategoriaProductos;
import VISTA.PantallaEmpleado;
import VISTA.PantallaEntradasSalidas;
import VISTA.PantallaMarcas;
import VISTA.PantallaPrincipal;
import VISTA.PantallaProductos;
import VISTA.PantallaProveedor;
import VISTA.PantallaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Control implements ActionListener {

  private final Empleado modEmpleado;
  private final ConsultaEmpleado conEmpleado;
  private final PantallaEmpleado pEmpleado;
//   clases de Productos
  
  private final Producto modProducto;
  private final consultaProducto conProducto;
  private final PantallaProductos pProductos;
  
  private final categoriaProductos modCateProducto;
  private final consultaCategoriaProductos conCateProducto;
  private final PantallaCategoriaProductos pCateProductos;
  
  private final PantallaEntradasSalidas pEtradasSalidas;
  
  private final PantallaMarcas pMarcas;
  private final Marcas modMarcas;
  private final consultaMarcas conMarcas;
  
  private final PantallaProveedor pProveedor;
  private final Proveedor modProveedor;
  private final consultaProveedor conProveedor;
  
  private final PantallaUsuario pUsuarios;
  
    
    ArrayList<Object[]> data;
    ArrayList<Object[]> data2;
  
  private final PantallaPrincipal pPrincipal;
    

    public Control() {
//         instancias de Empleado
        modEmpleado= new Empleado();
        conEmpleado= new ConsultaEmpleado();
        pEmpleado= new PantallaEmpleado();
        
        
//        instancias de PantallaPrincipal
        pPrincipal= new PantallaPrincipal();
        
//        Instancias Productos
        modProducto= new Producto();
        conProducto= new consultaProducto();
        pProductos= new PantallaProductos();
        
//        Instancias de Categorias Productos
        
        pCateProductos= new PantallaCategoriaProductos();
        modCateProducto= new categoriaProductos();
        conCateProducto= new consultaCategoriaProductos();
        
        //        Instancias de EntradasSalidas
        
        pEtradasSalidas= new PantallaEntradasSalidas();
        
        //        Instancias de Marcas
        
        pMarcas= new PantallaMarcas();
        modMarcas= new Marcas();
        conMarcas= new consultaMarcas();
        
        
        //        Instancias de Proveedor
        pProveedor= new PantallaProveedor();
        modProveedor= new Proveedor();
        conProveedor= new consultaProveedor();
        
       
        
        // instancias de Usuario
//        modUsuario = new Usuario();
//        conUsuario = new ConsultaUsuarios();
        pUsuarios = new PantallaUsuario();
//
//        instancia Pantallalogin
//        pLog = new PantallaLogin();


//            ESCUChADOR DE EVENTOS DE PANTALLAPRINCIPAL
         this.pPrincipal.btnEmpleados.addActionListener(this);
         this.pPrincipal.btnProductos.addActionListener(this);
         this.pPrincipal.btnCategoriaProductos.addActionListener(this);
         this.pPrincipal.btnMovimientosProductos.addActionListener(this);
         this.pPrincipal.btnMarcas.addActionListener(this);
         this.pPrincipal.btnProveedores.addActionListener(this);
         this.pPrincipal.btnUsuarios.addActionListener(this);
         

//          ESCUChADOR DE EVENTOS DE PANTALLAEMPLEADO
         this.pEmpleado.btnCargar.addActionListener(this);
         this.pEmpleado.btnCancelar.addActionListener(this);
         this.pEmpleado.btnNuevo.addActionListener(this);
         this.pEmpleado.btnVolver.addActionListener(this);
         this.pEmpleado.btnModificar.addActionListener(this);
         this.pEmpleado.btnBuscar.addActionListener(this);
          this.pEmpleado.btnActualizar.addActionListener(this);
          this.pEmpleado.btnConsultar.addActionListener(this);
         this.pEmpleado.btnBuscarConsulta.addActionListener(this);
         
  //       esCUCHADOR DE EVETOS PATALLAPRODUCTOS
         
         this.pProductos.btnCancelar.addActionListener(this);
         this.pProductos.btnNuevo.addActionListener(this);
         this.pProductos.btnActualizar.addActionListener(this);
         this.pProductos.btnBuscar.addActionListener(this);
         this.pProductos.btnCargar.addActionListener(this);
         this.pProductos.btnConsultar.addActionListener(this);
         this.pProductos.btnModificar.addActionListener(this);
         this.pProductos.btnAtras.addActionListener(this);
         this.pProductos.categoria.addActionListener(this);
         
    //     ESCUCADOR DE EVENTOS PANTALLA CATEGORIA PRODUCTOS
         
         this.pCateProductos.btnCancelar.addActionListener(this);
         this.pCateProductos.btnNuevo.addActionListener(this);
         this.pCateProductos.btnActualizar.addActionListener(this);
         this.pCateProductos.btnBuscar.addActionListener(this);
         this.pCateProductos.btnCargar.addActionListener(this);
         this.pCateProductos.btnConsultar.addActionListener(this);
         this.pCateProductos.btnModificar.addActionListener(this);
         this.pCateProductos.btnAtras.addActionListener(this);
         
    //   ESCUCHADOR DE EVENTOS PANTALLA ENTRADAS-SALIDAS PRODUCTOS
        this.pEtradasSalidas.btnAtras.addActionListener(this);
        this.pEtradasSalidas.ItemEntradaProducto.addActionListener(this);
        this.pEtradasSalidas.btnBBuscar.addActionListener(this);
        this.pEtradasSalidas.btnCancelar.addActionListener(this);
        
    //   ESCUCHADOR DE EVENTOS PANTALLA Marcas
        this.pMarcas.btnVolver.addActionListener(this);
        this.pMarcas.btnActualizar.addActionListener(this);
        this.pMarcas.btnBuscar.addActionListener(this);
        this.pMarcas.btnCancelar.addActionListener(this);
        this.pMarcas.btnCargar.addActionListener(this);
        this.pMarcas.btnConsultar.addActionListener(this);
        this.pMarcas.btnModificar.addActionListener(this);
        this.pMarcas.btnNuevo.addActionListener(this);
        
        
         //   ESCUCHADOR DE EVENTOS PANTALLA PROVEEDORES
        this.pProveedor.btnVolver.addActionListener(this);
        this.pProveedor.btnActualizar.addActionListener(this);
        this.pProveedor.btnBuscar.addActionListener(this);
        this.pProveedor.btnCancelar.addActionListener(this);
        this.pProveedor.btnCargar.addActionListener(this);
        this.pProveedor.btnConsultar.addActionListener(this);
        this.pProveedor.btnModificar.addActionListener(this);
        this.pProveedor.btnNuevo.addActionListener(this);
        
         //   ESCUCHADOR DE EVENTOS PANTALLA USUARIOS
        this.pUsuarios.btnVolver.addActionListener(this);
         
         
         

//      //   Escuchador de eventos de PantallaUsuario
//        this.pUsu.btnCargar.addActionListener(this);
//        this.pUsu.btnBuscar.addActionListener(this);
//        this.pUsu.btnConsultar.addActionListener(this);
//        this.pUsu.btnNRegistro.addActionListener(this);
//        this.pUsu.btnCancelar.addActionListener(this);
//        this.pUsu.btnActualizar.addActionListener(this);
//        this.pUsu.btnEliminar.addActionListener(this);
//        this.pUsu.btnVolver.addActionListener(this);
//        this.pUsu.btnGuardarCambiosUsuarios.addActionListener(this);
//        this.pUsu.btnRecuperar.addActionListener(this);
//        this.pUsu.btnCancelarRecu.addActionListener(this);
//
//        //Escuchador de eventos de pantallaLogin
//        this.pLog.btnIniciar.addActionListener(this);
//        this.pLog.btnRecuperarSesion.addActionListener(this);
//        this.pLog.btnCancelar.addActionListener(this);

        //Escuchador de eventos PantallaPrincipal
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        
//        Ejecutor de evetos PantallaPrincipal
//        boton Productos 
        
        if(e.getSource().equals(pPrincipal.btnProductos)){
            pProductos.ventProductos.setVisible(true);
            pPrincipal.ventPrincipal.setVisible(false);
            pProductos.botonCancelar();
            
//          conCateProducto.llenarCombo(modCateProducto);
            
          
            pProductos.categoria.addItem(modCateProducto.getDescripcion());
        
            conCateProducto.contar();
            
            pProductos.categoria.removeAllItems();
            pProductos.categoria.addItem("<Seleccione>");

            conCateProducto.cargarCategoriaProductos();

            for (Object arrayCategoria : conCateProducto.arrayCategoria) {
                pProductos.categoria.addItem(arrayCategoria);
            } 
        }
        
        if (e.getSource().equals(pPrincipal.btnEmpleados)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pEmpleado.ventEmpleado.setVisible(true);
        }
        
        if (e.getSource().equals(pPrincipal.btnCategoriaProductos)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pCateProductos.ventCatProductos.setVisible(true);
        }
        if (e.getSource().equals(pPrincipal.btnMovimientosProductos)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pEtradasSalidas.ventEntradaSalidasProductos.setVisible(true);
        }
        
        if (e.getSource().equals(pPrincipal.btnMarcas)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pMarcas.ventMarcas.setVisible(true);
            
        }
        if (e.getSource().equals(pPrincipal.btnProveedores)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pProveedor.ventProveedor.setVisible(true);
        }
        if (e.getSource().equals(pPrincipal.btnUsuarios)) {
            pPrincipal.ventPrincipal.setVisible(false);
            pUsuarios.ventanaUsuario.setVisible(true);
            
        }
        
        
//        Ejecutor de evetos PantallaEmpleado
//        boton cargar pantalla Empleado
        
        if(e.getSource().equals(pEmpleado.btnCargar)){
            
            System.err.println("FBBHFBFB");
            SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");

            if (!pEmpleado.txtIdEmpleado.getText().isEmpty() && !pEmpleado.txtApellido.getText().isEmpty()
                    && !pEmpleado.txtPrimerNombre.getText().isEmpty() && !pEmpleado.txtSegundoNombre.getText().isEmpty()
                    && pEmpleado.fechaNacimiento.getDate() != null && !pEmpleado.txtJefe.getText().isEmpty()
                    && !pEmpleado.txtDescripcion.getText().isEmpty() && !pEmpleado.txtTelefono.getText().isEmpty()
                    && pEmpleado.fechaAlta.getDate()!=null ) {
                
                modEmpleado.setIdEmpleado(Integer.parseInt(pEmpleado.txtIdEmpleado.getText()));
                modEmpleado.setApellido(pEmpleado.txtApellido.getText());
                modEmpleado.setNombre(pEmpleado.txtPrimerNombre.getText());
                modEmpleado.setSegundoNombre(pEmpleado.txtSegundoNombre.getText());
                 String i = formato.format(pEmpleado.fechaNacimiento.getDate());
                modEmpleado.setFechaNacimiento(i);
                modEmpleado.setJefe(pEmpleado.txtJefe.getText());
                modEmpleado.setDescripcion(pEmpleado.txtDescripcion.getText());
                modEmpleado.setTelefono(pEmpleado.txtTelefono.getText());
                String l = formato.format(pEmpleado.fechaAlta.getDate());
                modEmpleado.setFechaAlta(l);
                if(pEmpleado.fechaBaja.getDate()!=null){
                String m = formato.format(pEmpleado.fechaBaja.getDate());
                modEmpleado.setFechaBaja(m);
                }else{
                     modEmpleado.setFechaBaja("1900-01-01");
                }              
                if (conEmpleado.registrar(modEmpleado)) {

                    JOptionPane.showMessageDialog(pEmpleado.ventEmpleado, "Guardado Correctamente", "Confirmacion", 1);
                   pEmpleado.limpiar();
                     
                } else {
                    JOptionPane.showMessageDialog(pEmpleado.ventEmpleado, "Error al Guardar", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(this.pEmpleado.ventEmpleado, "Todos los campos Son Obligatorios", "Error", 0);
            }
            
            
        }
      //   BOTON CANCELAR PANTALLA EMPLEADO
        if(e.getSource().equals(pEmpleado.btnCancelar)){
            pEmpleado.botonCancelar();
            pEmpleado.limpiar();
        }
        //BOTON NNEVO PANTALLA EMPLEADO
        if(e.getSource().equals(pEmpleado.btnNuevo)){
            pEmpleado.botonNuevo();
        }
        //BOTN VOLVER PANTALLA EMPLEADO
         if(e.getSource().equals(pEmpleado.btnVolver)){
            pEmpleado.ventEmpleado.setVisible(false);
            pPrincipal.ventPrincipal.setVisible(true);
        }
          //BOTON MODIFICAR PANTALLA EMPLEADO
         if(e.getSource().equals(pEmpleado.btnModificar)){
            pEmpleado.activarBuscar();
        }
         
         //BOTON BUSCAR PANTALLA EMPLEADO
         if(e.getSource().equals(pEmpleado.btnBuscar)){
             if (!pEmpleado.txtIdEmpleado.getText().isEmpty()) {
                 
                 modEmpleado.setIdEmpleado(Integer.parseInt(pEmpleado.txtIdEmpleado.getText()));
                 if(conEmpleado.buscar(modEmpleado)){
                     JOptionPane.showMessageDialog(null, "Registro Localizado");
                     SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
                     pEmpleado.txtApellido.setText(modEmpleado.getApellido());
                     pEmpleado.txtPrimerNombre.setText(modEmpleado.getNombre());
                     pEmpleado.txtSegundoNombre.setText(modEmpleado.getSegundoNombre());
////////////                      dfdd
                     pEmpleado.fechaNacimiento.setDate(Date.valueOf(modEmpleado.getFechaNacimiento()));
                     pEmpleado.txtJefe.setText(modEmpleado.getJefe());
                     pEmpleado.txtDescripcion.setText(modEmpleado.getDescripcion());
                     pEmpleado.txtTelefono.setText(modEmpleado.getTelefono());
                     
                     pEmpleado.fechaAlta.setDate(Date.valueOf(modEmpleado.getFechaAlta()));
                     if (modEmpleado.getFechaBaja()!=null) {
                          pEmpleado.fechaBaja.setDate(Date.valueOf(modEmpleado.getFechaBaja()));
                     
                     }
                     pEmpleado.txtCodigo.setText(Integer.toString(modEmpleado.getIdEmpleado()));
                     pEmpleado.desbloquear();
                     
                 
             }else{
                     JOptionPane.showMessageDialog(null, "Registro No encontrado");
                 }
        }else{
                 JOptionPane.showMessageDialog(null, "Ingrese idEmpleado","Error",0);
             }
         }
         
         //BOTON ACTUALIZAR DATOS EMPLEADO
         
         if (e.getSource().equals(pEmpleado.btnActualizar)) {
             
             modEmpleado.setIdEmpleado(Integer.parseInt(pEmpleado.txtIdEmpleado.getText()));
             modEmpleado.setApellido(pEmpleado.txtApellido.getText());
             modEmpleado.setNombre(pEmpleado.txtPrimerNombre.getText());
             modEmpleado.setSegundoNombre(pEmpleado.txtSegundoNombre.getText());
              SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
              
             String fN = formato.format(pEmpleado.fechaNacimiento.getDate());
             modEmpleado.setFechaNacimiento((fN));
             modEmpleado.setJefe(pEmpleado.txtJefe.getText());
             modEmpleado.setDescripcion(pEmpleado.txtDescripcion.getText());
             modEmpleado.setTelefono(pEmpleado.txtTelefono.getText());
             String fA = formato.format(pEmpleado.fechaAlta.getDate());
             modEmpleado.setFechaAlta((fA));
              String fB = formato.format(pEmpleado.fechaBaja.getDate());
             modEmpleado.setFechaBaja(fB);
             modEmpleado.setCodigo(Integer.parseInt(pEmpleado.txtCodigo.getText()));
             
             if (conEmpleado.modificar(modEmpleado)) {
                 JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente");
                    pEmpleado.botonCancelar();
                    pEmpleado.limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Modificar");
             }
        }
           // BOTON CONSULTAR PANTALLA EMPLEADO
               if(e.getSource().equals(pEmpleado.btnConsultar)){
                   pEmpleado.btnBuscarConsulta.setEnabled(true);
                   pEmpleado.botonBuscarConsulta();
                   pEmpleado.btnBuscarConsulta.setVisible(true);
               }
               
             //  BOTON BUSCAR CONSULTA PANTALLA EMPLEADO
                if(e.getSource().equals(pEmpleado.btnBuscarConsulta)){
                    
                    if (!pEmpleado.txtIdEmpleado.getText().isEmpty()) {
                 
                 modEmpleado.setIdEmpleado(Integer.parseInt(pEmpleado.txtIdEmpleado.getText()));
                 if(conEmpleado.buscar(modEmpleado)){
                     JOptionPane.showMessageDialog(null, "Registro Localizado");
                     SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
                     pEmpleado.txtApellido.setText(modEmpleado.getApellido());
                     pEmpleado.txtPrimerNombre.setText(modEmpleado.getNombre());
                     pEmpleado.txtSegundoNombre.setText(modEmpleado.getSegundoNombre());
////////////                      dfdd
                     pEmpleado.fechaNacimiento.setDate(Date.valueOf(modEmpleado.getFechaNacimiento()));
                     pEmpleado.txtJefe.setText(modEmpleado.getJefe());
                     pEmpleado.txtDescripcion.setText(modEmpleado.getDescripcion());
                     pEmpleado.txtTelefono.setText(modEmpleado.getTelefono());
                     
                     pEmpleado.fechaAlta.setDate(Date.valueOf(modEmpleado.getFechaAlta()));
                     if (modEmpleado.getFechaBaja()!=null) {
                          pEmpleado.fechaBaja.setDate(Date.valueOf(modEmpleado.getFechaBaja()));
                     
                     }
                     pEmpleado.txtCodigo.setText(Integer.toString(modEmpleado.getIdEmpleado()));
                     
                 
             }else{
                     JOptionPane.showMessageDialog(null, "Registro No encontrado");
                 }
        }
         }
                
               // ejecutor de evetos pantallaProducto
                
                if (e.getSource().equals(pProductos.categoria)) {
                    if (pProductos.categoria.getSelectedIndex()!=0) {
                    
                    JOptionPane.showMessageDialog(null, "Categoria Seleccionada "+pProductos.categoria.getSelectedItem());

                    if( pProductos.categoria.getSelectedItem()!=null){
                        if(pProductos.categoria.getSelectedIndex()!=0 ){
                    modCateProducto.setDescripcion(pProductos.categoria.getSelectedItem().toString());
                    if(conCateProducto.buscarIdCategoria(modCateProducto)){
                        System.out.println(modCateProducto.getIdCategoria());
                        pProductos.txtIdProducto.setText("");
                        pProductos.txtIdCategoria.setText(String.valueOf(modCateProducto.getIdCategoria()));
                        
                    }}
                    }}}
                if(e.getSource().equals(pProductos.btnCancelar)){
                   
                    pProductos.botonCancelar();
                    pProductos.categoria.setSelectedIndex(0);
                }
                
                if(e.getSource().equals(pProductos.btnAtras)){
                    
                     
                    pPrincipal.ventPrincipal.setVisible(true);
                    pProductos.ventProductos.setVisible(false);
                    pProductos.limpiar();
                    
                }
                 if(e.getSource().equals(pProductos.btnNuevo)){
                     pProductos.botonNuevo();
                     pProductos.txtIdProducto.requestFocus();
                 
                 
                 }
                    
//            CATEGORIA PRODUCTOS
            
            
            
            
            if (e.getSource().equals(pCateProductos.btnBuscar)) {
                
                if (!pCateProductos.txtIdCategoria.getText().equals(null)) {
                    
                    modCateProducto.setIdCategoria(Integer.parseInt(pCateProductos.txtIdCategoria.getText()));
                     if (conCateProducto.buscar(modCateProducto)) {

                    JOptionPane.showMessageDialog(pCateProductos.ventCatProductos, "Registro Localizado", "Confirmacion", 1);
                   pCateProductos.txtDescripcion.setText(modCateProducto.getDescripcion());
                   pCateProductos.btnModificar.setEnabled(true);
                     
                } else {
                    JOptionPane.showMessageDialog(pCateProductos.ventCatProductos, "Registro No Localizado", "Error", 0);
                }   
                }   
        }
            
            if (e.getSource().equals(pCateProductos.btnNuevo)) {
                pCateProductos.nuevaCategoria();
            
        }
            if (e.getSource().equals(pCateProductos.btnAtras)) {
                pCateProductos.ventCatProductos.setVisible(false);
                pPrincipal.ventPrincipal.setVisible(true);
            
        }
            
            if (e.getSource().equals(pCateProductos.btnCancelar)) {
              pCateProductos.cancelar();
              pCateProductos.limpiar();
            
        }
            if(e.getSource().equals(pCateProductos.btnCargar)){
                
            
            if (!pCateProductos.txtIdCategoria.getText().isEmpty() && !pCateProductos.txtDescripcion.getText().isEmpty()) {
                
                modCateProducto.setIdCategoria(Integer.parseInt(pCateProductos.txtIdCategoria.getText()));
                modCateProducto.setDescripcion(pCateProductos.txtDescripcion.getText());
                              
                if (conCateProducto.registrar(modCateProducto)) {

                    JOptionPane.showMessageDialog(pCateProductos.ventCatProductos, "Guardado Correctamente", "Confirmacion", 1);
                   pCateProductos.limpiar();
                   pCateProductos.cancelar();
                     
                } else {
                    JOptionPane.showMessageDialog(pEmpleado.ventEmpleado, "Error al Guardar", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(this.pCateProductos.ventCatProductos, "Todos los campos Son Obligatorios", "Error", 0);
            }   
        }
            if (e.getSource().equals(pCateProductos.btnModificar)) {
                pCateProductos.activarModificaciones();
                pCateProductos.txtCodigo.setText(pCateProductos.txtIdCategoria.getText());
            }
            
            if (e.getSource().equals(pCateProductos.btnConsultar)) {
                pCateProductos.activarConsulta();
            
        }
            if (e.getSource().equals(pCateProductos.btnActualizar)) {
                if (!pCateProductos.txtIdCategoria.getText().isEmpty() && !pCateProductos.txtDescripcion.getText().isEmpty()) {
                       
                        modCateProducto.setCodigo(Integer.parseInt(pCateProductos.txtCodigo.getText()));
                        modCateProducto.setIdCategoria(Integer.parseInt(pCateProductos.txtIdCategoria.getText()));
                        modCateProducto.setDescripcion(pCateProductos.txtDescripcion.getText());
                        if (conCateProducto.modificar(modCateProducto)) {
                            JOptionPane.showMessageDialog(pCateProductos.ventCatProductos, "Registro Modificado Correctamente","Confirmación",1);
                            pCateProductos.cancelar();
                        }else{
                        JOptionPane.showMessageDialog(pCateProductos.ventCatProductos, "Error al Modificar Registro","Confirmación",1);
                        }
                        
                }
                else{
                        JOptionPane.showMessageDialog(pCateProductos.ventCatProductos,"Todos los Campos son Obbligatorios","Error",0);
                }
        }
            
            //Ejecutor de eventos pantalla Productos
            
             if (e.getSource().equals(pProductos.btnCargar)) {
                
                 if (!pProductos.txtDescripcion.getText().isEmpty()&& !pProductos.txtIdCategoria.getText().isEmpty()&& 
                     !pProductos.txtIdProducto.getText().isEmpty()&& !pProductos.txtMarca.getText().isEmpty()&& !pProductos.txtStock.getText().isEmpty()
                    && !pProductos.txtStockMinimo.getText().isEmpty()&& !pProductos.txtUMedida.getText().isEmpty()){
                     
                       modProducto.setIdProducto(Integer.parseInt(pProductos.txtIdProducto.getText()));
                       modProducto.setDescripcion(pProductos.txtDescripcion.getText());
                       modProducto.setStock(Double.parseDouble(pProductos.txtStock.getText()));
                       modProducto.setuMedida(pProductos.txtUMedida.getText());
                       modProducto.setIdCategoria(Integer.parseInt(pProductos.txtIdCategoria.getText()));
                       modProducto.setStockMinimo(Double.parseDouble(pProductos.txtStockMinimo.getText()));
                       
                       if(conProducto.registrar(modProducto)){
                        JOptionPane.showMessageDialog(pProductos.ventProductos, "Cargado Correctamente","Connfirmacion",1);
                       }else{
                       JOptionPane.showMessageDialog(pProductos.ventProductos, "Error al Cargar Producto","Error",0);
                       }   
                 }
                 else{JOptionPane.showMessageDialog(pProductos.ventProductos, "Todos los Campos son Obligatorios","Error",0);
                 }
            
        }
             
             //EJECUTOR DE EVENTOS Pantalla ENTRADAS SALIDAS PRODUCTOS
             if (e.getSource().equals(pEtradasSalidas.btnAtras)) {
                 pEtradasSalidas.ventEntradaSalidasProductos.setVisible(false);
                 pPrincipal.ventPrincipal.setVisible(true);
        }
             if (e.getSource().equals(pEtradasSalidas.ItemEntradaProducto)) {
                 
                 pEtradasSalidas.activarIngresoProducto();
                 pEtradasSalidas.botonNuevo();
        }
             if (e.getSource().equals(pEtradasSalidas.btnBBuscar)) {
                 
                 if (pEtradasSalidas.checkId.isSelected()) {
//                     JOptionPane.showMessageDialog(this.pEtradasSalidas, "");
                 
                 if (!pEtradasSalidas.txtIdProducto.getText().isEmpty()&& pEtradasSalidas.checkId.isSelected()) {
                     
                     
                 }}
             }
             if (e.getSource().equals(pEtradasSalidas.btnCancelar)) {
                 pEtradasSalidas.cancelarTodo();
            
        }
              
             //EJECUTOR DE EVENTOS PantallaMarcas
             if (e.getSource().equals(pMarcas.btnVolver)) {
                 pMarcas.ventMarcas.setVisible(false);
                 pPrincipal.ventPrincipal.setVisible(true);
    }
             if (e.getSource().equals(pMarcas.btnNuevo)) {
                 pMarcas.botonNuevo();
            
        }
             if (e.getSource().equals(pMarcas.btnCancelar)) {
                 pMarcas.botonCancelar();
            
        }
             // BOTON CARGAR MARCAS
             if (e.getSource().equals(pMarcas.btnCargar)) {
            
        
              if (!pMarcas.txtIdMarca.getText().isEmpty() && !pMarcas.txtDescripcion.getText().isEmpty()) {
                
                modMarcas.setIdMarca(Integer.parseInt(pMarcas.txtIdMarca.getText()));
                modMarcas.setDescripcion(pMarcas.txtDescripcion.getText());
                              
                if (conMarcas.registrar(modMarcas)) {

                    JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Guardado Correctamente", "Confirmacion", 1);
                   pMarcas.limpiar();
                   pMarcas.botonCancelar();
                     
                } else {
                    JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Error al Guardar", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(this.pMarcas.ventMarcas, "Todos los campos Son Obligatorios", "Error", 0);
            }   
             }     
             //BOTON CONSULTAR MARCAS
             
             if (e.getSource().equals(pMarcas.btnConsultar)) {
                 pMarcas.activarBuscar();
            }
             
             // Boton buscar marca
             if (e.getSource().equals(pMarcas.btnBuscar)) {
                
                if (!pMarcas.txtIdMarca.getText().equals(null)) {
                    
                    modMarcas.setIdMarca(Integer.parseInt(pMarcas.txtIdMarca.getText()));
                     if (conMarcas.buscar(modMarcas)) {

                    JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Registro Localizado", "Confirmacion", 1);
                   pMarcas.txtDescripcion.setText(modMarcas.getDescripcion());
                   pMarcas.btnModificar.setEnabled(true);
                     
                } else {
                    JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Registro No Localizado", "Error", 0);
                }   
                }   
              }
             // boton modificar marca
             if (e.getSource().equals(pMarcas.btnModificar)) {
                 pMarcas.desbloquear();
                 
            }
             
             //Boton actualizar marca
             if (e.getSource().equals(pMarcas.btnActualizar)) {
                 
                if (!pMarcas.txtIdMarca.getText().isEmpty() && !pMarcas.txtDescripcion.getText().isEmpty()) {
                       
                        modMarcas.setCodigo(Integer.parseInt(pMarcas.txtCodigo.getText()));
                        modMarcas.setIdMarca(Integer.parseInt(pMarcas.txtIdMarca.getText()));
                        modMarcas.setDescripcion(pMarcas.txtDescripcion.getText());
                        if (conMarcas.modificar(modMarcas)) {
                            JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Registro Modificado Correctamente","Confirmación",1);
                            pCateProductos.cancelar();
                        }else{
                        JOptionPane.showMessageDialog(pMarcas.ventMarcas, "Error al Modificar Registro","Confirmación",1);
                        }
                        
                }
                else{
                        JOptionPane.showMessageDialog(pMarcas.ventMarcas,"Todos los Campos son Obbligatorios","Error",0);
                }
        }
             
              //EJECUTOR DE EVENTOS PantallaProveedores
             if (e.getSource().equals(pProveedor.btnVolver)) {
                 pProveedor.ventProveedor.setVisible(false);
                 pPrincipal.ventPrincipal.setVisible(true);
    }
//        boton cargar pantalla Proveedores
        
        if(e.getSource().equals(pProveedor.btnCargar)){
            

            if (!pProveedor.txtIdProveedor.getText().isEmpty() && !pProveedor.txtRazonSocial.getText().isEmpty()
                    && !pProveedor.txtDescripcion.getText().isEmpty() && !pProveedor.txtDireccion.getText().isEmpty()
                    && !pProveedor.txtTelefono.getText().isEmpty()) {
                
                modProveedor.setIdProveedor(Double.parseDouble(pProveedor.txtIdProveedor.getText()));
                modProveedor.setRazonSocial(pProveedor.txtRazonSocial.getText());
                modProveedor.setDescripcion(pProveedor.txtDescripcion.getText());
                modProveedor.setDireccion(pProveedor.txtDireccion.getText());
                modProveedor.setTelefono(pProveedor.txtTelefono.getText());
                
                              
                if (conProveedor.registrar(modProveedor)) {

                    JOptionPane.showMessageDialog(pProveedor.ventProveedor, "Guardado Correctamente", "Confirmacion", 1);
                   pProveedor.limpiar();
                     
                } else {
                    JOptionPane.showMessageDialog(pProveedor.ventProveedor, "Error al Guardar", "Error", 0);
                }

            } else {
                JOptionPane.showMessageDialog(this.pProveedor.ventProveedor, "Todos los campos Son Obligatorios", "Error", 0);
            }
            
            
        }
      //   BOTON CANCELAR PANTALLA proveedor
        if(e.getSource().equals(pProveedor.btnCancelar)){
            pProveedor.botonCancelar();
            pProveedor.limpiar();
        }
        //BOTON NuEVO PANTALLA proveedor
        if(e.getSource().equals(pProveedor.btnNuevo)){
            pProveedor.botonNuevo();
        }
        
          //BOTON MODIFICAR PANTALLa proveedor
         if(e.getSource().equals(pProveedor.btnModificar)){
            pProveedor.desbloquear();
        }
         
         //BOTON BUSCAR PANTALLA proveedor
         if(e.getSource().equals(pProveedor.btnBuscar)){
             if (!pProveedor.txtIdProveedor.getText().isEmpty()) {
                 
                 modProveedor.setIdProveedor(Double.parseDouble(pProveedor.txtIdProveedor.getText()));
                 if(conProveedor.buscar(modProveedor)){
                     JOptionPane.showMessageDialog(null, "Registro Localizado");
                     
                     pProveedor.txtRazonSocial.setText(modProveedor.getRazonSocial());
                     pProveedor.txtDescripcion.setText(modProveedor.getDescripcion());
                     pProveedor.txtDireccion.setText(modProveedor.getDireccion());
                     pProveedor.txtTelefono.setText(modProveedor.getTelefono());
                     pProveedor.txtCodigo.setText(Double.toString(modProveedor.getIdProveedor()));
                     
                     pProveedor.btnModificar.setEnabled(true);
                 
             }else{
                     JOptionPane.showMessageDialog(null, "Registro No encontrado");
                     pProveedor.limpiar();
                     pProveedor.btnModificar.setEnabled(false);
                 }
        }else{
                 JOptionPane.showMessageDialog(null, "Ingrese idProveedor","Error",0);
             }
         }
         
         //BOTON ACTUALIZAR DATOS proveedor
         
         if (e.getSource().equals(pProveedor.btnActualizar)) {
             
             modProveedor.setIdProveedor(Double.parseDouble(pProveedor.txtIdProveedor.getText()));
             modProveedor.setRazonSocial(pProveedor.txtRazonSocial.getText());
             modProveedor.setDescripcion(pProveedor.txtDescripcion.getText());
             modProveedor.setDireccion(pProveedor.txtDireccion.getText());
             modProveedor.setTelefono(pProveedor.txtTelefono.getText());
             modProveedor.setCodigo(Double.parseDouble(pProveedor.txtCodigo.getText()));
             
             if (conProveedor.modificar(modProveedor)) {
                 JOptionPane.showMessageDialog(null, "Registro Modificado Correctamente");
                    pProveedor.botonCancelar();
                    pProveedor.limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error al Modificar");
             }
        }
           // BOTON CONSULTAR PANTALLA proveedor
               if(e.getSource().equals(pProveedor.btnConsultar)){
                   pProveedor.botonBuscarConsulta();
               }
               
             //  BOTON BUSCAR CONSULTA PANTALLA proveedor
//                if(e.getSource().equals(pProveedor.btnBuscarConsulta)){
//                    
//                    if (!pEmpleado.txtIdEmpleado.getText().isEmpty()) {
//                 
//                 modEmpleado.setIdEmpleado(Integer.parseInt(pEmpleado.txtIdEmpleado.getText()));
//                 if(conEmpleado.buscar(modEmpleado)){
//                     JOptionPane.showMessageDialog(null, "Registro Localizado");
//                     SimpleDateFormat formato = new SimpleDateFormat("YYYY-MM-dd");
//                     pEmpleado.txtApellido.setText(modEmpleado.getApellido());
//                     pEmpleado.txtPrimerNombre.setText(modEmpleado.getNombre());
//                     pEmpleado.txtSegundoNombre.setText(modEmpleado.getSegundoNombre());
//////////////                      dfdd
//                     pEmpleado.fechaNacimiento.setDate(Date.valueOf(modEmpleado.getFechaNacimiento()));
//                     pEmpleado.txtJefe.setText(modEmpleado.getJefe());
//                     pEmpleado.txtDescripcion.setText(modEmpleado.getDescripcion());
//                     pEmpleado.txtTelefono.setText(modEmpleado.getTelefono());
//                     
//                     pEmpleado.fechaAlta.setDate(Date.valueOf(modEmpleado.getFechaAlta()));
//                     if (modEmpleado.getFechaBaja()!=null) {
//                          pEmpleado.fechaBaja.setDate(Date.valueOf(modEmpleado.getFechaBaja()));
//                     
//                     }
//                     pEmpleado.txtCodigo.setText(Integer.toString(modEmpleado.getIdEmpleado()));
//                     
//                 
//             }else{
//                     JOptionPane.showMessageDialog(null, "Registro No encontrado");
//                 }
//        }
//         }
              //EJECUTOR DE EVENTOS PantallaUsuarios
             if (e.getSource().equals(pUsuarios.btnVolver)) {
                 pUsuarios.ventanaUsuario.setVisible(false);
                 pPrincipal.ventPrincipal.setVisible(true);
    }
             
    }
 
    public static void main(String[] args) {

        Control ctrl;
      ctrl = new Control();
    }
}

