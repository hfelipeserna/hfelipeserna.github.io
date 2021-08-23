package service.implementation;

import model.Tarjeta;

public class PagoService {

    public Boolean procesarPago(Tarjeta tarjeta, Integer montoACobrar){
        Boolean pagoRealizado = Boolean.FALSE;
        if(tarjeta != null && tarjeta.getNumero() != null & tarjeta.getCVV() != null){
            System.out.println("Procesando el pago por $" + String.valueOf(montoACobrar));
        }
        return pagoRealizado;
    }
}
