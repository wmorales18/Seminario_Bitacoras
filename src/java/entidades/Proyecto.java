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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author internet
 */
@Entity
@Table(name = "proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByIdPROYECTO", query = "SELECT p FROM Proyecto p WHERE p.idPROYECTO = :idPROYECTO")
    , @NamedQuery(name = "Proyecto.findByNombreProyecto", query = "SELECT p FROM Proyecto p WHERE p.nombreProyecto = :nombreProyecto")
    , @NamedQuery(name = "Proyecto.findByDescripcionProyecto", query = "SELECT p FROM Proyecto p WHERE p.descripcionProyecto = :descripcionProyecto")
    , @NamedQuery(name = "Proyecto.findByFechaInicioProyecto", query = "SELECT p FROM Proyecto p WHERE p.fechaInicioProyecto = :fechaInicioProyecto")
    , @NamedQuery(name = "Proyecto.findByFechaFinalProyecto", query = "SELECT p FROM Proyecto p WHERE p.fechaFinalProyecto = :fechaFinalProyecto")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idPROYECTO")
    private Integer idPROYECTO;
    @Basic(optional = false)
    @Column(name = "nombre_proyecto")
    private String nombreProyecto;
    @Basic(optional = false)
    @Column(name = "descripcion_proyecto")
    private String descripcionProyecto;
    @Basic(optional = false)
    @Column(name = "fecha_inicio_proyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaInicioProyecto;
    @Basic(optional = false)
    @Column(name = "fecha_final_proyecto")
    @Temporal(TemporalType.DATE)
    private Date fechaFinalProyecto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pROYECTOidPROYECTO")
    private Collection<Bitacora> bitacoraCollection;
    @JoinColumn(name = "ESTADO_idESTADO", referencedColumnName = "idESTADO")
    @ManyToOne(optional = false)
    private Estado eSTADOidESTADO;

    public Proyecto() {
    }

    public Proyecto(Integer idPROYECTO) {
        this.idPROYECTO = idPROYECTO;
    }

    public Proyecto(Integer idPROYECTO, String nombreProyecto, String descripcionProyecto, Date fechaInicioProyecto, Date fechaFinalProyecto) {
        this.idPROYECTO = idPROYECTO;
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.fechaInicioProyecto = fechaInicioProyecto;
        this.fechaFinalProyecto = fechaFinalProyecto;
    }

    public Integer getIdPROYECTO() {
        return idPROYECTO;
    }

    public void setIdPROYECTO(Integer idPROYECTO) {
        this.idPROYECTO = idPROYECTO;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public Date getFechaInicioProyecto() {
        return fechaInicioProyecto;
    }

    public void setFechaInicioProyecto(Date fechaInicioProyecto) {
        this.fechaInicioProyecto = fechaInicioProyecto;
    }

    public Date getFechaFinalProyecto() {
        return fechaFinalProyecto;
    }

    public void setFechaFinalProyecto(Date fechaFinalProyecto) {
        this.fechaFinalProyecto = fechaFinalProyecto;
    }

    @XmlTransient
    public Collection<Bitacora> getBitacoraCollection() {
        return bitacoraCollection;
    }

    public void setBitacoraCollection(Collection<Bitacora> bitacoraCollection) {
        this.bitacoraCollection = bitacoraCollection;
    }

    public Estado getESTADOidESTADO() {
        return eSTADOidESTADO;
    }

    public void setESTADOidESTADO(Estado eSTADOidESTADO) {
        this.eSTADOidESTADO = eSTADOidESTADO;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPROYECTO != null ? idPROYECTO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.idPROYECTO == null && other.idPROYECTO != null) || (this.idPROYECTO != null && !this.idPROYECTO.equals(other.idPROYECTO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Proyecto[ idPROYECTO=" + idPROYECTO + " ]";
    }
    
}
