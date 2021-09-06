package model;

public class DineroATM {
    private Integer dineroDisponible = 0;

    public Integer getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public void recargarDineroATM(Integer dineroARecargar){
        setDineroDisponible(getDineroDisponible()+dineroARecargar);
    }

    @Override
    public String toString() {
        return "Cod. de ATM: " + this.hashCode() + ", dinero disponible: $" + this.dineroDisponible;
    }
}
