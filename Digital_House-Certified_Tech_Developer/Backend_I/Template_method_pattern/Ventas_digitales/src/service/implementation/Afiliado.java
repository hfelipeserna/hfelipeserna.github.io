package service.implementation;
import service.Puntaje;
import service.Vendedor;

public class Afiliado extends Vendedor {

    public Afiliado(String nombre) {
        super(nombre);
    }

    @Override
    protected int calcularPuntos() {
        return getCantidadDeVentas()*Puntaje.VENTA_AFILIADO.getPuntos();
    }
}
