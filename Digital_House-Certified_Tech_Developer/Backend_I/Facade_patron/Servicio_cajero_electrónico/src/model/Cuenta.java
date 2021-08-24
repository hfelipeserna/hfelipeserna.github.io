package model;

public class Cuenta {
    private String dni;
    private Integer saldoActual;

    public Cuenta(String dni, Integer saldoActual) {
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public String getDni() {
        return dni;
    }

    public Integer getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Integer saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Número de cuenta: " + this.hashCode() + ", DNI: " + this.dni + ", saldo: $" + this.saldoActual;
    }
}
