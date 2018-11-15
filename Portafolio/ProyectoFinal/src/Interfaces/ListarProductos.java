package Interfaces;

import Clases.Producto;
import Clases.RedibujarTabla;
import Negocio.ProductoNegocio;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class ListarProductos extends javax.swing.JFrame {

    public ListarProductos() throws SQLException, ClassNotFoundException {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableListarProductos = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        lblIDdelatienda = new javax.swing.JLabel();
        btnListar = new javax.swing.JButton();

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

        btnListar.setBackground(new java.awt.Color(153, 255, 153));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIDdelatienda))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDdelatienda))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        try {
            cargarTabla(TableListarProductos);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ListarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListarActionPerformed
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
            }
        }
        tabla.setModel(objDT);
        tabla.setRowHeight(60);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TableListarProductos;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblIDdelatienda;
    // End of variables declaration//GEN-END:variables
}
