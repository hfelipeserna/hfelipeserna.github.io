package service;
import model.Documento;
import model.TipoDeDocumento;

public abstract class FuncionarioPublico {

    private FuncionarioPublico siguienteFuncionarioPublico;
    private TipoDeDocumento tipoDeAutorizacion;

    public abstract void leerDocumento(Documento documento);

    public FuncionarioPublico getSiguienteFuncionarioPublico() {
        return siguienteFuncionarioPublico;
    }

    public void setSiguienteFuncionarioPublico(FuncionarioPublico siguienteFuncionarioPublico) {
        this.siguienteFuncionarioPublico = siguienteFuncionarioPublico;
    }

    public TipoDeDocumento getTipoDeAutorizacion() {
        return tipoDeAutorizacion;
    }

    public void setTipoDeAutorizacion(TipoDeDocumento tipoDeAutorizacion) {
        this.tipoDeAutorizacion = tipoDeAutorizacion;
    }
}
