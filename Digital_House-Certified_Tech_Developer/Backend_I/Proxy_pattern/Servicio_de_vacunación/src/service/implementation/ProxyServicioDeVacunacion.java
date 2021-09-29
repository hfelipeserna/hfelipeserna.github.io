package service.implementation;
import service.IServicioDeVacunacion;

import java.time.LocalDate;

public class ProxyServicioDeVacunacion implements IServicioDeVacunacion {

    @Override
    public void vacunar(String dni, LocalDate fechaProgramadaDeVacunacion) {
        boolean fechaValida = validarFecha(fechaProgramadaDeVacunacion);
        if(fechaValida){
            ServicioDeVacunacion servicioDeVacunacion = new ServicioDeVacunacion();
            servicioDeVacunacion.vacunar(dni, LocalDate.now());
        } else
            System.out.println("Aún no corresponde fecha de vacunación");
    }

    private boolean validarFecha(LocalDate fechaProgramada){
        LocalDate fechaDeHoy = LocalDate.now();
        return fechaProgramada.isBefore(fechaDeHoy) || fechaProgramada.isEqual(fechaDeHoy);
    }
}
