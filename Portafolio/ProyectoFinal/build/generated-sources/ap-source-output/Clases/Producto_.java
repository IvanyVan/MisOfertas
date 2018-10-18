package Clases;

import Clases.Catgoriaproducto;
import Clases.Marca;
import Clases.Oferta;
import Clases.Rubroproducto;
import Clases.Tienda;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile CollectionAttribute<Producto, Tienda> tiendaCollection;
    public static volatile SingularAttribute<Producto, Oferta> oferta;
    public static volatile SingularAttribute<Producto, String> descripcionProducto;
    public static volatile SingularAttribute<Producto, BigDecimal> idProducto;
    public static volatile SingularAttribute<Producto, Marca> marcaIdMarca;
    public static volatile SingularAttribute<Producto, BigInteger> precioProducto;
    public static volatile SingularAttribute<Producto, BigInteger> stockProducto;
    public static volatile SingularAttribute<Producto, Catgoriaproducto> catprodIdCatprod;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, Serializable> imagenProducto;
    public static volatile SingularAttribute<Producto, Oferta> ofertaIdOferta;
    public static volatile SingularAttribute<Producto, Rubroproducto> rubroproductoIdRubro;

}