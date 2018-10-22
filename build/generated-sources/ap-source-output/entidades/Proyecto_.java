package entidades;

import entidades.Bitacora;
import entidades.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-22T14:09:38")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ { 

    public static volatile SingularAttribute<Proyecto, Date> fechaIniPro;
    public static volatile SingularAttribute<Proyecto, Estado> estadoidEstado;
    public static volatile SingularAttribute<Proyecto, String> nombrepro;
    public static volatile SingularAttribute<Proyecto, Integer> idproyecto;
    public static volatile SingularAttribute<Proyecto, String> descpro;
    public static volatile SingularAttribute<Proyecto, Date> fechaFinalPro;
    public static volatile CollectionAttribute<Proyecto, Bitacora> bitacoraCollection;

}