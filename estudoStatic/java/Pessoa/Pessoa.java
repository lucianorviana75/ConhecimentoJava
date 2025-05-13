/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author ribei
 */
public class Pessoa {
/*
   A idea é mostrar os doi tipos de variavel. 
   A variavel de instancia e a variavel estatica.
*/
    //Variável de instância: pertence a cada objeto.
    private String nome;
    
    
    //Variável estatica: compartilha entre todos os objetos
    private static int contador = 0;
    
    //Construtor
    public Pessoa(String nome){
        this.nome=nome;
        contador++;//aumenta o contador toda vez que um objeto e criado.
    }
    //Método de instânca
    public void mostraNome(){
        System.out.println("\nNome da pessoa: " + nome);
    }
    //Método estatico
    public static void mostraContador(){
        if(contador < 2){
            System.out.printf("\n0%d pessoa foi criada\n ",contador);
        }else{
            System.out.printf("\n0%d pessoas foram criadas\n ",contador);
        }
        // tem que chamar assim.
        //Pessoa.mostraContador();Classe primeiro, ponto, e em seguida o metodo.
      
    }
    
}
    

