package Clases;

import Clases.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Tipousuario.class)
public class Tipousuario_ { 

    public static volatile SingularAttribute<Tipousuario, String> nombreTipousuario;
    public static volatile SingularAttribute<Tipousuario, String> descripcion;
    public static volatile SingularAttribute<Tipousuario, BigDecimal> idTipousuario;
    public static volatile CollectionAttribute<Tipousuario, Usuario> usuarioCollection;

}