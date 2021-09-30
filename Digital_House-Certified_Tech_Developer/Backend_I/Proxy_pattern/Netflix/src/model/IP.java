package model;

public class IP {

    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        String pais = "";
        String stringPrimerOcteto = getDireccion().substring(0,3);
        Integer integerPrimerOcteto = Integer.parseInt(stringPrimerOcteto);

        if(integerPrimerOcteto>=0 && integerPrimerOcteto<=49)
            pais = "Argentina";
        else if(integerPrimerOcteto>=50 && integerPrimerOcteto<=99)
            pais = "Brasil";
        else if(integerPrimerOcteto>=100 && integerPrimerOcteto<=149)
            pais = "Colombia";
        else
            pais = "Desconocido";

        return pais;
    }
}
