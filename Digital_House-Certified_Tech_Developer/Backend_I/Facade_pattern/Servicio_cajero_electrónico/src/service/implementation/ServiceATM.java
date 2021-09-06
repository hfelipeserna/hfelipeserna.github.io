package service.implementation;
import service.IServiceATM;
import model.Cuenta;

public class ServiceATM implements IServiceATM {
    private AuthenticationService autenticationService;
    private CajaService cajaService;
    private CuentaService cuentaService;

    public ServiceATM(AuthenticationService autenticationService, CajaService cajaService, CuentaService cuentaService) {
        this.autenticationService = autenticationService;
        this.cajaService = cajaService;
        this.cuentaService = cuentaService;
    }

    @Override
    public void procesarRetiro(String dni, String contrasenia, Integer montoARetirar) {
        boolean validado = autenticationService.validarUsuarioYContrasenia(dni, contrasenia);
        if(validado){
            Cuenta c = cuentaService.getCuenta(dni);
            cajaService.entregarDinero(c, montoARetirar);
        }
        else{
            System.out.println("DNI o contraseña incorrectos");
        }
    }
}
