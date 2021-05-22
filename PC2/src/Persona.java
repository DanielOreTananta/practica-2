public abstract class Persona {
    int edad;
    String nombre;
    String codigo;
    String email;
    public Persona(int edad,String nombre,String codigo,String email){
        this.edad=edad;
        this.nombre=nombre;
        this.codigo=codigo;
        this.email=email;
    }
    public abstract void nadar();
}
