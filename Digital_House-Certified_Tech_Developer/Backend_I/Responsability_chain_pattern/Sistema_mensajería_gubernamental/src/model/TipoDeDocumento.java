package model;

public enum TipoDeDocumento {
    RESERVADO(1),
    SECRETO(2),
    MUY_SECRETO(3);

    private int nivelDeAcceso;
    TipoDeDocumento(int nivel){
        nivelDeAcceso = nivel;
    }

    public int getNivelDeAcceso(){
        return nivelDeAcceso;
    }
}
