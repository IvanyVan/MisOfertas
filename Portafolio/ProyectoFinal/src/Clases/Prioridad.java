/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "PRIORIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prioridad.findAll", query = "SELECT p FROM Prioridad p")
    , @NamedQuery(name = "Prioridad.findByIdVisita", query = "SELECT p FROM Prioridad p WHERE p.idVisita = :idVisita")
    , @NamedQuery(name = "Prioridad.findByProducto1", query = "SELECT p FROM Prioridad p WHERE p.producto1 = :producto1")
    , @NamedQuery(name = "Prioridad.findByProducto2", query = "SELECT p FROM Prioridad p WHERE p.producto2 = :producto2")})
public class Prioridad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_VISITA")
    private BigDecimal idVisita;
    @Basic(optional = false)
    @Column(name = "PRODUCTO_1")
    private BigInteger producto1;
    @Basic(optional = false)
    @Column(name = "PRODUCTO_2")
    private BigInteger producto2;
    @OneToOne(mappedBy = "prioridadIdVisita")
    private Usuario usuario;

    public Prioridad() {
    }

    public Prioridad(BigDecimal idVisita) {
        this.idVisita = idVisita;
    }

    public Prioridad(BigDecimal idVisita, BigInteger producto1, BigInteger producto2) {
        this.idVisita = idVisita;
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public BigDecimal getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(BigDecimal idVisita) {
        this.idVisita = idVisita;
    }

    public BigInteger getProducto1() {
        return producto1;
    }

    public void setProducto1(BigInteger producto1) {
        this.producto1 = producto1;
    }

    public BigInteger getProducto2() {
        return producto2;
    }

    public void setProducto2(BigInteger producto2) {
        this.producto2 = producto2;
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
        hash += (idVisita != null ? idVisita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prioridad)) {
            return false;
        }
        Prioridad other = (Prioridad) object;
        if ((this.idVisita == null && other.idVisita != null) || (this.idVisita != null && !this.idVisita.equals(other.idVisita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Prioridad[ idVisita=" + idVisita + " ]";
    }
    
}
