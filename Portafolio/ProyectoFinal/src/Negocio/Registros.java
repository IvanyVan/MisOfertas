package Negocio;
import Clases.Conexion;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eduardo
 */
public class Registros {

//    Método para insertar producto en la base de datos
    public void insertarProducto(Producto prod) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        String query = "insert into PRODUCTO (NOMBRE_PRODUCTO, PRECIO_PRODUCTO,"
                + "STOCK_PRODUCTO, DESCRIPCION_PRODUCTO, IMAGEN_PRODUCTO,"
                + "ID_MARCA, ID_CATEGORIA) VALUES(?,?,?,?,?,?,?)";

        /* String query ="{ call PRODUCTO_TAPI.INS(?,?,?,?,0,?,null,?,?)}";*/
        PreparedStatement objPs = null;
        objPs = conn.prepareStatement(query);
        objPs.setString(1, prod.getNombreProducto());
        objPs.setInt(2, prod.getPrecioProducto());
        objPs.setInt(3, prod.getStockProducto());
        objPs.setString(4, prod.getDescripcionProducto());
        objPs.setBytes(5, prod.getImagenProducto());
        objPs.setInt(6, prod.getMarcaIdMarca());
        objPs.setInt(7, prod.getCatprodIdCatprod());
        //objPs.setInt(5, prod.getOfertaIdOferta());        
        //objPs.setInt(7, prod.getIdProducto());       
        objPs.executeUpdate();
        objPs.close();
        conn.close();
        /*Statement sentencia = null;        
        String query = "Begin producto_tapi.ins('"+prod.getImagenProducto()+"','" + prod.getNombreProducto()
                + "','" + prod.getDescripcionProducto() + "'," + prod.getStockProducto()
                + "," + null + "," + prod.getCatprodIdCatprod() + ",PRODUCTO_ID_PRODUCTO_SEQ.nextval,"
                + prod.getPrecioProducto() + "," + prod.getMarcaIdMarca() + ");end;"; 
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);     */
    }


    /*public void crearProducto(Producto prod) throws ClassNotFoundException, SQLException {
        Connection cn = null;
        Conexion conexion = new Conexion();
        cn = conexion.getConnection();
        PreparedStatement pstm = null;
        try {
            cn = conexion.getConnection();
            cn.setAutoCommit(false);
            String query = "insert into producto (ID_PRODUCTO,NOMBRE_PRODUCTO,PRECIO_PRODUCTO,"
                    + "STOCK_PRODUCTO,DESCRIPCION_PRODUCTO,IMAGEN_PRODUCTO,ID_MARCA,ID_CATEGORIA,ID_OFERTA)"
                    + " values(PRODUCTO_ID_PRODUCTO_SEQ.nextval,'" + prod.getNombreProducto()
                    + "'," + prod.getPrecioProducto() + "," + prod.getStockProducto() + ",'" + prod.getDescripcionProducto() + "',"
                    + "" + prod.getImagenProducto() + "," + prod.getMarcaIdMarca()
                    + "," + prod.getCatprodIdCatprod() + "," + ",null);";
            pstm = cn.prepareStatement(query);
            pstm.executeUpdate();
            cn.commit();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar producto", "No se pudo registrar el producto "
                    + "Error: " + e, JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                pstm.close();
            } catch (Exception e) {

            }
        }
    }*/
    public void ModificarOferta(int idUsuario, String direccionUsuario,
            String apellidoPaterno, String rutUsuario, String apellidoMaterno,
            int ticketDescuento, String password, int prioridadVisita, int idComuna,
            String nombreUsuario, int tipoUsuario, int idTienda, String correoUsuario,
            int puntosUsuario, String telefonoUsuario) throws ClassNotFoundException, SQLException {
        // boolean validar = false;       

        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        Statement sentencia = null;
        String query = "Begin usuario_tapi.ins(" + 6 + ",'" + direccionUsuario
                + "','" + apellidoPaterno + "','" + rutUsuario + "','" + apellidoMaterno
                + "'," + null + ",'" + password + "'," + null + "," + idComuna + ",'" + nombreUsuario
                + "'," + tipoUsuario + "," + idTienda + ",'" + correoUsuario + "'," + puntosUsuario
                + ",'" + telefonoUsuario + "'); end;";

        if (tipoUsuario == 1 || tipoUsuario == 3) {
            query = "Begin usuario_tapi.ins(" + 6 + ",'" + direccionUsuario + "','" + apellidoPaterno
                    + "','" + rutUsuario + "','" + apellidoMaterno + "'," + null + ",'" + password
                    + "'," + null + "," + idComuna + ",'" + nombreUsuario + "'," + tipoUsuario
                    + "," + null + ",'" + correoUsuario + "'," + puntosUsuario + ",'" + telefonoUsuario + "'); end;";
        }
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);

    }

}
