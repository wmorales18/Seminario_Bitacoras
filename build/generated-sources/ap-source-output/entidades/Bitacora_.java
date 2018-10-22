package entidades;

import entidades.Proyecto;
import entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-22T14:30:35")
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, String> objetivo;
    public static volatile SingularAttribute<Bitacora, String> ubicacion;
    public static volatile SingularAttribute<Bitacora, Integer> idBitacora;
    public static volatile SingularAttribute<Bitacora, Date> fechaInicio;
    public static volatile SingularAttribute<Bitacora, Usuario> usuarioidUsuario;
    public static volatile SingularAttribute<Bitacora, Date> fechaFinal;
    public static volatile SingularAttribute<Bitacora, Proyecto> proyectoIdproyecto;
    public static volatile SingularAttribute<Bitacora, String> nombrebi;
    public static volatile SingularAttribute<Bitacora, String> actividad;

}