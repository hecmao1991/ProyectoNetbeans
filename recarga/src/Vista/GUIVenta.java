/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCliente;
import Control.ControlPersona;
import Control.ControlPlataforma;
import Control.ControlVendedor;
import Control.ControlVenta;
import Modelo.Persistencia;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleState;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Mauricio
 */
public class GUIVenta extends javax.swing.JFrame {
    Control.ControlVenta cv=new ControlVenta();
    Control.ControlCliente cc=new ControlCliente();
    Control.ControlPlataforma cp=new ControlPlataforma();
    Control.ControlPersona cpr= new ControlPersona();
    Control.ControlVendedor cven= new ControlVendedor();   
    
    
    DefaultTableModel dtm1;
    DefaultTableModel dtmBusqueda;
    
    
    
    String[] tablaVenta={"Codigo_Venta","Fecha","Valor","Codigo_vendedor","Codigo_Cliente","Codigo_Plataforma"};
    String[] tablaCliente={"Cedula","Nombres","Apellidos","Direccion","Telefono","Correo"};
    String[] tablaPlataforma={"Codigo","Nombre"};
    String CODIGO_VNT="";
    Date FECHA;
    double VALOR=0;
    String CODIGO_VENDEDOR="";
    String CODIGO_CLI="";
    String CODIGO_PLA="";      
    String CEDULA="";
    String NOMBRES="";
    String APELLIDOS="";
    String TELEFONO="";
    String CORREO="";
    String DIRECCION=""; 
    
    public GUIVenta() {
         
        Object[][] data= cv.consultarVentas();
        
        dtm1=new DefaultTableModel(data, tablaVenta);
        
        Object[][] datac= cc.consultarClientes();
        dtmBusqueda=new DefaultTableModel(datac, tablaCliente);
        
       
        initComponents();    
//        jPaneltblbusqueda.setVisible(false);
       
         
    }
    
            
    
    public void actualizarTablaVenta(String codigo){
        Object data[][] = cv.consultarVentaCodigo(codigo);
        dtm1= new DefaultTableModel(data,tablaVenta);
        tblVenta.setModel(dtm1);        
    }
    
