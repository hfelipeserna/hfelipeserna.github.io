package model;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String cuentaBancaria;

    public Empleado(String nombre, String apellido, String cuentaBancaria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public String toString() {
        return "Empleado " + this.nombre + " " + this.apellido + " - Cuenta bancaria: " + this.cuentaBancaria;
    }
}
