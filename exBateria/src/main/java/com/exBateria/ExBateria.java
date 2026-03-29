/*
Um celular possui bateria. A bateria possui uma carga inteira(0 a 100).
Toda bateria pode carregar 1 ponto ou descarregar 1 ponto. Um celular 
ligado pode recarregar, mostrar uma mensagem de bem-vindo e desligar.
A mensagem gasta 1 ponto de bateria. Um celular desligado pode ligar e
isso, também, lhe custa um ponto de bateria. Implemente a situação
descrita e faça testes.
*/
package com.exBateria;

public class ExBateria {

    public static void main(String[] args) {
        Bateria bateria = new Bateria(100, 90);
        Celular c = new Celular(bateria, Estado.LIGADO);

        c.ligar();
        c.desligar();
        c.carregar();
    }
}
