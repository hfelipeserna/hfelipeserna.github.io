package service;
import model.Articulo;

public abstract class ManejadorDeCalidad {

    private String nombre;
    private ManejadorDeCalidad manejadorCalidadSiguiente;

    public ManejadorDeCalidad(String nombre) {
        setNombre(nombre);
    }

    public abstract String comprobarCalidad (Articulo articulo);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ManejadorDeCalidad getManejadorCalidadSiguiente() {
        return manejadorCalidadSiguiente;
    }

    public void setManejadorCalidadSiguiente(ManejadorDeCalidad manejadorCalidadSiguiente) {
        this.manejadorCalidadSiguiente = manejadorCalidadSiguiente;
    }
}
