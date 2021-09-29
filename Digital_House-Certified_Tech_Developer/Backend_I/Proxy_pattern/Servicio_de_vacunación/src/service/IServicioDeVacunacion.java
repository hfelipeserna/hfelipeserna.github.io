package service;
import java.time.LocalDate;

public interface IServicioDeVacunacion {

    //La fecha programa de vacunación corresponde a la registrada en el sistema
    void vacunar(String dni, LocalDate fechaProgramadaDeVacunacion);
}
