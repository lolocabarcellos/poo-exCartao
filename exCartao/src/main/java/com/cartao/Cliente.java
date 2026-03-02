package com.cartao;

    public class Cliente {

        double valor_fatura;
        Cartao cartao;

        public Cliente(double valor_fatura, Cartao cartao){
            this.cartao = cartao;
            this.valor_fatura = valor_fatura;
        }

        public void mostrar(){
            System.out.println("CARTAO: " + cartao);
        }

        public void descontar(){
            switch(cartao){
                case GOLD:
                    valor_fatura = valor_fatura* 0.98;
                    System.out.println("Voce tem 2% de desconto! Sua fatura agora e R$" + valor_fatura);
                    break;
                case PLATINUM: 
                    valor_fatura = valor_fatura* 0.97;
                    System.out.println("Voce tem 3% de desconto! Sua fatura agora e R$" + valor_fatura);
                    break;
                case BLACK:
                    valor_fatura = valor_fatura* 0.95;
                    System.out.println("Voce tem 5% de desconto! Sua fatura agora e R$" + valor_fatura);
                    break;
                default:
                    System.out.println("NADAAAAAAAAAAAA");
            }
        }
    }