package service;

public class Gerente extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        this.setCargo("GERENTE");
        if(monto >= 60000 && monto < 200000)
            System.out.println("Yo, " + this.getCargo() + " me encargo.");
        else if(this.getSiguienteEmpleadoBanco() != null)
            this.getSiguienteEmpleadoBanco().procesarSolicitud(monto);
    }
}
