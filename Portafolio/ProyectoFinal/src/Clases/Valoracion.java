/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Eduardo
 */
@Entity
@Table(name = "VALORACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Valoracion.findAll", query = "SELECT v FROM Valoracion v")
    , @NamedQuery(name = "Valoracion.findByIdValoracion", query = "SELECT v FROM Valoracion v WHERE v.idValoracion = :idValoracion")
    , @NamedQuery(name = "Valoracion.findByCalificacion", query = "SELECT v FROM Valoracion v WHERE v.calificacion = :calificacion")
    , @NamedQuery(name = "Valoracion.findByNumeroBoleta", query = "SELECT v FROM Valoracion v WHERE v.numeroBoleta = :numeroBoleta")})
public class Valoracion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_VALORACION")
    private BigDecimal idValoracion;
    @Basic(optional = false)
    @Column(name = "CALIFICACION")
    private BigInteger calificacion;
    @Basic(optional = false)
    @Lob
    @Column(name = "IMAGENBOLETA")
    private Serializable imagenboleta;
    @Basic(optional = false)
    @Column(name = "NUMERO_BOLETA")
    private BigInteger numeroBoleta;
    @JoinColumn(name = "OFERTA_ID_OFERTA", referencedColumnName = "ID_OFERTA")
    @ManyToOne
    private Oferta ofertaIdOferta;
    @JoinColumn(name = "USUARIO_ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario usuarioIdUsuario;

    public Valoracion() {
    }

    public Valoracion(BigDecimal idValoracion) {
        this.idValoracion = idValoracion;
    }

    public Valoracion(BigDecimal idValoracion, BigInteger calificacion, Serializable imagenboleta, BigInteger numeroBoleta) {
        this.idValoracion = idValoracion;
        this.calificacion = calificacion;
        this.imagenboleta = imagenboleta;
        this.numeroBoleta = numeroBoleta;
    }

    public BigDecimal getIdValoracion() {
        return idValoracion;
    }

    public void setIdValoracion(BigDecimal idValoracion) {
        this.idValoracion = idValoracion;
    }

    public BigInteger getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigInteger calificacion) {
        this.calificacion = calificacion;
    }

    public Serializable getImagenboleta() {
        return imagenboleta;
    }

    public void setImagenboleta(Serializable imagenboleta) {
        this.imagenboleta = imagenboleta;
    }

    public BigInteger getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(BigInteger numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public Oferta getOfertaIdOferta() {
        return ofertaIdOferta;
    }

    public void setOfertaIdOferta(Oferta ofertaIdOferta) {
        this.ofertaIdOferta = ofertaIdOferta;
    }

    public Usuario getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Usuario usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValoracion != null ? idValoracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoracion)) {
            return false;
        }
        Valoracion other = (Valoracion) object;
        if ((this.idValoracion == null && other.idValoracion != null) || (this.idValoracion != null && !this.idValoracion.equals(other.idValoracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Validacion.Valoracion[ idValoracion=" + idValoracion + " ]";
    }
    
}
