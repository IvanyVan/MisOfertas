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

/**
 *
 * @author Ivan
 */
public class OfertaNegocio {
    
    
        
   public void crearOferta(Oferta oferta, int idProducto) throws ParseException {

     

		Connection cn = null;
                Conexion conexion =  new Conexion();
		PreparedStatement pstm = null;
		try {
			cn = conexion.getConnection();
			cn.setAutoCommit(false);
                     
//                        int dia = oferta.getFechaLimite().getDay();
//                        int mes = oferta.getFechaLimite().getMonth();
//                        int agno = oferta.getFechaLimite().getYear();TO_DATE('"+fecha+"','DD-MM-YYYY')
//                          String fecha =""+dia+"-"+mes+"-"+agno+""; //prueba segunda formato fecha
                        
String query = "Begin\n" +
"\n" +
"oferta_tapi.ins("+idProducto+","+oferta.getMaximoPro()+",sysdate,1,'"+oferta.getFechaLimite()+"',"+oferta.getPorcentajeDescuento()+","+oferta.getMinimoPro()+");\n" +
"\n" +
"end;";
			pstm = cn.prepareStatement(query);
                        pstm.executeUpdate(); 
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
		} finally {
			try {
				pstm.close();
			} catch (SQLException e) {
			}
		}
	}
    
    
    
    
    
    
}
