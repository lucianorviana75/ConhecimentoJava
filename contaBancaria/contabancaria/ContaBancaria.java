/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author ribei
 */
public class ContaBancaria {
   public static void main(String[] args) {
        CriandoConta p1 = new CriandoConta(5);
        
        p1.depositar(100);
        p1.sacar(0);
        
       
        
        System.out.println("O saldo em conta "+ p1.getSaldo());
        
    }
}
