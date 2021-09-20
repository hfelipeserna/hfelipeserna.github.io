package service;

public abstract class Vendedor {

    private String nombre;
    private int cantidadDeVentas;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.cantidadDeVentas = 0;
    }

    public void vender(){
        this.cantidadDeVentas ++;
    }

    protected abstract int calcularPuntos();

    public String mostrarCategoria(){
        int puntos = calcularPuntos();
        Categoria categoria = recategorizar();
        return getNombre() + " tiene un total de " + puntos + " puntos, y categoriza como " + categoria;
    }

    public Categoria recategorizar(){
        int puntos = calcularPuntos();
        Categoria categoria;
        if(puntos < 20)
            categoria = Categoria.NOVATO;
        else if(puntos < 31)
            categoria = Categoria.APRENDIZ;
        else if(puntos < 41)
            categoria = Categoria.BUENO;
        else
            categoria = Categoria.MAESTRO;
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
}
