/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Catgoriaproducto;
import Clases.Conexion;
import Clases.Rubroproducto;
import Clases.Oferta;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Negocio.OfertaNegocio;
import Negocio.Validacion;
import java.sql.Date;
import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public final class CrearOferta extends javax.swing.JFrame {
    
    OfertaNegocio ofertaN = new OfertaNegocio();
    Rubroproducto rubro = new Rubroproducto();
    Catgoriaproducto categoria = new Catgoriaproducto();
    ResultSet rss = null;
    DefaultTableModel ListarTablaProductos ;
    Validacion validacion = new Validacion();
    int idtienda = 0;
   
    
    public CrearOferta() throws ClassNotFoundException, SQLException {
        ListarTablaProductos = new DefaultTableModel(null,getColumna1());
        
         initComponents();
         lblMaxCompras.setVisible(false);
         lblMinCompras.setVisible(false);
         lbldescuento.setVisible(false);
         lblrubro.setVisible(false);
         lblcategoria.setVisible(false);
         CbxRubro.setVisible(false);
         CbxCategoria.setVisible(false);
          this.getContentPane().setBackground(Color.WHITE);
      this.TableListarProductos.setVisible(true);
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

			public boolean isCellEditable(int row, int column) {
				return false;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CbxCategoria = new javax.swing.JComboBox<>();
        btnBuscarProducto = new javax.swing.JButton();
        CbxRubro = new javax.swing.JComboBox<>();
        lblcategoria = new javax.swing.JLabel();
        lblrubro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblIDdelatienda = new javax.swing.JLabel();
        lblIDdelatienda1 = new javax.swing.JLabel();
        lbldescuento = new javax.swing.JLabel();
        lblMinCompras = new javax.swing.JLabel();
        lblMaxCompras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 530));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setText("Porcentaje Descuento");

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel3.setText("N° Minimo de compras");

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel4.setText("N° Maximo de compras");

        BtnRegistarOferta.setBackground(new java.awt.Color(153, 255, 153));
        BtnRegistarOferta.setText("Registrar");
        BtnRegistarOferta.setActionCommand("");
        BtnRegistarOferta.setPreferredSize(new java.awt.Dimension(177, 31));
        BtnRegistarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistarOfertaActionPerformed(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setPreferredSize(new java.awt.Dimension(99, 31));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Producto");

        CbxCategoria.setEnabled(false);

        btnBuscarProducto.setBackground(new java.awt.Color(153, 153, 255));
        btnBuscarProducto.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(51, 51, 0));
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        CbxRubro.setEnabled(false);

        lblcategoria.setText("Categoria");
        lblcategoria.setEnabled(false);

        lblrubro.setText("Rubro");
        lblrubro.setEnabled(false);

        TableListarProductos.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TableListarProductos.setModel(ListarTablaProductos);
        TableListarProductos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        TableListarProductos.setSelectionForeground(new java.awt.Color(0, 0, 51));
        TableListarProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                            .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblrubro)
                            .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblcategoria)
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
                    .addComponent(lblcategoria)
                    .addComponent(lblrubro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel7.setText("Fecha de expiracón");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        lblIDdelatienda.setText("  ");

        lblIDdelatienda1.setText("  ");

        lbldescuento.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lbldescuento.setForeground(new java.awt.Color(255, 51, 51));
        lbldescuento.setText("jLabel5");

        lblMinCompras.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblMinCompras.setForeground(new java.awt.Color(255, 51, 51));
        lblMinCompras.setText("jLabel5");

        lblMaxCompras.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblMaxCompras.setForeground(new java.awt.Color(255, 51, 51));
        lblMaxCompras.setText("jLabel5");

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
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(TxtNMinimo)
                            .addComponent(TxtPorcentajeDescuento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldescuento)
                            .addComponent(lblMinCompras)
                            .addComponent(lblMaxCompras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnRegistarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(lblIDdelatienda)
                    .addContainerGap(728, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(367, 367, 367)
                    .addComponent(lblIDdelatienda1)
                    .addContainerGap(728, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtPorcentajeDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldescuento))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMinCompras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtNMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaxCompras)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRegistarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(lblIDdelatienda)
                    .addContainerGap(241, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(271, 271, 271)
                    .addComponent(lblIDdelatienda1)
                    .addContainerGap(241, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
          
        try {
           // setFilasPorFiltro();
           idtienda = Integer.parseInt(lblIDdelatienda.getText());
           ListarTablaProductos.setColumnIdentifiers(getColumna());
           setFilas();
          this.TableListarProductos.getColumnModel().getColumn(0).setMaxWidth(0);
           this.TableListarProductos.getColumnModel().getColumn(0).setMinWidth(0);
           this.TableListarProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
           this.TableListarProductos.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CrearOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void BtnRegistarOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistarOfertaActionPerformed
         Oferta ofertaObj = new Oferta();
        int filaseleccionada;
        int validado = 0;
          lblMaxCompras.setVisible(false);
         lblMinCompras.setVisible(false);
         lbldescuento.setVisible(false);
         if(validacion.validacionLetras(TxtPorcentajeDescuento.getText())){// validacion de descuento
                    lbldescuento.setText("El descuento no puede tener letras");
                    lbldescuento.setVisible(true);
                    validado++;
                };
                if(TxtPorcentajeDescuento.getText().trim().length()<=0){
                    lbldescuento.setText("El descuento de compras no debe estar vacío");
                         lbldescuento.setVisible(true);
                    validado++;
                       }
                
                if(validacion.validacionLetras(TxtNMaximo.getText())){//validacion de compras maximas
                    lblMaxCompras.setText("El maximo de compras no puede tener letras");
                    lblMaxCompras.setVisible(true);
                    validado++;
                };
                 if(TxtNMaximo.getText().trim().length()<=0){
                    lblMaxCompras.setText("El maximo de compras no debe estar vacío");
                         lblMaxCompras.setVisible(true);
                    validado++;
                       }
                
                if(validacion.validacionLetras(TxtNMinimo.getText())){//validaciones menores
                    lblMinCompras.setText("El minimo de compras no puede tener letras");
                    lblMinCompras.setVisible(true);
                    validado++;}
               
                       if(TxtNMinimo.getText().trim().length()<=0){
                    lblMinCompras.setText("El minimo de compras no debe estar vacío");
                         lblMinCompras.setVisible(true);
                    validado++;
                       }
        if(validado>1){
             JOptionPane.showMessageDialog(null, "Registro no completado","Verifique datos ingresados", JOptionPane.WARNING_MESSAGE);
        }else{
            filaseleccionada =    TableListarProductos.getSelectedRow();
                int dia = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);
                int mes = jDateChooser1.getCalendar().get(Calendar.MONTH);
                int agno = jDateChooser1.getCalendar().get(Calendar.YEAR);
               String fecha = dia+"/"+mes+"/"+agno;
                
        ofertaObj.setMaximoPro(Integer.parseInt(TxtNMaximo.getText()));
        ofertaObj.setMinimoPro(Integer.parseInt(TxtNMinimo.getText()));
        ofertaObj.setFechaLimite(fecha);
        ofertaObj.setPorcentajeDescuento(Integer.parseInt(TxtPorcentajeDescuento.getText()));
        try {
           
           JOptionPane.showMessageDialog(null,ofertaN.crearOferta(ofertaObj,Integer.parseInt(TableListarProductos.getValueAt(filaseleccionada, 0).toString())), "Proceso terminado"
                   , JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar ", "No se registró la oferta", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(CrearOferta.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_BtnRegistarOfertaActionPerformed
 public String [] getColumna(){
        String columna[]= new String[]{"ID","NOMBRE","PRECIO","STOCK","DESCRIPCION","RUBRO","CATEGORIA","MARCA"};
        return columna;
    }
    
    public String [] getColumna1(){
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
        String query =  "SELECT p.ID_PRODUCTO, p.nombre_producto, p.precio_producto, p.stock_producto, p.descripcion_producto, r.nombre_rubro, c.nombre_categoriaprod, m.nombre_marca\n" +
"FROM Producto p ,marca m , CATGORIAPRODUCTO c, rubroproducto r, tienda_produco tp \n" +
"WHERE p.marca_id_marca = m.id_marca and p.catprod_id_catprod= c.id_categoriaproducto and p.rubroproducto_id_rubro = r.id_rubro and tp.producto_id_producto = p.id_producto and tp.tienda_id_tienda = "+idtienda+"";
         sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        Object datos []=new Object[8];
        while(rs.next()){
            for (int i = 0; i < 8; i++) {
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
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Img/iconoV2.png"));


        return retValue;
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
    public javax.swing.JTable TableListarProductos;
    private javax.swing.JTextField TxtNMaximo;
    private javax.swing.JTextField TxtNMinimo;
    private javax.swing.JTextField TxtPorcentajeDescuento;
    private javax.swing.JButton btnBuscarProducto;
    public com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIDdelatienda;
    public javax.swing.JLabel lblIDdelatienda1;
    private javax.swing.JLabel lblMaxCompras;
    private javax.swing.JLabel lblMinCompras;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lbldescuento;
    private javax.swing.JLabel lblrubro;
    // End of variables declaration//GEN-END:variables
}
