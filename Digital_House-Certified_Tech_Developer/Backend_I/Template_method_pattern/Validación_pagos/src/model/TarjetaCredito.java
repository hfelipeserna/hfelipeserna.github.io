package model;
import java.util.Date;

public class TarjetaCredito extends Tarjeta{

    public Double limite;
    public Double saldoUtilizado;

    public TarjetaCredito(String numerosFrente, String codSeguridad, Date fechaExpiracion, Tipo tipo, Double limite, Double saldoUtilizado) {
        super(numerosFrente, codSeguridad, fechaExpiracion, tipo);
        this.limite = limite;
        this.saldoUtilizado = saldoUtilizado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public void setSaldoUtilizado(Double saldoUtilizado) {
        this.saldoUtilizado = saldoUtilizado;
    }
}
