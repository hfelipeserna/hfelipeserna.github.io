package model;

public class Documento {

    private String contenido;
    private int tipo;

    public Documento(String contenido, int tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento: " + super.toString().hashCode() + " con tipo: " + this.tipo ;
    }
}
