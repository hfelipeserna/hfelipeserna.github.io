import model.Direccion;
import model.Producto;
import model.Tarjeta;
import service.ICompraService;
import service.implementation.AlmacenService;
import service.implementation.CompraService;
import service.implementation.EnvioService;
import service.implementation.PagoService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Direccion direccion_1 = new Direccion("Medellín", "Colombia", "410016", "Cr. 14 Sur # 38-20");
        Producto producto_1 = new Producto("M345FGH", "Mouse inhalámbrico", 3, 45000);
        Producto producto_2 = new Producto("T88TYU78", "Teclado", 4, 65000);
        Producto producto_3 = new Producto("P9ZU2", "Pantalla 14 pulgadas", 5, 102000);
        Tarjeta tarjeta_1 = new Tarjeta ("0000645982", "709", "Falabella");
        Tarjeta tarjeta_2 = new Tarjeta ("1020667943", "854", "Bancolombia");

        AlmacenService almacenService = new AlmacenService(Arrays.asList(producto_1, producto_2, producto_3));
        PagoService pagoService = new PagoService();
        EnvioService envioService = new EnvioService();
        ICompraService compraService = new CompraService(almacenService, pagoService, envioService);

        //Textos por consola
        System.out.println(direccion_1.toString());
        System.out.println(producto_1.toString());
        System.out.println(producto_2.toString());
        System.out.println(producto_3.toString());
        System.out.println(tarjeta_1.toString());
        System.out.println(tarjeta_2.toString());
        compraService.procesarCompra("M345FGH", 2, tarjeta_1, direccion_1);
        compraService.procesarCompra("P9ZU2", 3, tarjeta_2, direccion_1);
    }
}
