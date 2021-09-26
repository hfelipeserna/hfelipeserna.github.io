package service;
import model.Documento;

public interface IDocumentoService {

    public Documento buscarDocumento(String url, String email);
}
