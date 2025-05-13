/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

/**
 *
 * @author ribei
 */
public class AulaNivel {
    enum Nivel{
        Baixo,
        Medio,
        Alto
    }    
    public void resposta(){
        System.out.println("Em que nivel voce esta ?");    
        System.out.println("Eu estou no nivel "+Nivel.Alto);
    }    
    
}
