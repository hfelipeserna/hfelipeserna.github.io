package service.implementation;

import model.Direccion;
import model.Producto;
import model.Tarjeta;
import service.ICompraService;

import java.util.Arrays;

public class CompraService implements ICompraService {
    private AlmacenService almacenService;
    private PagoService pagoService;
    private EnvioService envioService;

    public CompraService(AlmacenService almacenService, PagoService pagoService, EnvioService envioService) {
        this.almacenService = almacenService;
        this.pagoService = pagoService;
        this.envioService = envioService;
    }

    @Override
    public void procesarCompra(String productoID, Integer cantidad, Tarjeta tarjeta, Direccion direccion) {
        Producto producto = almacenService.buscarProducto(productoID, cantidad);
        if(producto != null){
            //Si se tiene el producto, se procesa el pago y se envía el producto
            if(pagoService.procesarPago(tarjeta, producto.getValor()*cantidad))
                envioService.procesarEnvio(Arrays.asList(producto), direccion);
        }
    }
}
