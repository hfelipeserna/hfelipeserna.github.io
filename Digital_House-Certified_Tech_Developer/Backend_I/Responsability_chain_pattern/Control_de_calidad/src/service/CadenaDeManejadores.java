package service;
import service.implementation.ManejadorDeCalidadPorEnvasado;
import service.implementation.ManejadorDeCalidadPorLote;
import service.implementation.ManejadorDeCalidadPorPeso;

import java.util.Map;

public class CadenaDeManejadores {

    private ManejadorDeCalidad manejadorBase;

    public CadenaDeManejadores() {
        // Se crea map con las instancias de cada uno de los manejadores
        Map<String, ManejadorDeCalidad> manejadores = Map.of(
                "Lote", new ManejadorDeCalidadPorLote("CALIDAD_LOTE"),
                "Peso", new ManejadorDeCalidadPorPeso("CALIDAD_PESO"),
                "Envasado", new ManejadorDeCalidadPorEnvasado("CALIDAD_ENVASADO"));

        setManejadorBase(manejadores.get("Lote"));
        // Se arma la cadena de responsabilidad
        manejadores.get("Lote").setManejadorCalidadSiguiente(manejadores.get("Peso"));
        manejadores.get("Peso").setManejadorCalidadSiguiente(manejadores.get("Envasado"));
    }

    public ManejadorDeCalidad getManejadorBase() {
        return manejadorBase;
    }

    public void setManejadorBase(ManejadorDeCalidad manejadorBase) {
        this.manejadorBase = manejadorBase;
    }
}
