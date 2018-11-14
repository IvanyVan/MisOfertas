
package Interfaces;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class EncargadoTienda extends javax.swing.JFrame {

    /**
     * Creates new form EncargadoTienda
     */
    public EncargadoTienda() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.WHITE);
         lblIdEmpresa.setVisible(false);
         lblIdEmpleado.setVisible(false);
         lblIdTienda.setVisible(false);
         jMenu3.setVisible(false);
         MenuModificarOferta.setVisible(false);
         MenuModificarProducto.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblIdEmpleado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblempresa = new javax.swing.JLabel();
        lbltienda = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        lblIdEmpresa = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblIdTienda = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCrearOferta = new javax.swing.JMenuItem();
        MenuListarOferta = new javax.swing.JMenuItem();
        MenuModificarOferta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuRegistrarProducto = new javax.swing.JMenuItem();
        MenuListarProductos = new javax.swing.JMenuItem();
        MenuModificarProducto = new javax.swing.JMenuItem();
        mnuEliminarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuReporteOferta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Empresa:");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Bienvenido:");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Tienda:");

        lblIdEmpleado.setEnabled(false);

        lblempresa.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        lblempresa.setText("empresa");

        lbltienda.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        lbltienda.setText("tienda");

        lblempleado.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        lblempleado.setText("empleado");

        lblIdEmpresa.setEnabled(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconocompleto.png"))); // NOI18N
        jLabel6.setText(" ");

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 102));

        jMenu1.setText("Ofertas");
        jMenu1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N

        MenuCrearOferta.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuCrearOferta.setText("Crear Oferta");
        MenuCrearOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCrearOfertaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCrearOferta);

        MenuListarOferta.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuListarOferta.setText("Listar Ofertas");
        MenuListarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarOfertaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuListarOferta);

        MenuModificarOferta.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuModificarOferta.setText("Modificar Oferta");
        jMenu1.add(MenuModificarOferta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N

        MenuRegistrarProducto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuRegistrarProducto.setText("Registrar Producto");
        MenuRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRegistrarProducto);

        MenuListarProductos.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuListarProductos.setText("Listar Productos");
        MenuListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuListarProductos);

        MenuModificarProducto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuModificarProducto.setText("Modificar Producto");
        MenuModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuModificarProducto);

        mnuEliminarProducto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mnuEliminarProducto.setText("Eliminar producto");
        mnuEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuEliminarProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N

        MenuReporteOferta.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        MenuReporteOferta.setText("Generar Reporte");
        MenuReporteOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporteOfertaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuReporteOferta);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltienda, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(lblempleado, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(lblempresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(588, 588, 588)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 600, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblIdTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblempleado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblempresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbltienda))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuReporteOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteOfertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReporteOfertaActionPerformed

    private void MenuRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarProductoActionPerformed
        try {
            // TODO add your handling code here:
            RegistrarProducto registraroferta =  new RegistrarProducto();
            
            //this.rootPane.getContentPane().add(registraroferta);
            //registraroferta.lblIDEMPRESAUSAR.setText(this.lblIdEmpresa.getText());
            registraroferta.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRegistrarProductoActionPerformed

    private void MenuListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarProductosActionPerformed
         try {
            ListarProductos listarproductos =  new ListarProductos();
            listarproductos.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuListarProductosActionPerformed

    private void MenuCrearOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCrearOfertaActionPerformed
        // TODO add your handling code here:
        CrearOferta crearoferta = null;
        try {
            crearoferta = new CrearOferta();
            crearoferta.lblIDdelatienda.setText(this.lblIdEmpresa.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        crearoferta.setVisible(true);
    }//GEN-LAST:event_MenuCrearOfertaActionPerformed

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/iconoV2.png"));


        return retValue;
    }
    
    private void MenuListarOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarOfertaActionPerformed
        // TODO add your handling code here:
          ListarOferta paginanueva = null;
        try {
            paginanueva = new ListarOferta();
            paginanueva.lblIDdelatienda.setText(this.lblIdEmpresa.getText());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        paginanueva.setVisible(true);
    }//GEN-LAST:event_MenuListarOfertaActionPerformed

    private void MenuModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarProductoActionPerformed
        frmModificarProductos objFrmModificarP = new frmModificarProductos(this, rootPaneCheckingEnabled);
        objFrmModificarP.setVisible(true);
    }//GEN-LAST:event_MenuModificarProductoActionPerformed

    private void mnuEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarProductoActionPerformed
        frmEliminarProductos objFrmEliminar = new frmEliminarProductos(this, rootPaneCheckingEnabled);
        objFrmEliminar.setVisible(true);
    }//GEN-LAST:event_mnuEliminarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(EncargadoTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncargadoTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncargadoTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncargadoTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncargadoTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCrearOferta;
    private javax.swing.JMenuItem MenuListarOferta;
    private javax.swing.JMenuItem MenuListarProductos;
    private javax.swing.JMenuItem MenuModificarOferta;
    private javax.swing.JMenuItem MenuModificarProducto;
    private javax.swing.JMenuItem MenuRegistrarProducto;
    private javax.swing.JMenuItem MenuReporteOferta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel lblIdEmpleado;
    public javax.swing.JLabel lblIdEmpresa;
    public javax.swing.JLabel lblIdTienda;
    public javax.swing.JLabel lblempleado;
    public javax.swing.JLabel lblempresa;
    public javax.swing.JLabel lbltienda;
    private javax.swing.JMenuItem mnuEliminarProducto;
    // End of variables declaration//GEN-END:variables
}
