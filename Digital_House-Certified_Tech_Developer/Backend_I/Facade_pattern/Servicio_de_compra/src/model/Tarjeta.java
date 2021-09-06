package model;

public class Tarjeta {
    private String numero;
    private String CVV;
    private String banco;

    public Tarjeta(String numero, String CVV, String banco) {
        this.numero = numero;
        this.CVV = CVV;
        this.banco = banco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Tarjeta: { Número: " + this.numero + ", Banco: " + this.banco + " }";
    }
}
