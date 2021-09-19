package service.implementation;
import model.Producto;
import model.Tarjeta;
import service.ICalculoDescuento;

public class CalculoDescuento implements ICalculoDescuento {
    private APICantidad apiCantidad;
    private APIProducto apiProducto;
    private APITarjeta apiTarjeta;

    public CalculoDescuento() {
        apiCantidad = new APICantidad();
        apiProducto = new APIProducto();
        apiTarjeta = new APITarjeta();
    }

    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad){
        int descuento = 0;
        descuento = descuento + apiCantidad.calcularDescuento(cantidad);
        descuento = descuento + apiProducto.calcularDescuento(producto);
        descuento = descuento + apiTarjeta.calcularDescuento(tarjeta);
        return descuento;
    }
}
