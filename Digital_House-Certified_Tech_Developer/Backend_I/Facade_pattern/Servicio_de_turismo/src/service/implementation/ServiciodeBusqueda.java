package service.implementation;

import service.IServicioDeBusqueda;

public class ServiciodeBusqueda implements IServicioDeBusqueda {

    private HotelesAPI hotelesAPI;
    private VuelosAPI vuelosAPI;

    public ServiciodeBusqueda(){
        this.hotelesAPI = new HotelesAPI();
        this.vuelosAPI = new VuelosAPI();
    }

    public void buscar(String ciudadOrigen, String ciudadDestino, String fechaDesde, String fechaHasta){
        hotelesAPI.buscarHoteles(ciudadDestino, fechaDesde, fechaHasta);
        vuelosAPI.buscarVuelos(ciudadOrigen, ciudadDestino, fechaDesde, fechaHasta);
    }
}
