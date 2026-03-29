package com.simulado1;

public class Simulado1 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mostrarEstado();
        carro.acelerar(10);
        carro.mostrarEstado();
        carro.alterarEstado(EstadoCarro.LIGADO);
        carro.mostrarEstado();
        carro.acelerar(10);
        carro.mostrarEstado();
        carro.alterarEstado(EstadoCarro.MOVENDO);
        carro.alterarEstado(EstadoCarro.MOVENDO);
        carro.alterarEstado(EstadoCarro.MOVENDO);
        carro.mostrarEstado();
        carro.acelerar(20);
        carro.mostrarEstado();
        carro.alterarEstado(EstadoCarro.PARADO);
        carro.mostrarEstado();
        carro.alterarEstado(EstadoCarro.DESLIGADO);
        carro.mostrarEstado();

        Radar radar = new Radar();
        radar.inserirCarro(carro);
        radar.exibirCarrosEmMovimento();
        radar.listarCarrosDesligados(); 

        Conta conta1 = new Conta("Alice", 1000.0);
        Conta conta2 = new Conta("Bob", 500.0); 

        System.out.println("Saldo inicial de " + conta1.getNome() + ": " + conta1.getSaldo());
        System.out.println("Saldo inicial de " + conta2.getNome() + ": " + conta2.getSaldo());  

        Transferencia.transferir(conta1, conta2, 200.0);
        Transferencia.transferir(conta1, conta2, 1000.0);
        Transferencia.transferir(conta1, conta2, -50.0);
    }
}
