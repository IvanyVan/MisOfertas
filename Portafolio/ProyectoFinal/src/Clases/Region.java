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
@Table(name = "REGION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
    , @NamedQuery(name = "Region.findByIdRegion", query = "SELECT r FROM Region r WHERE r.idRegion = :idRegion")
    , @NamedQuery(name = "Region.findByNombreRegion", query = "SELECT r FROM Region r WHERE r.nombreRegion = :nombreRegion")})
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_REGION")
    private BigDecimal idRegion;
    @Basic(optional = false)
    @Column(name = "NOMBRE_REGION")
    private String nombreRegion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionIdRegion")
    private Collection<Comuna> comunaCollection;

    public Region() {
    }

    public Region(BigDecimal idRegion) {
        this.idRegion = idRegion;
    }

    public Region(BigDecimal idRegion, String nombreRegion) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
    }

    public BigDecimal getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(BigDecimal idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    @XmlTransient
    public Collection<Comuna> getComunaCollection() {
        return comunaCollection;
    }

    public void setComunaCollection(Collection<Comuna> comunaCollection) {
        this.comunaCollection = comunaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegion != null ? idRegion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.idRegion == null && other.idRegion != null) || (this.idRegion != null && !this.idRegion.equals(other.idRegion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Region[ idRegion=" + idRegion + " ]";
    }
    
     public ResultSet getRegiono() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select nombre_region from Region order by id_region"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}
     
          public ResultSet getRegionID(String nombreRegion) throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select id_region from Region where nombre_region = '"+nombreRegion+"' order by id_region";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}
}

