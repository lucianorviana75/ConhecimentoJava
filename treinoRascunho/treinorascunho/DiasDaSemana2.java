/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

import com.mycompany.treinorascunho.DiaDaSemana.Dias;

/**
 *
 * @author ribei
 */
public class DiasDaSemana2 {
    Dias hoje = Dias.domingo;
    
    public void resultado(){
        switch(hoje){
            case segunda -> System.out.println("\nSegunda-feira, estamos comeco da semana! ");
            case sexta -> System.out.println("\nSexta-feira, Quase fim de semana!");
            case sabado  -> System.out.println("\nSabado, Fim de semana!");
            case domingo  -> System.out.println("\nDomingo, Fim de semana!");
            default -> System.out.println("\nOutro dia da semana.");
        }
    }
}
