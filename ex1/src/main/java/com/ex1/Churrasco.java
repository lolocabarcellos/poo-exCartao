package com.ex1;

/**
 *
 * @author Lorena
 */
public class Churrasco {
    double qtdCarne;
    Pessoa pessoa;

    public Churrasco(Pessoa pessoa){
        this.pessoa = pessoa;
        this.qtdCarne = 0;
    }

    public void verificarConsumo(Pessoa p){
        faixaEtaria faixa;

        if (p.vegetariana) {
            faixa = faixaEtaria.VEGETARIANO;
        } else if (p.idade <= 3) {
            faixa = faixaEtaria.CRIANCA;
        } else if (p.idade <= 12) {
            faixa = faixaEtaria.ADOLESCENTE;
        } else {
            faixa = faixaEtaria.ADULTO;
        }

        switch(faixa){
            case CRIANCA:
                qtdCarne = 0;
                System.out.println(p.nome + " nao consome carne.");
                break;
            case VEGETARIANO:
                qtdCarne = 0;
                System.out.println(p.nome + " nao consome carne.");
                break;
            case ADOLESCENTE:
                qtdCarne = 1;
                System.out.println(p.nome + " consome 1 kg de carne.");
                break;
            case ADULTO:
                qtdCarne = 2;
                System.out.println(p.nome + " consome 2 kg de carne.");
                break;
        }
    }
}
