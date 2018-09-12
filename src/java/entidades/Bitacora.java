/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author internet
 */
@Entity
@Table(name = "bitacora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b")
    , @NamedQuery(name = "Bitacora.findByIdBITACORA", query = "SELECT b FROM Bitacora b WHERE b.idBITACORA = :idBITACORA")
    , @NamedQuery(name = "Bitacora.findByTitulo", query = "SELECT b FROM Bitacora b WHERE b.titulo = :titulo")
    , @NamedQuery(name = "Bitacora.findByActividad", query = "SELECT b FROM Bitacora b WHERE b.actividad = :actividad")
    , @NamedQuery(name = "Bitacora.findByFechaInicio", query = "SELECT b FROM Bitacora b WHERE b.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Bitacora.findByFechaFinal", query = "SELECT b FROM Bitacora b WHERE b.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Bitacora.findByUbicacion", query = "SELECT b FROM Bitacora b WHERE b.ubicacion = :ubicacion")})
public class Bitacora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBITACORA")
    private Integer idBITACORA;
    @Basic(optional = false)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @Column(name = "actividad")
    private String actividad;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @Column(name = "ubicacion")
    private String ubicacion;
    @JoinColumn(name = "PROYECTO_idPROYECTO", referencedColumnName = "idPROYECTO")
    @ManyToOne(optional = false)
    private Proyecto pROYECTOidPROYECTO;
    @JoinColumn(name = "USUARIO_idUSUARIO", referencedColumnName = "idUSUARIO")
    @ManyToOne(optional = false)
    private Usuario uSUARIOidUSUARIO;

    public Bitacora() {
    }

    public Bitacora(Integer idBITACORA) {
        this.idBITACORA = idBITACORA;
    }

    public Bitacora(Integer idBITACORA, String titulo, String actividad, Date fechaInicio, Date fechaFinal, String ubicacion) {
        this.idBITACORA = idBITACORA;
        this.titulo = titulo;
        this.actividad = actividad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.ubicacion = ubicacion;
    }

    public Integer getIdBITACORA() {
        return idBITACORA;
    }

    public void setIdBITACORA(Integer idBITACORA) {
        this.idBITACORA = idBITACORA;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Proyecto getPROYECTOidPROYECTO() {
        return pROYECTOidPROYECTO;
    }

    public void setPROYECTOidPROYECTO(Proyecto pROYECTOidPROYECTO) {
        this.pROYECTOidPROYECTO = pROYECTOidPROYECTO;
    }

    public Usuario getUSUARIOidUSUARIO() {
        return uSUARIOidUSUARIO;
    }

    public void setUSUARIOidUSUARIO(Usuario uSUARIOidUSUARIO) {
        this.uSUARIOidUSUARIO = uSUARIOidUSUARIO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBITACORA != null ? idBITACORA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        if ((this.idBITACORA == null && other.idBITACORA != null) || (this.idBITACORA != null && !this.idBITACORA.equals(other.idBITACORA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Bitacora[ idBITACORA=" + idBITACORA + " ]";
    }
    
}
