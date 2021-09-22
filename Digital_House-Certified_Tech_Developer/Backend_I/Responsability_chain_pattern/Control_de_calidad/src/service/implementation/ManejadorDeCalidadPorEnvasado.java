package service.implementation;
import model.Articulo;
import service.ManejadorDeCalidad;

public class ManejadorDeCalidadPorEnvasado extends ManejadorDeCalidad {

    public ManejadorDeCalidadPorEnvasado(String nombre) {
        super(nombre);
    }

    @Override
    public String comprobarCalidad(Articulo articulo) {
        String resultado = "OK";
        boolean pasaControlDeCalidad = articulo.getEnvasado().equals("ACEPTADO");
        if(!pasaControlDeCalidad)
            System.out.println("\tProducto: " + articulo.getNombre() +" rechazado por ENVASADO");
        else{
            if(this.getManejadorCalidadSiguiente() != null)
                resultado = this.getManejadorCalidadSiguiente().comprobarCalidad(articulo);
        }
        return resultado;
    }
}
