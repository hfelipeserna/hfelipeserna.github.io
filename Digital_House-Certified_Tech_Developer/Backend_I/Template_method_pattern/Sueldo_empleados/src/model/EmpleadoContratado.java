package model;

public class EmpleadoContratado extends Empleado{

    private int cantidadHoraTrabajadas;
    private double valorPorHora;

    public EmpleadoContratado(String nombre, String apellido, String cuentaBancaria, int cantidadHoraTrabajadas, double valorPorHora) {
        super(nombre, apellido, cuentaBancaria);
        this.cantidadHoraTrabajadas = cantidadHoraTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int getCantidadHoraTrabajadas() {
        return cantidadHoraTrabajadas;
    }

    public void setCantidadHoraTrabajadas(int cantidadHoraTrabajadas) {
        this.cantidadHoraTrabajadas = cantidadHoraTrabajadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
