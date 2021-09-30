package model;
import java.util.ArrayList;
import java.util.List;

public class CatalogoDePeliculas {

    List<Pelicula> catalogo;

    public CatalogoDePeliculas() {
        this.catalogo = (ArrayList<Pelicula>)List.of(
                new Pelicula("The White Tiger","Argentina", "wwww.pelis.com/RTY78Uyd8P"),
                new Pelicula("His Houser", "Brasil", "wwww.pelis.com/y7uu35eO0P"),
                new Pelicula("Over the Moon", "Colombia", "wwww.pelis.com/a56Trg3I90"),
                new Pelicula("Superbad", "Argentina", "wwww.pelis.com/6Yu7Ijn3YT"),
                new Pelicula("The Prom", "Brasil", "wwww.pelis.com/Egv6YuI9o0"),
                new Pelicula("The Babysitter", "Colombia", "wwww.pelis.com/TrR4ehn97gH"),
                new Pelicula("The Artist", "Colombia", "wwww.pelis.com/A56Tgb489j"),
                new Pelicula("Avengers", "Argentina","wwww.pelis.com/5Tvb43Fhud" ),
                new Pelicula("Good Morning Vietnam", "Brasil", "wwww.pelis.com/3eCv76YuWQ")
        );
    }

    public List<Pelicula> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Pelicula> catalogo) {
        this.catalogo = catalogo;
    }
}
