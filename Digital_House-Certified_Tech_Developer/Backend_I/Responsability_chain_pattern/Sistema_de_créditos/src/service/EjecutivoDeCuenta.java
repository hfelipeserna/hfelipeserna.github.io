package service;

public class EjecutivoDeCuenta extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        this.setCargo("EJECUTIVO DE CUENTA");
        if(monto < 60000)
            System.out.println("Yo, " + this.getCargo() + " me encargo.");
        else if(this.getSiguienteEmpleadoBanco() != null)
            this.getSiguienteEmpleadoBanco().procesarSolicitud(monto);
    }
}
