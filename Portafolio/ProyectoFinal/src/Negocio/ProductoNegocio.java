/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivan
 */
public class ProductoNegocio {
    
    
          public int getUltimoRegistro() throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from producto where rownum = '1' order by id_producto desc";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        
        while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
         
}
//    
}
