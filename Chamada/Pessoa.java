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
public class Pessoa extends Thread{
    private String nome;
    private BlockingQueue<Chamada> filaChamadas;
    private Random random = new Random();
    
    public Pessoa(String nome,BlockingQueue<Chamada> filChamadas){
        this.nome=nome;
        this.filaChamadas=filChamadas;
        
    }
    @Override
    public void run(){
        try{
            int andarDesejado = random.nextInt(6);//andar de 0 a 5
            System.err.println(nome + " esta chamando o elevador no andar " + andarDesejado);
            filaChamadas.put(new Chamada(andarDesejado, nome));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
