/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author internet
 */
@Entity
@Table(name = "proyecto", catalog = "seminario1", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByIdproyecto", query = "SELECT p FROM Proyecto p WHERE p.idproyecto = :idproyecto")
    , @NamedQuery(name = "Proyecto.findByNombrepro", query = "SELECT p FROM Proyecto p WHERE p.nombrepro = :nombrepro")
    , @NamedQuery(name = "Proyecto.findByDescpro", query = "SELECT p FROM Proyecto p WHERE p.descpro = :descpro")
    , @NamedQuery(name = "Proyecto.findByFechaIniPro", query = "SELECT p FROM Proyecto p WHERE p.fechaIniPro = :fechaIniPro")
    , @NamedQuery(name = "Proyecto.findByFechaFinalPro", query = "SELECT p FROM Proyecto p WHERE p.fechaFinalPro = :fechaFinalPro")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproyecto")
    private Integer idproyecto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombrepro")
    private String nombrepro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descpro")
    private String descpro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ini_pro")
    @Temporal(TemporalType.DATE)
    private Date fechaIniPro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_final_pro")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalPro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proyectoIdproyecto")
    private Collection<Bitacora> bitacoraCollection;
    @JoinColumn(name = "Estado_idEstado", referencedColumnName = "idEstado")
    @ManyToOne(optional = false)
    private Estado estadoidEstado;

    public Proyecto() {
    }

    public Proyecto(Integer idproyecto) {
        this.idproyecto = idproyecto;
    }

    public Proyecto(Integer idproyecto, String nombrepro, String descpro, Date fechaIniPro, Date fechaFinalPro) {
        this.idproyecto = idproyecto;
        this.nombrepro = nombrepro;
        this.descpro = descpro;
        this.fechaIniPro = fechaIniPro;
        this.fechaFinalPro = fechaFinalPro;
    }

    public Integer getIdproyecto() {
        return idproyecto;
    }

    public void setIdproyecto(Integer idproyecto) {
        this.idproyecto = idproyecto;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Date getFechaIniPro() {
        return fechaIniPro;
    }

    public void setFechaIniPro(Date fechaIniPro) {
        this.fechaIniPro = fechaIniPro;
    }

    public Date getFechaFinalPro() {
        return fechaFinalPro;
    }

    public void setFechaFinalPro(Date fechaFinalPro) {
        this.fechaFinalPro = fechaFinalPro;
    }

    @XmlTransient
    public Collection<Bitacora> getBitacoraCollection() {
        return bitacoraCollection;
    }

    public void setBitacoraCollection(Collection<Bitacora> bitacoraCollection) {
        this.bitacoraCollection = bitacoraCollection;
    }

    public Estado getEstadoidEstado() {
        return estadoidEstado;
    }

    public void setEstadoidEstado(Estado estadoidEstado) {
        this.estadoidEstado = estadoidEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproyecto != null ? idproyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        return !((this.idproyecto == null && other.idproyecto != null) || (this.idproyecto != null && !this.idproyecto.equals(other.idproyecto)));
    }

    @Override
    public String toString() {
        return "entidades.Proyecto[ idproyecto=" + idproyecto + " ]";
    }
    
}
