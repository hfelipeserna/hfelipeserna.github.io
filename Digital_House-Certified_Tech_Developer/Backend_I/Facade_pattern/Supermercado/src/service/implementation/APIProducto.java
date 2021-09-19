package service.implementation;
import model.Producto;

public class APIProducto {
    public int calcularDescuento (Producto producto){
        int descuento = 0;
        if(producto.getTipo().compareTo("Lata") == 0)
            descuento = 10;
        return descuento;
    }
}
