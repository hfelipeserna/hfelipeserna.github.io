package service.implementation;
import model.Tarjeta;

public class APITarjeta {
    public int calcularDescuento(Tarjeta tarjeta){
        int descuento = 0;
        if(tarjeta.getBanco().compareTo("Star Bank") == 0)
            descuento = 20;
        return descuento;
    }
}
