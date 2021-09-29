package service.implementation;
import service.IServicioDeVacunacion;

import java.time.LocalDate;

public class ServicioDeVacunacion implements IServicioDeVacunacion {

    @Override
    public void vacunar(String dni, LocalDate fechaProgramadaDeVacunacion) {
        System.out.println("La persona con el DNI: " + dni + " fue vacunada en el fecha " + fechaProgramadaDeVacunacion.toString());
    }
}
