/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
import Clases.Producto;
import Clases.Tienda;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivan
 */
public class TiendaProducto {
    
      public void insertarProductoTienda(int prod,int tienda) throws ClassNotFoundException, SQLException{
            Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        
        String query = "Begin Insert into TIENDA_PRODUCO (TIENDA_ID_TIENDA,producto_id_producto) values("+tienda+","+prod+"); end;";
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);
    
    }
    
    
    
    
}
