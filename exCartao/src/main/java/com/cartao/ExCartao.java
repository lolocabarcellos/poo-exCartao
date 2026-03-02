/*
 * Um cartão de crédito possui valor de fatura e nível de fiddelidade (GOLD, PLATINUM ou BLACK). 
 * Todo cartão possui um desconto de fatura de acordo com a fidelidade.
 * - 2% para GOLD;
 * - 3% para PLATINUM;
 * - 5% para BLACK;
 * Implemente a situação descrita e um teste simples.
 */

package com.cartao;

/**
 *
 * @author Lorena
 */
public class ExCartao {

    public static void main(String[] args) {
        Cliente a = new Cliente(100.00, Cartao.GOLD);
        a.mostrar();
        a.descontar();
    }
}