    public void refrescarTblVenta(){
        Object[][] data= cv.consultarVentas();
        dtm1=new DefaultTableModel(data, tablaVenta);
        tblVenta.setModel(dtm1);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Busqueda = new javax.swing.JPanel();
        jPanelBotonesVnt = new javax.swing.JPanel();
        btnGuardarVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        btnModificarVenta = new javax.swing.JButton();
        btnmostrarVentas = new javax.swing.JButton();
        jPanelDatosVnt = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtcodVen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        txtCodCli = new javax.swing.JTextField();
        txtCodPlat = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        txtcodVendedor = new javax.swing.JLabel();
        jPaneltblVenta = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jPanelBusquedaVnt = new javax.swing.JPanel();
        txtBusquedadVenta = new javax.swing.JTextField();
        btnBusquedadVenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBoxBusquedaVenta = new javax.swing.JComboBox<>();
        jPaneltblbusqueda = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        txtBienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta"));

        jPanelBotonesVnt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Botones"));

        btnGuardarVenta.setText("Guardar");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });

        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnModificarVenta.setText("Modificar");
        btnModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVentaActionPerformed(evt);
            }
        });

        btnmostrarVentas.setText("Refrescar");
        btnmostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotonesVntLayout = new javax.swing.GroupLayout(jPanelBotonesVnt);
        jPanelBotonesVnt.setLayout(jPanelBotonesVntLayout);
        jPanelBotonesVntLayout.setHorizontalGroup(
            jPanelBotonesVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesVntLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelBotonesVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmostrarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(btnGuardarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBotonesVntLayout.setVerticalGroup(
            jPanelBotonesVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesVntLayout.createSequentialGroup()
                .addComponent(btnGuardarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmostrarVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDatosVnt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar Datos"));

        jLabel3.setText("Valor:");

        jLabel4.setText("Codigo Vendedor:");

        jLabel5.setText("Cedula Cliente:");

        jLabel6.setText("Codigo Plataforma:");

        jLabel1.setText("Codigo Venta:");

        jLabel2.setText("Fecha:");

        jDate.setMaxSelectableDate(new java.util.Date(1893477695000L));

        txtcodVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelDatosVntLayout = new javax.swing.GroupLayout(jPanelDatosVnt);
        jPanelDatosVnt.setLayout(jPanelDatosVntLayout);
        jPanelDatosVntLayout.setHorizontalGroup(
            jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosVntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtvalor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcodVen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodPlat, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtcodVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatosVntLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        jPanelDatosVntLayout.setVerticalGroup(
            jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosVntLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtcodVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtcodVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodPlat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanelDatosVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatosVntLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel1)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        tblVenta.setModel(dtm1);
        tblVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentaMouseClicked(evt);
            }
        });
        jPaneltblVenta.setViewportView(tblVenta);

        jPanelBusquedaVnt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Busqueda"));

        txtBusquedadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedadVentaActionPerformed(evt);
            }
        });

        btnBusquedadVenta.setText("Buscar");
        btnBusquedadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedadVentaActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar por:");

        jCBoxBusquedaVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre_Cliente", "Cedula_Cliente", "Codigo_Venta", "Mostrar_Clientes", "Mostrar_Plataforma" }));

        jPaneltblbusqueda.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPaneltblbusquedaComponentAdded(evt);
            }
        });

        tblBusqueda.setModel(dtmBusqueda);
        tblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBusquedaMouseClicked(evt);
            }
        });
        jPaneltblbusqueda.setViewportView(tblBusqueda);

        javax.swing.GroupLayout jPanelBusquedaVntLayout = new javax.swing.GroupLayout(jPanelBusquedaVnt);
        jPanelBusquedaVnt.setLayout(jPanelBusquedaVntLayout);
        jPanelBusquedaVntLayout.setHorizontalGroup(
            jPanelBusquedaVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaVntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBusquedaVntLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBoxBusquedaVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBusquedadVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPaneltblbusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaVntLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBusquedadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        jPanelBusquedaVntLayout.setVerticalGroup(
            jPanelBusquedaVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaVntLayout.createSequentialGroup()
                .addGroup(jPanelBusquedaVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jCBoxBusquedaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBusquedadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusquedadVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneltblbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BusquedaLayout = new javax.swing.GroupLayout(Busqueda);
        Busqueda.setLayout(BusquedaLayout);
        BusquedaLayout.setHorizontalGroup(
            BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BusquedaLayout.createSequentialGroup()
                        .addComponent(jPaneltblVenta)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BusquedaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(BusquedaLayout.createSequentialGroup()
                        .addComponent(jPanelDatosVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelBotonesVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelBusquedaVnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        BusquedaLayout.setVerticalGroup(
            BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaLayout.createSequentialGroup()
                .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelDatosVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BusquedaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(BusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelBotonesVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelBusquedaVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPaneltblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed
       
        
        
        CODIGO_VNT= txtcodVen.getText();
       FECHA=jDate.getDate();
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
       VALOR=Double.parseDouble(txtvalor.getText());
       CODIGO_VENDEDOR=txtcodVendedor.getText();
       CODIGO_CLI=txtCodCli.getText();
       CODIGO_PLA=txtCodPlat.getText();
        
       boolean inserto = cv.insertarVenta(CODIGO_VNT,formato.format(FECHA),VALOR,CODIGO_VENDEDOR,CODIGO_CLI,CODIGO_PLA);
      
       if (inserto){
           JOptionPane.showMessageDialog(this, "Datos Almacenados!!","guardar",JOptionPane.INFORMATION_MESSAGE);
           actualizarTablaVenta(CODIGO_VNT);
       }else {JOptionPane.showMessageDialog(this, "Datos no Almacenados!!","guardar",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        CODIGO_VNT=txtcodVen.getText();        
        int respuesta = JOptionPane.showConfirmDialog(this, "Desea Eliminar la region "+CODIGO_VNT+"?");
        boolean elimino= cv.eliminarVenta(CODIGO_VNT);
        if (respuesta == JOptionPane.YES_OPTION){
            elimino = cv.eliminarVenta(CODIGO_VNT);
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnmostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarVentasActionPerformed
        this.refrescarTblVenta();
    }//GEN-LAST:event_btnmostrarVentasActionPerformed

    private void txtBusquedadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedadVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedadVentaActionPerformed

    private void btnBusquedadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedadVentaActionPerformed
        
        String Busqueda= txtBusquedadVenta.getText();
//       Object dato[][]=cc.consultarClienteNombre(Busqueda);
       if ("Nombre_Cliente".equals(jCBoxBusquedaVenta.getSelectedItem().toString())) {                
                 Object data[][] = cc.consultarClienteNombre(Busqueda);
                    dtmBusqueda= new DefaultTableModel(data,tablaCliente);
                    tblBusqueda.setModel(dtmBusqueda);                                         
       }else if("Cedula_Cliente".equals(jCBoxBusquedaVenta.getSelectedItem().toString())){                
                 Object data[][] = cc.consultarClientesCedula(Busqueda);
                    dtmBusqueda= new DefaultTableModel(data,tablaCliente);
                    tblBusqueda.setModel(dtmBusqueda);                    
       }else if ("Codigo_Venta".equals(jCBoxBusquedaVenta.getSelectedItem().toString())){
                Object data[][] = cv.consultarVentaCodigo(Busqueda);
                    dtmBusqueda= new DefaultTableModel(data,tablaVenta);
                    tblBusqueda.setModel(dtmBusqueda);
       }else if ("Mostrar_Clientes".equals(jCBoxBusquedaVenta.getSelectedItem().toString())){
                Object data[][] = cc.consultarClientes();
                    dtmBusqueda= new DefaultTableModel(data,tablaCliente);
                    tblBusqueda.setModel(dtmBusqueda);
       }else if ("Mostrar_Plataforma".equals(jCBoxBusquedaVenta.getSelectedItem().toString())){
                Object data[][] = cp.consultarPlataforma();
                    dtmBusqueda= new DefaultTableModel(data,tablaPlataforma);
                    tblBusqueda.setModel(dtmBusqueda);
       }else{JOptionPane.showMessageDialog(this, "Datos no Encontrados!!","ERROR!",JOptionPane.ERROR_MESSAGE);
       }
       jPaneltblbusqueda.setVisible(true);
    }//GEN-LAST:event_btnBusquedadVentaActionPerformed

    private void btnModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVentaActionPerformed
       CODIGO_VNT= txtcodVen.getText();
       FECHA=jDate.getDate();
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
       VALOR=Double.parseDouble(txtvalor.getText());
       CODIGO_VENDEDOR=txtcodVendedor.getText();
       CODIGO_CLI=txtCodCli.getText();
       CODIGO_PLA=txtCodPlat.getText();
       boolean inserto = cv.actualizarVenta(CODIGO_VNT, formato.format(FECHA),VALOR,CODIGO_VENDEDOR,CODIGO_CLI,CODIGO_PLA);
       
       if (inserto){
           JOptionPane.showMessageDialog(this, "Datos Modificados!!","guardar",JOptionPane.INFORMATION_MESSAGE);
           actualizarTablaVenta(CODIGO_VNT);
       }else {JOptionPane.showMessageDialog(this, "Datos no Almacenados!!","guardar",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_btnModificarVentaActionPerformed

    private void tblVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentaMouseClicked
        
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
            int  sel = this.tblVenta.getSelectedRow();
            this.txtcodVen.setText(tblVenta.getValueAt(sel,0).toString());
        try {
            this.jDate.setDate(formato.parse(tblVenta.getValueAt(sel, 1).toString()));
        } catch (ParseException ex) {
            Logger.getLogger(GUIVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println(tblVenta.getValueAt(sel, 1).toString());
            this.txtvalor.setText(tblVenta.getValueAt(sel,2).toString());
            this.txtcodVendedor.setText(tblVenta.getValueAt(sel,3).toString());
            this.txtCodCli.setText(tblVenta.getValueAt(sel,4).toString());
            this.txtCodPlat.setText(tblVenta.getValueAt(sel,5).toString());
        
    }//GEN-LAST:event_tblVentaMouseClicked

    private void tblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBusquedaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBusquedaMouseClicked

    private void jPaneltblbusquedaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPaneltblbusquedaComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPaneltblbusquedaComponentAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Busqueda;
    private javax.swing.JButton btnBusquedadVenta;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JButton btnModificarVenta;
    private javax.swing.JButton btnmostrarVentas;
    private javax.swing.JComboBox<String> jCBoxBusquedaVenta;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBotonesVnt;
    private javax.swing.JPanel jPanelBusquedaVnt;
    private javax.swing.JPanel jPanelDatosVnt;
    private javax.swing.JScrollPane jPaneltblVenta;
    private javax.swing.JScrollPane jPaneltblbusqueda;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTable tblVenta;
    public javax.swing.JLabel txtBienvenido;
    private javax.swing.JTextField txtBusquedadVenta;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtCodPlat;
    private javax.swing.JTextField txtcodVen;
    public javax.swing.JLabel txtcodVendedor;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables

    private void splite(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
