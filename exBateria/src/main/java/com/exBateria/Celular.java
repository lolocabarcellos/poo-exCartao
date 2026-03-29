package com.exBateria;

public class Celular {

    private Bateria bateria;
    private Estado estado;

    public Celular(Bateria bateria, Estado estado){
        this.bateria = bateria;
        this.estado = estado;
    }

    public void mensagem(){
        if (Estado.LIGADO.isLigado(estado) && !bateria.ehVazio()){
        System.out.println("BEM-VINDO!");
        bateria.descarregar();
        }
    }

    public void carregar(){
        bateria.carregar();
        System.out.println("Carregando...");
    }

    public void ligar(){
        estado = Estado.LIGADO;
        System.err.println("Ligando...");
        this.mensagem();
        bateria.descarregar();
    }

    public void desligar(){
        estado = Estado.DESLIGADO;
        System.out.println("Desligando...");
    }
}
