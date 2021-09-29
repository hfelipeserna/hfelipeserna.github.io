package service;
import model.TipoUsuario;

public interface IServicioDeDescarga {
    public void descargarCancion(String cancion, TipoUsuario tipoDeUsuario);
}
