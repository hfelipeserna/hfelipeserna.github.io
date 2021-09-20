package service.implementation;
import model.Empleado;
import model.EmpleadoEfectivo;
import service.CalculadorDeSueldo;

public class CalculadorDeSueldoEmpleadoEfectivo extends CalculadorDeSueldo {

    @Override
    protected double calcularSueldo(Empleado empleado) {
        EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
        double sueldo = empleadoEfectivo.getSueldoBasico() - empleadoEfectivo.getDescuentos() + empleadoEfectivo.getPremios();
        return sueldo;
    }

    @Override
    protected void imprimirRecibo(Empleado empleado, double sueldoCalculado) {
        TipoImpresion tipo = TipoImpresion.IMPRESO;
        System.out.println("\tEntregando recibo " + tipo);
    }
}
