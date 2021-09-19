package Service.implementation;
import Service.Cocinero;

public class CocineroNoVeggie extends Cocinero {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando queso y jamón...");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes: queso y jamón...");
    }
}
