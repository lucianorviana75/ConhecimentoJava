/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author ribei
 */

public class PessoaB {
//Variavel da instância: Cada pessoa tem seu proprio nome
    private String nome;
    
//Variavel da classe: todos as pessoas compartilham esta classe
    private static int totalDePessoas = 0;
    
//contrutor
    public PessoaB(String nome){
        this.nome=nome;
        totalDePessoas++;//cada vez que uma pessoa é criada,o contador aumenta
    }
    
// Método de instância
    public void mostrarNome(){
        System.out.println("Nome da pessoa e " + nome);
    }
//Método da classe (estático)
    public static void mostrarTotalDePessoa(){
        System.out.println(" Total de pessoas criadas "+ totalDePessoas);
    }
  
}


   

        
