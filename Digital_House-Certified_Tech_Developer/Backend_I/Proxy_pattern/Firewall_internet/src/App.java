import service.IConexionInternet;
import service.implementation.InternetService;
import service.implementation.ProxyService;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> sitiosBloqueados = Arrays.asList("www.instagram.com", "www.xvideos.com", "www.facebook.com");
        InternetService internetService = new InternetService();
        IConexionInternet proxy = new ProxyService(internetService, sitiosBloqueados);

        proxy.conectarCon("www.google.com");
        proxy.conectarCon("www.facebook.com");
    }
}
