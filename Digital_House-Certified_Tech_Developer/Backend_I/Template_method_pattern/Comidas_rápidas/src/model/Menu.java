package model;

public abstract class Menu {

    private double precio;
    private TipoDeMenu descripcion;

    public Menu(double precio, TipoDeMenu descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoDeMenu getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(TipoDeMenu descripcion) {
        this.descripcion = descripcion;
    }
}
