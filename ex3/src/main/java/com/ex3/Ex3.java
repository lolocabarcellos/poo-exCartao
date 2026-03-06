/*
 *  Implemente uma classe Lˆampada com os seguintes componentes
e fa¸ca um teste ao final: Atributos: estado(Enum) M´etodos:
• click(): ao chamar este m´etodo a lˆampada ´e colocada 
no estado ”apagada” caso esteja ”acesa” e ´e colocado no estado 
”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lˆampada foi acesa (DICA:
este m´etodo deve ser chamada no m´etodo acima).
• checaEstado(): retorna o estado atual da Lˆampada.
 */

package com.ex3;

public class Ex3 {

    public static void main(String[] args) {
       Lampada l = new Lampada(Estado.APAGADA);
       System.out.println(l.checaEstado());
       System.out.println(l.qtdAcendimentos());
       l.click();
       System.out.println(l.checaEstado());
       System.out.println(l.qtdAcendimentos());
       l.click();
       System.out.println(l.checaEstado());
       System.out.println(l.qtdAcendimentos());
       l.click();
       System.out.println(l.checaEstado());
       System.out.println(l.qtdAcendimentos());
    }
}
