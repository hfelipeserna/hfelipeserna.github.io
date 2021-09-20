package service.Implementation;
import model.Menu;
import model.MenuAdulto;
import service.ProcesoDeMenu;

public class ProcesoDeMenuAdulto extends ProcesoDeMenu {

    @Override
    public void armar(Menu menu) {
        System.out.println("Armando menú " + menu.getDescripcion());
    }

    @Override
    public double calcularPrecioDelMenu(Menu menu) {
        MenuAdulto menuAdulto = (MenuAdulto) menu;
        return menu.getPrecio();
    }
}
