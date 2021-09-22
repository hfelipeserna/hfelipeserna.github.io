package service.Implementation;
import model.Documento;
import model.TipoDeDocumento;
import service.FuncionarioPublico;

public class Presidente extends FuncionarioPublico {

    public Presidente(TipoDeDocumento tipoDeAutorización) {
        this.setTipoDeAutorizacion(tipoDeAutorización);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if(this.getTipoDeAutorizacion().getNivelDeAcceso() >= documento.getTipo().getNivelDeAcceso()){
            System.out.println("Presidente accediendo al documento: " + documento.toString());
            System.out.println("\tMensaje: " + documento.getContenido());
        }
        if(this.getSiguienteFuncionarioPublico() != null)
            this.getSiguienteFuncionarioPublico().leerDocumento(documento);
    }
}
