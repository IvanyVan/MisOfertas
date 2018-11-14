
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "TIENDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tienda.findAll", query = "SELECT t FROM Tienda t")
    , @NamedQuery(name = "Tienda.findByIdTienda", query = "SELECT t FROM Tienda t WHERE t.idTienda = :idTienda")
    , @NamedQuery(name = "Tienda.findByNombreTienda", query = "SELECT t FROM Tienda t WHERE t.nombreTienda = :nombreTienda")
    , @NamedQuery(name = "Tienda.findByDireccionTienda", query = "SELECT t FROM Tienda t WHERE t.direccionTienda = :direccionTienda")
    , @NamedQuery(name = "Tienda.findByTelefonoTienda", query = "SELECT t FROM Tienda t WHERE t.telefonoTienda = :telefonoTienda")})
public class Tienda implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIENDA")
    private BigDecimal idTienda;
    @Basic(optional = false)
    @Column(name = "NOMBRE_TIENDA")
    private String nombreTienda;
    @Basic(optional = false)
    @Column(name = "DIRECCION_TIENDA")
    private String direccionTienda;
    @Basic(optional = false)
    @Column(name = "TELEFONO_TIENDA")
    private String telefonoTienda;
    @ManyToMany(mappedBy = "tiendaCollection")
    private Collection<Producto> productoCollection;
    @JoinColumn(name = "COMUNA_ID_COMUNA", referencedColumnName = "ID_COMUNA")
    @ManyToOne(optional = false)
    private Comuna comunaIdComuna;
    @JoinColumn(name = "EMPRESA_ID_EMPRESA", referencedColumnName = "ID_EMPRESA")
    @ManyToOne(optional = false)
    private Empresa empresaIdEmpresa;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tiendaIdTienda")
    private Usuario usuario;

    public Tienda() {
    }

    public Tienda(BigDecimal idTienda) {
        this.idTienda = idTienda;
    }

    public Tienda(BigDecimal idTienda, String nombreTienda, String direccionTienda, String telefonoTienda) {
        this.idTienda = idTienda;
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.telefonoTienda = telefonoTienda;
    }

    public BigDecimal getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(BigDecimal idTienda) {
        this.idTienda = idTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getTelefonoTienda() {
        return telefonoTienda;
    }

    public void setTelefonoTienda(String telefonoTienda) {
        this.telefonoTienda = telefonoTienda;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    public Comuna getComunaIdComuna() {
        return comunaIdComuna;
    }

    public void setComunaIdComuna(Comuna comunaIdComuna) {
        this.comunaIdComuna = comunaIdComuna;
    }

    public Empresa getEmpresaIdEmpresa() {
        return empresaIdEmpresa;
    }

    public void setEmpresaIdEmpresa(Empresa empresaIdEmpresa) {
        this.empresaIdEmpresa = empresaIdEmpresa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTienda != null ? idTienda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tienda)) {
            return false;
        }
        Tienda other = (Tienda) object;
        if ((this.idTienda == null && other.idTienda != null) || (this.idTienda != null && !this.idTienda.equals(other.idTienda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Tienda[ idTienda=" + idTienda + " ]";
    }
    
        public ResultSet getTienda(int empresa) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from TIENDA where id_empresa ="+empresa+" order by id_tienda"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
    }
    
        public ResultSet getTiendaxID(int idComuna) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from Tienda where id_comuna ="+idComuna+"";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}
        
               public int getIDxNombre(String nomtienda) throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from tienda where nombre_tienda = '"+nomtienda+"'";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        
        while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
         
}
               
            public String getNombreTiendaStringxEmpresa(int empresa) throws ClassNotFoundException, SQLException{
        String nombre = "";
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select NOMBRE_TIENDA from TIENDA where id_empresa ="+empresa+" order by id_tienda"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
        while(rs.next()){
        nombre = rs.getString(1);
        };
        rs.close();
         return nombre;
    }
    
}
