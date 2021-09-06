package service.implementation;

import model.Direccion;
import model.Producto;

import java.util.List;

public class EnvioService {

    public void procesarEnvio(List<Producto> productos, Direccion direccion){
        System.out.println("Enviando productos a " + direccion.getDireccion() + " Ciudad: " + direccion.getCiudad() + " País: " + direccion.getPais());

    }
}
