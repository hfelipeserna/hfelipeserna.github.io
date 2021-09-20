package service.implementation;
import service.Categoria;
import service.Puntaje;
import service.Vendedor;

public class Pasante extends Vendedor {

    public Pasante(String nombre) {
        super(nombre);
    }

    @Override
    protected int calcularPuntos() {
        return getCantidadDeVentas()* Puntaje.VENTA_PASANTE.getPuntos();
    }

    @Override
    public Categoria recategorizar() {
        int puntos = calcularPuntos();
        Categoria categoria;
        if(puntos < 50)
            categoria = Categoria.PASANTE_NOVATO;
        else
            categoria = Categoria.PASANTE_EXPERTO;
        return categoria;
    }
}
