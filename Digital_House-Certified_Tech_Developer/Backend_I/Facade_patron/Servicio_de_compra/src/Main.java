import model.Direccion;
import model.Producto;
import model.Tarjeta;

public class Main {
    public static void main(String[] args) {
        Direccion direccion_1 = new Direccion("Medellín", "Colombia", "410016", "Cr. 14 Sur # 38-20");
        Producto producto_1 = new Producto("M345FGH", "Mouse inhalámbrico", 3, 45000);
        Producto producto_2 = new Producto("T88TYU78", "Teclado", 1, 65000);
        Producto producto_3 = new Producto("P9ZU2", "Pantalla 14 pulgadas", 1, 102000);
        Tarjeta tarjeta_1 = new Tarjeta ("0000645982", "709", "Falabella");
        Tarjeta tarjeta_2 = new Tarjeta ("1020667943", "854", "Bancolombia");

        //Textos por consola
        System.out.println(direccion_1.toString());
        System.out.println(producto_1.toString());
        System.out.println(producto_2.toString());
        System.out.println(producto_3.toString());
        System.out.println(tarjeta_1.toString());
        System.out.println(tarjeta_2.toString());
    }
}
