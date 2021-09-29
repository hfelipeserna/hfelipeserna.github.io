package model;

public class Usuario {

    private String id;
    private TipoUsuario tipoDeUsuario;

    public Usuario(String id, TipoUsuario tipoDeUsuario) {
        this.id = id;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public TipoUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }
}
