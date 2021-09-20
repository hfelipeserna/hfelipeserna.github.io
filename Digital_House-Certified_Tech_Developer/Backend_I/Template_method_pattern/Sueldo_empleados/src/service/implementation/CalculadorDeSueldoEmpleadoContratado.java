package service.implementation;
import model.Empleado;
import model.EmpleadoContratado;
import service.CalculadorDeSueldo;

public class CalculadorDeSueldoEmpleadoContratado extends CalculadorDeSueldo {

    @Override
    protected double calcularSueldo(Empleado empleado) {
        EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
        double sueldo = empleadoContratado.getCantidadHoraTrabajadas() * empleadoContratado.getValorPorHora();
        return sueldo;
    }

    @Override
    protected void imprimirRecibo(Empleado empleado, double sueldoCalculado) {
        TipoImpresion tipo = TipoImpresion.DIGITAL;
        System.out.println("\tEntregando recibo " + tipo);
    }
}
