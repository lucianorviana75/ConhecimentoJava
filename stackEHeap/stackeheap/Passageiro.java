/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackeheap;

/**
 *
 * @author ribei
 */
public class Passageiro {
    //Classe passageiro representando os passageiros no elevador.
    String nome;
    int andarDestino;
    
    //Construtor para inicializar um passageiro com nome e andar de destino.

    public Passageiro(String nome, int andarDestino) {
        this.nome = nome;
        this.andarDestino = andarDestino;
    }
    //Método para simular a viagem do passageiro
    public void viajar(){
        System.out.println(nome + " indo para o andar " + andarDestino);
    }
    /*
    Classe Passageiro: A classe Passageiro representa um passageiro no elevador, com o nome e o destino. 
    O método viajar() simula a viagem do elevador até o andar de destino do passageiro.

    */
    
}
