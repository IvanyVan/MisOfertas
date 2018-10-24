package Clases;

import Clases.Oferta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-23T14:37:16")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Oferta> oferta;
    public static volatile SingularAttribute<Producto, String> descripcionProducto;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, Integer> marcaIdMarca;
    public static volatile SingularAttribute<Producto, Integer> precioProducto;
    public static volatile SingularAttribute<Producto, Integer> stockProducto;
    public static volatile SingularAttribute<Producto, Integer> idTienda;
    public static volatile SingularAttribute<Producto, Integer> catprodIdCatprod;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, byte[]> imagenProducto;
    public static volatile SingularAttribute<Producto, Integer> ofertaIdOferta;
    public static volatile SingularAttribute<Producto, Integer> rubroproductoIdRubro;

}