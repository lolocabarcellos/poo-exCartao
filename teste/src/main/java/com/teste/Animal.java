package com.teste;

public class Animal {

    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void latir() {
        System.out.println(nome + " está fazendo um som.");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public void brincar() {
        System.out.println(nome + " está brincando!");
    }
}