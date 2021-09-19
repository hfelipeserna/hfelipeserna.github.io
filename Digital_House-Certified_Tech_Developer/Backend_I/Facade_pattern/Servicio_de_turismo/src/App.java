import service.implementation.ServiciodeBusqueda;

public class App {
    public static void main(String[] args) {
        // Busca vuelos y hoteles de acuerdo a una implementación ya realizada
        ServiciodeBusqueda busqueda = new ServiciodeBusqueda();

        //Búsqueda con ciudad de origen
        busqueda.buscar("Medellín", "Buenos Aires", "11/08/2021", "14/12/2021");

        //Búsqueda sin ciudad de origen
        busqueda.buscar(null, "Buenos Aires", "11/08/2021", "14/12/2021");
    }
}
