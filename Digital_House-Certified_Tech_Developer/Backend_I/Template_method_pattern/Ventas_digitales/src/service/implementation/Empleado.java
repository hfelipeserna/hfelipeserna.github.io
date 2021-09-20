package service.implementation;
import service.Puntaje;
import service.Vendedor;
import java.util.ArrayList;

public class Empleado extends Vendedor{

    private int aniosAntiguedad;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Empleado(String nombre, int aniosAntiguedad) {
        super(nombre);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    // Agregar afiliados y sumar los puntos
    public void conseguirAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.getNombre() + " ahora es afiliado de " + super.getNombre());
    }

    // Por cada año de antiguedad, obtiene 5 puntos extra
    @Override
    protected int calcularPuntos() {
        return afiliados.size()*Puntaje.NUEVO_AFILIADO.getPuntos() + getCantidadDeVentas()*Puntaje.VENTA_EMPLEADO.getPuntos() + getAniosAntiguedad()*Puntaje.ANTIGUEDAD.getPuntos();
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
}
