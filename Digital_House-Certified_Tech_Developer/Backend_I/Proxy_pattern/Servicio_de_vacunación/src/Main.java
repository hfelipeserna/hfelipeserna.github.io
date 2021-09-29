import service.IServicioDeVacunacion;
import service.implementation.ProxyServicioDeVacunacion;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        IServicioDeVacunacion servicioDeVacunacion = new ProxyServicioDeVacunacion();
        servicioDeVacunacion.vacunar("123456", LocalDate.of(2021, 8,14));
        servicioDeVacunacion.vacunar("123456", LocalDate.of(2021, 12,14));
    }
}
