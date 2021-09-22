import model.Documento;
import model.TipoDeDocumento;
import service.CadenaDeManejadores;

public class Main {
    public static void main(String[] args) {
        // Se crean los documentos
        Documento documento1 = new Documento("Movilizar tropas para operativo militar", TipoDeDocumento.MUY_SECRETO);
        Documento documento2 = new Documento("Gestionar logistica para vacunación departamental", TipoDeDocumento.RESERVADO);
        Documento documento3 = new Documento("Autorizar compra de vacunas", TipoDeDocumento.SECRETO);

        // Se dispara la cadena
        CadenaDeManejadores cadenaDeManejadores = new CadenaDeManejadores();
        cadenaDeManejadores.getManejadorInicial().leerDocumento(documento1);
        cadenaDeManejadores.getManejadorInicial().leerDocumento(documento2);
        cadenaDeManejadores.getManejadorInicial().leerDocumento(documento3);
    }
}
