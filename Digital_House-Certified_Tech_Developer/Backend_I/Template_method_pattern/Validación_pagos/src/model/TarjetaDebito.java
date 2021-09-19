package model;
import java.util.Date;

public class TarjetaDebito extends Tarjeta{

    private Double saldoDisponible;

    public TarjetaDebito(String numerosFrente, String codSeguridad, Date fechaExpiracion, Tipo tipo, Double saldoDisponible) {
        super(numerosFrente, codSeguridad, fechaExpiracion, tipo);
        this.saldoDisponible = saldoDisponible;
    }

    public Double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(Double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }
}
