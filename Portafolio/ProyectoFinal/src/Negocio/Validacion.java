/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
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

    public boolean validarUsuario(String user, String clave) throws SQLException, ClassNotFoundException{
        boolean validar = false;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String query = "Select count(*) from USUARIO where nombre_usuario ='"+user+"' and password_usuario='"+clave+"'";
        sentencia=conn.createStatement();
        rs = sentencia.executeQuery(query);
        while (rs.next()) {            
            try {
                 String id=rs.getString(1);
            if(id.equals("1")){
                validar=true;
            }
            } catch (Exception e) {
            }
            
        }
        
       
        return validar;
        
    }
    
    public String devolverTipo (String user,String clave) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select TIPOUSUARIO_ID_TIPOUSUARIO from USUARIO where nombre_usuario='"+user+"' and password_usuario='"+clave+"'"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
         while (rs.next()) {            
            
            String idTipo=rs.getString(1);
            if(!idTipo.equals(null)){
                tipo = idTipo;
            }
        
         }
         rs.close();
         return tipo;
    }
   
       public ResultSet devolverUsuariocompleto (String user,String clave) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select Id_usuario,Nombre_usuario,apepa_usuario,apema_usuario,tienda_id_tienda from USUARIO where nombre_usuario='"+user+"' and password_usuario='"+clave+"'"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
        
         return rs;
    }
       
       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



   
   public boolean validacionNumeros(String dato){
       boolean validado=false;
       for (int i = 0; i < dato.length(); i++) {
           if (true) {
               if(Character.isDigit(dato.charAt(i))){
                   validado=true;
               }
           } else {
               validado=false;
           }
       }
       return validado;
   }
    
   public boolean validacionLetras(String dato){
       boolean validado=false;
       for (int i = 0; i < dato.length(); i++) {
           if (true) {
               if(Character.isAlphabetic(dato.charAt(i))){
                   validado=true;
               }
           } else {
               validado=false;
           }
       }
       return validado;
   }
   
   public boolean validarRut(String rut) {
 
boolean validacion = false;
try {
rut =  rut.toUpperCase();
rut = rut.replace(".", "");
rut = rut.replace("-", "");
int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
 
char dv = rut.charAt(rut.length() - 1);
 
int m = 0, s = 1;
for (; rutAux != 0; rutAux /= 10) {
s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
}
if (dv == (char) (s != 0 ? s + 47 : 75)) {
validacion = true;
}
 
} catch (java.lang.NumberFormatException e) {
} catch (Exception e) {
}
return validacion;
}


       
    
}
