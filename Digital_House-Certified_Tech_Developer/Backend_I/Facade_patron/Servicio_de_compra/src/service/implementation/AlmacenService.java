package service.implementation;

import model.Producto;

import java.util.List;

public class AlmacenService {
    private List<Producto> productos;

    public AlmacenService(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto buscarProducto(String productoID, Integer cantidad){
        Producto producto = null;
        for (Producto p: this.productos) {
            if(p.getProductoID().equals(productoID) && p.getCantidad() >= cantidad) {
                producto = p;
                p.setCantidad(p.getCantidad() - cantidad); //Se actualiza las existencias del producto
                producto.setCantidad(cantidad);
            }
        }
        return producto;
    }
}
