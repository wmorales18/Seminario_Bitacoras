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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author internet
 */
@Entity
@Table(name = "bitacora", catalog = "seminario1", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bitacora.findAll", query = "SELECT b FROM Bitacora b")
    , @NamedQuery(name = "Bitacora.findByIdBitacora", query = "SELECT b FROM Bitacora b WHERE b.idBitacora = :idBitacora")
    , @NamedQuery(name = "Bitacora.findByNombrebi", query = "SELECT b FROM Bitacora b WHERE b.nombrebi = :nombrebi")
    , @NamedQuery(name = "Bitacora.findByActividad", query = "SELECT b FROM Bitacora b WHERE b.actividad = :actividad")
    , @NamedQuery(name = "Bitacora.findByFechaInicio", query = "SELECT b FROM Bitacora b WHERE b.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Bitacora.findByFechaFinal", query = "SELECT b FROM Bitacora b WHERE b.fechaFinal = :fechaFinal")
    , @NamedQuery(name = "Bitacora.findByUbicacion", query = "SELECT b FROM Bitacora b WHERE b.ubicacion = :ubicacion")
    , @NamedQuery(name = "Bitacora.findByObjetivo", query = "SELECT b FROM Bitacora b WHERE b.objetivo = :objetivo")})
public class Bitacora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idBitacora")
    private Integer idBitacora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrebi")
    private String nombrebi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "actividad")
    private String actividad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_final")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ubicacion")
    private String ubicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "objetivo")
    private String objetivo;
    @JoinColumn(name = "Usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario usuarioidUsuario;
    @JoinColumn(name = "proyecto_idproyecto", referencedColumnName = "idproyecto")
    @ManyToOne(optional = false)
    private Proyecto proyectoIdproyecto;

    public Bitacora() {
    }

    public Bitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public Bitacora(Integer idBitacora, String nombrebi, String actividad, Date fechaInicio, Date fechaFinal, String ubicacion, String objetivo) {
        this.idBitacora = idBitacora;
        this.nombrebi = nombrebi;
        this.actividad = actividad;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.ubicacion = ubicacion;
        this.objetivo = objetivo;
    }

    public Integer getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public String getNombrebi() {
        return nombrebi;
    }

    public void setNombrebi(String nombrebi) {
        this.nombrebi = nombrebi;
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

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public Proyecto getProyectoIdproyecto() {
        return proyectoIdproyecto;
    }

    public void setProyectoIdproyecto(Proyecto proyectoIdproyecto) {
        this.proyectoIdproyecto = proyectoIdproyecto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBitacora != null ? idBitacora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bitacora)) {
            return false;
        }
        Bitacora other = (Bitacora) object;
        return !((this.idBitacora == null && other.idBitacora != null) || (this.idBitacora != null && !this.idBitacora.equals(other.idBitacora)));
    }

    @Override
    public String toString() {
        return "entidades.Bitacora[ idBitacora=" + idBitacora + " ]";
    }
    
}
