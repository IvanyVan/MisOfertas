package Clases;

import java.io.Serializable;
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
@Table(name = "CATEGORIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCategoriaproducto", query = "SELECT c FROM Categoria c WHERE c.id_Categoria = :idCategoriaproducto")
    , @NamedQuery(name = "Categoria.findByNombreCategoriaprod", query = "SELECT c FROM Categoria c WHERE c.nombre_Categoria = :nombreCategoriaprod")})
public class Catgoriaproducto implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoriaproducto;
    @Basic(optional = false)
    @Column(name = "NOMBRE_CATEGORIA")
    private String nombreCategoriaprod;
    @OneToMany(mappedBy = "catprodIdCatprod")
    private Collection<VwListadoProductos> vwListadoProductosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catprodIdCatprod")
    private Collection<Producto> productoCollection;

    public Catgoriaproducto() {
    }

    public Catgoriaproducto(Integer idCategoriaproducto) {
        this.idCategoriaproducto = idCategoriaproducto;
    }

    public Catgoriaproducto(Integer idCategoriaproducto, String nombreCategoriaprod) {
        this.idCategoriaproducto = idCategoriaproducto;
        this.nombreCategoriaprod = nombreCategoriaprod;
    }

    public Integer getIdCategoriaproducto() {
        return idCategoriaproducto;
    }

    public void setIdCategoriaproducto(Integer idCategoriaproducto) {
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
        return "Validacion.Categoria[ idCategoria=" + idCategoriaproducto + " ]";
    }
    
     public ResultSet getCategoriaProds() throws ClassNotFoundException, SQLException{
        
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select NOMBRE_CATEGORIA from CATEGORIA order by ID_CATEGORIA"; 
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
         return rs;
}
     
         public int getCategoriaID(String categoria) throws ClassNotFoundException, SQLException{
        int id = 0;
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn=conexion.getConnection();
        Statement sentencia = null;
        ResultSet rs = null;
        String tipo=null;
        String query = "select ID_CATEGORIA from CATEGORIA where NOMBRE_CATEGORIA = '"+categoria+"' order by ID_CATEGORIA";
        sentencia =conn.createStatement();
        rs = sentencia.executeQuery(query);
       
           while(rs.next()){
        id = Integer.parseInt(rs.getString(1));
        };
        rs.close();
         return id;
}
    
}
