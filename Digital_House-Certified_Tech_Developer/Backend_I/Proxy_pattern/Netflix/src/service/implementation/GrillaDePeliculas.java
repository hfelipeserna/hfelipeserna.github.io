package service.implementation;
import exceptions.PeliculaNoHabilitadaException;
import model.CatalogoDePeliculas;
import model.Pelicula;
import service.IGrillaDePeliculas;

public class GrillaDePeliculas implements IGrillaDePeliculas {

    private CatalogoDePeliculas catalogo = new CatalogoDePeliculas();

    @Override
    public Pelicula getPelicula(String nombre) throws PeliculaNoHabilitadaException {
        Pelicula pelicula = null;

        for (Pelicula p: catalogo.getCatalogo()) {
            if(p.getNombre().equals(nombre)) {
                pelicula = p;
                break;
            }
        }

        return pelicula;
    }
}
