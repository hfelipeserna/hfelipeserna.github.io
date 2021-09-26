package service.implementation;
import model.Documento;
import service.IDocumentoService;
import java.util.List;

public class DocumentoService implements IDocumentoService {

    private List<Documento> documentos;

    public DocumentoService(List<Documento> documentos) {
        this.documentos = documentos;
    }

    /* Buscamos un documento que tenga la misma url, y que el email esté dentro de los autorizados. En caso de no encontrarlo,
       se indica con un null que no existe nungún documento que cumpla lo anterior.*/
    @Override
    public Documento buscarDocumento(String url, String email) {
        return this.documentos.stream().filter(doc -> doc.getUrl().equals(url) && doc.getUsuariosAutorizados().contains(email)).findFirst().orElse(null);
    }
}
