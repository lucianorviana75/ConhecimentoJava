/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

/**
 *
 * @author ribei
 */
public class DiaDaSemana {
    public enum Dias{
        segunda,terca,quarta,quinta,sexta,sabado,domingo;
    }
    public void dia(){
        System.out.println("\nEm que dia estamos? ");
        System.out.println("Estamos em uma(um) " +Dias.quarta+ "-feira.");
    }    
    
}
