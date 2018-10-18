/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Comuna;
import Clases.Empresa;
import Clases.Tienda;
import Clases.Tipousuario;
import Clases.Region;
import Negocio.Registros;
import Negocio.UsuarioNegocio;
import Negocio.Validacion;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class RegistarUsuario extends javax.swing.JFrame {
    ResultSet rss = null;
 UsuarioNegocio usuarioN = new UsuarioNegocio();
        Tipousuario tusuario =new Tipousuario();
        Tienda tienda =new Tienda();
        Region region = new Region();
        Comuna comuna = new Comuna();
        Empresa empresa = new Empresa();
     Validacion validacion = new Validacion();

        
        
     
    public RegistarUsuario() throws ClassNotFoundException, SQLException {
        initComponents();
         this.setLocationRelativeTo(null);
         LbErrorNombres.setVisible(false);
         LbErrorApepa.setVisible(false);
         LbErroDireccion.setVisible(false);
         LbErroRut.setVisible(false);
         LbErrorClave.setVisible(false);
         LbErrorTelefono.setVisible(false);
         LbErrorApMa.setVisible(false);
         LbErrorCorreo.setVisible(false);
        rss = tusuario.getTipoUsuario();
        while (rss.next()) {    
             CbxRoles.addItem(rss.getString("NOMBRE_TIPOUSUARIO"));
        }
         
        
         rss = region.getRegiono();
        while (rss.next()){
            CbxRegion.addItem(rss.getString("NOMBRE_REGION"));
        }
        rss = empresa.getEmpresas();
        while(rss.next()){
            CbxEmpresa.addItem(rss.getString("NOMBRE_EMPRESA"));
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        TxtApellidoPaterno = new javax.swing.JTextField();
        TxtRut = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        CbxRoles = new javax.swing.JComboBox<>();
        CbxTiendas = new javax.swing.JComboBox<>();
        TxtContrasena = new javax.swing.JTextField();
        Region = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CbxRegion = new javax.swing.JComboBox<>();
        CbxComuna = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtApellidoMaterno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TxtCorreoElectronico = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CbxEmpresa = new javax.swing.JComboBox<>();
        LbErrorNombre = new javax.swing.JLabel();
        LbErrorNombres = new javax.swing.JLabel();
        LbErrorApepa = new javax.swing.JLabel();
        LbErrorApMa = new javax.swing.JLabel();
        LbErroRut = new javax.swing.JLabel();
        LbErrorClave = new javax.swing.JLabel();
        LbErroDireccion = new javax.swing.JLabel();
        LbErrorCorreo = new javax.swing.JLabel();
        LbErrorTelefono = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ListarUsuario = new javax.swing.JMenuItem();
        ModificarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Rut");

        jLabel5.setText("Direccion");

        jLabel6.setText("Rol");

        jLabel7.setText("Tienda");

        BtnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnRegistrar.setText("Registrar");
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });

        BtnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

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

        Region.setText("Región");

        jLabel9.setText("Comuna");

        CbxRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Región" }));
        CbxRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CbxRegionMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CbxRegionMousePressed(evt);
            }
        });
        CbxRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRegionActionPerformed(evt);
            }
        });

        CbxComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxComunaActionPerformed(evt);
            }
        });

        jLabel8.setText("Apellido Materno");

        jLabel10.setText("Correo Electronico");

        jLabel11.setText("Telefono");

        jLabel12.setText("Empresa");

        CbxEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Empresa" }));
        CbxEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbxEmpresaMouseClicked(evt);
            }
        });
        CbxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxEmpresaActionPerformed(evt);
            }
        });

        LbErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorNombres.setText("jLabel13");

        LbErrorApepa.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorApepa.setText("jLabel13");

        LbErrorApMa.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorApMa.setText("jLabel13");

        LbErroRut.setForeground(new java.awt.Color(255, 0, 0));
        LbErroRut.setText("jLabel13");

        LbErrorClave.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorClave.setText("jLabel13");

        LbErroDireccion.setForeground(new java.awt.Color(255, 0, 0));
        LbErroDireccion.setText("jLabel13");

        LbErrorCorreo.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorCorreo.setText("jLabel13");

        LbErrorTelefono.setForeground(new java.awt.Color(255, 0, 0));
        LbErrorTelefono.setText("jLabel13");

        jMenu1.setText("Usuario");

        ListarUsuario.setText("Listar Usuarios");
        ListarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(ListarUsuario);

        ModificarUsuario.setText("Modificar Usuario");
        ModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reporte");

        jMenuItem3.setText("Generar BI");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbErrorApepa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LbErrorNombres))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(Region)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addComponent(BtnCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CbxComuna, javax.swing.GroupLayout.Alignment.LEADING, 0, 294, Short.MAX_VALUE)
                                    .addComponent(CbxRegion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxTiendas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxEmpresa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CbxRoles, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCorreoElectronico, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRut, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbErrorApMa)
                                    .addComponent(LbErroRut)
                                    .addComponent(LbErrorClave)
                                    .addComponent(LbErroDireccion)
                                    .addComponent(LbErrorCorreo)
                                    .addComponent(LbErrorTelefono))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(LbErrorNombre)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LbErrorNombre)
                    .addComponent(LbErrorNombres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbErrorApepa))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbErrorApMa))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbErroRut))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbErrorClave))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LbErroDireccion))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel12)
                    .addComponent(CbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(CbxTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Region)
                            .addComponent(CbxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(CbxComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
     Registros registro = new Registros();
        int validado = 0;
        LbErrorNombres.setVisible(false);
        LbErrorApepa.setVisible(false);
        LbErrorApMa.setVisible(false);
        LbErroRut.setVisible(false);
        LbErrorClave.setVisible(false);
        LbErroDireccion.setVisible(false);
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
                LbErrorApMa.setText("El apellido materno no puede estar vacio");
                LbErrorApMa.setVisible(true);
                validado++;
                };
                if(TxtRut.getText().trim().length()<=0){
                    LbErroRut.setText("El rut no puede estar vacio");
                    LbErroRut.setVisible(true);
                    validado++;
                };
                if(TxtContrasena.getText().trim().length()<=0){
                    LbErrorClave.setText("La clave no puede estar vacia");
                    LbErrorClave.setVisible(true);
                    validado++;
                };
                if(TxtDireccion.getText().trim().length()<=0){
                    LbErroDireccion.setText("La direccion no puede estar vacia");
                    LbErroDireccion.setVisible(true);
                    validado++;
                };
                if(TxtCorreoElectronico.getText().trim().length()<=0){
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
                    LbErrorApMa.setText("El apellido no puede tener numeros");
                    LbErrorApMa.setVisible(true);
                    validado++;
                };
                if(validacion.validacionLetras(TxtTelefono.getText())){
                    LbErrorTelefono.setText("El telefono no puede tener letras");
                    LbErrorTelefono.setVisible(true);
                    validado++;
                };
//                if(validacion.validarRut(TxtRut.getText())){
//                    LbErroRut.setText("Rut invalido");
//                    LbErroRut.setVisible(true);
//                };
                if(validado>0){
                    validado=0;
                    
                }
             else {
                usuarioN.RegistrarUsuario(5, TxtDireccion.getText(), TxtApellidoPaterno.getText(), TxtRut.getText(),
                    TxtApellidoMaterno.getText(),0, TxtContrasena.getText(),0,comuna.getIDxNombre(CbxComuna.getSelectedItem().toString()),
                    TxtNombre.getText(),tusuario.getIDxNombre(CbxRoles.getSelectedItem().toString()),
                    tienda.getIDxNombre(CbxTiendas.getSelectedItem().toString()),//tienda
                    TxtCorreoElectronico.getText(),0,TxtTelefono.getText() );
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
                
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnRegistrarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Administrador administrador = new Administrador();
        administrador.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void CbxComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxComunaActionPerformed
        
    }//GEN-LAST:event_CbxComunaActionPerformed

    
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

    private void ListarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarUsuarioActionPerformed
            ListarUsuarios listar = null;
        try {
            listar = new ListarUsuarios();
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
         listar.setVisible(true);
       
    }//GEN-LAST:event_ListarUsuarioActionPerformed

    private void ModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUsuarioActionPerformed
        ModificarUsuario modificar = null;
    try {
        modificar = new ModificarUsuario();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }
        modificar.setVisible(true);
        dispose();
    }//GEN-LAST:event_ModificarUsuarioActionPerformed

    private void CbxTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTiendasActionPerformed
        
    }//GEN-LAST:event_CbxTiendasActionPerformed

    private void CbxEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxEmpresaMouseClicked

    }//GEN-LAST:event_CbxEmpresaMouseClicked

    private void CbxRegionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxRegionMouseEntered
        // TODO add your handling code here:
   
        
        
        
    }//GEN-LAST:event_CbxRegionMouseEntered

    private void CbxRegionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxRegionMousePressed
       
    }//GEN-LAST:event_CbxRegionMousePressed

    private void CbxRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxRolesActionPerformed

    private void CbxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxEmpresaActionPerformed
        // TODO add your handling code here:
              CbxTiendas.removeAllItems();
          int idEmpresa=0; 
             rss = null;
    try {
        rss = empresa.getEmpresasID(CbxEmpresa.getSelectedItem().toString());
        //rss= tienda.getTienda(Integer.parseInt(CbxEmpresa.getSelectedItem().toString()));
        
       
        while (rss.next()){
            idEmpresa= rss.getInt(1);
        }
        
       rss = tienda.getTienda(idEmpresa);
        while (rss.next()){
            CbxTiendas.addItem(rss.getString(2));
            
        }
        rss.close();
        
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
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RegistarUsuario().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(RegistarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistrar;
    public javax.swing.JComboBox<String> CbxComuna;
    private javax.swing.JComboBox<String> CbxEmpresa;
    public javax.swing.JComboBox<String> CbxRegion;
    public javax.swing.JComboBox<String> CbxRoles;
    public javax.swing.JComboBox<String> CbxTiendas;
    private javax.swing.JLabel LbErroDireccion;
    private javax.swing.JLabel LbErroRut;
    private javax.swing.JLabel LbErrorApMa;
    private javax.swing.JLabel LbErrorApepa;
    private javax.swing.JLabel LbErrorClave;
    private javax.swing.JLabel LbErrorCorreo;
    private javax.swing.JLabel LbErrorNombre;
    private javax.swing.JLabel LbErrorNombres;
    private javax.swing.JLabel LbErrorTelefono;
    private javax.swing.JMenuItem ListarUsuario;
    private javax.swing.JMenuItem ModificarUsuario;
    private javax.swing.JLabel Region;
    private javax.swing.JTextField TxtApellidoMaterno;
    private javax.swing.JTextField TxtApellidoPaterno;
    private javax.swing.JTextField TxtContrasena;
    private javax.swing.JTextField TxtCorreoElectronico;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

   
}
