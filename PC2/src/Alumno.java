public class Alumno extends Persona{
    public void ejecutarLaClase() {
        System.out.println("La clase se esta ejecutando");
    }
    public void agregarEstilo(Estilo e){

    }
    @Override
    public void nadar() {
        
    }
    public Alumno(int edad, String nombre, String codigo, String email){
        super(edad,nombre,codigo,email);
    }
}
