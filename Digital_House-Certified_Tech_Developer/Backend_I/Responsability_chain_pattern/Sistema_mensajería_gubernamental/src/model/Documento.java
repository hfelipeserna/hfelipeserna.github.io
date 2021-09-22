package model;

public class Documento {

    private String contenido;
    private TipoDeDocumento tipo;

    public Documento(String contenido, TipoDeDocumento tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public TipoDeDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeDocumento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Documento: " + super.toString().hashCode() + " con tipo: " + this.tipo ;
    }
}
