/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.exBateria;

/**
 *
 * @author Lorena
 */
public class Bateria {

    private int bateriaMax;
    private int bateria;
    private boolean ehVazio;

    public Bateria (int bateriaMax, int bateria){
        this.bateriaMax = bateriaMax;
        this.bateria = bateria;
    }

    public void carregar(){
        if (bateriaMax < 100){
            bateria++;
        }
    }

    public void descarregar(){
        if (!ehVazio()){
            bateria--;
        }
    }

    public boolean ehVazio(){
        return bateria == 0;
    }
}
