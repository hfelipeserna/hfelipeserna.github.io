package service.implementation;
import service.IConexionInternet;
import java.util.List;

public class ProxyService implements IConexionInternet {

    private InternetService internetService;
    private List<String> sitiosBloqueados;

    public ProxyService(InternetService internetService, List<String> sitiosBloqueados) {
        this.internetService = internetService;
        this.sitiosBloqueados = sitiosBloqueados;
    }

    @Override
    public void conectarCon(String url) {
        if(!this.sitiosBloqueados.contains(url))
            this.internetService.conectarCon(url);
        else
            System.out.println("ERROR: Acceso denegado. No se puede conectar con " + url);
    }
}
