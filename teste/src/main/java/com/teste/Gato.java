package com.teste;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void latir() {
        System.out.println(nome + " diz: Miau!");
    }
}