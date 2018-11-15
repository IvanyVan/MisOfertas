/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "RUBRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rubro.findAll", query = "SELECT r FROM Rubro r")
    , @NamedQuery(name = "Rubro.findByIdRubro", query = "SELECT r FROM Rubro r WHERE r.idRubro = :idRubro")
    , @NamedQuery(name = "Rubro.findByNombreRubro", query = "SELECT r FROM Rubro r WHERE r.nombreRubro = :nombreRubro")
    , @NamedQuery(name = "Rubro.findByDescripcion", query = "SELECT r FROM Rubro r WHERE r.descripcion = :descripcion")})
public class Rubroproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RUBRO")
    private BigDecimal idRubro;
    @Basic(optional = false)
    @Column(name = "NOMBRE_RUBRO")
    private String nombreRubro;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "rubroproductoIdRubro")
    private Collection<VwListadoProductos> vwListadoProductosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rubroproductoIdRubro")
    private Collection<Producto> productoCollection;

    public Rubroproducto() {
    }

    public Rubroproducto(BigDecimal idRubro) {
        this.idRubro = idRubro;
    }

    public Rubroproducto(BigDecimal idRubro, String nombreRubro) {
        this.idRubro = idRubro;
        this.nombreRubro = nombreRubro;
    }

    public BigDecimal getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(BigDecimal idRubro) {
        this.idRubro = idRubro;
    }

    public String getNombreRubro() {
        return nombreRubro;
    }

    public void setNombreRubro(String nombreRubro) {
        this.nombreRubro = nombreRubro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<VwListadoProductos> getVwListadoProductosCollection() {
        return vwListadoProductosCollection;
    }

    public void setVwListadoProductosCollection(Collection<VwListadoProductos> vwListadoProductosCollection) {
        this.vwListadoProductosCollection = vwListadoProductosCollection;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRubro != null ? idRubro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubroproducto)) {
            return false;
        }
        Rubroproducto other = (Rubroproducto) object;
        if ((this.idRubro == null && other.idRubro != null) || (this.idRubro != null && !this.idRubro.equals(other.idRubro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Rubroproducto[ idRubro=" + idRubro + " ]";
    }
    
         public ResultSet getRubroProd() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select NOMBRE_RUBRO from RUBRO order by ID_RUBRO"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
         
}
     
          public int getRubroporID(String nombrerubro) throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select ID_RUBRO from RUBRO where NOMBRE_RUBRO = '"+nombrerubro+"' order by ID_RUBRO";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
            
        while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
}
         
    
}
