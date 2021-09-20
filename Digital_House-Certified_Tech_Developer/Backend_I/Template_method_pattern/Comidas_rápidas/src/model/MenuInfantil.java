package model;

public class MenuInfantil extends Menu{

    private String juguete;
    private double costoJuguete;

    public MenuInfantil(double precio, TipoDeMenu descripcion, String juguete, double costoJuguete) {
        super(precio, descripcion);
        this.juguete = juguete;
        this.costoJuguete = costoJuguete;
    }

    public String getJuguete() {
        return juguete;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }

    public double getCostoJuguete() {
        return costoJuguete;
    }

    public void setCostoJuguete(double costoJuguete) {
        this.costoJuguete = costoJuguete;
    }
}
