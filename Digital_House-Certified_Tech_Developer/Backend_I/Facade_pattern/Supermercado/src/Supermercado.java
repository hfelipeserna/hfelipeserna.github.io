import model.Producto;
import model.Tarjeta;
import service.implementation.CalculoDescuento;

public class Supermercado {
    public static void main(String[] args) {
        CalculoDescuento facadeDescuento = new CalculoDescuento();
        Tarjeta tarjeta1 = new Tarjeta("1266789023", "Star Bank");
        Producto producto1 = new Producto("Frijoles", "Lata");
        Tarjeta tarjeta2 = new Tarjeta("2800349023", "Fallabela");
        Producto producto2 = new Producto("Pastas", "Paquete");

        System.out.println("Descuento 1: " + facadeDescuento.calcularDescuento(tarjeta1, producto1, 2));
        System.out.println("Descuento 2: " + facadeDescuento.calcularDescuento(tarjeta1, producto2, 15));
        System.out.println("Descuento 3: " + facadeDescuento.calcularDescuento(tarjeta2, producto1, 6));
        System.out.println("Descuento 3: " + facadeDescuento.calcularDescuento(tarjeta1, producto1, 16));
    }
}
