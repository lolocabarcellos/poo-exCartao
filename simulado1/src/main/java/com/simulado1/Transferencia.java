package com.simulado1;

public class Transferencia {

    public static void transferir(Conta de, Conta para, double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor deve ser maior que zero!");
            return;
        }
        
        if (de.getSaldo() < valor) {
            System.out.println("Erro: Saldo insuficiente na conta de " + de.getNome() 
                + ". Saldo atual: R$ " + String.format("%.2f", de.getSaldo())
                + " | Valor solicitado: R$ " + String.format("%.2f", valor));
            return;
        }
        
        de.retirar(valor);
        para.depositar(valor);
        
        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Conta de origem (" + de.getNome() + "): R$ " 
            + String.format("%.2f", de.getSaldo()));
        System.out.println("Conta de destino (" + para.getNome() + "): R$ " 
            + String.format("%.2f", para.getSaldo()));
    }
}
