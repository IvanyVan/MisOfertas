
package Interfaces;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class ListarProductos extends javax.swing.JFrame {
     int idtienda = 0;
    DefaultTableModel ListarTablaProductos;
    
     

    public ListarProductos() throws SQLException, ClassNotFoundException {
          ListarTablaProductos = new DefaultTableModel(null,getColumna());
          initComponents();
      
         this.setLocationRelativeTo(null);
         this.lblIDdelatienda.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarProductos = new javax.swing.JTable();
        BtnAceptar = new javax.swing.JButton();
        lblIDdelatienda = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCrearOferta = new javax.swing.JMenuItem();
        MenuListarOferta = new javax.swing.JMenuItem();
        MenuModificarOferta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuRegistarProducto = new javax.swing.JMenuItem();
        MenuListarProductos = new javax.swing.JMenuItem();
        MenuModificarProducto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuReporteOferta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableListarProductos.setModel(ListarTablaProductos);
        jScrollPane1.setViewportView(TableListarProductos);

        BtnAceptar.setText("Aceptar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        lblIDdelatienda.setText("  ");

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jMenu1.setText("Ofertas");

        MenuCrearOferta.setText("Crear Oferta");
        jMenu1.add(MenuCrearOferta);

        MenuListarOferta.setText("Listar Ofertas");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273)
                        .addComponent(lblIDdelatienda)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BtnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIDdelatienda))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
      dispose();        
    }//GEN-LAST:event_BtnAceptarActionPerformed

    private void MenuRegistarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistarProductoActionPerformed
        try {
            RegistrarProducto registraroferta =  new RegistrarProducto();
            registraroferta.setVisible(true);
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EncargadoTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuRegistarProductoActionPerformed

    private void MenuReporteOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteOfertaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuReporteOfertaActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        
         idtienda = Integer.parseInt(this.lblIDdelatienda.getText());
         try {
             setFilas();
         } catch (SQLException | ClassNotFoundException ex) {
             Logger.getLogger(ListarProductos.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnListarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ListarProductos().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(ListarProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JMenuItem MenuCrearOferta;
    private javax.swing.JMenuItem MenuListarOferta;
    private javax.swing.JMenuItem MenuListarProductos;
    private javax.swing.JMenuItem MenuModificarOferta;
    private javax.swing.JMenuItem MenuModificarProducto;
    private javax.swing.JMenuItem MenuRegistarProducto;
    private javax.swing.JMenuItem MenuReporteOferta;
    public javax.swing.JTable TableListarProductos;
    private javax.swing.JButton btnListar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIDdelatienda;
    // End of variables declaration//GEN-END:variables
}
