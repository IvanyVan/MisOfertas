/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ivan
 */
public class UsuarioNegocio {
    
     public void RegistrarUsuario(int idUsuario,String direccionUsuario,String apellidoPaterno,String rutUsuario,String apellidoMaterno,int ticketDescuento,String password,int prioridadVisita,int idComuna,String nombreUsuario,int tipoUsuario,int idTienda,String correoUsuario,int puntosUsuario,String telefonoUsuario) throws ClassNotFoundException, SQLException
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
    
    public void ModificarUsuario(int idUsuario,String direccionUsuario,String apellidoPaterno,String rutUsuario,String apellidoMaterno,int ticketDescuento,String password,int prioridadVisita,int idComuna,String nombreUsuario,int tipoUsuario,int idTienda,String correoUsuario,int puntosUsuario,String telefonoUsuario) throws ClassNotFoundException, SQLException{
         Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        String query="Begin usuario_tapi.upd("+6+",'"+direccionUsuario+"','"+apellidoPaterno+"','"+rutUsuario+"','"+apellidoMaterno+"',"+null+",'"+password+"',"+null+","+idComuna+",'"+nombreUsuario+"',"+tipoUsuario+","+idTienda+",'"+correoUsuario+"',"+puntosUsuario+",'"+telefonoUsuario+"'); end;";
          if (tipoUsuario==1 || tipoUsuario == 3) {
              query="Begin usuario_tapi.upd("+6+",'"+direccionUsuario+"','"+apellidoPaterno+"','"+rutUsuario+"','"+apellidoMaterno+"',"+null+",'"+password+"',"+null+","+idComuna+",'"+nombreUsuario+"',"+tipoUsuario+","+null+",'"+correoUsuario+"',"+puntosUsuario+",'"+telefonoUsuario+"'); end;";
        } 
        
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);
    
    }
    
    
}
