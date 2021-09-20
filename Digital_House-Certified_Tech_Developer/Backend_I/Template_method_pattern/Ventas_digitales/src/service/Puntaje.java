package service;

public enum Puntaje {
    NUEVO_AFILIADO(10),
    ANTIGUEDAD(5),
    VENTA_EMPLEADO(5),
    VENTA_AFILIADO(10),
    VENTA_PASANTE(5);

    private int valor;
    Puntaje(int v){
        valor = v;
    }

    public int getPuntos(){
        return valor;
    }
}
