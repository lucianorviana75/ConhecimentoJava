/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author ribei
 */
/*
Imagine um prédio com um elevador. 
Toda vez que uma pessoa entra:
Guardamos o nome dela (variável de instância)
Aumentamos o número total de pessoas no elevador 
(variável estática)
*/

public class PessoaC {
    //Variável de instancia:Pertence a cada pessoa
    private String nome;
    
    //variável estática: pertence a classe,representa o total no elevador
    private static int totalNoElevador = 0;
    
    //construtor
    public PessoaC(String nome){
        this.nome= nome;
        totalNoElevador++;//Almenta o total de pessoas no elevador
        System.out.println(nome + " entrou no elevador. ");
    }
    //Método de instância
    public void mostraNome(){
        System.out.println(" Pessoa: "+ nome);
    }
    //Método estático
    public static void mostrarTotalNoElevador(){
        System.out.println(" Total de pessoas no elevador: " + totalNoElevador);
        
    }
    
}
