package Interfaces;

import Clases.Empresa;
import Clases.Tienda;
import Negocio.Validacion;
import Negocio.HasharClave;
//import com.sun.xml.internal.ws.api.message.Message;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class InicioSesion extends javax.swing.JFrame {

    Tienda ti = new Tienda();
    Empresa emp = new Empresa();
    Validacion validacion = new Validacion();

    public InicioSesion() {
        initComponents();
        LbError.setVisible(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtUsuarioRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtClave = new javax.swing.JPasswordField();
        BtnInicioSesion = new javax.swing.JButton();
        LbError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("RUT");

        TxtUsuarioRut.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA");

        TxtClave.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        TxtClave.setEchoChar('\u2022');

        BtnInicioSesion.setBackground(new java.awt.Color(204, 255, 204));
        BtnInicioSesion.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        BtnInicioSesion.setText("INGRESAR");
        BtnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioSesionActionPerformed(evt);
            }
        });

        LbError.setForeground(new java.awt.Color(204, 0, 0));
        LbError.setText("Contraseña o Usuario Erroneo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconocompleto.png"))); // NOI18N
        jLabel4.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtUsuarioRut, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LbError)
                            .addComponent(BtnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsuarioRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(BtnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LbError)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        TxtUsuarioRut.getAccessibleContext().setAccessibleName("NombreUsuarioTxt");
        BtnInicioSesion.getAccessibleContext().setAccessibleName("");
        BtnInicioSesion.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioSesionActionPerformed
        ResultSet rs = null;
        boolean validado;
<<<<<<< HEAD
        if (validacion.isValidRut(TxtUsuarioRut.getText()) == true) {

            try {
                validado = validacion.validarUsuario(TxtUsuarioRut.getText(), TxtClave.getText());
                if (validado == true) {
                    if (validacion.devolverTipo(TxtUsuarioRut.getText(), TxtClave.getText()).equals("1")) {
                        Administrador administrador = new Administrador();
                        administrador.setVisible(true);
                        dispose();
                    }
                    if (validacion.devolverTipo(TxtUsuarioRut.getText(), TxtClave.getText()).equals("2")) {
                        EncargadoTienda encargadoTienda = new EncargadoTienda();
                        rs = validacion.devolverUsuariocompleto(TxtUsuarioRut.getText(), TxtClave.getText());
                         //Extraemos los datos del usuario y los colocaremos en la siguiente pantalla 
                        while (rs.next()) {
                            //Se concatena Nombre empleado, apellido paterno y apellido materno
                            encargadoTienda.lblempleado.setText(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                            //Rut del usuario
                            encargadoTienda.lblIdEmpleado.setText(rs.getString(1));
                            //id de la tienda a la cual esta asignado 
                            encargadoTienda.lblIdEmpresa.setText(rs.getString(5));
                            //nos devuelve el nombre de la tienda segun su id 
                            encargadoTienda.lbltienda.setText(rs.getString(6));
                            // nos devuelve el nombre de la empresa a la cual la tienda asignada
                            encargadoTienda.lblempresa.setText(rs.getString(7));
                        }
                        encargadoTienda.setVisible(true);
                        dispose();
                    }
                    if (validacion.devolverTipo(TxtUsuarioRut.getText(), TxtClave.getText()).equals("3")) {
                        Gerente gerente = new Gerente();
                        gerente.setVisible(true);
                        dispose();
                    }
                    if (validacion.devolverTipo(TxtUsuarioRut.getText(), TxtClave.getText()).equals("4")) {
                        LbError.setText("Este usuario esta inhabilitado");
                        LbError.setVisible(true);
                    }
                } else {
=======
        HasharClave hs = new HasharClave();
        if (validacion.isValidRut(TxtUsuarioRut.getText())==true) {
            String ClaveHash = hs.MD5(TxtClave.getText());
        
        try {
          validado = validacion.validarUsuario(TxtUsuarioRut.getText(), ClaveHash);
            if (validado==true) {
                if(validacion.devolverTipo(TxtUsuarioRut.getText(), ClaveHash).equals("1")){
                    Administrador administrador = new Administrador();
                    administrador.setVisible(true);
                    
                    dispose();
                }if(validacion.devolverTipo(TxtUsuarioRut.getText(), ClaveHash).equals("2")){
                  EncargadoTienda encargadoTienda = new EncargadoTienda();
                  rs= validacion.devolverUsuariocompleto(TxtUsuarioRut.getText(), ClaveHash);
                  
                   while (rs.next()) {     //Extraemos los datos del usuario y los colocaremos en la siguiente pantalla       
            encargadoTienda.lblempleado.setText(rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));//nombre apellido apellido
                    encargadoTienda.lblIdEmpleado.setText(rs.getString(1));//id del usuario
                    encargadoTienda.lblIdEmpresa.setText(rs.getString(5));//id de la tienda a la cual esta asignado 
                    encargadoTienda.lbltienda.setText(ti.getNombreTiendaStringxEmpresa(Integer.parseInt(rs.getString(5)))); // nos devuelve el nombre de la tienda segun su id 
                    encargadoTienda.lblempresa.setText(emp.getNombreEmpresa(Integer.parseInt(rs.getString(5))));// nos devuelve el nombre de la empresa a la cual la tienda asignada
                  }
                   
                  encargadoTienda.setVisible(true);
                    dispose();  
                }if(validacion.devolverTipo(TxtUsuarioRut.getText(), ClaveHash).equals("3")){
                    Gerente gerente = new Gerente();
                    gerente.setVisible(true);
                    
                    dispose();
                }
                if(validacion.devolverTipo(TxtUsuarioRut.getText(), ClaveHash).equals("4")){
                    
                    LbError.setText("Este usuario esta inhabilitado");
>>>>>>> origin/master
                    LbError.setVisible(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            LbError.setText("Ingrese un rut valido, sin puntos y guión.");
            LbError.setVisible(true);
        }
        TxtUsuarioRut.setText("");
        TxtClave.setText("");
    }//GEN-LAST:event_BtnInicioSesionActionPerformed
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/iconoV2.png"));

        return retValue;
    }

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        }
        );

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInicioSesion;
    private javax.swing.JLabel LbError;
    private javax.swing.JPasswordField TxtClave;
    private javax.swing.JTextField TxtUsuarioRut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
