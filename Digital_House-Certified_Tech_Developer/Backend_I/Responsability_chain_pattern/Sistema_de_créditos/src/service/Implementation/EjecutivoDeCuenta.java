package service.Implementation;
import service.EmpleadoBanco;

public class EjecutivoDeCuenta extends EmpleadoBanco {

    @Override
    public void procesarSolicitud(Integer monto) {
        this.setCargo("EJECUTIVO DE CUENTA");
        if(monto < 60000)
            System.out.println(this.getCargo() + ": yo me encargo.");
        else if(this.getSiguienteEmpleadoBanco() != null)
            this.getSiguienteEmpleadoBanco().procesarSolicitud(monto);
    }
}
