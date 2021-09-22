package service;
import model.TipoDeDocumento;
import service.Implementation.Diputado;
import service.Implementation.Ministro;
import service.Implementation.Presidente;

import java.util.Map;

public class CadenaDeManejadores {

    private FuncionarioPublico manejadorInicial;

    public CadenaDeManejadores() {
        // Se crea map con las instancias de cada uno de los manejadores
        Map<String, FuncionarioPublico> funcionarios = Map.of(
                "Diputado", new Diputado(TipoDeDocumento.RESERVADO),
                "Ministro", new Ministro(TipoDeDocumento.SECRETO),
                "Presidente", new Presidente(TipoDeDocumento.MUY_SECRETO));
    }
}
