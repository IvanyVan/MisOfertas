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
public class TiendaNegocio {
    
    
        public void eliminarAsignacion(String rutempleado) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String query = "UPDATE tienda SET rut_usuario = null WHERE rut_usuario = "+rutempleado+"";
        sentencia=conn.createStatement();
        rs = sentencia.executeQuery(query);
rs.close();
    }
        
        public void agregarAsignacion(String rutempleado, int idtienda) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String query = "UPDATE tienda SET rut_usuario = "+rutempleado+" WHERE id_tienda = "+idtienda+"";
        sentencia=conn.createStatement();
        rs = sentencia.executeQuery(query);
rs.close();
    }  
        
}
