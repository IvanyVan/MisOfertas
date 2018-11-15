package Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Producto.findByPrecioProducto", query = "SELECT p FROM Producto p WHERE p.precioProducto = :precioProducto"),
    @NamedQuery(name = "Producto.findByStockProducto", query = "SELECT p FROM Producto p WHERE p.stockProducto = :stockProducto"),
    @NamedQuery(name = "Producto.findByDescripcionProducto", query = "SELECT p FROM Producto p WHERE p.descripcionProducto = :descripcionProducto")})

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO")
    private Integer idProducto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_PRODUCTO")
    private String nombreProducto;
    @Basic(optional = false)
    @Column(name = "PRECIO_PRODUCTO")
    private Integer precioProducto;
    @Basic(optional = false)
    @Column(name = "STOCK_PRODUCTO")
    private Integer stockProducto;
    @Column(name = "DESCRIPCION_PRODUCTO")
    private String descripcionProducto;
    @Basic(optional = false)
    @Lob
    @Column(name = "IMAGEN_PRODUCTO")
    private byte[] imagenProducto;
    private int idTienda;
    private int catprodIdCatprod;
    private int marcaIdMarca;
    private int ofertaIdOferta;
    private int rubroproductoIdRubro;
    private Marca objMarca;
    private Catgoriaproducto objCategoria;

    public int getRubroproductoIdRubro() {
        return rubroproductoIdRubro;
    }

    public void setRubroproductoIdRubro(int rubroproductoIdRubro) {
        this.rubroproductoIdRubro = rubroproductoIdRubro;
    }
    private Oferta oferta;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombreProducto, Integer precioProducto,
            Integer stockProducto, byte[] imagenProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.imagenProducto = imagenProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(Integer stockProducto) {
        this.stockProducto = stockProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public byte[] getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(byte[] imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public int getCatprodIdCatprod() {
        return catprodIdCatprod;
    }

    public int getMarcaIdMarca() {
        return marcaIdMarca;
    }

    public int getOfertaIdOferta() {
        return ofertaIdOferta;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public void setCatprodIdCatprod(int catprodIdCatprod) {
        this.catprodIdCatprod = catprodIdCatprod;
    }

    public void setMarcaIdMarca(int marcaIdMarca) {
        this.marcaIdMarca = marcaIdMarca;
    }

    public void setOfertaIdOferta(int ofertaIdOferta) {
        this.ofertaIdOferta = ofertaIdOferta;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Catgoriaproducto getObjCategoria() {
        return objCategoria;
    }

    public Marca getObjMarca() {
        return objMarca;
    }

    public void setObjCategoria(Catgoriaproducto objCategoria) {
        this.objCategoria = objCategoria;
    }

    public void setObjMarca(Marca objMarca) {
        this.objMarca = objMarca;
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
        return "Validacion.Producto[idProducto=" + idProducto + "]";
    }

}
