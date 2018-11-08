package Clases;

import Clases.Comuna;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-24T18:04:33")
@StaticMetamodel(Region.class)
public class Region_ { 

    public static volatile SingularAttribute<Region, String> nombreRegion;
    public static volatile CollectionAttribute<Region, Comuna> comunaCollection;
    public static volatile SingularAttribute<Region, BigDecimal> idRegion;

}