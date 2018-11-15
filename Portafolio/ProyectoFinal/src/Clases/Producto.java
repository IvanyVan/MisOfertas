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
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
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
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
    , @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto")
    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "Producto.findByPrecioProducto", query = "SELECT p FROM Producto p WHERE p.precioProducto = :precioProducto")
    , @NamedQuery(name = "Producto.findByStockProducto", query = "SELECT p FROM Producto p WHERE p.stockProducto = :stockProducto")
    , @NamedQuery(name = "Producto.findByDescripcionProducto", query = "SELECT p FROM Producto p WHERE p.descripcionProducto = :descripcionProducto")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO")
    private BigDecimal idProducto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "PRECIO_PRODUCTO")
    private BigInteger precioProducto;
    @Basic(optional = false)
    @Column(name = "STOCK_PRODUCTO")
    private BigInteger stockProducto;
    @Column(name = "DESCRIPCION_PRODUCTO")
    private String descripcionProducto;
    @Basic(optional = false)
    @Lob
    @Column(name = "IMAGEN_PRODUCTO")
    private Serializable imagenProducto;
    @JoinTable(name = "TIENDA_PRODUCO", joinColumns = {
        @JoinColumn(name = "PRODUCTO_ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")}, inverseJoinColumns = {
        @JoinColumn(name = "TIENDA_ID_TIENDA", referencedColumnName = "ID_TIENDA")})
    @ManyToMany
    private Collection<Tienda> tiendaCollection;
    @JoinColumn(name = "CATPROD_ID_CATPROD", referencedColumnName = "ID_CATEGORIAPRODUCTO")
    @ManyToOne(optional = false)
    private Catgoriaproducto catprodIdCatprod;
    @JoinColumn(name = "MARCA_ID_MARCA", referencedColumnName = "ID_MARCA")
    @ManyToOne(optional = false)
    private Marca marcaIdMarca;
    @JoinColumn(name = "OFERTA_ID_OFERTA", referencedColumnName = "ID_OFERTA")
    @OneToOne(optional = false)
    private Oferta ofertaIdOferta;
    @JoinColumn(name = "RUBROPRODUCTO_ID_RUBRO", referencedColumnName = "ID_RUBRO")
    @ManyToOne(optional = false)
    private Rubroproducto rubroproductoIdRubro;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "productoIdProducto")
    private Oferta oferta;

    public Producto() {
    }

    public Producto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(BigDecimal idProducto, String nombreProducto, BigInteger precioProducto, BigInteger stockProducto, Serializable imagenProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.imagenProducto = imagenProducto;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigInteger getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(BigInteger precioProducto) {
        this.precioProducto = precioProducto;
    }

    public BigInteger getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(BigInteger stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Serializable getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(Serializable imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    @XmlTransient
    public Collection<Tienda> getTiendaCollection() {
        return tiendaCollection;
    }

    public void setTiendaCollection(Collection<Tienda> tiendaCollection) {
        this.tiendaCollection = tiendaCollection;
    }

    public Catgoriaproducto getCatprodIdCatprod() {
        return catprodIdCatprod;
    }

    public void setCatprodIdCatprod(Catgoriaproducto catprodIdCatprod) {
        this.catprodIdCatprod = catprodIdCatprod;
    }

    public Marca getMarcaIdMarca() {
        return marcaIdMarca;
    }

    public void setMarcaIdMarca(Marca marcaIdMarca) {
        this.marcaIdMarca = marcaIdMarca;
    }

    public Oferta getOfertaIdOferta() {
        return ofertaIdOferta;
    }

    public void setOfertaIdOferta(Oferta ofertaIdOferta) {
        this.ofertaIdOferta = ofertaIdOferta;
    }

    public Rubroproducto getRubroproductoIdRubro() {
        return rubroproductoIdRubro;
    }

    public void setRubroproductoIdRubro(Rubroproducto rubroproductoIdRubro) {
        this.rubroproductoIdRubro = rubroproductoIdRubro;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
