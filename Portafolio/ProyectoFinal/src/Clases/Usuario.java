/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuario.findByApepaUsuario", query = "SELECT u FROM Usuario u WHERE u.apepaUsuario = :apepaUsuario")
    , @NamedQuery(name = "Usuario.findByApemaUsuario", query = "SELECT u FROM Usuario u WHERE u.apemaUsuario = :apemaUsuario")
    , @NamedQuery(name = "Usuario.findByCorreoUsuario", query = "SELECT u FROM Usuario u WHERE u.correoUsuario = :correoUsuario")
    , @NamedQuery(name = "Usuario.findByRutUsuario", query = "SELECT u FROM Usuario u WHERE u.rutUsuario = :rutUsuario")
    , @NamedQuery(name = "Usuario.findByDireccionUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionUsuario = :direccionUsuario")
    , @NamedQuery(name = "Usuario.findByTelefonoUsuario", query = "SELECT u FROM Usuario u WHERE u.telefonoUsuario = :telefonoUsuario")
    , @NamedQuery(name = "Usuario.findByPasswordUsuario", query = "SELECT u FROM Usuario u WHERE u.passwordUsuario = :passwordUsuario")
    , @NamedQuery(name = "Usuario.findByPuntosUsuario", query = "SELECT u FROM Usuario u WHERE u.puntosUsuario = :puntosUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private BigDecimal idUsuario;
    @Basic(optional = false)
    @Column(name = "NOMBRE_USUARIO")
    private String nombreUsuario;
    @Basic(optional = false)
    @Column(name = "APEPA_USUARIO")
    private String apepaUsuario;
    @Basic(optional = false)
    @Column(name = "APEMA_USUARIO")
    private String apemaUsuario;
    @Basic(optional = false)
    @Column(name = "CORREO_USUARIO")
    private String correoUsuario;
    @Basic(optional = false)
    @Column(name = "RUT_USUARIO")
    private String rutUsuario;
    @Basic(optional = false)
    @Column(name = "DIRECCION_USUARIO")
    private String direccionUsuario;
    @Basic(optional = false)
    @Column(name = "TELEFONO_USUARIO")
    private String telefonoUsuario;
    @Basic(optional = false)
    @Column(name = "PASSWORD_USUARIO")
    private String passwordUsuario;
    @Basic(optional = false)
    @Column(name = "PUNTOS_USUARIO")
    private BigInteger puntosUsuario;
    @JoinColumn(name = "COMUNA_ID_COMUNA", referencedColumnName = "ID_COMUNA")
    @ManyToOne(optional = false)
    private Comuna comunaIdComuna;
    @JoinColumn(name = "PRIORIDAD_ID_VISITA", referencedColumnName = "ID_VISITA")
    @OneToOne
    private Prioridad prioridadIdVisita;
    @JoinColumn(name = "TICKETDESCUENTO_ID_TICKET", referencedColumnName = "ID_TICKET")
    @OneToOne
    private Ticketdescuento ticketdescuentoIdTicket;
    @JoinColumn(name = "TIENDA_ID_TIENDA", referencedColumnName = "ID_TIENDA")
    @OneToOne(optional = false)
    private Tienda tiendaIdTienda;
    @JoinColumn(name = "TIPOUSUARIO_ID_TIPOUSUARIO", referencedColumnName = "ID_TIPOUSUARIO")
    @ManyToOne(optional = false)
    private Tipousuario tipousuarioIdTipousuario;
    @OneToMany(mappedBy = "usuarioIdUsuario")
    private Collection<Valoracion> valoracionCollection;

    public Usuario() {
    }

    public Usuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(BigDecimal idUsuario, String nombreUsuario, String apepaUsuario, String apemaUsuario, String correoUsuario, String rutUsuario, String direccionUsuario, String telefonoUsuario, String passwordUsuario, BigInteger puntosUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apepaUsuario = apepaUsuario;
        this.apemaUsuario = apemaUsuario;
        this.correoUsuario = correoUsuario;
        this.rutUsuario = rutUsuario;
        this.direccionUsuario = direccionUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.passwordUsuario = passwordUsuario;
        this.puntosUsuario = puntosUsuario;
    }

    public BigDecimal getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(BigDecimal idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApepaUsuario() {
        return apepaUsuario;
    }

    public void setApepaUsuario(String apepaUsuario) {
        this.apepaUsuario = apepaUsuario;
    }

    public String getApemaUsuario() {
        return apemaUsuario;
    }

    public void setApemaUsuario(String apemaUsuario) {
        this.apemaUsuario = apemaUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public BigInteger getPuntosUsuario() {
        return puntosUsuario;
    }

    public void setPuntosUsuario(BigInteger puntosUsuario) {
        this.puntosUsuario = puntosUsuario;
    }

    public Comuna getComunaIdComuna() {
        return comunaIdComuna;
    }

    public void setComunaIdComuna(Comuna comunaIdComuna) {
        this.comunaIdComuna = comunaIdComuna;
    }

    public Prioridad getPrioridadIdVisita() {
        return prioridadIdVisita;
    }

    public void setPrioridadIdVisita(Prioridad prioridadIdVisita) {
        this.prioridadIdVisita = prioridadIdVisita;
    }

    public Ticketdescuento getTicketdescuentoIdTicket() {
        return ticketdescuentoIdTicket;
    }

    public void setTicketdescuentoIdTicket(Ticketdescuento ticketdescuentoIdTicket) {
        this.ticketdescuentoIdTicket = ticketdescuentoIdTicket;
    }

    public Tienda getTiendaIdTienda() {
        return tiendaIdTienda;
    }

    public void setTiendaIdTienda(Tienda tiendaIdTienda) {
        this.tiendaIdTienda = tiendaIdTienda;
    }

    public Tipousuario getTipousuarioIdTipousuario() {
        return tipousuarioIdTipousuario;
    }

    public void setTipousuarioIdTipousuario(Tipousuario tipousuarioIdTipousuario) {
        this.tipousuarioIdTipousuario = tipousuarioIdTipousuario;
    }

    @XmlTransient
    public Collection<Valoracion> getValoracionCollection() {
        return valoracionCollection;
    }

    public void setValoracionCollection(Collection<Valoracion> valoracionCollection) {
        this.valoracionCollection = valoracionCollection;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
    
     public ResultSet getUsuario() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from USUARIO"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
    }
     
       public ResultSet getUsuarioRut(String rut) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from USUARIO where rut_usuario = '"+rut+"'"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
    }
}
