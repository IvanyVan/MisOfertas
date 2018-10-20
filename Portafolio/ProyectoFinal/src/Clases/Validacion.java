/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import static java.sql.JDBCType.NULL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eduardo
 */
public class Validacion {

    public boolean validarUsuario(String rut, String clave) throws SQLException, ClassNotFoundException{
        boolean validar = false;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String query = "Select count(*) from USUARIO where rut_usuario ='"+rut+"' and password_usuario='"+clave+"'";
        sentencia=conn.createStatement();
        rs = sentencia.executeQuery(query);
        while (rs.next()) {            
            
            
            String id=rs.getString(1);
            if(id=="1"){
                validar=true;
            }
            
        }
        
       
        return validar;
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
