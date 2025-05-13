/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author ribei
 */
import java.util.Scanner;
public class CalculadoraEspacoTempo {
    Scanner teclado = new Scanner(System.in);

    //entrada de dados
    public void calculadora(){
         //entrada de dados
         System.out.println("=== Calculo do volume de um objeto ====");
         
         System.out.println("Digite a Largura (cm): ");
         double largura = teclado.nextDouble();
         
         System.out.println("Digite a Altura (cm): ");
         double altura = teclado.nextDouble();
         
         System.out.println("Digite o comprimento (cm) :");
         double comprimento = teclado.nextDouble();
         
         //alculo do volume;
         double volume = largura * altura * comprimento;
         
         //Saida do resultado
         System.out.println("\nO volume do objeto e : "+ volume + "cm");

         
         teclado.close();
    }
    
}
