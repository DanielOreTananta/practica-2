import java.util.ArrayList;

public class SesionNatacion {
    ArrayList<Persona> Sesion=new ArrayList<Persona>();
    protected int buscar(Alumno a){
        int b=1;
        for(Persona persona:Sesion){
            if(persona.codigo==a.codigo){
                return b;
            }
        }
        return -1;        
    }
    protected void darAlta(Alumno a){
        Sesion.add(a);
    }
}
