package service.Implementation;
import model.Documento;
import model.TipoDeDocumento;
import service.FuncionarioPublico;

public class Ministro extends FuncionarioPublico {

    public Ministro(TipoDeDocumento tipoDeAutorizaci√≥n) {
        this.setTipoDeAutorizacion(tipoDeAutorizaci√≥n);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if(this.getTipoDeAutorizacion().getNivelDeAcceso() >= documento.getTipo().getNivelDeAcceso()){
            System.out.println("Ministro accediendo al documento: " + documento.toString());
            System.out.println("\tMensaje: " + documento.getContenido());
        }
        if(this.getSiguienteFuncionarioPublico() != null)
            this.getSiguienteFuncionarioPublico().leerDocumento(documento);
    }
}
