/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlCliente;
import Control.ControlDetalleVenta;
import Control.ControlPersona;
import Control.ControlPlataforma;
import Control.ControlVendedor;
import Control.ControlVenta;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mauricio
 */
public class GUIDetalleVenta extends javax.swing.JFrame {

    Control.ControlDetalleVenta cdv = new ControlDetalleVenta();
    Control.ControlPlataforma cp = new ControlPlataforma();
    Control.ControlVenta cv = new ControlVenta();

    DefaultTableModel dtmDetVenta;
    DefaultTableModel dtmBusqueda;
    String[] tablaDetVenta = {"Codigo", "Abono", "saldo", "Codigo Venta"};
    String[] tablaVenta={"Codigo_Venta","Fecha","Valor","Codigo_vendedor","Codigo_Cliente","Codigo_Plataforma"};
    
    Object data[][] = new Object[0][4];
    Object datac[][] = new Object[0][6];

    String CODIGO_DETALLE_VENTA = "";
    int ABONO = 0;
    int SALDO = 0;
    String CODIGO_VENTA = "";

    public GUIDetalleVenta() {
        data = cdv.consultarDetalleVenta();
        dtmDetVenta = new DefaultTableModel(data, tablaDetVenta);
        datac = cv.consultarVentas();
        dtmBusqueda = new DefaultTableModel(datac, tablaVenta);
        initComponents();
        txtcodigodetvnt.setText(cdv.GenerarCodigoDetalleVenta());
    }

    public void actualizarTablaDetalleVenta(String codigo_detalle_venta) {
        Object data[][] = cdv.consultarDetalleVentaCodigo(codigo_detalle_venta);
        dtmDetVenta = new DefaultTableModel(data, tablaDetVenta);

        tblDetVenta.setModel(dtmDetVenta);
    }

