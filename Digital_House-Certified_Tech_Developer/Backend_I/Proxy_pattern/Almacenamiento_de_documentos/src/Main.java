import model.Documento;
import service.IDocumentoService;
import service.implementation.DocumentoService;
import service.implementation.ProxyDocumentoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Documento> documentosGuardados = new ArrayList<>();
        Documento documento1 = new Documento("1","www.docs.com/1", Arrays.asList("usuario1@gmail.com", "usuario2@gmail.com"));
        Documento documento2 = new Documento("2","www.docs.com/2", Arrays.asList("usuario2@gmail.com", "usuario3@gmail.com"));
        Documento documento3 = new Documento("3","www.docs.com/3", Arrays.asList("usuario1@gmail.com", "usuario3@gmail.com"));
        documento1.setContenido("Este es el contenido del documento 1");
        documento2.setContenido("Este es el contenido del documento 2");
        documento3.setContenido("Este es el contenido del documento 3");

        documentosGuardados.add(documento1);
        documentosGuardados.add(documento2);
        documentosGuardados.add(documento3);

        IDocumentoService documentoService = new ProxyDocumentoService(new DocumentoService(documentosGuardados));
        documentoService.buscarDocumento("www.docs.com/1","usuario1@gmail.com");
        documentoService.buscarDocumento("www.docs.com/2","usuario1@gmail.com");
        documentoService.buscarDocumento("www.docs.com/3","usuario3@gmail.com");
        documentoService.buscarDocumento("www.docs.com/4","usuario3@gmail.com");
    }
}
