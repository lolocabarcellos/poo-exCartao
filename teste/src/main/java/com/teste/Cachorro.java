package com.teste;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void latir() {
        System.out.println(nome + " diz: Au au!");
    }
}