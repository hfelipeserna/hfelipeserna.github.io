import model.Articulo;
import service.CadenaDeManejadores;

public class Main {
    public static void main(String[] args) {
        // Se crean los artículos
        Articulo articulo1 = new Articulo("Producto 1", 1500, 1250, "ACEPTADO");
        Articulo articulo2 = new Articulo("Producto 2", 900, 1250, "ACEPTADO");
        Articulo articulo3 = new Articulo("Producto 3", 1500, 1500, "ACEPTADO");
        Articulo articulo4 = new Articulo("Producto 4", 1500, 1250, "RECHAZADO");

        CadenaDeManejadores cadenaDeManejadores = new CadenaDeManejadores();
        cadenaDeManejadores.getManejadorBase().comprobarCalidad(articulo1);
        cadenaDeManejadores.getManejadorBase().comprobarCalidad(articulo2);
        cadenaDeManejadores.getManejadorBase().comprobarCalidad(articulo3);
        cadenaDeManejadores.getManejadorBase().comprobarCalidad(articulo4);
    }
}
