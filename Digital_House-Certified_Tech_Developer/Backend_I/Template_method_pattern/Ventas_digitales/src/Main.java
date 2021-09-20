import service.Vendedor;
import service.implementation.Afiliado;
import service.implementation.Empleado;
import service.implementation.Pasante;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Felipe", 2);
        Empleado empleado2 = new Empleado("Sergio", 1);
        Empleado empleado3 = new Empleado("Camila", 3);

        Vendedor afiliado1 = new Afiliado("Luisa");
        Vendedor afiliado2 = new Afiliado("Esteban");
        Vendedor afiliado3 = new Afiliado("Ana");

        Pasante pasante1 = new Pasante("Carolina");

        empleado1.conseguirAfiliado(afiliado1);
        empleado1.conseguirAfiliado(afiliado2);
        empleado2.conseguirAfiliado(afiliado3);

        //Ventas
        empleado1.vender();
        empleado1.vender();
        empleado1.vender();
        empleado2.vender();
        empleado3.vender();
        empleado3.vender();
        empleado3.vender();
        empleado3.vender();
        afiliado1.vender();
        afiliado1.vender();
        afiliado2.vender();
        pasante1.vender();

        System.out.println(empleado1.mostrarCategoria());
        System.out.println(empleado2.mostrarCategoria());
        System.out.println(empleado3.mostrarCategoria());
        System.out.println(afiliado1.mostrarCategoria());
        System.out.println(afiliado2.mostrarCategoria());
        System.out.println(afiliado3.mostrarCategoria());
        System.out.println(pasante1.mostrarCategoria());
    }
}
