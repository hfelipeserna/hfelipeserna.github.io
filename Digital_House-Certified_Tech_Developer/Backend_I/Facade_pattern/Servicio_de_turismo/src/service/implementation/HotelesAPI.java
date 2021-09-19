package service.implementation;

public class HotelesAPI {
    // Busca hoteles de acuerdo a una implementación ya realizada
    public void buscarHoteles(String ciudad, String fechaDesde, String fechaHasta){
        System.out.println("Bucando hoteles con: \n" + "\tCiudad: " + ciudad + "\n\tCheck-in: " + fechaDesde + "\n\tCheck-out: " + fechaHasta);
    }
}
