public class RestriccionEdad implements TipoRestriccion{
    int edadMinima;
    @Override
    public boolean valida(Persona p) {
        if(p.edad<edadMinima){
            return false;
        }    
        return true;
    }

    public RestriccionEdad(int edadMinima){
        this.edadMinima=edadMinima;

    }
}
