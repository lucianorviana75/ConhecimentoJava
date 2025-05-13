/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulathreads;

/**
 *
 * @author ribei
 */
public class AulaThreads {

    public static void main(String[] args) {
       ThreadAula elevador1 = new ThreadAula("A");
       ThreadAula elevador2 = new ThreadAula("B");
       
       elevador1.start();
       elevador2.start();
    }
}
