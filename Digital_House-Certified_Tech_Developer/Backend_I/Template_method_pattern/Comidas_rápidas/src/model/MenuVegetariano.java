package model;

public class MenuVegetariano extends Menu{

    private double costoPackaging;

    public MenuVegetariano(double precio, TipoDeMenu descripcion, double costoPackaging) {
        super(precio, descripcion);
        this.costoPackaging = costoPackaging;
    }

    public double getCostoPackaging() {
        return costoPackaging;
    }

    public void setCostoPackaging(double costoPackaging) {
        this.costoPackaging = costoPackaging;
    }
}
