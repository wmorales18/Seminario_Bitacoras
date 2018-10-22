package entidades;

import entidades.Proyecto;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-22T14:30:35")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, Integer> idEstado;
    public static volatile CollectionAttribute<Estado, Proyecto> proyectoCollection;
    public static volatile SingularAttribute<Estado, String> descest;
    public static volatile SingularAttribute<Estado, String> nombreest;

}