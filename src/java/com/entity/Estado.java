/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Wilson
 */
@Entity
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")
    , @NamedQuery(name = "Estado.findByIdESTADO", query = "SELECT e FROM Estado e WHERE e.idESTADO = :idESTADO")
    , @NamedQuery(name = "Estado.findByNombreEstado", query = "SELECT e FROM Estado e WHERE e.nombreEstado = :nombreEstado")
    , @NamedQuery(name = "Estado.findByDescripcionEstado", query = "SELECT e FROM Estado e WHERE e.descripcionEstado = :descripcionEstado")})
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idESTADO")
    private Integer idESTADO;
    @Size(max = 45)
    @Column(name = "nombre_estado")
    private String nombreEstado;
    @Size(max = 45)
    @Column(name = "descripcion_estado")
    private String descripcionEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eSTADOidESTADO")
    private Collection<Proyecto> proyectoCollection;

    public Estado() {
    }

    public Estado(Integer idESTADO) {
        this.idESTADO = idESTADO;
    }

    public Integer getIdESTADO() {
        return idESTADO;
    }

    public void setIdESTADO(Integer idESTADO) {
        this.idESTADO = idESTADO;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    @XmlTransient
    public Collection<Proyecto> getProyectoCollection() {
        return proyectoCollection;
    }

    public void setProyectoCollection(Collection<Proyecto> proyectoCollection) {
        this.proyectoCollection = proyectoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idESTADO != null ? idESTADO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.idESTADO == null && other.idESTADO != null) || (this.idESTADO != null && !this.idESTADO.equals(other.idESTADO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Estado[ idESTADO=" + idESTADO + " ]";
    }
    
}
