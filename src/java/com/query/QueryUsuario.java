/** To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.query;

import com.entity.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
*
* @author Ivan
*/
public class QueryUsuario {

public Usuario u = null;
EntityManagerFactory emf;
EntityManager em;
public QueryUsuario(){
emf = Persistence.createEntityManagerFactory("Seminario_BitacorasPU");
em=emf.createEntityManager();
em.getTransaction().begin();
}
public boolean loginControl(String usuario, String password){
try {
u = em.createNamedQuery("Login.control", Usuario.class).setParameter("usuario", usuario).setParameter("password", password).getSingleResult();
if(u !=null){
return true;
}
return false;
} catch (Exception e) {
return false;
}
}
}