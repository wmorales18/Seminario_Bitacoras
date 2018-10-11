/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Wilson
 */
@Embeddable
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idUSUARIO")
    private int idUSUARIO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rol_idRol")
    private int rolidRol;

    public UsuarioPK() {
    }

    public UsuarioPK(int idUSUARIO, int rolidRol) {
        this.idUSUARIO = idUSUARIO;
        this.rolidRol = rolidRol;
    }

    public int getIdUSUARIO() {
        return idUSUARIO;
    }

    public void setIdUSUARIO(int idUSUARIO) {
        this.idUSUARIO = idUSUARIO;
    }

    public int getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(int rolidRol) {
        this.rolidRol = rolidRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUSUARIO;
        hash += (int) rolidRol;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idUSUARIO != other.idUSUARIO) {
            return false;
        }
        if (this.rolidRol != other.rolidRol) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UsuarioPK[ idUSUARIO=" + idUSUARIO + ", rolidRol=" + rolidRol + " ]";
    }
    
}
