package service;
import model.Producto;
import model.Tarjeta;

public interface ICalculoDescuento {
    int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad);
}
