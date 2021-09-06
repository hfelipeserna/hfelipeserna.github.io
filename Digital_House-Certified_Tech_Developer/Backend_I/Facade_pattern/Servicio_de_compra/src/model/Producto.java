package model;

public class Producto {
    private String productoID;
    private String nombre;
    private Integer cantidad;
    private Integer valor;

    public Producto(String productoID, String nombre, Integer cantidad, Integer valor) {
        this.productoID = productoID;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getProductoID() {
        return productoID;
    }

    public void setProductoID(String productoID) {
        this.productoID = productoID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Producto: { ProductoID: " + this.productoID + ", Nombre: " + this.nombre + ", Cantidad: " + this.cantidad + ", Valor: " + this.valor + " }";
    }
}
