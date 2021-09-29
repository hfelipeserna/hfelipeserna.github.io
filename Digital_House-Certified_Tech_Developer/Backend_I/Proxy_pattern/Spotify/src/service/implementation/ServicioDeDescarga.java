package service.implementation;
import model.TipoUsuario;
import service.IServicioDeDescarga;

public class ServicioDeDescarga implements IServicioDeDescarga {

    @Override
    public void descargarCancion(String cancion, TipoUsuario tipoDeUsuario) {
        System.out.println("La canción " + cancion + " se ha descargado.");
    }
}
