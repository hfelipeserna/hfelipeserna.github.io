package model;

public class Direccion {
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String direccion;

    public Direccion(String ciudad, String pais, String codigoPostal, String direccion) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Dirección: " + this.direccion + "  cod. postal: " + this.codigoPostal + " " + this.ciudad + " - " + this.pais;
    }
}
