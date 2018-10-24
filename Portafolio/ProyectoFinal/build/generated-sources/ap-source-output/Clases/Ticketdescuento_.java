package Clases;

import Clases.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-23T14:37:16")
@StaticMetamodel(Ticketdescuento.class)
public class Ticketdescuento_ { 

    public static volatile SingularAttribute<Ticketdescuento, BigDecimal> idTicket;
    public static volatile SingularAttribute<Ticketdescuento, Date> fechaInicio;
    public static volatile SingularAttribute<Ticketdescuento, BigInteger> tope;
    public static volatile SingularAttribute<Ticketdescuento, Date> fechaTermino;
    public static volatile SingularAttribute<Ticketdescuento, Serializable> codigobarra;
    public static volatile SingularAttribute<Ticketdescuento, BigInteger> descuentoOtorgado;
    public static volatile SingularAttribute<Ticketdescuento, Usuario> usuario;

}