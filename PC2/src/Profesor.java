public class Profesor extends Persona{
    public void dirigirClase() {
        System.out.println("Dirige la clase");
    }
    @Override
    public void nadar() {
        
    }
    
    public Profesor(int edad, String nombre, String codigo, String email){
        super(edad,nombre,codigo,email);
    }
}
