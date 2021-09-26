package model;
import java.util.List;

public class Documento {

    private String id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;

    public Documento(String id, String url, List<String> usuariosAutorizados){
        this.id = id;
        this.url = url;
        this.usuariosAutorizados = usuariosAutorizados;
        this.contenido = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<String> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }
}
