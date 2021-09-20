package service;
import model.Menu;

public abstract class ProcesoDeMenu {

    public double preparar(Menu menu){
        armar(menu);
        return calcularPrecioDelMenu(menu);
    }

    public abstract void armar(Menu menu);
    public abstract double calcularPrecioDelMenu(Menu menu);
}
