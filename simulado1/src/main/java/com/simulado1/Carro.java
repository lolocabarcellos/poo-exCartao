package com.simulado1;

public class Carro {
    private EstadoCarro estado;
    private double velocidade;

    public Carro(){
        this.estado = EstadoCarro.DESLIGADO;
        this.velocidade = 0.0;
    }

    public EstadoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void alterarEstado(EstadoCarro novoEstado) {
       if (novoEstado == EstadoCarro.LIGADO && this.estado == EstadoCarro.DESLIGADO) {
            this.estado = novoEstado;
        } else if (novoEstado == EstadoCarro.DESLIGADO && this.estado != EstadoCarro.DESLIGADO) {
            this.estado = novoEstado;
            this.velocidade = 0.0; // Ao desligar, a velocidade deve ser zerada
        } else if (novoEstado == EstadoCarro.MOVENDO && this.estado == EstadoCarro.LIGADO) {
            this.estado = novoEstado;
        } else if (novoEstado == EstadoCarro.PARADO && this.estado == EstadoCarro.MOVENDO) {
            this.estado = novoEstado;
            this.velocidade = 0.0; // Ao parar, a velocidade deve ser zerada
        }
    }

    public void acelerar(double incremento) {
        if (this.estado == EstadoCarro.MOVENDO) {
            this.velocidade += incremento;
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado do Carro: " + this.estado);
        System.out.println("Velocidade do Carro: " + this.velocidade + " km/h");
    }
}