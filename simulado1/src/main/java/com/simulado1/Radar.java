package com.simulado1;

import java.util.ArrayList;
import java.util.List;

public class Radar {
    private List<Carro> carros;

    public Radar() {
        this.carros = new ArrayList<>();
    }

    public void inserirCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void exibirCarrosEmMovimento() {
        List<Carro> carrosEmMovimento = new ArrayList<>();
        double velocidadeTotal = 0.0;

        for (Carro carro : carros) {
            if (carro.getEstado() == EstadoCarro.MOVENDO) {
                carrosEmMovimento.add(carro);
                velocidadeTotal += carro.getVelocidade();
            }
        }

        System.out.println("=== CARROS EM MOVIMENTO ===");
        if (carrosEmMovimento.isEmpty()) {
            System.out.println("Nenhum carro em movimento!");
        } else {
            for (int i = 0; i < carrosEmMovimento.size(); i++) {
                System.out.println("Carro " + (i + 1) + " - Velocidade: " 
                    + carrosEmMovimento.get(i).getVelocidade() + " km/h");
            }
            System.out.println("Quantidade: " + carrosEmMovimento.size());
            System.out.println("Velocidade Média: " 
                + (velocidadeTotal / carrosEmMovimento.size()) + " km/h");
        }
        System.out.println();
    }

    public void listarCarrosDesligados() {
        System.out.println("=== CARROS DESLIGADOS ===");
        int contador = 0;
        for (Carro carro : carros) {
            if (carro.getEstado() == EstadoCarro.DESLIGADO) {
                System.out.println("Carro " + (contador + 1) + " - Estado: DESLIGADO");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Nenhum carro desligado!");
        }
        System.out.println();
    }

    public int getTotalCarros() {
        return carros.size();
    }

}
