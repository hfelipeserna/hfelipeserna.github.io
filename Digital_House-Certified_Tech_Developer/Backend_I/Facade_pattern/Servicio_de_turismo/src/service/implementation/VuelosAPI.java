package service.implementation;

public class VuelosAPI {
    // Busca vuelos de acuerdo a una implementación ya realizada
    public void buscarVuelos(String ciudadOrigen, String ciudadDestino, String fechaDesde, String fechaHasta){
        System.out.println("Bucando vuelos con: \n" + "\tCiudad de origen: " + ciudadOrigen + "\n\tCiudad de destino: " + ciudadDestino + "\n\tFecha de salida: " + fechaDesde + "\n\tFecha de regreso: " + fechaHasta);
    }
}
