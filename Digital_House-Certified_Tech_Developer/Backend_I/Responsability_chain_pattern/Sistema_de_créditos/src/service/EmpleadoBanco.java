package service;

public abstract class EmpleadoBanco {

    private EmpleadoBanco siguienteEmpleadoBanco;
    private String cargo;

    public abstract void procesarSolicitud(Integer monto);

    public EmpleadoBanco getSiguienteEmpleadoBanco() {
        return siguienteEmpleadoBanco;
    }

    public void setSiguienteEmpleadoBanco(EmpleadoBanco siguienteEmpleadoBanco) {
        this.siguienteEmpleadoBanco = siguienteEmpleadoBanco;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
