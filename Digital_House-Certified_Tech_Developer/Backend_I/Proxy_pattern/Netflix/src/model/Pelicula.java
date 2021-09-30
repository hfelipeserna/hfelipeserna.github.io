package model;

public class Pelicula {

    private String nombre;
    private String pais;
    private String url;

    public Pelicula(String nombre, String pais, String url) {
        this.nombre = nombre;
        this.pais = pais;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
