/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
import Clases.Producto;
import Clases.Tienda;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

/**
 *
 * @author Eduardo
 */
public class Registros {
    
   
    
    public void insertarProducto(Producto prod) throws ClassNotFoundException, SQLException{
            Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
     ResultSet rs = null;
        String query = "Begin insert into producto (ID_PRODUCTO,NOMBRE_PRODUCTO,PRECIO_PRODUCTO,STOCK_PRODUCTO,DESCRIPCION_PRODUCTO,IMAGEN_PRODUCTO,RUBROPRODUCTO_ID_RUBRO,MARCA_ID_MARCA,CATPROD_ID_CATPROD,OFERTA_ID_OFERTA)"
        + " values(PRODUCTO_ID_PRODUCTO_SEQ.nextval,'"+prod.getNombreProducto()+"',"+prod.getPrecioProducto()+","+prod.getStockProducto()+",'"+prod.getDescripcionProducto()+"',null,"+prod.getRubroproductoIdRubro()+","+prod.getMarcaIdMarca()+","+prod.getCatprodIdCatprod()+",null);"
                + "commit; end;";
        sentencia = conn.createStatement();
     sentencia.executeUpdate(query);
     
    }
    
    
    
    
    
    
   public void crearProducto(Producto prod) {
		Connection cn = null;
                Conexion conexion =  new Conexion();
		PreparedStatement pstm = null;
		try {
			cn = conexion.getConnection();
			cn.setAutoCommit(false);
String query = "insert into producto (ID_PRODUCTO,NOMBRE_PRODUCTO,PRECIO_PRODUCTO,STOCK_PRODUCTO,DESCRIPCION_PRODUCTO,IMAGEN_PRODUCTO,RUBROPRODUCTO_ID_RUBRO,MARCA_ID_MARCA,CATPROD_ID_CATPROD,OFERTA_ID_OFERTA)"
        + " values(PRODUCTO_ID_PRODUCTO_SEQ.nextval,'"+prod.getNombreProducto()+"',"+prod.getPrecioProducto()+","+prod.getStockProducto()+",'"+prod.getDescripcionProducto()+"',"
        + ""+prod.getImagenProducto()+","+prod.getRubroproductoIdRubro()+","+prod.getMarcaIdMarca()+","+prod.getCatprodIdCatprod()+",null);";
			pstm = cn.prepareStatement(query);
			//pstm.setBytes(5,prod.getImagenProducto());
			//pstm.setString(1, prod.getNombreProducto());
			//pstm.setString(4, prod.getDescripcionProducto());
			//pstm.setInt(3,prod.getStockProducto());
			//pstm.setInt(6, prod.getRubroproductoIdRubro());
//			pstm.setInt(8, prod.getMarcaIdMarca());
//			pstm.setInt(7, prod.getIdProducto());
//                       // pstm.setInt(2, prod.getPrecioProducto());
//                       // pstm.setString(10, null);
//                        pstm.setInt(9, prod.getCatprodIdCatprod());
			pstm.executeUpdate(); 
			cn.commit();
                        
		} catch (Exception e) {
		
			
		} finally {
			try {
				pstm.close();
			} catch (Exception e) {
			}
		}
	}
     
     
     
     
          public void ModificarOferta(int idUsuario,String direccionUsuario,String apellidoPaterno,String rutUsuario,String apellidoMaterno,int ticketDescuento,String password,int prioridadVisita,int idComuna,String nombreUsuario,int tipoUsuario,int idTienda,String correoUsuario,int puntosUsuario,String telefonoUsuario) throws ClassNotFoundException, SQLException
    {
        
        // boolean validar = false;
       
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
         String query="Begin usuario_tapi.ins("+6+",'"+direccionUsuario+"','"+apellidoPaterno+"','"+rutUsuario+"','"+apellidoMaterno+"',"+null+",'"+password+"',"+null+","+idComuna+",'"+nombreUsuario+"',"+tipoUsuario+","+idTienda+",'"+correoUsuario+"',"+puntosUsuario+",'"+telefonoUsuario+"'); end;";
        
       if (tipoUsuario==1 || tipoUsuario == 3) {
              query="Begin usuario_tapi.ins("+6+",'"+direccionUsuario+"','"+apellidoPaterno+"','"+rutUsuario+"','"+apellidoMaterno+"',"+null+",'"+password+"',"+null+","+idComuna+",'"+nombreUsuario+"',"+tipoUsuario+","+null+",'"+correoUsuario+"',"+puntosUsuario+",'"+telefonoUsuario+"'); end;";
        } 
        
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);
    
    }
     
}
