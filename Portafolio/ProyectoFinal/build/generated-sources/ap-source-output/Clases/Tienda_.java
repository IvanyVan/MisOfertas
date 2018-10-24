package Clases;

import Clases.Comuna;
import Clases.Empresa;
import Clases.Producto;
import Clases.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-23T14:37:16")
@StaticMetamodel(Tienda.class)
public class Tienda_ { 

    public static volatile SingularAttribute<Tienda, String> telefonoTienda;
    public static volatile SingularAttribute<Tienda, Empresa> empresaIdEmpresa;
    public static volatile SingularAttribute<Tienda, String> direccionTienda;
    public static volatile SingularAttribute<Tienda, Comuna> comunaIdComuna;
    public static volatile SingularAttribute<Tienda, Usuario> usuario;
    public static volatile SingularAttribute<Tienda, String> nombreTienda;
    public static volatile CollectionAttribute<Tienda, Producto> productoCollection;
    public static volatile SingularAttribute<Tienda, BigDecimal> idTienda;

}