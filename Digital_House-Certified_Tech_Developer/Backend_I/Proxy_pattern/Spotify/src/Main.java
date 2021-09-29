import model.TipoUsuario;
import model.Usuario;
import service.IServicioDeDescarga;
import service.implementation.ProxyServicioDeDescarga;

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("musica@gmail.com", TipoUsuario.PREMIUM);
        Usuario usuario2 = new Usuario("musica@gmail.com", TipoUsuario.FREE);

        IServicioDeDescarga descarga = new ProxyServicioDeDescarga();

        descarga.descargarCancion("Mi cancion", usuario1.getTipoDeUsuario());
        descarga.descargarCancion("Mi cancion", usuario2.getTipoDeUsuario());
    }
}
