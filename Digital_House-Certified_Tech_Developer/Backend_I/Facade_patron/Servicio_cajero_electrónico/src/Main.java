import model.AuthenticationDatabase;
import model.DineroATM;
import model.Cuenta;
import service.implementation.AuthenticationService;
import service.implementation.CajaService;
import service.implementation.CuentaService;
import service.implementation.ServiceATM;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DineroATM atm1 = new DineroATM();
        atm1.recargarDineroATM(20000000);
        Cuenta c1 = new Cuenta("1128267634", 3000000);
        Cuenta c2 = new Cuenta("21961206", 2500000);
        Cuenta c3 = new Cuenta("8246272", 5500000);
        AuthenticationDatabase aDB1 = new AuthenticationDatabase(c1.getDni(), "We45$%#hj2");
        AuthenticationDatabase aDB2 = new AuthenticationDatabase(c2.getDni(), "a56&#po9$");
        AuthenticationDatabase aDB3 = new AuthenticationDatabase(c3.getDni(), "byt6#$jQ&");

        AuthenticationService autenticationService = new AuthenticationService(Arrays.asList(aDB1, aDB2, aDB3));
        CuentaService cuentaService = new CuentaService(Arrays.asList(c1, c2, c3));
        CajaService cajaService = new CajaService(atm1);

        ServiceATM sATM = new ServiceATM(autenticationService, cajaService, cuentaService);
        sATM.procesarRetiro("1128267634", "We45$%#hj2", 50000);
        sATM.procesarRetiro("1128267634", "We45$%#hj2", 34000);
        sATM.procesarRetiro("8246272", "byt6#$jQ&", 8000000);
        sATM.procesarRetiro("21961206", "a56&#po9$", 60000);
        sATM.procesarRetiro("21961206", "a56&#jo9$", 60000);
    }
}
