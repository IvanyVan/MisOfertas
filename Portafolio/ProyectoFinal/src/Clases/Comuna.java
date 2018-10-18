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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "COMUNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comuna.findAll", query = "SELECT c FROM Comuna c")
    , @NamedQuery(name = "Comuna.findByIdComuna", query = "SELECT c FROM Comuna c WHERE c.idComuna = :idComuna")
    , @NamedQuery(name = "Comuna.findByNombreComuna", query = "SELECT c FROM Comuna c WHERE c.nombreComuna = :nombreComuna")})
public class Comuna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COMUNA")
    private BigDecimal idComuna;
    @Basic(optional = false)
    @Column(name = "NOMBRE_COMUNA")
    private String nombreComuna;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comunaIdComuna")
    private Collection<Tienda> tiendaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comunaIdComuna")
    private Collection<Usuario> usuarioCollection;
    @JoinColumn(name = "REGION_ID_REGION", referencedColumnName = "ID_REGION")
    @ManyToOne(optional = false)
    private Region regionIdRegion;

    public Comuna() {
    }

    public Comuna(BigDecimal idComuna) {
        this.idComuna = idComuna;
    }

    public Comuna(BigDecimal idComuna, String nombreComuna) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
    }

    public BigDecimal getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(BigDecimal idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    @XmlTransient
    public Collection<Tienda> getTiendaCollection() {
        return tiendaCollection;
    }

    public void setTiendaCollection(Collection<Tienda> tiendaCollection) {
        this.tiendaCollection = tiendaCollection;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    public Region getRegionIdRegion() {
        return regionIdRegion;
    }

    public void setRegionIdRegion(Region regionIdRegion) {
        this.regionIdRegion = regionIdRegion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComuna != null ? idComuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comuna)) {
            return false;
        }
        Comuna other = (Comuna) object;
        if ((this.idComuna == null && other.idComuna != null) || (this.idComuna != null && !this.idComuna.equals(other.idComuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Comuna[ idComuna=" + idComuna + " ]";
    }
     public ResultSet getComunaxID(int idRegion) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from Comuna where region_id_region ="+idRegion+"";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}
     
          public int getIDxNombre(String comuna) throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from Comuna where NOMBRE_COMUNA = '"+comuna+"'";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        
        while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
         
}
}
