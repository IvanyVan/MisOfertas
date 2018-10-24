package Clases;

import Clases.Producto;
import Clases.VwListadoProductos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-23T14:37:16")
@StaticMetamodel(Rubroproducto.class)
public class Rubroproducto_ { 

    public static volatile SingularAttribute<Rubroproducto, String> descripcion;
    public static volatile CollectionAttribute<Rubroproducto, VwListadoProductos> vwListadoProductosCollection;
    public static volatile CollectionAttribute<Rubroproducto, Producto> productoCollection;
    public static volatile SingularAttribute<Rubroproducto, BigDecimal> idRubro;
    public static volatile SingularAttribute<Rubroproducto, String> nombreRubro;

}