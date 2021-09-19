package service;
import model.Tarjeta;
import java.util.Date;

public abstract class PagoService {

    public Boolean procesarPago(Tarjeta tarjeta, Double monto){
        Boolean pagoRealizado = Boolean.FALSE;
        System.out.println("Por favor espere...");
        if(tarjeta.getFechaExpiracion().after(new Date())){
            Boolean pagoAutorizado = autorizarPago(tarjeta, monto);
            if(pagoAutorizado){
                System.out.println("\tRealizando el pago...");
                pagoRealizado = Boolean.TRUE;
            }
        }
        return pagoRealizado;
    }

    protected abstract Boolean autorizarPago(Tarjeta tarjeta, Double monto);
}
