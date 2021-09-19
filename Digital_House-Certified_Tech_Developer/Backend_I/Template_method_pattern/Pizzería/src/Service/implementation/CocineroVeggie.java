package Service.implementation;
import Service.Cocinero;

public class CocineroVeggie extends Cocinero {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate, hierbas y quesos");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando ingredientes: tomate, hierbas y quesos");
    }
}
