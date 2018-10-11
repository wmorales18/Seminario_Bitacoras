/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.controller;

import com.query.QueryUsuario;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
*
* @author Ivan
*/
@ManagedBean(name="Usuario")
@SessionScoped
public class UsuarioController implements Serializable {

private String usuario;
private String password;
private final QueryUsuario query = new QueryUsuario();
public String loginControl(){
if(query.loginControl(usuario, password)){
return "Home_proyectos.xhtml?faces-redirect=true";
}
RequestContext.getCurrentInstance().update("growl");
FacesContext context = FacesContext.getCurrentInstance();
context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error de Autenticacion", "Error en el Usuario o password"));
return "";
}

public String getUsuario() {
return usuario;
}

public void setUsuario(String usuario) {
this.usuario = usuario;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}
}

