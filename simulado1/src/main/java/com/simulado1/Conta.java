package com.simulado1;

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
        return saldo;
    }

    public double retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
        return saldo;
    }

    public void naoEhZero(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }
}
