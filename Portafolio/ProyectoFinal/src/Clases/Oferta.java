 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "OFERTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oferta.findAll", query = "SELECT o FROM Oferta o")
    , @NamedQuery(name = "Oferta.findByIdOferta", query = "SELECT o FROM Oferta o WHERE o.idOferta = :idOferta")
    , @NamedQuery(name = "Oferta.findByMaximoPro", query = "SELECT o FROM Oferta o WHERE o.maximoPro = :maximoPro")
    , @NamedQuery(name = "Oferta.findByMinimoPro", query = "SELECT o FROM Oferta o WHERE o.minimoPro = :minimoPro")
    , @NamedQuery(name = "Oferta.findByFechaLimite", query = "SELECT o FROM Oferta o WHERE o.fechaLimite = :fechaLimite")
    , @NamedQuery(name = "Oferta.findByFechaRegistro", query = "SELECT o FROM Oferta o WHERE o.fechaRegistro = :fechaRegistro")
    , @NamedQuery(name = "Oferta.findByPorcentajeDescuento", query = "SELECT o FROM Oferta o WHERE o.porcentajeDescuento = :porcentajeDescuento")})
public class Oferta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_OFERTA")
    private Integer idOferta;
    @Basic(optional = false)
    @Column(name = "MAXIMO_PRO")
    private Integer maximoPro;
    @Basic(optional = false)
    @Column(name = "MINIMO_PRO")
    private Integer minimoPro;
    @Basic(optional = false)
    @Column(name = "FECHA_LIMITE")
    @Temporal(TemporalType.TIMESTAMP)
    private String fechaLimite;
    @Basic(optional = false)
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Basic(optional = false)
    @Column(name = "PORCENTAJE_DESCUENTO")
    private Integer porcentajeDescuento;
//    @OneToMany(mappedBy = "ofertaIdOferta")
//    private Collection<VwListadoProductos> vwListadoProductosCollection;
//    @OneToMany(mappedBy = "ofertaIdOferta")
//    private Collection<Valoracion> valoracionCollection;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ofertaIdOferta")
//    private Producto producto;
//    @JoinColumn(name = "PRODUCTO_ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
//    @OneToOne(optional = false)
    private int productoIdProducto;

    public Oferta() {
    }

    public Oferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Oferta(Integer idOferta, Integer maximoPro, Integer minimoPro, String fechaLimite, Date fechaRegistro, Integer porcentajeDescuento) {
        this.idOferta = idOferta;
        this.maximoPro = maximoPro;
        this.minimoPro = minimoPro;
        this.fechaLimite = fechaLimite;
        this.fechaRegistro = fechaRegistro;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Integer getMaximoPro() {
        return maximoPro;
    }

    public void setMaximoPro(Integer maximoPro) {
        this.maximoPro = maximoPro;
    }

    public Integer getMinimoPro() {
        return minimoPro;
    }

    public void setMinimoPro(Integer minimoPro) {
        this.minimoPro = minimoPro;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(Integer porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
//
//    @XmlTransient
//    public Collection<VwListadoProductos> getVwListadoProductosCollection() {
//        return vwListadoProductosCollection;
//    }
//
//    public void setVwListadoProductosCollection(Collection<VwListadoProductos> vwListadoProductosCollection) {
//        this.vwListadoProductosCollection = vwListadoProductosCollection;
//    }
//
//    @XmlTransient
//    public Collection<Valoracion> getValoracionCollection() {
//        return valoracionCollection;
//    }
//
//    public void setValoracionCollection(Collection<Valoracion> valoracionCollection) {
//        this.valoracionCollection = valoracionCollection;
//    }
//
//    public Producto getProducto() {
//        return producto;
//    }
//
//    public void setProducto(Producto producto) {
//        this.producto = producto;
//    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOferta != null ? idOferta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oferta)) {
            return false;
        }
        Oferta other = (Oferta) object;
        if ((this.idOferta == null && other.idOferta != null) || (this.idOferta != null && !this.idOferta.equals(other.idOferta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Oferta[ idOferta=" + idOferta + " ]";
    }
    
}
