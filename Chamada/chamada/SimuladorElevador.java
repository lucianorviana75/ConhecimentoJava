/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chamada;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 *
 * @author ribei
 */
public class SimuladorElevador {

    public static void main(String[] args) {
        BlockingQueue<Chamada> filaChamadas = new LinkedBlockingQueue<>();
        
        Elevador elevador1 = new Elevador(" Elevador A ", filaChamadas);
        elevador1.start();
        
        // Criar várias pessoaschamando o elevador
        for(int i= 1;i <= 5; i++){
            new Pessoa(" Pessoa " + i, filaChamadas).start();
            try{
                Thread.sleep(500);// simula chamadas em tempos deferent
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
        
}
