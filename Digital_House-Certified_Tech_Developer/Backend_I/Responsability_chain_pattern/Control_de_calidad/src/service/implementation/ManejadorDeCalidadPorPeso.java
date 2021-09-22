package service.implementation;
import model.Articulo;
import model.Parametro;
import service.ManejadorDeCalidad;

public class ManejadorDeCalidadPorPeso extends ManejadorDeCalidad {

    public ManejadorDeCalidadPorPeso(String nombre) {
        super(nombre);
    }

    @Override
    public String comprobarCalidad(Articulo articulo) {
        String resultado = "OK";
        boolean pasaControlDeCalidad = (articulo.getPeso() >= Parametro.PESO.getLimiteInferior())
                && (articulo.getPeso() <= Parametro.PESO.getLimiteSuperior());
        if(!pasaControlDeCalidad)
            System.out.println("\tProducto: " + articulo.getNombre() +" rechazado por " + Parametro.PESO);
        else{
            if(this.getManejadorCalidadSiguiente() != null)
                resultado = this.getManejadorCalidadSiguiente().comprobarCalidad(articulo);
        }
        return resultado;
    }
}
