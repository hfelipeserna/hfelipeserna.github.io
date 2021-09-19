package service.implementation;
import model.Tarjeta;
import model.TarjetaCredito;
import service.PagoService;

public class ProcesadorCredito extends PagoService {

    @Override
    protected Boolean autorizarPago(Tarjeta tarjeta, Double monto) {
        TarjetaCredito tarjetaCredito = ((TarjetaCredito) tarjeta);
        Double saldoDisponible = tarjetaCredito.getLimite() - tarjetaCredito.getSaldoUtilizado();
        return (saldoDisponible >= monto);
    }
}
