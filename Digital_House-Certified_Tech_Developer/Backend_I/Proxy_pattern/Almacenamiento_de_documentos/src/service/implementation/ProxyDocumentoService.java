package service.implementation;
import model.Documento;
import service.IDocumentoService;
import java.util.*;

public class ProxyDocumentoService implements IDocumentoService{

    private IDocumentoService documentoService;
    private List<Map<String, String>> registroDeUsuarios;

    public ProxyDocumentoService(IDocumentoService documentoService) {
        this.documentoService = documentoService;
        this.registroDeUsuarios = new ArrayList<>();
    }

    @Override
    public Documento buscarDocumento(String url, String email) {
        Documento documento = documentoService.buscarDocumento(url, email);
        if(documento != null){
            System.out.println("Usuario: " + email + " accediendo al documento con url " + url);
            registroDeUsuarios.add(createSingletonMap(url, email));
        } else {
            System.out.println("El doumento no existe o no tiene acceso.");
        }
        return documento;
    }

    private Map<String, String> createSingletonMap(String key, String value){
        return Collections.singletonMap(key, value);
    }
}
