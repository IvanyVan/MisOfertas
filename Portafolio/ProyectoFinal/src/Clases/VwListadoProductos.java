/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "VW_LISTADO_PRODUCTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwListadoProductos.findAll", query = "SELECT v FROM VwListadoProductos v")
    , @NamedQuery(name = "VwListadoProductos.findByIdProducto", query = "SELECT v FROM VwListadoProductos v WHERE v.idProducto = :idProducto")
    , @NamedQuery(name = "VwListadoProductos.findByNombreProducto", query = "SELECT v FROM VwListadoProductos v WHERE v.nombreProducto = :nombreProducto")
    , @NamedQuery(name = "VwListadoProductos.findByPrecioProducto", query = "SELECT v FROM VwListadoProductos v WHERE v.precioProducto = :precioProducto")
    , @NamedQuery(name = "VwListadoProductos.findByStockProducto", query = "SELECT v FROM VwListadoProductos v WHERE v.stockProducto = :stockProducto")
    , @NamedQuery(name = "VwListadoProductos.findByDescripcionProducto", query = "SELECT v FROM VwListadoProductos v WHERE v.descripcionProducto = :descripcionProducto")})
public class VwListadoProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Column(name = "ID_PRODUCTO")
    private BigDecimal idProducto;
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Column(name = "PRECIO_PRODUCTO")
    private BigInteger precioProducto;
    @Column(name = "STOCK_PRODUCTO")
    private BigInteger stockProducto;
    @Column(name = "DESCRIPCION_PRODUCTO")
    private String descripcionProducto;
    @Lob
    @Column(name = "IMAGEN_PRODUCTO")
    private Serializable imagenProducto;
    @JoinColumn(name = "CATPROD_ID_CATPROD", referencedColumnName = "ID_CATEGORIAPRODUCTO")
    @ManyToOne
    private Catgoriaproducto catprodIdCatprod;
    @JoinColumn(name = "MARCA_ID_MARCA", referencedColumnName = "ID_MARCA")
    @ManyToOne
    private Marca marcaIdMarca;
    @JoinColumn(name = "OFERTA_ID_OFERTA", referencedColumnName = "ID_OFERTA")
    @ManyToOne
    private Oferta ofertaIdOferta;
    @JoinColumn(name = "RUBROPRODUCTO_ID_RUBRO", referencedColumnName = "ID_RUBRO")
    @ManyToOne
    private Rubroproducto rubroproductoIdRubro;

    public VwListadoProductos() {
    }

    public VwListadoProductos(BigDecimal idProducto) {
        this.idProducto = idProducto;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VwListadoProductos)) {
            return false;
        }
        VwListadoProductos other = (VwListadoProductos) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.VwListadoProductos[ idProducto=" + idProducto + " ]";
    }
    
}
