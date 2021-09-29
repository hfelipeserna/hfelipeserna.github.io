package service.implementation;
import model.TipoUsuario;
import service.IServicioDeDescarga;

public class ProxyServicioDeDescarga implements IServicioDeDescarga {

    @Override
    public void descargarCancion(String cancion, TipoUsuario tipoDeUsuario) {
        if(validarUsuario(tipoDeUsuario)){
            IServicioDeDescarga servicioDeDescarga = new ServicioDeDescarga();
            servicioDeDescarga.descargarCancion(cancion, tipoDeUsuario);
        } else
            System.out.println("No puede descargar la canción.");
    }

    private boolean validarUsuario(TipoUsuario tipoDeUsuario){
        return tipoDeUsuario.equals(TipoUsuario.PREMIUM);
    }
}
