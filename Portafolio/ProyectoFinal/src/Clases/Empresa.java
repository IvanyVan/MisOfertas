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
@Table(name = "EMPRESA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findByIdEmpresa", query = "SELECT e FROM Empresa e WHERE e.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Empresa.findByNombreEmpresa", query = "SELECT e FROM Empresa e WHERE e.nombreEmpresa = :nombreEmpresa")
    , @NamedQuery(name = "Empresa.findByRutEmpresa", query = "SELECT e FROM Empresa e WHERE e.rutEmpresa = :rutEmpresa")
    , @NamedQuery(name = "Empresa.findByGiro", query = "SELECT e FROM Empresa e WHERE e.giro = :giro")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_EMPRESA")
    private BigDecimal idEmpresa;
    @Basic(optional = false)
    @Column(name = "NOMBRE_EMPRESA")
    private String nombreEmpresa;
    @Basic(optional = false)
    @Column(name = "RUT_EMPRESA")
    private String rutEmpresa;
    @Basic(optional = false)
    @Column(name = "GIRO")
    private String giro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaIdEmpresa")
    private Collection<Tienda> tiendaCollection;

    public Empresa() {
    }

    public Empresa(BigDecimal idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa(BigDecimal idEmpresa, String nombreEmpresa, String rutEmpresa, String giro) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giro = giro;
    }

    public BigDecimal getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(BigDecimal idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getRutEmpresa() {
        return rutEmpresa;
    }

    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    @XmlTransient
    public Collection<Tienda> getTiendaCollection() {
        return tiendaCollection;
    }

    public void setTiendaCollection(Collection<Tienda> tiendaCollection) {
        this.tiendaCollection = tiendaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }
    
    public ResultSet getEmpresas() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select nombre_empresa from Empresa order by id_empresa"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}

        public ResultSet getEmpresasID(String nombre) throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from EMPRESA where NOMBRE_EMPRESA = '"+nombre+"'"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
    }
    
        public String getNombreEmpresa(int empresa) throws ClassNotFoundException, SQLException{
        String nombre = "";
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select NOMBRE_EMPRESA  from EMPRESA where ID_EMPRESA = "+empresa+" order by ID_EMPRESA"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
        while(rs.next()){
        nombre = rs.getString(1);
        };
        rs.close();
         return nombre;
    }
    
    @Override
    public String toString() {
        return "Validacion.Empresa[ idEmpresa=" + idEmpresa + " ]";
    }
    
}
