import model.EmpleadoContratado;
import model.EmpleadoEfectivo;
import service.CalculadorDeSueldo;
import service.implementation.CalculadorDeSueldoEmpleadoContratado;
import service.implementation.CalculadorDeSueldoEmpleadoEfectivo;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, CalculadorDeSueldo> calculadorDeSueldoMap = Map.of("Empleado Contratado", new CalculadorDeSueldoEmpleadoContratado(), "Empleado Efectivo", new CalculadorDeSueldoEmpleadoEfectivo());

        EmpleadoContratado empleadoContratado = new EmpleadoContratado("Henry", "Gómez", "3900271892", 10,20);
        EmpleadoEfectivo empleadoEfectivo = new EmpleadoEfectivo("Micaela", "Casagrande", "4922019283", 1000, 300, 50);

        CalculadorDeSueldo calculoEmpleadoContratado = calculadorDeSueldoMap.get("Empleado Contratado");
        System.out.println("Calculando sueldo de " + empleadoContratado.toString());
        calculoEmpleadoContratado.liquidarSueldo(empleadoContratado);

        CalculadorDeSueldo calculoEmpleadoEfectivo = calculadorDeSueldoMap.get("Empleado Efectivo");
        System.out.println("Calculando sueldo de " + empleadoEfectivo.toString());
        calculoEmpleadoEfectivo.liquidarSueldo(empleadoEfectivo);
    }
}
