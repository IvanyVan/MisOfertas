package Interfaces;

import Clases.Catgoriaproducto;
import Clases.Marca;
import Clases.Producto;
import Negocio.Registros;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tita
 */
public class frmModificarProductos extends javax.swing.JDialog {

    Catgoriaproducto catprod = new Catgoriaproducto();
    Marca marca = new Marca();   

    /**
     * Creates new form frmModificarProductos
     */
    public frmModificarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inhabilitarComponentes(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblErrorCategoria = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        cboMarca = new javax.swing.JComboBox<>();
        lblStock = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();
        txtStockProducto = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        btnBuscarFoto = new javax.swing.JButton();
        lblPrecioProducto = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        btnModificarProducto = new javax.swing.JButton();
        lblErrorStock = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblErrorPrecio = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        lblErrorMarca = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        lblBuscarProducto = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODIFICAR PRODUCTO");
        setBackground(new java.awt.Color(255, 255, 255));

        lblErrorCategoria.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblErrorCategoria.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCategoria.setText("jLabel13");

        txtDescripcion.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtDescripcion.setToolTipText("(este campo no es obligatorio)");

        cboMarca.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione marca" }));

        lblStock.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblStock.setText("Stock");

        cboCategoria.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoria" }));

        txtStockProducto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        txtFoto.setEditable(false);
        txtFoto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtFoto.setForeground(new java.awt.Color(0, 102, 204));

        lblNombreProducto.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblNombreProducto.setText("Nombre del producto");

        lblMarca.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblMarca.setText("Marca");

        btnBuscarFoto.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscarFoto.setText("Cambiar imagen");
        btnBuscarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFotoActionPerformed(evt);
            }
        });

        lblPrecioProducto.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblPrecioProducto.setText("Precio");

        lblCategoria.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblCategoria.setText("Categoria");

        lblImagen.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblImagen.setText("Imagen");

        lblDescripcion.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        lblDescripcion.setText("Descripcion");

        lblErrorNombre.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombre.setText("jLabel13");

        btnModificarProducto.setBackground(new java.awt.Color(153, 255, 153));
        btnModificarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        lblErrorStock.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblErrorStock.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorStock.setText("jLabel13");

        btnCancelar.setBackground(new java.awt.Color(255, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblErrorPrecio.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblErrorPrecio.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorPrecio.setText("jLabel13");

        txtNombreProducto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        lblErrorMarca.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblErrorMarca.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMarca.setText("jLabel13");

        txtPrecioProducto.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtPrecioProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoActionPerformed(evt);
            }
        });

        lblBuscarProducto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblBuscarProducto.setText("Buscar producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(lblImagen)
                .addGap(18, 18, 18)
                .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuscarFoto)
                .addGap(85, 85, 85))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMarca)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrecioProducto)
                                        .addComponent(lblStock)
                                        .addComponent(lblCategoria)
                                        .addComponent(lblDescripcion))
                                    .addGap(87, 87, 87))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblNombreProducto)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(101, 101, 101)
                                    .addComponent(btnModificarProducto)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblErrorCategoria))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblErrorMarca))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblErrorNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblErrorPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblErrorStock, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addComponent(txtStockProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarProducto))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImagen)
                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarFoto))
                .addContainerGap(459, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblErrorNombre)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreProducto)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblErrorPrecio)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblErrorStock)
                                    .addGap(39, 39, 39))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPrecioProducto)
                                        .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblStock)
                                        .addComponent(txtStockProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMarca)
                                .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblErrorMarca))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCategoria)
                                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblErrorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDescripcion)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(334, 334, 334)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(98, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFotoActionPerformed
        JFileChooser openFile = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        openFile.setFileFilter(filtro);

        int returnValue = openFile.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String ruta = openFile.getSelectedFile().getAbsolutePath();
            txtFoto.setText(ruta);
        }
    }//GEN-LAST:event_btnBuscarFotoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        try {
            Registros registro = new Registros();
            Producto prod = new Producto();
            prod.setIdProducto(1);
            prod.setStockProducto(Integer.parseInt(txtStockProducto.getText()));
            prod.setDescripcionProducto(txtDescripcion.getText());
            prod.setCatprodIdCatprod(catprod.getCategoriaID(cboCategoria.getSelectedItem().toString()));
            prod.setMarcaIdMarca(marca.getMarcaID(cboMarca.getSelectedItem().toString()));
            prod.setNombreProducto(txtNombreProducto.getText());
            prod.setPrecioProducto(Integer.parseInt(txtPrecioProducto.getText()));
            File objArchivo = new File(txtFoto.getText());
            try {
                byte[] imagen = new byte[(int) objArchivo.length()];
                InputStream objInput = new FileInputStream(objArchivo);
                objInput.read(imagen);
                //Seteamos la imagen en el objeto producto
                prod.setImagenProducto(imagen);
            } catch (Exception e) {
                prod.setImagenProducto(null);
            }
            registro.insertarProducto(prod);
            JOptionPane.showMessageDialog(null, "Producto insertado", "Se registro un nuevo producto",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto",
                    "No se pudo registrar el producto "
                    + "Error: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    public void inhabilitarComponentes(Boolean valor){
     lblNombreProducto.setVisible(valor);
     txtNombreProducto.setVisible(valor);
     lblPrecioProducto.setVisible(valor);
     txtPrecioProducto.setVisible(valor);
     lblMarca.setVisible(valor);
     cboMarca.setVisible(valor);
     cboCategoria.setVisible(valor);
     lblCategoria.setVisible(valor);
     lblDescripcion.setVisible(valor);
     txtDescripcion.setVisible(valor);
     lblImagen.setVisible(valor);
     txtFoto.setVisible(valor);
     btnBuscarFoto.setVisible(valor);
     btnCancelar.setVisible(valor);
     btnModificarProducto.setVisible(valor);
     lblStock.setVisible(valor);
     txtStockProducto.setVisible(valor);
     lblErrorCategoria.setVisible(valor);
     lblErrorNombre.setVisible(valor);
     lblErrorMarca.setVisible(valor);
     lblErrorPrecio.setVisible(valor);
     lblErrorStock.setVisible(valor);
    } 
    
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPrecioProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoActionPerformed

    }//GEN-LAST:event_txtPrecioProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {       
        

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                frmModificarProductos dialog = new frmModificarProductos(new javax.swing.JFrame(), true);                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {                    
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFoto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JLabel lblBuscarProducto;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblErrorCategoria;
    private javax.swing.JLabel lblErrorMarca;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorPrecio;
    private javax.swing.JLabel lblErrorStock;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblStock;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStockProducto;
    // End of variables declaration//GEN-END:variables
}
