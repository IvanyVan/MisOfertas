package Clases;

import Clases.Oferta;
import Clases.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Valoracion.class)
public class Valoracion_ { 

    public static volatile SingularAttribute<Valoracion, BigDecimal> idValoracion;
    public static volatile SingularAttribute<Valoracion, Usuario> usuarioIdUsuario;
    public static volatile SingularAttribute<Valoracion, Serializable> imagenboleta;
    public static volatile SingularAttribute<Valoracion, BigInteger> calificacion;
    public static volatile SingularAttribute<Valoracion, BigInteger> numeroBoleta;
    public static volatile SingularAttribute<Valoracion, Oferta> ofertaIdOferta;

}