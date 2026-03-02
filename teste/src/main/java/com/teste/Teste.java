package com.teste;

public class Teste {
    public static void main(String[] args) {

        Gato gato = new Gato("Mimi");
        Cachorro cachorro = new Cachorro("Rex");

        gato.latir();
        gato.correr();
        gato.brincar();

        System.out.println("-------------");

        cachorro.latir();
        cachorro.correr();
        cachorro.brincar();
    }
}