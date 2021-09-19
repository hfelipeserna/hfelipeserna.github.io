package service.implementation;
import model.Tarjeta;
import model.TarjetaDebito;
import service.PagoService;

public class ProcesadorDebito extends PagoService {

    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaDebito tarjetaDebito = ((TarjetaDebito) tarjeta);
        return (tarjetaDebito.getSaldoDisponible() >= monto);
    }
}
