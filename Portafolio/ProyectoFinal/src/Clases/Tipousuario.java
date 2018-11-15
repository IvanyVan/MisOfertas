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
@Table(name = "TIPOUSUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipousuario.findAll", query = "SELECT t FROM Tipousuario t")
    , @NamedQuery(name = "Tipousuario.findByIdTipousuario", query = "SELECT t FROM Tipousuario t WHERE t.idTipousuario = :idTipousuario")
    , @NamedQuery(name = "Tipousuario.findByNombreTipousuario", query = "SELECT t FROM Tipousuario t WHERE t.nombreTipousuario = :nombreTipousuario")
    , @NamedQuery(name = "Tipousuario.findByDescripcion", query = "SELECT t FROM Tipousuario t WHERE t.descripcion = :descripcion")})
public class Tipousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TIPOUSUARIO")
    private BigDecimal idTipousuario;
    @Basic(optional = false)
    @Column(name = "NOMBRE_TIPOUSUARIO")
    private String nombreTipousuario;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipousuarioIdTipousuario")
    private Collection<Usuario> usuarioCollection;

    public Tipousuario() {
    }

    public Tipousuario(BigDecimal idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    public Tipousuario(BigDecimal idTipousuario, String nombreTipousuario) {
        this.idTipousuario = idTipousuario;
        this.nombreTipousuario = nombreTipousuario;
    }

    public BigDecimal getIdTipousuario() {
        return idTipousuario;
    }

    public void setIdTipousuario(BigDecimal idTipousuario) {
        this.idTipousuario = idTipousuario;
    }

    public String getNombreTipousuario() {
        return nombreTipousuario;
    }

    public void setNombreTipousuario(String nombreTipousuario) {
        this.nombreTipousuario = nombreTipousuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipousuario != null ? idTipousuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipousuario)) {
            return false;
        }
        Tipousuario other = (Tipousuario) object;
        if ((this.idTipousuario == null && other.idTipousuario != null) || (this.idTipousuario != null && !this.idTipousuario.equals(other.idTipousuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Tipousuario[ idTipousuario=" + idTipousuario + " ]";
    }
    
    
        public ResultSet getTipoUsuario() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from TIPOUSUARIO order by id_tipousuario"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
    }
        
              public int getIDxNombre(String rol) throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select * from tipousuario where nombre_tipousuario = '"+rol+"'";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
        
        while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
         
}
    
}
