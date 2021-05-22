public class EstiloLibre extends Estilo{
    String tipoESTILO="Libre";
    @Override
    public String respiracion() {
        return "Respiracion lateral";
    }
    @Override
    public String movimientoPiernas() {
        return "Batido alternado de piernas";
    }
    @Override
    public String movimientoBrazos() {
        return "Alternancia de brazos";
    }
}
