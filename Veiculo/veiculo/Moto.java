/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veiculo;

/**
 *
 * @author ribei
 */
public class Moto extends Veiculo{
    @Override
    public void mover(){
        System.out.println("Moto esta acelerando na pista.");
    }
    public void parado(){
        System.out.println("A moto parou .");
    }
    
}
