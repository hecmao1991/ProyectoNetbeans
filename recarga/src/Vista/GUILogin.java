/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlPersona;
import Control.ControlVendedor;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class GUILogin extends javax.swing.JFrame {

    GUIVenta GV = new GUIVenta();
    ControlPersona CP = new ControlPersona();
    ControlVendedor CVEN = new ControlVendedor();
    String CEDULA, CODIGO_VENDEDOR, NOMBRES, APELLIDOS, TELEFONO, CORREO, DIRECCION, PASSWORD, PASSWORD2;

    public GUILogin() {
        initComponents();
        Jpanelregistrarse.setVisible(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanellogin = new javax.swing.JPanel();
        Jpanelregistrarse = new javax.swing.JPanel();
        txtNombrePer = new javax.swing.JTextField();
        txtIdePer = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoPer = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        JlbCodigo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        JpanelIngresar = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jpanelregistrarse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales Vendedor"));

        txtNombrePer.setText("MAURICIO");
        txtNombrePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePerActionPerformed(evt);
            }
        });

        txtIdePer.setText("12345");
        txtIdePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdePerActionPerformed(evt);
            }
        });

        jLabel22.setText("Apellido:");

        txtApellidoPer.setText("BOLAÑOS");
        txtApellidoPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPerActionPerformed(evt);
            }
        });

        jLabel24.setText("Nombre");

        jLabel25.setText("Identificacion: ");

        jLabel28.setText("Codigo: ");

        JlbCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTelefono.setText("3189742");
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel29.setText("Telefono:");

        txtCorreo.setText("MAO12");
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel30.setText("Correo:");

        jLabel31.setText("Password:");

        txtPassword.setText("12345");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelregistrarseLayout = new javax.swing.GroupLayout(Jpanelregistrarse);
        Jpanelregistrarse.setLayout(JpanelregistrarseLayout);
        JpanelregistrarseLayout.setHorizontalGroup(
            JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel30))
                    .addComponent(jLabel31))
                .addGap(74, 74, 74)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelregistrarseLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                        .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoPer, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtNombrePer)
                            .addComponent(txtIdePer)
                            .addComponent(JlbCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JpanelregistrarseLayout.setVerticalGroup(
            JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombrePer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(6, 6, 6)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        JpanelIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar"));

        txtUsuario.setText("mao1");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel27.setText("Contraseña:");

        jLabel26.setText("Usuario:");

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarse!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtContraseña.setText("123");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelIngresarLayout = new javax.swing.GroupLayout(JpanelIngresar);
        JpanelIngresar.setLayout(JpanelIngresarLayout);
        JpanelIngresarLayout.setHorizontalGroup(
            JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario)
                    .addGroup(JpanelIngresarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(txtContraseña))
                .addContainerGap())
        );
        JpanelIngresarLayout.setVerticalGroup(
            JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpanelloginLayout = new javax.swing.GroupLayout(Jpanellogin);
        Jpanellogin.setLayout(JpanelloginLayout);
        JpanelloginLayout.setHorizontalGroup(
            JpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelloginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JpanelloginLayout.setVerticalGroup(
            JpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelloginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(JpanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Jpanellogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Jpanellogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePerActionPerformed
        txtApellidoPer.setEnabled(true);
        txtNombrePer.transferFocus();
    }//GEN-LAST:event_txtNombrePerActionPerformed

    private void txtIdePerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdePerActionPerformed
        txtNombrePer.setEnabled(true);
        txtIdePer.transferFocus();
    }//GEN-LAST:event_txtIdePerActionPerformed

    private void txtApellidoPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPerActionPerformed

        txtApellidoPer.transferFocus();
    }//GEN-LAST:event_txtApellidoPerActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        txtContraseña.setEnabled(true);
        txtUsuario.transferFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            String usu=txtUsuario.getText();
            String pass=txtContraseña.getText();            
            Object dato[][] = CVEN.consultarVendedorUsuario(usu);
            Object dato2[][] = CVEN.consultarVendedorCorreo(usu);
           
            System.out.println("usuario= "+dato2[0][0]+"pass= "+dato[0][1]);
            
            
            if(dato[0][2]==null&&dato[0][3]==null){
                JOptionPane.showMessageDialog(null, " Usuario No Registrado\n Contraseña Incorrecta o Usuario Invalido\n De Lo Contrario Dar Clic En Registrarse!");
                

            }else{
                JOptionPane.showMessageDialog(null, "Bienvenido a Recargas: " + dato2[0][0].toString() + " " + dato2[0][1].toString() + " ☺.");
                GV.txtBienvenido.setText("Bienvenido a Recargas: " + dato2[0][0].toString() + " " + dato2[0][1].toString() + ".");
                String Codigo=dato[0][0].toString();
                GV.txtcodVendedor.setText(Codigo);
                this.setVisible(false);
                GV.setVisible(true);
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Revisar los Datos\n Contraseña Incorrecta o Usuario Invalido\n De Lo Contrario Dar Clic En Registrarse!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Jpanelregistrarse.setVisible(true);
        JpanelIngresar.setVisible(false);
        Random rnd = new Random();
        String abecedario = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        String cadena = "";
        int m = 0, pos = 0, num;
        while (m < 1) {
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            num = (int) (rnd.nextDouble() * 9999 + 1000);
            cadena = cadena + abecedario.charAt(pos) + num;
            pos = (int) (rnd.nextDouble() * abecedario.length() - 1 + 0);
            cadena = cadena + abecedario.charAt(pos);
            JlbCodigo.setText(cadena);
            System.out.println("Cadenaa " + (m + 1) + " : " + cadena + "\n");
            cadena = "";
            m++;
        }
        jButton2.transferFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        txtContraseña.transferFocus();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            CEDULA = txtIdePer.getText();
            CODIGO_VENDEDOR = JlbCodigo.getText();
            NOMBRES = txtNombrePer.getText();
            APELLIDOS = txtApellidoPer.getText();
            TELEFONO = txtTelefono.getText();
            CORREO = txtCorreo.getText();
            PASSWORD = txtPassword.getText();
            Object dato[][] = CVEN.consultarVendedorCodigo(CEDULA);

            
            if (dato[0][1]==null) {
               
                boolean Inserto = CP.insertarPersona(CEDULA, NOMBRES, APELLIDOS, TELEFONO, CORREO);
                Inserto = CVEN.insertarVendedor(CODIGO_VENDEDOR, CEDULA, CORREO, PASSWORD);
                if (Inserto) {
                    JOptionPane.showMessageDialog(null, "Vendedor Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Vendedor no registrado!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }

                Jpanelregistrarse.setVisible(false);
                JpanelIngresar.setVisible(false); 
            } else {
                JOptionPane.showMessageDialog(null, "Vendedor Registrado", "ERROR!", JOptionPane.ERROR_MESSAGE);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtIdePer.setText("");
        txtNombrePer.setText("");
        txtApellidoPer.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbCodigo;
    private javax.swing.JPanel JpanelIngresar;
    private javax.swing.JPanel Jpanellogin;
    private javax.swing.JPanel Jpanelregistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JTextField txtApellidoPer;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdePer;
    private javax.swing.JTextField txtNombrePer;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
