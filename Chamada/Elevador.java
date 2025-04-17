/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chamada;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;
/**
 *
 * @author ribei
 */
public class Elevador extends Thread{
    private String nome;
    private BlockingQueue<Chamada>filaChamadas;
    private int andarAtual =0;
    
    public Elevador(String nome,BlockingQueue<Chamada>filaChamadas){
        this.nome=nome;
        this.filaChamadas=filaChamadas;
    }
    @Override
    public void run(){
        while(true){
            try{
                Chamada chamada = filaChamadas.take();//Espera uma nova chamada.
                System.out.println(nome + " recebeu chamada de "+ chamada.pessoa + " no andar de " + chamada.andar);
                while(andarAtual != chamada.andar){
                    if(andarAtual < chamada.andar){
                        andarAtual++;
                    }else{
                        andarAtual--;
                    }
                    System.out.println(nome + " indo para o andar "+ andarAtual);
                    Thread.sleep(700);
                }
                System.out.println(nome + " chegou no andar " + andarAtual + " para " + chamada.pessoa);
                Thread.sleep(1000);//tempo embarque.
            }catch(InterruptedException e){
                break;
            }
        }
    }
} 
   
    

