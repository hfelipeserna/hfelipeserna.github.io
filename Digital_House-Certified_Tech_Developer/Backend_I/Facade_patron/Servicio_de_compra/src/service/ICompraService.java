package service;

import model.Direccion;
import model.Tarjeta;

public interface ICompraService {

    public void procesarCompra(String productoID, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}
