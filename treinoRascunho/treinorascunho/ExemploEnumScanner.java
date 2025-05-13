/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

/**
 *
 * @author ribei
 */
import java.util.Scanner;
public class ExemploEnumScanner {
    Scanner scanner = new Scanner(System.in);
    public enum Cor{
        VERMELHO,AZUL,VERDE,AMARELO;
    }
    public void retorno(){
        System.out.println("Escolha uma cor pelo numero: ");
        for (Cor cor : Cor.values()){
            System.out.println(cor.ordinal()+ 0 + " - "+ cor);
        }
        System.out.println("Digite o numero da cor escolhida: ");
        int escolha = scanner.nextInt();
        if(escolha >= 0 && escolha < Cor.values().length){
            Cor corEscolhida = Cor.values()[escolha];
            System.out.println("Voce escolheu: "+ corEscolhida);
        }else{
            System.out.println("Opcao invalida. ");
        }
        
    }
}
