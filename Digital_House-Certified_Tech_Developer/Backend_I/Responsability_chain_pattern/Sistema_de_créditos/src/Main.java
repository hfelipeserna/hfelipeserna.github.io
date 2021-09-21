import service.CadenaDeManejadores;

public class Main {
    public static void main(String[] args) {

        CadenaDeManejadores cadenaDeManejadores = new CadenaDeManejadores();
        cadenaDeManejadores.getManejadorInicial().procesarSolicitud(290000);
        cadenaDeManejadores.getManejadorInicial().procesarSolicitud(90000);
        cadenaDeManejadores.getManejadorInicial().procesarSolicitud(900);
    }
}
