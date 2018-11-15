/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CATGORIAPRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catgoriaproducto.findAll", query = "SELECT c FROM Catgoriaproducto c")
    , @NamedQuery(name = "Catgoriaproducto.findByIdCategoriaproducto", query = "SELECT c FROM Catgoriaproducto c WHERE c.idCategoriaproducto = :idCategoriaproducto")
    , @NamedQuery(name = "Catgoriaproducto.findByNombreCategoriaprod", query = "SELECT c FROM Catgoriaproducto c WHERE c.nombreCategoriaprod = :nombreCategoriaprod")})
public class Catgoriaproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIAPRODUCTO")
    private BigDecimal idCategoriaproducto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CATEGORIAPROD")
    private String nombreCategoriaprod;
    @OneToMany(mappedBy = "catprodIdCatprod")
    private Collection<VwListadoProductos> vwListadoProductosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catprodIdCatprod")
    private Collection<Producto> productoCollection;

    public Catgoriaproducto() {
    }

    public Catgoriaproducto(BigDecimal idCategoriaproducto) {
        this.idCategoriaproducto = idCategoriaproducto;
    }

    public Catgoriaproducto(BigDecimal idCategoriaproducto, String nombreCategoriaprod) {
        this.idCategoriaproducto = idCategoriaproducto;
        this.nombreCategoriaprod = nombreCategoriaprod;
    }

    public BigDecimal getIdCategoriaproducto() {
        return idCategoriaproducto;
    }

    public void setIdCategoriaproducto(BigDecimal idCategoriaproducto) {
        this.idCategoriaproducto = idCategoriaproducto;
    }

    public String getNombreCategoriaprod() {
        return nombreCategoriaprod;
    }

    public void setNombreCategoriaprod(String nombreCategoriaprod) {
        this.nombreCategoriaprod = nombreCategoriaprod;
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
        hash += (idCategoriaproducto != null ? idCategoriaproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catgoriaproducto)) {
            return false;
        }
        Catgoriaproducto other = (Catgoriaproducto) object;
        if ((this.idCategoriaproducto == null && other.idCategoriaproducto != null) || (this.idCategoriaproducto != null && !this.idCategoriaproducto.equals(other.idCategoriaproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Catgoriaproducto[ idCategoriaproducto=" + idCategoriaproducto + " ]";
    }
    
}
