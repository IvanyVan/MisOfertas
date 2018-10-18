package Clases;

import Clases.Comuna;
import Clases.Prioridad;
import Clases.Ticketdescuento;
import Clases.Tienda;
import Clases.Tipousuario;
import Clases.Valoracion;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T20:16:45")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apepaUsuario;
    public static volatile SingularAttribute<Usuario, String> telefonoUsuario;
    public static volatile SingularAttribute<Usuario, BigDecimal> idUsuario;
    public static volatile SingularAttribute<Usuario, String> passwordUsuario;
    public static volatile CollectionAttribute<Usuario, Valoracion> valoracionCollection;
    public static volatile SingularAttribute<Usuario, Comuna> comunaIdComuna;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;
    public static volatile SingularAttribute<Usuario, String> rutUsuario;
    public static volatile SingularAttribute<Usuario, BigInteger> puntosUsuario;
    public static volatile SingularAttribute<Usuario, Ticketdescuento> ticketdescuentoIdTicket;
    public static volatile SingularAttribute<Usuario, String> direccionUsuario;
    public static volatile SingularAttribute<Usuario, String> correoUsuario;
    public static volatile SingularAttribute<Usuario, Prioridad> prioridadIdVisita;
    public static volatile SingularAttribute<Usuario, Tienda> tiendaIdTienda;
    public static volatile SingularAttribute<Usuario, Tipousuario> tipousuarioIdTipousuario;
    public static volatile SingularAttribute<Usuario, String> apemaUsuario;

}