package service.implementation;
import model.Cuenta;
import java.util.List;

public class CuentaService {
    private List<Cuenta> cuentas;

    public CuentaService(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta getCuenta(String dni){
        Cuenta cuenta = null;
        for (Cuenta c:this.cuentas){
            if(c.getDni().equals(dni))
                cuenta = c;
        }
        return cuenta;
    }
}
