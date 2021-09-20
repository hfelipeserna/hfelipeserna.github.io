package service.Implementation;
import model.Menu;
import model.MenuInfantil;
import service.ProcesoDeMenu;

public class ProcesoDeMenuInfantil extends ProcesoDeMenu {

    @Override
    public void armar(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        System.out.println("Armando menú " + menu.getDescripcion());
        System.out.println("\tEste menú lleva juguete: " +menuInfantil.getJuguete());
    }

    @Override
    public double calcularPrecioDelMenu(Menu menu) {
        MenuInfantil menuInfantil = (MenuInfantil) menu;
        return menu.getPrecio() + menuInfantil.getCostoJuguete();
    }
}
