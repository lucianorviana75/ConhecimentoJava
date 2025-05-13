/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

/**
 *
 * @author ribei
 */
public class CriandoConta {
    private double saldo;
    
    public CriandoConta(double saldoInicial){
        if(saldoInicial < 0){
           throw new IllegalArgumentException("Saldo inicial nao pode ser negativo");
        }
       this.saldo = saldoInicial;
    }
    public double getSaldo(){
       return saldo;
   }
    public void depositar(double valor){
       if (valor <= 0){
           throw new IllegalArgumentException("Valor de deposito invalido .");
           
        }
        saldo += valor;
    }
    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor saque invalido .");
           
        }
        if(valor > saldo){
            throw new IllegalArgumentException("Saldo insuficiente .");
        }
        saldo -= valor;
    }    
}
