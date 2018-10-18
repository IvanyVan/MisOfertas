package Clases;

import Clases.Region;
import Clases.Tienda;
import Clases.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Comuna.class)
public class Comuna_ { 

    public static volatile CollectionAttribute<Comuna, Tienda> tiendaCollection;
    public static volatile SingularAttribute<Comuna, String> nombreComuna;
    public static volatile SingularAttribute<Comuna, BigDecimal> idComuna;
    public static volatile CollectionAttribute<Comuna, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Comuna, Region> regionIdRegion;

}