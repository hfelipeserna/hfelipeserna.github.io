package service;
import model.Empleado;
import service.implementation.TipoImpresion;

public abstract class CalculadorDeSueldo {

    public void liquidarSueldo(Empleado empleado){
        // Calcular sueldo
        double sueldoCalculado = calcularSueldo(empleado);
        // Imprimir recibo
        imprimirRecibo(empleado, sueldoCalculado);
        // Depositar dinero en cuenta bancaria
        depositar(empleado.getCuentaBancaria(), sueldoCalculado);
    }

    protected abstract double calcularSueldo(Empleado empleado);

    protected abstract void imprimirRecibo(Empleado empleado, double sueldoCalculado);

    public void depositar(String cuentaBancaria, double sueldoCalculado){
        System.out.println("\tDepositando $" + sueldoCalculado + " en la cuenta N° " + cuentaBancaria);
    }
}
