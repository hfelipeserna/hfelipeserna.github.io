package service.Implementation;
import model.Menu;
import model.MenuVegetariano;
import service.ProcesoDeMenu;

import javax.swing.*;

public class ProcesoDeMenuVegetariano extends ProcesoDeMenu {

    @Override
    public void armar(Menu menu) {
        System.out.println("Armando menú " + menu.getDescripcion());
        System.out.println("\tEste menú lleva packaging especial y condimentos");
    }

    @Override
    public double calcularPrecioDelMenu(Menu menu) {
        MenuVegetariano menuVegetariano = (MenuVegetariano) menu;
        return menu.getPrecio() + menuVegetariano.getCostoPackaging() + menu.getPrecio()*0.01;
    }
}
