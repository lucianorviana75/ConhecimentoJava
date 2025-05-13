/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Pessoa;



/**
 *
 * @author ribei
 */
public class RetornoPessoa {

    public static void main(String[] args) {
    //Classe Pessoa    
    Pessoa p1 = new Pessoa("Luciano");
    Pessoa p2 = new Pessoa("Marcos");
    p1.mostraNome();
    p2.mostraNome();
    Pessoa.mostraContador();
    //Classe PessoaB
    
    PessoaB P1 = new PessoaB("Luciano");
    PessoaB P2 = new PessoaB("Roberto");
    
    P1.mostrarNome();
    P2.mostrarNome();
    
    //Método estático acessa a variavel de classe
    PessoaB.mostrarTotalDePessoa();
    
    //PessoaC
    PessoaC pessoa1 = new PessoaC("Robertino");
    PessoaC pessoa2 = new PessoaC("Ledolino");
    PessoaC.mostrarTotalNoElevador();
    
    
    
    
   
       
    }
}