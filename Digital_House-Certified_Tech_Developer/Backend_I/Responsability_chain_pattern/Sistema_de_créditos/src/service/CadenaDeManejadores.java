package service;
import java.util.Map;

public class CadenaDeManejadores {

    private EmpleadoBanco manejadorInicial;

    public CadenaDeManejadores() {
        // Se crea map con las instancias de cada uno de los manejadores
        Map<String, EmpleadoBanco> empleados = Map.of(
                "Ejecutivo de cuenta", new EjecutivoDeCuenta(),
                "Gerente", new Gerente(),
                "Director", new Director());

        setManejadorInicial(empleados.get("Ejecutivo de cuenta"));
        // Se arma la cadena de responsabilidad
        empleados.get("Ejecutivo de cuenta").setSiguienteEmpleadoBanco(empleados.get("Gerente"));
        empleados.get("Gerente").setSiguienteEmpleadoBanco(empleados.get("Director"));
    }

    public EmpleadoBanco getManejadorInicial() {
        return manejadorInicial;
    }

    public void setManejadorInicial(EmpleadoBanco manejadorInicial) {
        this.manejadorInicial = manejadorInicial;
    }
}
