package Negocio;

import Clases.Catgoriaproducto;
import Clases.Conexion;
import Clases.Marca;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class ProductoNegocio {

    public int getUltimoRegistro() throws ClassNotFoundException, SQLException {
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo = null;
        String query = "select * from producto where rownum = '1' order by id_producto desc";
        sentencia = conn.createStatement();
        rs = sentencia.executeQuery(query);

        while (rs.next()) {
            id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
        return id;
    }
    
    //Método para crear listado con todos los productos almacenados en la base de datos
    public ArrayList<Producto> listarProductos() throws ClassNotFoundException, SQLException{          
        ArrayList<Producto> lstProductos = new ArrayList<>();
        Connection cnx = new Conexion().getConnection();
        String query = "Select p.ID_PRODUCTO,p.NOMBRE_PRODUCTO,p.precio_producto,p.stock_producto,"
                + "p.descripcion_producto,p.imagen_producto,m.id_marca, m.nombre_marca,c.id_categoria,c.nombre_categoria"
                + " from PRODUCTO p,MARCA m, CATEGORIA c WHERE p.id_marca=m.id_marca"
                + " and p.id_categoria=c.id_categoria";        
        PreparedStatement ps = cnx.prepareStatement(query);
        ResultSet rs = ps.executeQuery();       
            while(rs.next()){
                Producto objP = new Producto(); 
                objP.setIdProducto(rs.getInt(1));
                objP.setNombreProducto(rs.getString(2));
                objP.setPrecioProducto(rs.getInt(3));
                objP.setStockProducto(rs.getInt(4));
                objP.setDescripcionProducto(rs.getString(5));
                objP.setImagenProducto(rs.getBytes(6));
                objP.setObjMarca(new Marca(rs.getInt(7),rs.getString(8)));                
                objP.setObjCategoria(new Catgoriaproducto(rs.getInt(9),rs.getString(10)));
                lstProductos.add(objP);            
            } 
            rs.close();
            ps.close();
            cnx.close();        
        return lstProductos;
    }

}
