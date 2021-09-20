import model.MenuAdulto;
import model.MenuInfantil;
import model.MenuVegetariano;
import model.TipoDeMenu;
import service.Implementation.ProcesoDeMenuAdulto;
import service.Implementation.ProcesoDeMenuInfantil;
import service.Implementation.ProcesoDeMenuVegetariano;
import service.ProcesoDeMenu;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, ProcesoDeMenu> procesadorDeMenu = Map.of("Adulto", new ProcesoDeMenuAdulto(), "Infantil", new ProcesoDeMenuInfantil(), "Vegetariano", new ProcesoDeMenuVegetariano());

        MenuAdulto menuAdulto = new MenuAdulto(13000, TipoDeMenu.ADULTO);
        MenuInfantil menuInfantil = new MenuInfantil(11000, TipoDeMenu.INFANTIL, "Muñeco Star Wars", 1500);
        MenuVegetariano menuVegetariano = new MenuVegetariano(12000, TipoDeMenu.VEGETARIANO, 1300);

        ProcesoDeMenu procesoMenuAdulto = procesadorDeMenu.get("Adulto");
        System.out.println("\tTotal a pagar: $" + procesoMenuAdulto.preparar(menuAdulto));

        ProcesoDeMenu procesoMenuInfantil = procesadorDeMenu.get("Infantil");
        System.out.println("\tTotal a pagar: $" + procesoMenuInfantil.preparar(menuInfantil));

        ProcesoDeMenu procesoMenuVegetariano = procesadorDeMenu.get("Vegetariano");
        System.out.println("\tTotal a pagar: $" + procesoMenuVegetariano.preparar(menuVegetariano));
    }
}
