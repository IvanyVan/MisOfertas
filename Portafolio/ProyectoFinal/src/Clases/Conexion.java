/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Conexion {
 
    
    

public Connection getConnection() throws ClassNotFoundException, SQLException{

String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:XE";
String username="MO2";
String password="123";
Connection conn = null;



   Class.forName(driver);
     
            conn = DriverManager.getConnection(url,username,password);


       return conn;
    } 
    
    
    
    
    
    
}
