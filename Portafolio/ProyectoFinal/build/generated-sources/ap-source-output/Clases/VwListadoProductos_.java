package Clases;

import Clases.Catgoriaproducto;
import Clases.Marca;
import Clases.Oferta;
import Clases.Rubroproducto;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-23T14:37:16")
@StaticMetamodel(VwListadoProductos.class)
public class VwListadoProductos_ { 

    public static volatile SingularAttribute<VwListadoProductos, String> descripcionProducto;
    public static volatile SingularAttribute<VwListadoProductos, BigDecimal> idProducto;
    public static volatile SingularAttribute<VwListadoProductos, Marca> marcaIdMarca;
    public static volatile SingularAttribute<VwListadoProductos, BigInteger> precioProducto;
    public static volatile SingularAttribute<VwListadoProductos, BigInteger> stockProducto;
    public static volatile SingularAttribute<VwListadoProductos, Catgoriaproducto> catprodIdCatprod;
    public static volatile SingularAttribute<VwListadoProductos, String> nombreProducto;
    public static volatile SingularAttribute<VwListadoProductos, Serializable> imagenProducto;
    public static volatile SingularAttribute<VwListadoProductos, Oferta> ofertaIdOferta;
    public static volatile SingularAttribute<VwListadoProductos, Rubroproducto> rubroproductoIdRubro;

}