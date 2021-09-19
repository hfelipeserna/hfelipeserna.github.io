import model.Tarjeta;
import model.TarjetaCredito;
import model.TarjetaDebito;
import model.Tipo;
import service.PagoService;
import service.implementation.ProcesadorCredito;
import service.implementation.ProcesadorDebito;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws ParseException {
        Map<String, PagoService> procesadoresDePago = Map.of("Crédito", new ProcesadorCredito(), "Débito", new ProcesadorDebito());

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date fechaExpiracionTarjetaCredito = sdf.parse("2022-06-29");
        Tarjeta tarjetaCredito = new TarjetaCredito("6712228902652887", "203", fechaExpiracionTarjetaCredito, Tipo.CREDITO, 3000000.0, 600000.0);
        Date fechaExpiracionTarjetaDebito = sdf.parse("2022-09-27");
        Tarjeta tarjetaDebito = new TarjetaDebito("15582455902652341", "901", fechaExpiracionTarjetaCredito, Tipo.DEBITO, 2500000.0);

        PagoService ppcredito = procesadoresDePago.get("Crédito");
        System.out.println("\tPago realizado: " + ppcredito.procesarPago(tarjetaCredito, 450000.0));

        PagoService ppdebito = procesadoresDePago.get("Débito");
        System.out.println("\tPago realizado: " + ppdebito.procesarPago(tarjetaDebito, 350000.0));
    }
}
