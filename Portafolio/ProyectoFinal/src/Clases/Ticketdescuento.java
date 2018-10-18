/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "TICKETDESCUENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticketdescuento.findAll", query = "SELECT t FROM Ticketdescuento t")
    , @NamedQuery(name = "Ticketdescuento.findByIdTicket", query = "SELECT t FROM Ticketdescuento t WHERE t.idTicket = :idTicket")
    , @NamedQuery(name = "Ticketdescuento.findByFechaInicio", query = "SELECT t FROM Ticketdescuento t WHERE t.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Ticketdescuento.findByFechaTermino", query = "SELECT t FROM Ticketdescuento t WHERE t.fechaTermino = :fechaTermino")
    , @NamedQuery(name = "Ticketdescuento.findByDescuentoOtorgado", query = "SELECT t FROM Ticketdescuento t WHERE t.descuentoOtorgado = :descuentoOtorgado")
    , @NamedQuery(name = "Ticketdescuento.findByTope", query = "SELECT t FROM Ticketdescuento t WHERE t.tope = :tope")})
public class Ticketdescuento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TICKET")
    private BigDecimal idTicket;
    @Basic(optional = false)
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "FECHA_TERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTermino;
    @Basic(optional = false)
    @Column(name = "DESCUENTO_OTORGADO")
    private BigInteger descuentoOtorgado;
    @Lob
    @Column(name = "CODIGOBARRA")
    private Serializable codigobarra;
    @Basic(optional = false)
    @Column(name = "TOPE")
    private BigInteger tope;
    @OneToOne(mappedBy = "ticketdescuentoIdTicket")
    private Usuario usuario;

    public Ticketdescuento() {
    }

    public Ticketdescuento(BigDecimal idTicket) {
        this.idTicket = idTicket;
    }

    public Ticketdescuento(BigDecimal idTicket, Date fechaInicio, Date fechaTermino, BigInteger descuentoOtorgado, BigInteger tope) {
        this.idTicket = idTicket;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.descuentoOtorgado = descuentoOtorgado;
        this.tope = tope;
    }

    public BigDecimal getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(BigDecimal idTicket) {
        this.idTicket = idTicket;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public BigInteger getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(BigInteger descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public Serializable getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(Serializable codigobarra) {
        this.codigobarra = codigobarra;
    }

    public BigInteger getTope() {
        return tope;
    }

    public void setTope(BigInteger tope) {
        this.tope = tope;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticketdescuento)) {
            return false;
        }
        Ticketdescuento other = (Ticketdescuento) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Ticketdescuento[ idTicket=" + idTicket + " ]";
    }
    
}
