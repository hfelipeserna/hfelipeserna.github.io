package model;

public enum Parametro {
    LOTE(1000, 2000),
    PESO(1200, 1300);

    private int limiteInferior;
    private int limiteSuperior;

    private Parametro(int limInferior, int limSuperior){
        limiteInferior = limInferior;
        limiteSuperior = limSuperior;
    }

    public int getLimiteInferior(){
        return limiteInferior;
    }

    public int getLimiteSuperior(){
        return limiteSuperior;
    }
}
