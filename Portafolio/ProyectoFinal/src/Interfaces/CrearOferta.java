/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Catgoriaproducto;
import Clases.Conexion;
import Clases.Rubroproducto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Eduardo
 */
public final class CrearOferta extends javax.swing.JFrame {

    Rubroproducto rubro = new Rubroproducto();
    Catgoriaproducto categoria = new Catgoriaproducto();
    ResultSet rss = null;
    DefaultTableModel ListarTablaProductos ;
    
    int idtienda = 0;
   
    
    public CrearOferta() throws ClassNotFoundException, SQLException {
        ListarTablaProductos = new DefaultTableModel(null,getColumna());
         initComponents();
         
       
        this.lblIDdelatienda.setVisible(false);
        this.setLocationRelativeTo(null);
        rss = rubro.getRubroProd();
        while (rss.next()) {    
            CbxRubro.addItem(rss.getString("NOMBRE_RUBRO"));
        }
        rss = categoria.getCategoriaProds();
        while (rss.next()) {    
            CbxCategoria.addItem(rss.getString("NOMBRE_CATEGORIAPROD"));
        }
        
          //TableListarProductos = new DefaultTableModel(null,getColumna());
        //setFilas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtPorcentajeDescuento = new javax.swing.JTextField();
        TxtNMinimo = new javax.swing.JTextField();
        TxtNMaximo = new javax.swing.JTextField();
        BtnRegistarOferta = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        LbNombreUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CbxCategoria = new javax.swing.JComboBox<>();
        btnBuscarProducto = new javax.swing.JButton();
        CbxRubro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblIDdelatienda = new javax.swing.JLabel();
        lblIDdelatienda1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuListarOferta = new javax.swing.JMenuItem();
        MenuModificarOferta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuRegistarProducto = new javax.swing.JMenuItem();
        MenuListarProductos = new javax.swing.JMenuItem();
        MenuModificarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuReporteOferta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Porcentaje Descuento");

        jLabel3.setText("N° Minimo de compras");

        jLabel4.setText("N° Maximo de compras");

        BtnRegistarOferta.setText("Registrar");
        BtnRegistarOferta.setActionCommand("");

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        LbNombreUsuario.setText("Nombre Usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Producto");

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria");

        jLabel6.setText("Rubro");

        TableListarProductos.setModel(ListarTablaProductos);
        jScrollPane1.setViewportView(TableListarProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnBuscarProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(112, 112, 112))
                            .addComponent(CbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setText("Fecha de expiracón");

        lblIDdelatienda.setText("  ");

        lblIDdelatienda1.setText("  ");

        jMenu1.setText("Ofertas");

        MenuListarOferta.setText("Listar Ofertas");
        MenuListarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarOfertaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuListarOferta);

        MenuModificarOferta.setText("Modificar Oferta");
        jMenu1.add(MenuModificarOferta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");

        MenuRegistarProducto.setText("Registrar Producto");
        MenuRegistarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRegistarProducto);

        MenuListarProductos.setText("Listar Productos");
        MenuListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarProductosActionPerformed(evt);
            }
        });
        jMenu2.add(MenuListarProductos);

        MenuModificarProducto.setText("Modificar Producto");
        jMenu2.add(MenuModificarProducto);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");

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
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(LbNombreUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtNMaximo)
                                            .addComponent(TxtNMinimo)
                                            .addComponent(TxtPorcentajeDescuento)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(BtnRegistarOferta)
                                        .addGap(38, 38, 38)
                                        .addComponent(BtnCancelar)))
                                .addGap(128, 128, 128)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(lblIDdelatienda)
                    .addContainerGap(368, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(lblIDdelatienda1)
                    .addContainerGap(368, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtPorcentajeDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegistarOferta)
                    .addComponent(BtnCancelar))
                .addGap(62, 62, 62)
                .addComponent(LbNombreUsuario)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(lblIDdelatienda)
                    .addContainerGap(272, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(lblIDdelatienda1)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuListarOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarOfertaActionPerformed
        // TODO add your handling code here:
        ListarOfertas paginanueva =  new ListarOfertas();
        paginanueva.setVisible(true);
        dispose();

    }//GEN-LAST:event_MenuListarOfertaActionPerformed

    private void MenuRegistarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistarProductoActionPerformed
        try {
            // TODO add your handling code here:
            RegistrarProducto registraroferta =  new RegistrarProducto();
            registraroferta.setVisible(true);
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRegistarProductoActionPerformed

    private void MenuListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarProductosActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ListarProductos listarproductos =  new ListarProductos();
            listarproductos.setVisible(true);
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuListarProductosActionPerformed

    private void MenuReporteOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteOfertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReporteOfertaActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
          
        try {
           // setFilasPorFiltro();
           idtienda = Integer.parseInt(lblIDdelatienda.getText());
           setFilas();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CrearOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    public String [] getColumna(){
        String columna[]= new String[]{"NOMBRE","PRECIO","STOCK","DESCRIPCION","RUBRO","CATEGORIA","MARCA"};
        return columna;
    }
    
    public void setFilas() throws SQLException, ClassNotFoundException{
  ListarTablaProductos.setRowCount(0);
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query =  "SELECT p.nombre_producto, p.precio_producto, p.stock_producto, p.descripcion_producto, r.nombre_rubro, c.nombre_categoriaprod, m.nombre_marca\n" +
"FROM Producto p ,marca m , CATGORIAPRODUCTO c, rubroproducto r, tienda_produco tp \n" +
"WHERE p.marca_id_marca = m.id_marca and p.catprod_id_catprod= c.id_categoriaproducto and p.rubroproducto_id_rubro = r.id_rubro and tp.producto_id_producto = p.id_producto and tp.tienda_id_tienda = "+idtienda+"";
         sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        Object datos []=new Object[7];
        while(rs.next()){
            for (int i = 0; i < 7; i++) {
                datos[i]= rs.getObject(i+1);
            }
             ListarTablaProductos.addRow(datos);
        }
        rs.close();
    }
    
      public void setFilasPorFiltro() throws SQLException, ClassNotFoundException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query =  "SELECT p.nombre_producto, p.precio_producto, p.stock_producto, p.descripcion_producto, r.nombre_rubro, c.nombre_categoriaprod, m.nombre_marca\n" +
"FROM Producto p ,marca m , CATGORIAPRODUCTO c, rubroproducto r \n" +
"WHERE p.marca_id_marca = m.id_marca and p.catprod_id_catprod= "+categoria.getCategoriaID(CbxCategoria.getSelectedItem().toString())+" and"
                + " p.rubroproducto_id_rubro = "+rubro.getRubroporID(CbxRubro.getSelectedItem().toString())+"";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        Object datos []=new Object[7];
        while(rs.next()){
            for (int i = 0; i < 7; i++) {
                datos[i]= rs.getObject(i+1);
            }
             ListarTablaProductos.addRow(datos);
        }
        rs.close();
    }
    
    
  
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
            java.util.logging.Logger.getLogger(CrearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearOferta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrearOferta().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(CrearOferta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnRegistarOferta;
    private javax.swing.JComboBox<String> CbxCategoria;
    private javax.swing.JComboBox<String> CbxRubro;
    private javax.swing.JLabel LbNombreUsuario;
    private javax.swing.JMenuItem MenuListarOferta;
    private javax.swing.JMenuItem MenuListarProductos;
    private javax.swing.JMenuItem MenuModificarOferta;
    private javax.swing.JMenuItem MenuModificarProducto;
    private javax.swing.JMenuItem MenuRegistarProducto;
    private javax.swing.JMenuItem MenuReporteOferta;
    public javax.swing.JTable TableListarProductos;
    private javax.swing.JTextField TxtNMaximo;
    private javax.swing.JTextField TxtNMinimo;
    private javax.swing.JTextField TxtPorcentajeDescuento;
    private javax.swing.JButton btnBuscarProducto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIDdelatienda;
    public javax.swing.JLabel lblIDdelatienda1;
    // End of variables declaration//GEN-END:variables
}
