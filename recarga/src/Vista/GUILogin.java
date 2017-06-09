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
import java.awt.Image;
import java.awt.Toolkit;
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
        this.setLocationRelativeTo(null);
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
        Jlbmensaje = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnsalir2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JpanelIngresar = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BtnOk = new javax.swing.JButton();
        BtnRegistrarse = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        btnsalir = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsalir1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Jpanelregistrarse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombrePer.setBackground(new java.awt.Color(0, 0, 51));
        txtNombrePer.setForeground(new java.awt.Color(255, 255, 255));
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
        Jpanelregistrarse.add(txtNombrePer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));

        txtIdePer.setBackground(new java.awt.Color(0, 0, 51));
        txtIdePer.setForeground(new java.awt.Color(255, 255, 255));
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
        Jpanelregistrarse.add(txtIdePer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 140, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Apellido:");
        Jpanelregistrarse.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        txtApellidoPer.setBackground(new java.awt.Color(0, 0, 51));
        txtApellidoPer.setForeground(new java.awt.Color(255, 255, 255));
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
        Jpanelregistrarse.add(txtApellidoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 140, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nombre");
        Jpanelregistrarse.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Identificacion: ");
        Jpanelregistrarse.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Codigo Vendedor: ");
        Jpanelregistrarse.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        JlbCodigo.setBackground(new java.awt.Color(0, 0, 51));
        JlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        JlbCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Jpanelregistrarse.add(JlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, 24));

        txtTelefono.setBackground(new java.awt.Color(0, 0, 51));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("3189742");
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        Jpanelregistrarse.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Telefono:");
        Jpanelregistrarse.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 51));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("@gmail.com");
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        Jpanelregistrarse.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 140, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Correo:");
        Jpanelregistrarse.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Password:");
        Jpanelregistrarse.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("12345");
        Jpanelregistrarse.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 140, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Jpanelregistrarse.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        Jlbmensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Jpanelregistrarse.add(Jlbmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 247, 22));

        jButton4.setBackground(new java.awt.Color(0, 0, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Jpanelregistrarse.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Validar Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Jpanelregistrarse.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor inserta tus datos personales.");
        Jpanelregistrarse.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btnsalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        btnsalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir2MouseClicked(evt);
            }
        });
        Jpanelregistrarse.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 40, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-4-610x381.jpg"))); // NOI18N
        Jpanelregistrarse.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 380));

        JpanelIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(0, 0, 51));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("hec1_@hotmail.com");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        JpanelIngresar.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Contraseña:");
        JpanelIngresar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Correo:");
        JpanelIngresar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        BtnOk.setBackground(new java.awt.Color(0, 0, 51));
        BtnOk.setForeground(new java.awt.Color(255, 255, 255));
        BtnOk.setText("Ingresar");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });
        JpanelIngresar.add(BtnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        BtnRegistrarse.setBackground(new java.awt.Color(0, 0, 51));
        BtnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarse.setText("Registrarse!");
        BtnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarseActionPerformed(evt);
            }
        });
        JpanelIngresar.add(BtnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(0, 0, 51));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("12345");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        JpanelIngresar.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 140, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor inserta tu Correo y tu contraseña.");
        JpanelIngresar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/personal.png"))); // NOI18N
        JpanelIngresar.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, -1));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
        });
        JpanelIngresar.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home2.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        JpanelIngresar.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue-wallpaper-4-610x381.jpg"))); // NOI18N
        JpanelIngresar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));

        btnsalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit1.png"))); // NOI18N
        btnsalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir1MouseClicked(evt);
            }
        });
        JpanelIngresar.add(btnsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpanelregistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(JpanelIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono-celular.png"));
        return retValue;
    }
    public void validarpassword(){
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
    }
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
                GUIGeneral GG = new GUIGeneral();
                GG.menu.setVisible(true);
                GG.setVisible(true);                
                this.setVisible(false);
                //GV.setVisible(true);

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
//        try {
            int aux;            
            CEDULA = txtIdePer.getText();
            CODIGO_VENDEDOR = JlbCodigo.getText();
            NOMBRES = txtNombrePer.getText().toUpperCase();
            APELLIDOS = txtApellidoPer.getText().toUpperCase();
            TELEFONO = txtTelefono.getText();
            CORREO = txtEmail.getText();
            PASSWORD = txtPassword.getText();

            Object dato[][] = CVEN.consultarVendedorCedula(CEDULA);
            Object dato2[][] = CVEN.consultarVendedorUsuario(CORREO);
            aux = CValidaciones.validaremail(CORREO);
            if (CEDULA.equals("") || NOMBRES.equals("") || APELLIDOS.equals("") || TELEFONO.equals("") || CORREO.equals("") || CODIGO_VENDEDOR.equals("") || PASSWORD.equals("")) {
                JOptionPane.showMessageDialog(null, "ALGUN DATO SE ENCUENTRA VACIO", "DATOS FALTANTES!", JOptionPane.WARNING_MESSAGE);
            }
            else if (aux == -1) {              
                    JOptionPane.showMessageDialog(null, "CORREO INCORRECTO!", "ERROR!", JOptionPane.ERROR_MESSAGE); 
                    }           
            else if (dato[0][1] == null) {  
                boolean InsertoP = CP.insertarPersona(CEDULA, NOMBRES, APELLIDOS, TELEFONO, CORREO);             
                boolean InsertoV = CVEN.insertarVendedor(CODIGO_VENDEDOR, CEDULA, CORREO, PASSWORD);
                if (InsertoP==true&&InsertoV==true) {                    
                    JOptionPane.showMessageDialog(null, "Bienvenido a Recargas: " + NOMBRES + " " + APELLIDOS+ " ☺.");
                    Jpanelregistrarse.setVisible(false);
                    JpanelIngresar.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "VENDEDOR NO REGISTRADO!", "ERROR!", JOptionPane.ERROR_MESSAGE);
                }
               

            }else {
                JOptionPane.showMessageDialog(null, "VENDEDOR YA SE ENCUENTRA REGISTRADO", "ERROR!", JOptionPane.ERROR_MESSAGE);
                System.out.println(dato[0][1]);
            }
//        } catch (Exception e) {
//            
//            JOptionPane.showMessageDialog(null, "CORREO INCORRECTO!", "ERROR!", JOptionPane.ERROR_MESSAGE);
//            
//        }
        
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
        this.validarpassword();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdePerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdePerKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdePerKeyTyped

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir1MouseClicked

    private void btnsalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir2MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        this.setVisible(false);
        new GUIGeneral().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

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
    public javax.swing.JPanel JpanelIngresar;
    private javax.swing.JPanel Jpanelregistrarse;
    private javax.swing.JLabel btnsalir;
    private javax.swing.JLabel btnsalir1;
    private javax.swing.JLabel btnsalir2;
    private javax.swing.JLabel home;
    private javax.swing.JLabel iconUser;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
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
