package Clases;

import Clases.Producto;
import Clases.Valoracion;
import Clases.VwListadoProductos;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Oferta.class)
public class Oferta_ { 

    public static volatile SingularAttribute<Oferta, BigInteger> porcentajeDescuento;
    public static volatile SingularAttribute<Oferta, Date> fechaLimite;
    public static volatile SingularAttribute<Oferta, Date> fechaRegistro;
    public static volatile SingularAttribute<Oferta, BigInteger> maximoPro;
    public static volatile SingularAttribute<Oferta, BigInteger> minimoPro;
    public static volatile CollectionAttribute<Oferta, Valoracion> valoracionCollection;
    public static volatile CollectionAttribute<Oferta, VwListadoProductos> vwListadoProductosCollection;
    public static volatile SingularAttribute<Oferta, BigDecimal> idOferta;
    public static volatile SingularAttribute<Oferta, Producto> producto;
    public static volatile SingularAttribute<Oferta, Producto> productoIdProducto;

}