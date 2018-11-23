package Interfaces;

import Clases.Catgoriaproducto;
import Clases.Marca;
import Clases.Producto;
import Clases.RedibujarTabla;
import Clases.Rubroproducto;
import Negocio.ProductoNegocio;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Eduardo
 */
public class ListarProductos extends javax.swing.JFrame {
    ResultSet rss = null;
    Catgoriaproducto catprod = new Catgoriaproducto();
    Marca marca = new Marca();
            
    
    private TableRowSorter trsfiltro;

    public ListarProductos() throws SQLException, ClassNotFoundException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
        rss = catprod.getCategoriaProds();
        while (rss.next()) {
            CbxCategoria.addItem(rss.getString("NOMBRE_CATEGORIA"));
        }
        try {
            cargarTabla(TableListarProductos);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ListarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rss = marca.getMarcaProd();
        while (rss.next()) {
            CbxRubro.addItem(rss.getString("NOMBRE_MARCA"));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarProductos = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        lblIDdelatienda = new javax.swing.JLabel();
        CbxCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CbxRubro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setIconImage(getIconImage());
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1150, 530));
        setResizable(false);

        TableListarProductos.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        TableListarProductos.setGridColor(new java.awt.Color(204, 255, 255));
        TableListarProductos.setSelectionBackground(new java.awt.Color(204, 255, 204));
        TableListarProductos.setSelectionForeground(new java.awt.Color(0, 0, 51));
        TableListarProductos.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(TableListarProductos);

        btnVolver.setBackground(new java.awt.Color(255, 153, 153));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblIDdelatienda.setText("  ");

        CbxCategoria.setEditable(true);
        CbxCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        CbxCategoria.setToolTipText("");
        CbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxCategoriaItemStateChanged(evt);
            }
        });
        CbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxCategoriaActionPerformed(evt);
            }
        });
        CbxCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CbxCategoriaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Filtrar por Categoria");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Filtrar por Marca");

        CbxRubro.setEditable(true);
        CbxRubro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CbxRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        CbxRubro.setToolTipText("");
        CbxRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxRubroItemStateChanged(evt);
            }
        });
        CbxRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxRubroActionPerformed(evt);
            }
        });
        CbxRubro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CbxRubroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(176, 176, 176)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIDdelatienda))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDdelatienda)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbxRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void CbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxCategoriaActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxCategoriaActionPerformed

    private void CbxCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbxCategoriaKeyTyped
       /* CbxCategoria.addKeyListener(new KeyAdapter() {
            public void KeyReleased(final KeyEvent e){
               String cadena = (CbxCategoria.getSelectedItem().toString()).toUpperCase();
               CbxCategoria.setSelectedItem(cadena);
               repaint();
               filtro();
            }
    });
        trsfiltro = new TableRowSorter(TableListarProductos.getModel());
        TableListarProductos.setRowSorter(trsfiltro);*/
        
    }//GEN-LAST:event_CbxCategoriaKeyTyped
        
    private void CbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxCategoriaItemStateChanged
        String query = CbxCategoria.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) TableListarProductos.getModel());
        TableListarProductos.setRowSorter(tr);
        if(query != ""){
            tr.setRowFilter(RowFilter.regexFilter(query));
            
            
        }else{
            TableListarProductos.setRowSorter(tr);
        }
    }//GEN-LAST:event_CbxCategoriaItemStateChanged

    private void CbxRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxRubroItemStateChanged
        String query = CbxRubro.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) TableListarProductos.getModel());
        TableListarProductos.setRowSorter(tr);
        if(query != ""){
            tr.setRowFilter(RowFilter.regexFilter(query));
            
            
        }else{
            TableListarProductos.setRowSorter(tr);
        }
    }//GEN-LAST:event_CbxRubroItemStateChanged

    private void CbxRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxRubroActionPerformed

    private void CbxRubroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CbxRubroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxRubroKeyTyped
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

    public void cargarTabla(JTable tabla) throws ClassNotFoundException, SQLException {
        
        tabla.setDefaultRenderer(Object.class, new RedibujarTabla());
        DefaultTableModel objDT = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        objDT.addColumn("NOMBRE");
        objDT.addColumn("PRECIO");
        objDT.addColumn("STOCK");
        objDT.addColumn("DESCRIPCION");
        objDT.addColumn("IMAGEN");
        objDT.addColumn("CATEGORIA");
        objDT.addColumn("MARCA");

        ProductoNegocio objProNegocio = new ProductoNegocio();
        Producto objProducto = new Producto();
        ArrayList<Producto> lstProductos = new ArrayList<Producto>();
        lstProductos = objProNegocio.listarProductos();

        if (lstProductos.size() > 0) {
            for (int i = 0; i < lstProductos.size(); i++) {
                Object[] fila = new Object[9];
                objProducto = lstProductos.get(i);
              // if (catprod.getCategoriaID(CbxCategoria.getSelectedItem().toString())==objProducto.getCatprodIdCatprod()) {
                fila[0] = objProducto.getNombreProducto();
                fila[1] = objProducto.getPrecioProducto();
                fila[2] = objProducto.getStockProducto();
                fila[3] = objProducto.getDescripcionProducto();
                try {
                    byte[] arrByte = objProducto.getImagenProducto();
                    BufferedImage imagen = null;
                    InputStream in = new ByteArrayInputStream(arrByte);
                    imagen = ImageIO.read(in);
                    ImageIcon imgIcono = new ImageIcon(imagen.getScaledInstance(60, 60, 0));
                    fila[4] = new JLabel(imgIcono);
                } catch (Exception e) {
                    fila[4] = new JLabel("No hay imagen cargada");
                }

                fila[5] = objProducto.getObjCategoria().getNombreCategoriaprod();
                fila[6] = objProducto.getObjMarca().getNombreMarca();
                objDT.addRow(fila);
           // }
           /* else {
                    //JOptionPane.showMessageDialog(null, catprod.getCategoriaID(CbxCategoria.getSelectedItem().toString()));
                }*/
            }     
        }
        tabla.setModel(objDT);
        tabla.setRowHeight(60);
    }
    
    
    
    
     
     
             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxCategoria;
    private javax.swing.JComboBox<String> CbxRubro;
    public javax.swing.JTable TableListarProductos;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIDdelatienda;
    // End of variables declaration//GEN-END:variables
}
