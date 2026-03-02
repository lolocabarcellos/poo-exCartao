/* 
Dada a classe Pessoa que possui atributos: String nome, String sexo,
int idade, boolean vegetariana. Faça agora uma classe Churrasco que
possua: Atributos: qtdCarne(double); Método: verificarConsumo(): Recebe
via parametro uma Pessoa e com isto define a consumação média de carne 
(quantidade de carne consumida) pessoas de 0 a 3 anos não consomem, 
vegetarianos também não. Pessoas de 4 a 12 anos consomem 1kg de carne
e de 13 anos em diante 2 kg de carne.
*/

package com.ex1;

/**
 *
 * @author Lorena
 */
public class Ex1 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana", "F", 2, false);
        Pessoa p2 = new Pessoa("Carlos", "M", 30, true);
        Pessoa p3 = new Pessoa("Marcos", "M", 5, false);
        Pessoa p4 = new Pessoa("Fernanda", "F", 20, false);

        Churrasco c1 = new Churrasco(p1);
        c1.verificarConsumo(p1);

        Churrasco c2 = new Churrasco(p2);
        c2.verificarConsumo(p2);

        Churrasco c3 = new Churrasco(p3);
        c3.verificarConsumo(p3);

        Churrasco c4 = new Churrasco(p4);
        c4.verificarConsumo(p4);
    }
}
