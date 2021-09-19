import Service.Cocinero;
import Service.implementation.CocineroNoVeggie;
import Service.implementation.CocineroVeggie;

public class Main {
    public static void main(String[] args) {
        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();
    }
}
