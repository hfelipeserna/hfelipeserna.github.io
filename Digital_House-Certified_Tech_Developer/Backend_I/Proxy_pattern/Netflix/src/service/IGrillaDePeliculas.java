package service;
import exceptions.PeliculaNoHabilitadaException;
import model.Pelicula;

public interface IGrillaDePeliculas {

    public Pelicula getPelicula(String nombre) throws PeliculaNoHabilitadaException;
}
