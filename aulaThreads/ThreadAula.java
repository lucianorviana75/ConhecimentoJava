/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulathreads;

/**
 *
 * @author ribei
 */
public class ThreadAula extends Thread {
    private String nome;
    
    public ThreadAula(String nome){
        this.nome = nome;
    }
    @Override
    public void run(){
        for(int andar = 0; andar <= 5; andar++){
            System.out.println("Elevador " + nome + " esta no andar " + andar);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Elevador " + nome + " chegou aoultimo andar. ");
        
    }
}