    public void refrescarTblDetalleVenta() {
        Object[][] data = cdv.consultarDetalleVenta();
        dtmDetVenta = new DefaultTableModel(data, tablaDetVenta);
        tblDetVenta.setModel(dtmDetVenta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDetVenta = new javax.swing.JPanel();
        jPanelDatoscli = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtcodigodetvnt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtabonodetvnt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcodvnt = new javax.swing.JTextField();
        jPanelbotonesDetVenta = new javax.swing.JPanel();
        btnGuardardetvnt = new javax.swing.JButton();
        btnEliminardetvnt = new javax.swing.JButton();
        btnmostrardetvnt = new javax.swing.JButton();
        jPanelBusquedaVnt = new javax.swing.JPanel();
        txtBusquedadVenta = new javax.swing.JTextField();
        btnBusquedadVenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBoxBusquedaVenta = new javax.swing.JComboBox<>();
        jPaneltblbusqueda = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        jPaneltblDetVenta = new javax.swing.JScrollPane();
        tblDetVenta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDetVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cliente"));

        jPanelDatoscli.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar Datos"));

        jLabel12.setText("Cod Det Venta:");

        jLabel13.setText("Abono:");

        txtabonodetvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtabonodetvntActionPerformed(evt);
            }
        });

        jLabel15.setText("Codigo Venta:");

        txtcodvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodvntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatoscliLayout = new javax.swing.GroupLayout(jPanelDatoscli);
        jPanelDatoscli.setLayout(jPanelDatoscliLayout);
        jPanelDatoscliLayout.setHorizontalGroup(
            jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatoscliLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatoscliLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigodetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txtabonodetvnt)))
                    .addGroup(jPanelDatoscliLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(15, 15, 15)
                        .addComponent(txtcodvnt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatoscliLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel12)
                    .addContainerGap(199, Short.MAX_VALUE)))
        );
        jPanelDatoscliLayout.setVerticalGroup(
            jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatoscliLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtcodigodetvnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtabonodetvnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtcodvnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(jPanelDatoscliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatoscliLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel12)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );

        jPanelbotonesDetVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Botones"));

        btnGuardardetvnt.setText("Pagar");
        btnGuardardetvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardardetvntActionPerformed(evt);
            }
        });

        btnEliminardetvnt.setText("Eliminar Pago");
        btnEliminardetvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminardetvntActionPerformed(evt);
            }
        });

        btnmostrardetvnt.setText("Mostrar");
        btnmostrardetvnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrardetvntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelbotonesDetVentaLayout = new javax.swing.GroupLayout(jPanelbotonesDetVenta);
        jPanelbotonesDetVenta.setLayout(jPanelbotonesDetVentaLayout);
        jPanelbotonesDetVentaLayout.setHorizontalGroup(
            jPanelbotonesDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotonesDetVentaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelbotonesDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmostrardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelbotonesDetVentaLayout.setVerticalGroup(
            jPanelbotonesDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelbotonesDetVentaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnGuardardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmostrardetvnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

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

        jCBoxBusquedaVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar_Ventas" }));

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
                    .addComponent(jPaneltblbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelBusquedaVntLayout.createSequentialGroup()
                        .addGroup(jPanelBusquedaVntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBusquedaVntLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBoxBusquedaVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtBusquedadVenta, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaVntLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBusquedadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addContainerGap())))
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
                .addComponent(jPaneltblbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelDetVentaLayout = new javax.swing.GroupLayout(jPanelDetVenta);
        jPanelDetVenta.setLayout(jPanelDetVentaLayout);
        jPanelDetVentaLayout.setHorizontalGroup(
            jPanelDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetVentaLayout.createSequentialGroup()
                .addComponent(jPanelDatoscli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelbotonesDetVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBusquedaVnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDetVentaLayout.setVerticalGroup(
            jPanelDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetVentaLayout.createSequentialGroup()
                .addGroup(jPanelDetVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelbotonesDetVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDatoscli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBusquedaVnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tblDetVenta.setModel(dtmDetVenta);
        tblDetVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetVentaMouseClicked(evt);
            }
        });
        jPaneltblDetVenta.setViewportView(tblDetVenta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPaneltblDetVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDetVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDetVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPaneltblDetVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void btnGuardardetvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardardetvntActionPerformed
        CODIGO_DETALLE_VENTA = txtcodigodetvnt.getText();
        ABONO = Integer.parseInt(txtabonodetvnt.getText());
       
        CODIGO_VENTA = txtcodvnt.getText();

        
        data = cv.consultarVentaCodigo(CODIGO_VENTA);
        datac = cdv.consultarDetalleVentaCodigo(CODIGO_DETALLE_VENTA);
        System.out.println("CODIGO_VENTA: " + data[0][0]);
//        System.out.println("CODIGO_DETALLE_VENTA: " + datac[0][0]);
        
        
        try {
          if(data[0][0]==null){
              JOptionPane.showMessageDialog(this, "NO EXISTE CODIGO VENTA!!","ERROR",JOptionPane.ERROR_MESSAGE);
          }
            
          else if( data[0][0].toString().equals(CODIGO_VENTA) & datac[0][0]==null){
          boolean ejecuto = cdv.insertarDetalleVenta(CODIGO_DETALLE_VENTA, ABONO, cdv.saldo(cdv.valor_venta(CODIGO_VENTA), ABONO), CODIGO_VENTA);
                if(ejecuto){
                    JOptionPane.showMessageDialog(this, "PAGO EXITOSO!!","Guardar",JOptionPane.INFORMATION_MESSAGE);
                    this.refrescarTblDetalleVenta();
                }else{JOptionPane.showMessageDialog(this, "PAGO NO REALIZADO!!","guardar",JOptionPane.ERROR_MESSAGE);}
      
            }
          else if (data[0][0].toString().equals(CODIGO_VENTA) & datac[0][0].toString().equals(CODIGO_DETALLE_VENTA)) {
                boolean ejecuto2 = cdv.actualizarDetalleVenta(CODIGO_DETALLE_VENTA, cdv.abonoaux(cdv.valor_abono(CODIGO_VENTA), ABONO),
                        cdv.saldoaux(cdv.valor_saldo(CODIGO_VENTA), ABONO), CODIGO_VENTA);
                        
                      if(ejecuto2){
                      JOptionPane.showMessageDialog(this, "PAGO EXITOSO!!","Guardar",JOptionPane.INFORMATION_MESSAGE);
                      this.refrescarTblDetalleVenta();
                }else{JOptionPane.showMessageDialog(this, "PAGO NO REALIZADO!!","ERROR",JOptionPane.ERROR_MESSAGE);}

            }
          this.refrescarTblDetalleVenta();
        } catch (Exception e) {
            System.out.println("NO EXISTE VENTA");
//            JOptionPane.showMessageDialog(this, "VENTA NO REALIZADA!!","ERROR",JOptionPane.ERROR_MESSAGE);
            boolean ejecuto = cdv.insertarDetalleVenta(CODIGO_DETALLE_VENTA, ABONO, cdv.saldo(cdv.valor_venta(CODIGO_VENTA), ABONO), CODIGO_VENTA);
            if(ejecuto){
                    JOptionPane.showMessageDialog(this, "PAGO EXITOSO!!","Guardar",JOptionPane.INFORMATION_MESSAGE);
                    this.refrescarTblDetalleVenta();
                }else{JOptionPane.showMessageDialog(this, "PAGO NO REALIZADO!!","guardar",JOptionPane.ERROR_MESSAGE);}
      

//          System.out.println("CODIGO_VENTA: " + data[0][0]);
        }
        
        
        
    }//GEN-LAST:event_btnGuardardetvntActionPerformed

    private void btnEliminardetvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminardetvntActionPerformed
        CODIGO_DETALLE_VENTA = txtcodigodetvnt.getText();
        int respuesta = JOptionPane.showConfirmDialog(this, "Desea Eliminar la PLATAFORMA " + CODIGO_DETALLE_VENTA + "?");
        boolean elimino = cp.eliminarPlataforma(CODIGO_DETALLE_VENTA);

        if (respuesta == JOptionPane.YES_OPTION) {
            elimino = cp.eliminarPlataforma(CODIGO_DETALLE_VENTA);

        }
    }//GEN-LAST:event_btnEliminardetvntActionPerformed

    private void btnmostrardetvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrardetvntActionPerformed
        this.refrescarTblDetalleVenta();

        for (int i = 0; i < cdv.contarDetalleVenta(); i++) {
            System.out.println("COD DETALLE VENTA: " + data[i][0].toString()
                    + " ABONO: " + data[i][1].toString()
                    + " SALDO: " + data[i][2].toString()
                    + " COD VENTA: " + data[i][3].toString());
        }

    }//GEN-LAST:event_btnmostrardetvntActionPerformed

    private void tblDetVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetVentaMouseClicked

//        int sel = this.tblDetVenta.getSelectedRow();
//        this.txtcodigodetvnt.setText(tblDetVenta.getValueAt(sel, 0).toString());
//        this.txtabonodetvnt.setText(tblDetVenta.getValueAt(sel, 1).toString());
//        this.txtcodvnt.setText(tblDetVenta.getValueAt(sel, 2).toString());


    }//GEN-LAST:event_tblDetVentaMouseClicked

    private void txtabonodetvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtabonodetvntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtabonodetvntActionPerformed

    private void txtcodvntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodvntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodvntActionPerformed

    private void txtBusquedadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedadVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedadVentaActionPerformed

    private void btnBusquedadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedadVentaActionPerformed

        String Busqueda= txtBusquedadVenta.getText();
        //       Object dato[][]=cc.consultarClienteNombre(Busqueda);
        if ("Mostrar_Ventas".equals(jCBoxBusquedaVenta.getSelectedItem().toString())){
            Object data[][] = cv.consultarVentas();
            dtmBusqueda= new DefaultTableModel(data,tablaVenta);
            tblBusqueda.setModel(dtmBusqueda);
        }else{JOptionPane.showMessageDialog(this, "Datos no Encontrados!!","ERROR!",JOptionPane.ERROR_MESSAGE);
        }
        jPaneltblbusqueda.setVisible(true);
    }//GEN-LAST:event_btnBusquedadVentaActionPerformed

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
            java.util.logging.Logger.getLogger(GUIDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDetalleVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDetalleVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusquedadVenta;
    private javax.swing.JButton btnEliminardetvnt;
    private javax.swing.JButton btnGuardardetvnt;
    private javax.swing.JButton btnmostrardetvnt;
    private javax.swing.JComboBox<String> jCBoxBusquedaVenta;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelBusquedaVnt;
    private javax.swing.JPanel jPanelDatoscli;
    private javax.swing.JPanel jPanelDetVenta;
    private javax.swing.JPanel jPanelbotonesDetVenta;
    private javax.swing.JScrollPane jPaneltblDetVenta;
    private javax.swing.JScrollPane jPaneltblbusqueda;
    private javax.swing.JTable tblBusqueda;
    private javax.swing.JTable tblDetVenta;
    private javax.swing.JTextField txtBusquedadVenta;
    private javax.swing.JTextField txtabonodetvnt;
    private javax.swing.JTextField txtcodigodetvnt;
    private javax.swing.JTextField txtcodvnt;
    // End of variables declaration//GEN-END:variables

    private void splite(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}