package com.ex3;

public class Lampada {
    Estado estado;
    private int qtdAcendimentos;

    public Lampada(Estado estado) {
        this.estado = estado;
        this.qtdAcendimentos = 0;
    }

    public void click(){
        if (estado == Estado.ACESA) {
            estado = Estado.APAGADA;
        } else {
            estado = Estado.ACESA;
            qtdAcendimentos++;
        }
    }

    public int qtdAcendimentos() {
        return qtdAcendimentos;
    }

    public String checaEstado() {
        return "A lampada esta " + estado;
    }
}
