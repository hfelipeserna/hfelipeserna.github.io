package service.implementation;
import model.Articulo;
import model.Parametro;
import service.ManejadorDeCalidad;

public class ManejadorDeCalidadPorLote extends ManejadorDeCalidad {

    public ManejadorDeCalidadPorLote(String nombre) {
        super(nombre);
    }

    @Override
    public String comprobarCalidad(Articulo articulo) {
        String resultado = "OK";
        boolean pasaControlDeCalidad = (articulo.getLote() >= Parametro.LOTE.getLimiteInferior())
                && (articulo.getLote() <= Parametro.LOTE.getLimiteSuperior());
        if(!pasaControlDeCalidad)
            System.out.println("\tProducto: " + articulo.getNombre() +" rechazado por " + Parametro.LOTE);
        else{
            if(this.getManejadorCalidadSiguiente() != null)
                resultado = this.getManejadorCalidadSiguiente().comprobarCalidad(articulo);
        }
        return resultado;
    }
}
