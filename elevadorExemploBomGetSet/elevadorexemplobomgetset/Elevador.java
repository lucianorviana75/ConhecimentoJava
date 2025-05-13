/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elevadorexemplobomgetset;

/**
 *
 * @author ribei
 */
public class Elevador {
   private int andarAtual = 0;
   private final int totalAndares;
   private final int capacidade;
   private int pessoasPresentes = 0;
   
   public Elevador(int totalAndares,int capacidade){
       if(totalAndares <= 0 || capacidade <= 0){
           throw new IllegalArgumentException("Valores invalidos para andares ou capacidade. ");
       }
       this.totalAndares=totalAndares;
       this.capacidade=capacidade;
   }
   public int getAndarAtual(){
       return andarAtual;
   }
   public int getPessoaPresentes(){
       return pessoasPresentes;
   }
    public void entrar(){
        if(pessoasPresentes < capacidade){
            pessoasPresentes++;
        }else{
            System.out.println("Exesso de pessoas! ");
            System.out.println("Ha uma pessoa a mais no elevador ");
        }
    }  
    public void sair(){
        if(pessoasPresentes > 0){
            pessoasPresentes--;
        }else{
            System.out.println("Elevador vazio! ");
        }
    }
    public void subir(){
       if(andarAtual< totalAndares){
           andarAtual++;
        }else{
           System.out.println("Voce ja esta no ultimo anadar");
        }
    }
    public void descer(){
        if(andarAtual > 0){
            
        }else{
            System.out.println("Voce ja esta no terreo.");
        }
    }
    
   
}  

