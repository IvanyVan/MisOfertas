/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Comuna;
import Clases.Empresa;
import Clases.Region;
import Clases.Tienda;
import Clases.Tipousuario;
import Clases.Usuario;
import Negocio.Registros;
import Negocio.UsuarioNegocio;
import Negocio.Validacion;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class ModificarUsuario extends javax.swing.JFrame {

    ResultSet rss = null;
    ResultSet rssT= null;
     List lista =  new List(); 
     Usuario usuario = new Usuario();
       Tipousuario tusuario =new Tipousuario();
        Tienda tienda =new Tienda();
        Region region = new Region();
        Comuna comuna = new Comuna();
        Empresa empresa = new Empresa();
        Validacion validacion = new Validacion();
        UsuarioNegocio usuarioN = new UsuarioNegocio();

        
    public ModificarUsuario() throws ClassNotFoundException, SQLException {
        initComponents();
         LbErrorNombres.setVisible(false);
         LbErrorApepa.setVisible(false);
         LbErrorDireccion.setVisible(false);
         LbErrorClave.setVisible(false);
         LbErrorTelefono.setVisible(false);
         LbErrorApema.setVisible(false);
         LbErrorCorreo.setVisible(false);
        LbModificado.setVisible(false);
         this.setLocationRelativeTo(null);
         rss= usuario.getUsuario();
         while(rss.next()){
             CbxRut.addItem(rss.getString("RUT_USUARIO"));
         }
         rss= tusuario.getTipoUsuario();
         while(rss.next()){
             CbxRoles.addItem(rss.getString("NOMBRE_TIPOUSUARIO"));
         }
         rss= empresa.getEmpresas();
         while(rss.next()){
             CbxEmpresa.addItem(rss.getString("NOMBRE_EMPRESA"));
         }
         rss= region.getRegiono();
         while(rss.next()){
             CbxRegion.addItem(rss.getString("NOMBRE_REGION"));
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidoPaterno = new javax.swing.JTextField();
        TxtContrasena = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        CbxRoles = new javax.swing.JComboBox<>();
        CbxTiendas = new javax.swing.JComboBox<>();
        BtnModificar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        CbxRut = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtApellidoMaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CbxEmpresa = new javax.swing.JComboBox<>();
        CbxRegion = new javax.swing.JComboBox<>();
        CbxComuna = new javax.swing.JComboBox<>();
        LbModificado = new javax.swing.JLabel();
        LbErrorNombres = new javax.swing.JLabel();
        LbErrorApepa = new javax.swing.JLabel();
        LbErrorApema = new javax.swing.JLabel();
        LbErrorClave = new javax.swing.JLabel();
        LbErrorDireccion = new javax.swing.JLabel();
        LbErrorCorreo = new javax.swing.JLabel();
        LbErrorTelefono = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Rut");

        jLabel6.setText("Rol");

        jLabel7.setText("Tienda");

        CbxRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRolesActionPerformed(evt);
            }
        });

        CbxTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxTiendasActionPerformed(evt);
            }
        });

        BtnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        CbxRut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Usuario" }));
        CbxRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRutActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido Materno");

        jLabel10.setText("Direccion");

        jLabel9.setText("Correo Electronico");

        jLabel11.setText("Telefono");

        jLabel13.setText("Empresa");

        jLabel14.setText("Region");

        jLabel15.setText("Comuna");

        CbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Empresa" }));
        CbxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxEmpresaActionPerformed(evt);
            }
        });

        CbxRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Region" }));
        CbxRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRegionActionPerformed(evt);
            }
        });

        LbModificado.setForeground(new java.awt.Color(255, 0, 0));
        LbModificado.setText("jLabel5");

        LbErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorNombres.setText("jLabel16");

        LbErrorApepa.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorApepa.setText("jLabel17");

        LbErrorApema.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorApema.setText("jLabel18");

        LbErrorClave.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorClave.setText("jLabel19");

        LbErrorDireccion.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorDireccion.setText("jLabel20");

        LbErrorCorreo.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorCorreo.setText("jLabel21");

        LbErrorTelefono.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorTelefono.setText("jLabel22");

        jMenu1.setText("Usuario");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reporte");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(BtnCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbxRut, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtNombre)
                                    .addComponent(TxtApellidoMaterno)
                                    .addComponent(TxtApellidoPaterno)
                                    .addComponent(TxtContrasena)
                                    .addComponent(TxtDireccion)
                                    .addComponent(TxtCorreo)
                                    .addComponent(TxtTelefono)
                                    .addComponent(CbxRoles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxTiendas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxEmpresa, 0, 230, Short.MAX_VALUE)
                                    .addComponent(CbxRegion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxComuna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbErrorNombres)
                                    .addComponent(LbErrorApepa)
                                    .addComponent(LbErrorApema)
                                    .addComponent(LbErrorClave)
                                    .addComponent(LbErrorDireccion)
                                    .addComponent(LbErrorCorreo)
                                    .addComponent(LbErrorTelefono)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(LbModificado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CbxRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorNombres))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorApepa))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorApema))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorClave))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbErrorDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbErrorCorreo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbErrorTelefono))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CbxRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CbxTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CbxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(CbxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(LbModificado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
         Administrador administrador = new Administrador();
        administrador.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
      Registros registro = new Registros();
      int validado=0;
        LbErrorNombres.setVisible(false);
        LbErrorApepa.setVisible(false);
        LbErrorApema.setVisible(false);
        LbErrorClave.setVisible(false);
        LbErrorDireccion.setVisible(false);
        LbErrorCorreo.setVisible(false);
        LbErrorTelefono.setVisible(false);
                
      
        try {
            if (TxtNombre.getText().trim().length()<=0) {
                LbErrorNombres.setText("El nombre no puede estar vacio");
                LbErrorNombres.setVisible(true);
                validado++;
                };
            if(TxtApellidoPaterno.getText().trim().length()<=0){
                LbErrorApepa.setText("El apellido paterno no puede estar vacio");
                LbErrorApepa.setVisible(true);
                validado++;
                };
            if(TxtApellidoMaterno.getText().trim().length()<=0){
                LbErrorApema.setText("El apellido materno no puede estar vacio");
                LbErrorApema.setVisible(true);
                validado++;
                };
                if(TxtContrasena.getText().trim().length()<=0){
                    LbErrorClave.setText("La clave no puede estar vacia");
                    LbErrorClave.setVisible(true);
                    validado++;
                };
                if(TxtDireccion.getText().trim().length()<=0){
                    LbErrorDireccion.setText("La direccion no puede estar vacia");
                    LbErrorDireccion.setVisible(true);
                    validado++;
                };
                if(TxtCorreo.getText().trim().length()<=0){
                    LbErrorCorreo.setText("El correo no puede estar vacio");
                    LbErrorCorreo.setVisible(true);
                    validado++;
                };
                if(TxtTelefono.getText().trim().length()<=0){
                    LbErrorTelefono.setText("El telefono no puede estar vacio");
                    LbErrorTelefono.setVisible(true);
                    validado++;
                };
                if(validacion.validacionNumeros(TxtNombre.getText())){
                    LbErrorNombres.setText("El nombre no puede tener numeros");
                    LbErrorNombres.setVisible(true);
                    validado++;
                };
                if(validacion.validacionNumeros(TxtApellidoPaterno.getText())){
                    LbErrorApepa.setText("El apellido no puede tener numeros");
                    LbErrorApepa.setVisible(true);
                    validado++;
                };
                if(validacion.validacionNumeros(TxtApellidoMaterno.getText())){
                    LbErrorApema.setText("El apellido no puede tener numeros");
                    LbErrorApema.setVisible(true);
                    validado++;
                };
                if(validacion.validacionLetras(TxtTelefono.getText())){
                    LbErrorTelefono.setText("El telefono no puede tener letras");
                    LbErrorTelefono.setVisible(true);
                    validado++;
                };
                if(validado>0){
                    validado=0;
                  
                
                }else{
            usuarioN.ModificarUsuario(5,TxtDireccion.getText(), TxtApellidoPaterno.getText(),CbxRut.getSelectedItem().toString(),
                    TxtApellidoMaterno.getText(),0,TxtContrasena.getText(),0, comuna.getIDxNombre(CbxComuna.getSelectedItem().toString()),
                    TxtNombre.getText(), tusuario.getIDxNombre(CbxRoles.getSelectedItem().toString()),
                    tienda.getIDxNombre(CbxTiendas.getSelectedItem().toString()),TxtCorreo.getText(),
                    0, TxtTelefono.getText());
               JOptionPane.showMessageDialog(null, "Usuario Modificado");
             LbModificado.setText("Usuario Modificado");
             
            
                }
            
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void CbxRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRutActionPerformed
       
        try {
            rss = usuario.getUsuarioRut(CbxRut.getSelectedItem().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(rss.next()){
                TxtNombre.setText(rss.getString("NOMBRE_USUARIO"));
                TxtApellidoPaterno.setText(rss.getString("APEPA_USUARIO"));
                TxtApellidoMaterno.setText(rss.getString("APEMA_USUARIO"));
                TxtContrasena.setText(rss.getString("PASSWORD_USUARIO"));
                TxtDireccion.setText(rss.getString("DIRECCION_USUARIO"));
                TxtCorreo.setText(rss.getString("CORREO_USUARIO"));
                TxtTelefono.setText(rss.getString("TELEFONO_USUARIO"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CbxRutActionPerformed

    private void CbxRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRolesActionPerformed
      
    }//GEN-LAST:event_CbxRolesActionPerformed

    private void CbxTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTiendasActionPerformed

    private void CbxRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRegionActionPerformed
                int idRegion=0; 
            CbxComuna.removeAllItems();
    try {
        rss= region.getRegionID(CbxRegion.getSelectedItem().toString());
        
       
        while (rss.next()){
            idRegion= rss.getInt(1);
            
        }
        
        rss = comuna.getComunaxID(idRegion);
        while (rss.next()){
            CbxComuna.addItem(rss.getString(2));
            
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_CbxRegionActionPerformed

    private void CbxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxEmpresaActionPerformed
                 int idEmpresa=0; 
            CbxTiendas.removeAllItems();
    try {
        rss= empresa.getEmpresasID(CbxEmpresa.getSelectedItem().toString());
        
       
        while (rss.next()){
            idEmpresa= rss.getInt(1);
            
        }
        
        rss = tienda.getTienda(idEmpresa);
        while (rss.next()){
            CbxTiendas.addItem(rss.getString(2));
            
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_CbxEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ModificarUsuario().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ModificarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JComboBox<String> CbxComuna;
    private javax.swing.JComboBox<String> CbxEmpresa;
    private javax.swing.JComboBox<String> CbxRegion;
    private javax.swing.JComboBox<String> CbxRoles;
    private javax.swing.JComboBox<String> CbxRut;
    private javax.swing.JComboBox<String> CbxTiendas;
    private javax.swing.JLabel LbErrorApema;
    private javax.swing.JLabel LbErrorApepa;
    private javax.swing.JLabel LbErrorClave;
    private javax.swing.JLabel LbErrorCorreo;
    private javax.swing.JLabel LbErrorDireccion;
    private javax.swing.JLabel LbErrorNombres;
    private javax.swing.JLabel LbErrorTelefono;
    private javax.swing.JLabel LbModificado;
    private javax.swing.JTextField TxtApellidoMaterno;
    private javax.swing.JTextField TxtApellidoPaterno;
    private javax.swing.JTextField TxtContrasena;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
