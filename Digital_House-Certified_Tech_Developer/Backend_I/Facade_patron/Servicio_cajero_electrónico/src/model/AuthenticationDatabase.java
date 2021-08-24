package model;

public class AuthenticationDatabase {
    private String dni;
    private String contrasenia;

    public AuthenticationDatabase(String dni, String contrasenia) {
        this.dni = dni;
        this.contrasenia = contrasenia;
    }

    public String getDni() {
        return dni;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Registro " + this.hashCode() + ", DNI: " + this.dni + ", Contraseña: " + this.contrasenia;
    }
}
