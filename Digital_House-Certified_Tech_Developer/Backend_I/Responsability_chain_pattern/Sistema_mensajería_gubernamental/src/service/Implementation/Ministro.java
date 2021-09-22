package service.Implementation;
import model.Documento;
import model.TipoDeDocumento;
import service.FuncionarioPublico;

public class Ministro extends FuncionarioPublico {

    public Ministro(TipoDeDocumento tipoDeAutorización) {
        this.setTipoDeAutorizacion(tipoDeAutorización);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if(this.getTipoDeAutorizacion().getNivelDeAcceso() >=documento.getTipo()){
            System.out.println("Ministro accediendo al documento: " + documento.toString());
            System.out.println("\tMensaje: " + documento.getContenido());
        }else if(this.getSiguienteFuncionarioPublico() != null)
            this.getSiguienteFuncionarioPublico().leerDocumento(documento);
    }
}
