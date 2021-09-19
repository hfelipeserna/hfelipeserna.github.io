package service.implementation;

public class APICantidad {
    public int calcularDescuento(int cantidad){
        int descuento = 0;
        if(cantidad > 12)
            descuento = 15;
        return descuento;
    }
}
