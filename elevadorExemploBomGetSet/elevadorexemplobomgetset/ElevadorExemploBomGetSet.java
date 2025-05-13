/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevadorexemplobomgetset;

/**
 *
 * @author ribei
 */
public class ElevadorExemploBomGetSet {

    public static void main(String[] args) {
        Elevador passageiro1 = new Elevador(10, 5);
        passageiro1.getAndarAtual();
        passageiro1.getAndarAtual();
        passageiro1.getPessoaPresentes();
        passageiro1.entrar();
        passageiro1.entrar();
        passageiro1.entrar();
        passageiro1.entrar();
        passageiro1.entrar();
        passageiro1.entrar();
        
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir();
        //passageiro1.subir(); 
        //passageiro1.subir(); 
        //passageiro1.subir();
        
        passageiro1.sair();
        passageiro1.sair();
        //passageiro1.sair();
        //passageiro1.sair();
        //passageiro1.sair();
        
        passageiro1.descer();



        
              
        
        System.out.println("total andares "+ passageiro1.equals(passageiro1));
        System.out.println("Voce chegou ao " +passageiro1.getAndarAtual()+ " andar");
        System.out.println(passageiro1.getPessoaPresentes()+ " pessoas no elevador.");
    }  
}
