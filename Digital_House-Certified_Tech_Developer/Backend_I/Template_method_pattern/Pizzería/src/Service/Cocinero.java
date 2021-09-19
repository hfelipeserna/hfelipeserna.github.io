package Service;

public abstract class Cocinero {

    public void hacerPizza(){
        prepararMasa();
        preCocinarMasa();
        prepararIngredientes();
        agregarIngredientes();
        cocinarPizza();
        empaquetarPizza();
    }

    private void prepararMasa(){
        System.out.println("\nPreparando masa...");
    };

    private void preCocinarMasa(){
        System.out.println("Pre-cocinando masa...");
    }

    protected abstract void prepararIngredientes();

    protected abstract void agregarIngredientes();

    private void cocinarPizza(){
        System.out.println("Metiendo la pizza al horno...");
    }

    private void empaquetarPizza(){
        System.out.println("Empaquetando pizza...");
    }
}
