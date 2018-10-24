/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Clases.Conexion;
import Clases.Oferta;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class OfertaNegocio {
    
    
        
   public String crearOferta(Oferta oferta, int idProducto) throws ParseException {

     String mensaje = "";

		Connection cn = null;
                Conexion conexion =  new Conexion();
		PreparedStatement pstm = null;
		try {
			cn = conexion.getConnection();
			cn.setAutoCommit(false);
                        
String query = "Begin\n" +
"\n" +
"oferta_tapi.ins("+idProducto+","+oferta.getMaximoPro()+",sysdate,1,TO_DATE('"+oferta.getFechaLimite()+"','DD-MM-YYYY HH:MI'),"+oferta.getPorcentajeDescuento()+","+oferta.getMinimoPro()+");\n" +
"\n" +
"end;";
mensaje = "Registro completado";
			pstm = cn.prepareStatement(query);
                        pstm.executeUpdate(); 
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
                    mensaje = "Error: Registo no completado";
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
                             mensaje = "Error: Registo no completado";
			}
		}
                
                return mensaje;
	}
    
    
    
    
    
    
}
