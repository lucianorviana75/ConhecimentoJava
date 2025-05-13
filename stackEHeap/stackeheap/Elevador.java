/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stackeheap;

import java.util.ArrayList;

/**
 *
 * @author ribei
 */
public class Elevador {
 // Função que simula chamar o elevador (usa stack)
    public static void chamarElevador(int andarOrigem, int andarDestino) {
        System.out.println("Elevador chamado do andar " + andarOrigem + " para o andar " + andarDestino + ".");
        System.out.println("Elevador em movimento...");
        System.out.println("Elevador chegou no andar " + andarDestino);
    }

    // Função que adiciona um passageiro no elevador (usando heap)
    public static void adicionarPassageiro(ArrayList<Passageiro> elevador, String nome, int andarDestino) {
        Passageiro novoPassageiro = new Passageiro(nome, andarDestino); // Alocação no heap
        elevador.add(novoPassageiro);
        System.out.println(nome + " entrou no elevador.");
    }

    public static void main(String[] args) {
        // Chamada do elevador (simula um comportamento de stack)
        chamarElevador(1, 5);

        // ArrayList para armazenar os passageiros (usando heap)
        ArrayList<Passageiro> elevador = new ArrayList<>();

        // Adicionando passageiros ao elevador
        adicionarPassageiro(elevador, "João", 3);
        adicionarPassageiro(elevador, "Maria", 7);

        // Elevador transportando passageiros
        for (Passageiro passageiro : elevador) {
            passageiro.viajar();
        }
        
        // Não é necessário liberar memória manualmente em Java (garbage collection cuida disso)
        /*
        Explicação do código:
        Classe Passageiro: A classe Passageiro representa um passageiro no elevador, com o nome e o destino. 
        O método viajar() simula a viagem do elevador até o andar de destino do passageiro.

        Função chamarElevador: Esta função simula a chamada do elevador, indo de um andar para outro. 
        Em Java, isso pode ser visto como um exemplo de stack, pois a chamada do método ocorre de maneira sequencial e retorna após ser executada.

        Função adicionarPassageiro: Ao adicionar passageiros ao elevador, estamos criando objetos Passageiro e alocando-os dinamicamente no heap. 
        O Java usa garbage collection, então não precisamos liberar a memória manualmente, como fazemos em C++.

        ArrayList elevador: Utilizamos um ArrayList para armazenar os passageiros do elevador. 
        Este tipo de lista é alocado dinamicamente no heap e pode crescer conforme adicionamos novos passageiros.

        Como funciona:
        O elevador é chamado utilizando o método chamarElevador(), que simula uma operação de stack.

        Passageiros são adicionados ao elevador usando o método adicionarPassageiro(). 
        Os objetos Passageiro são alocados no heap.

        Cada passageiro viaja para o seu andar de destino, e o método viajar() é chamado para cada um.

        Em Java, a garbage collection automaticamente cuida da liberação de memória quando o objeto não é mais utilizado.
        */
    }
}


