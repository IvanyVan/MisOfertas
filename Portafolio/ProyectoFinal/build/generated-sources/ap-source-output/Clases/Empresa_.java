package Clases;

import Clases.Tienda;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T18:04:33")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile CollectionAttribute<Empresa, Tienda> tiendaCollection;
    public static volatile SingularAttribute<Empresa, String> rutEmpresa;
    public static volatile SingularAttribute<Empresa, BigDecimal> idEmpresa;
    public static volatile SingularAttribute<Empresa, String> nombreEmpresa;
    public static volatile SingularAttribute<Empresa, String> giro;

}