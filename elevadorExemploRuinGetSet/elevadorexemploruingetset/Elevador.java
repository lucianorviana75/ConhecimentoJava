/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevadorexemploruingetset;

/**
 *
 * @author ribei
 */
public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int andarAtual, int capacidade, int pessoasPresentes, int totalAndares) {
        this.andarAtual = andarAtual;
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
        this.totalAndares = totalAndares;
    }
    
    
    

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

        public int getTotalAndares() {
            return totalAndares;
        }

        public void setTotalAndares(int totalAndares) {
            this.totalAndares = totalAndares;
        }

        public int getCapacidade() {
            return capacidade;
        }

        public void setCapacidade(int capacidade) {
            this.capacidade = capacidade;
        }
        

    
}


