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
public class UsuarioNegocio {

    public void RegistrarUsuario(String direccionUsuario, String apellidoPaterno,
            String correoActivo, String rutUsuario, String apellidoMaterno,
            String password, int idComuna, String nombreUsuario, int tipoUsuario,
            String correoUsuario, int puntosUsuario, String telefonoUsuario) throws ClassNotFoundException, SQLException {

        // boolean validar = false;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        Statement sentencia = null;
        String query = "Begin usuario_tapi.ins(" + tipoUsuario + ",'" + direccionUsuario
                + "','" + correoActivo + "','" + apellidoPaterno + "','" + nombreUsuario
                + "','" + rutUsuario + "','" + correoUsuario + "','" + apellidoMaterno + "',"
                + 0 + ",'" + telefonoUsuario + "'," + idComuna + ",'" + password + "'); end;";
        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);
    }

    public void ModificarUsuario(String direccionUsuario, String apellidoPaterno,
            String correoActivo, String rutUsuario, String apellidoMaterno, String password,
            int idComuna, String nombreUsuario, int tipoUsuario, String correoUsuario,
            int puntosUsuario, String telefonoUsuario) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        Statement sentencia = null;
        String query = "Begin usuario_tapi.upd(" + tipoUsuario + ",'" + direccionUsuario
                + "'," + correoActivo + "','" + apellidoPaterno + "','" + nombreUsuario + "','"
                + rutUsuario + "','" + correoUsuario + "','" + apellidoMaterno + "'," + 0 + ",'"
                + telefonoUsuario + "'," + idComuna + ",'" + password + "'); end;";

        sentencia = conn.createStatement();
        sentencia.executeUpdate(query);
    }

    public boolean validarUsuario(String rut) throws SQLException, ClassNotFoundException {
        boolean validar = false;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String query = "Select count(*) from USUARIO where rut_usuario ='" + rut + "'";
        sentencia = conn.createStatement();
        rs = sentencia.executeQuery(query);
        while (rs.next()) {
            try {
                String id = rs.getString(1);
                if (id.equals("1")) {
                    validar = true;
                }
            } catch (Exception e) {
            }
        }
        return validar;
    }

}
