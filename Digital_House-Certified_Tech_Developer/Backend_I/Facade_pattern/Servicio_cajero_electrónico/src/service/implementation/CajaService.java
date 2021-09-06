package service.implementation;
import model.Cuenta;
import model.DineroATM;

public class CajaService {

    private DineroATM atm;

    public CajaService(DineroATM atm) {
        this.atm = atm;
    }

    public void entregarDinero(Cuenta c, Integer montoAEntregar){
        if(atm.getDineroDisponible()>=montoAEntregar){
            if(c.getSaldoActual()>=montoAEntregar){
                c.setSaldoActual(c.getSaldoActual()-montoAEntregar);
                atm.setDineroDisponible(atm.getDineroDisponible()-montoAEntregar);
                System.out.println("Entregando dinero: $" + montoAEntregar);
                System.out.println("Saldo en la cuenta DNI " + c.getDni() + ": $" + c.getSaldoActual());
                System.out.println("Dinero en ATM: $" + atm.getDineroDisponible() +"\n");
            }else{
                System.out.println("La cuenta no tiene saldo suficiente \n");
            }
        }else{
            System.out.println("El cajero no tiene dinero suficiente");
        }
    }
}
