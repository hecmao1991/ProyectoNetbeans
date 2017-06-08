/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.ControlPersona;
import Control.ControlValidaciones;
import Control.ControlVendedor;
import Control.ControlVenta;
import Modelo.Persistencia;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Mauricio
 */
public class GUILogin extends javax.swing.JFrame {

    GUIVenta GV = new GUIVenta();
    ControlPersona CP = new ControlPersona();
    ControlVendedor CVEN = new ControlVendedor();
    ControlValidaciones CValidaciones=new ControlValidaciones();
    ControlVenta CV = new ControlVenta();
    String CEDULA, CODIGO_VENDEDOR, NOMBRES, APELLIDOS, TELEFONO, CORREO, DIRECCION, PASSWORD, PASSWORD2;
    Persistencia p = new Persistencia();

    public GUILogin() {
        initComponents();
        Jpanelregistrarse.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtEmail = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Jlbmensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JpanelIngresar = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jpanelregistrarse.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales Vendedor"));

        txtNombrePer.setText("MAURICIO");
        txtNombrePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePerActionPerformed(evt);
            }
        });
        txtNombrePer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedValidacionLetras(evt);
            }
        });

        txtIdePer.setText("12345");
        txtIdePer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdePerActionPerformed(evt);
            }
        });
        txtIdePer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdePerKeyTyped(evt);
            }
        });

        jLabel22.setText("Apellido:");

        txtApellidoPer.setText("BOLAÑOS");
        txtApellidoPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPerActionPerformed(evt);
            }
        });
        txtApellidoPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                KeyTypedValidacionLetras(evt);
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

        txtEmail.setText("@gmail.com");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel30.setText("Correo:");

        jLabel31.setText("Password:");

        txtPassword.setText("12345");

        jButton3.setText("Guardar");
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

        Jlbmensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton1.setText("validar pass");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelregistrarseLayout = new javax.swing.GroupLayout(Jpanelregistrarse);
        Jpanelregistrarse.setLayout(JpanelregistrarseLayout);
        JpanelregistrarseLayout.setHorizontalGroup(
            JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jlbmensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JpanelregistrarseLayout.createSequentialGroup()
                        .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpanelregistrarseLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel30))
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoPer)
                            .addComponent(txtNombrePer)
                            .addComponent(txtIdePer)
                            .addComponent(JlbCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelregistrarseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
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
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jlbmensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelregistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(16, 16, 16))
        );

        JpanelIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar"));

        txtUsuario.setText("hec1_@hotmail.com");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel27.setText("Contraseña:");

        jLabel26.setText("Correo:");

        BtnOk.setText("Ingresar");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        BtnRegistrarse.setText("Registrarse!");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });

        txtContraseña.setText("12345");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel1.setText("Por favor inserta tu Correo y tu contraseña.");

        jLabel2.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel2.setText("LOGIN");

        javax.swing.GroupLayout JpanelIngresarLayout = new javax.swing.GroupLayout(JpanelIngresar);
        JpanelIngresar.setLayout(JpanelIngresarLayout);
        JpanelIngresarLayout.setHorizontalGroup(
            JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelIngresarLayout.createSequentialGroup()
                        .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(txtContraseña)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelIngresarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BtnOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnRegistrarse))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(JpanelIngresarLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelIngresarLayout.setVerticalGroup(
            JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelIngresarLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpanelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnOk)
                    .addComponent(BtnRegistrarse))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        try {

            String usu = txtUsuario.getText();
            String pass = txtContraseña.getText();
            Object dato[][] = CVEN.consultarVendedorUsuario(usu);
            Object dato2[][] = CVEN.consultarVendedorCorreo(usu);

            System.out.println("usuario= " + dato2[0][0] + "pass= " + dato2[0][1]);
            System.out.println("usuario= " + dato[0][2] + "pass= " + dato[0][3]);

            if (dato[0][2] == null || dato[0][3] == null) {
                JOptionPane.showMessageDialog(null, " Usuario No Registrado\n Contraseña Incorrecta o Usuario Invalido\n De Lo Contrario Dar Clic En Registrarse!");

            } else if (!dato[0][2].equals(usu) || !dato[0][3].equals(pass)) {
                JOptionPane.showMessageDialog(null, " Usuario No Registrado\n Contraseña Incorrecta o Usuario Invalido\n De Lo Contrario Dar Clic En Registrarse!");

            } else {
                JOptionPane.showMessageDialog(null, "Bienvenido a Recargas: " + dato2[0][0].toString() + " " + dato2[0][1].toString() + " ☺.");
                GV.txtBienvenido.setText("Bienvenido a Recargas: " + dato2[0][0].toString() + " " + dato2[0][1].toString() + ".");
                String Codigo = dato[0][0].toString();
                GV.txtcodVendedor.setText(Codigo);
                GV.txtcodVen.setText(CV.GenerarCodigoVenta());
                this.setVisible(false);
                GV.setVisible(true);

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Revisar los Datos\n Contraseña Incorrecta o Usuario Invalido\n De Lo Contrario Dar Clic En Registrarse!");
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    private void BtnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarseActionPerformed
        Jpanelregistrarse.setVisible(true);
        JpanelIngresar.setVisible(false);
        JlbCodigo.setText(CVEN.generarCodigo());

    }//GEN-LAST:event_BtnRegistrarseActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        BtnOk.setEnabled(true);
        BtnRegistrarse.setEnabled(true);
        txtContraseña.transferFocus();
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int aux;            
            CEDULA = txtIdePer.getText();
            CODIGO_VENDEDOR = JlbCodigo.getText();
            NOMBRES = txtNombrePer.getText();
            APELLIDOS = txtApellidoPer.getText();
            TELEFONO = txtTelefono.getText();
            CORREO = txtEmail.getText();
            PASSWORD = txtPassword.getText();

            Object dato[][] = CVEN.consultarVendedorCedula(CEDULA);
            Object dato2[][] = CVEN.consultarVendedorUsuario(CORREO);
            aux = CValidaciones.validaremail(CORREO);
            if (CEDULA.equals("") || NOMBRES.equals("") || APELLIDOS.equals("") || TELEFONO.equals("") || CORREO.equals("") || CODIGO_VENDEDOR.equals("") || PASSWORD.equals("")) {
                JOptionPane.showMessageDialog(null, "ALGUN DATO SE ENCUENTRA VACIO", "DATOS FALTANTES!", JOptionPane.WARNING_MESSAGE);
            }
            else if (dato[0][1] == null) {  
               if (aux == -1||CORREO.equals(dato2[0][2].toString())) {              
                    JOptionPane.showMessageDialog(null, "CORREO INCORRECTO O YA REGISTRADO!", "ERROR!", JOptionPane.ERROR_MESSAGE); 
                    }else{                  
                boolean InsertoP = CP.insertarPersona(CEDULA, NOMBRES, APELLIDOS, TELEFONO, CORREO);             
                boolean InsertoV = CVEN.insertarVendedor(CODIGO_VENDEDOR, CEDULA, CORREO, PASSWORD);
                if (InsertoP==true&&InsertoV==true) {                    
                    JOptionPane.showMessageDialog(null, "Bienvenido a Recargas: " + NOMBRES + " " + APELLIDOS+ " ☺.");
                    GV.txtBienvenido.setText("Bienvenido a Recargas: " + NOMBRES + " " + APELLIDOS + ".");
                    GV.setVisible(true);
                    GV.txtcodVendedor.setText(CODIGO_VENDEDOR);
                    GV.txtcodVen.setText(CV.GenerarCodigoVenta());
                    Jpanelregistrarse.setVisible(false);
                    JpanelIngresar.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "VENDEDOR NO REGISTRADO!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
               }

            }else {
                JOptionPane.showMessageDialog(null, "VENDEDOR YA SE ENCUENTRA REGISTRADO", "ERROR!", JOptionPane.ERROR_MESSAGE);
                System.out.println(dato[0][1]);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "CORREO INCORRECTO!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Jpanelregistrarse.setVisible(false);
        JpanelIngresar.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void KeyTypedValidacionLetras(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyTypedValidacionLetras
               char car = evt.getKeyChar();
               if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_KeyTypedValidacionLetras

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int aux; 
        if ((txtPassword.getText().length()) >= 8 && (txtPassword.getText().length()) <= 16) {
                if (CValidaciones.debil(txtPassword.getText()) == -1) {
                   Jlbmensaje.setForeground(Color.red);
                    Jlbmensaje.setText("Password Debil");
                } else if (CValidaciones.normal(txtPassword.getText()) == -1) {
                    Jlbmensaje.setForeground(Color.ORANGE);
                    Jlbmensaje.setText("Password Normal");
                } else if (CValidaciones.fuerte(txtPassword.getText()) == -1) {
                    Jlbmensaje.setForeground(Color.GREEN);
                    Jlbmensaje.setText("Passwod Fuerte");
                } else {
                    JOptionPane.showMessageDialog(null, "Pasword invalido");                    
                    aux = -1;

                }
         }else{JOptionPane.showMessageDialog(null, "Pasword Minimo 8 y maximo 16 caracteres");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdePerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdePerKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdePerKeyTyped

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
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton BtnRegistrarse;
    private javax.swing.JLabel JlbCodigo;
    private javax.swing.JLabel Jlbmensaje;
    private javax.swing.JPanel JpanelIngresar;
    private javax.swing.JPanel Jpanelregistrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdePer;
    private javax.swing.JTextField txtNombrePer;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
