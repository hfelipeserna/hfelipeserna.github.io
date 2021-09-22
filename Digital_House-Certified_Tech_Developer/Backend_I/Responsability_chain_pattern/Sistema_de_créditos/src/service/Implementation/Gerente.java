package service.Implementation;
import service.EmpleadoBanco;

public class Gerente extends EmpleadoBanco {

    @Override
    public void procesarSolicitud(Integer monto) {
        this.setCargo("GERENTE");
        if(monto >= 60000 && monto < 200000)
            System.out.println(this.getCargo() + ": yo me encargo.");
        else if(this.getSiguienteEmpleadoBanco() != null)
            this.getSiguienteEmpleadoBanco().procesarSolicitud(monto);
    }
}
