package com.exBateria;

public enum Estado {
    LIGADO, DESLIGADO;

    public boolean isLigado(Estado estado){
        return estado == LIGADO;
    }

    public boolean isDesligado(Estado estado){
        return estado == DESLIGADO;
    }
}
