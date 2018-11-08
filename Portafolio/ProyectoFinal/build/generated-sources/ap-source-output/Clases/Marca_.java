package Clases;

import Clases.Producto;
import Clases.VwListadoProductos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T18:04:33")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile CollectionAttribute<Marca, VwListadoProductos> vwListadoProductosCollection;
    public static volatile CollectionAttribute<Marca, Producto> productoCollection;
    public static volatile SingularAttribute<Marca, BigDecimal> idMarca;
    public static volatile SingularAttribute<Marca, String> nombreMarca;

}