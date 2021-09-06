package service.implementation;
import model.AuthenticationDatabase;
import java.util.List;

public class AuthenticationService {
    private List<AuthenticationDatabase> authenticationDatabases;

    public AuthenticationService(List<AuthenticationDatabase> authenticationDatabases) {
        this.authenticationDatabases = authenticationDatabases;
    }

    public boolean validarUsuarioYContrasenia(String dni, String contrasenia){
        boolean valido = Boolean.FALSE;
        for(AuthenticationDatabase aDB: this.authenticationDatabases){
            if(aDB.getDni().equals(dni) && aDB.getContrasenia().equals(contrasenia)){
                valido = Boolean.TRUE;
                break;
            }
        }
        return valido;
    }
}
