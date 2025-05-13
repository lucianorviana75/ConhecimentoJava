/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplotry;

/**
 *
 * @author ribei
 */
import java.util.Scanner;

public class ExemploTry {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        try{
            System.out.println("Digite um numero ");
            int numero = Integer.parseInt(teclado.nextLine());
            int resultado = 10/numero;
            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: Nao e possivel dividir por zero. ");
        }catch(NumberFormatException e){
            System.out.println("Erro: Voce deve digitar um numero valido. ");
        }finally{
            System.out.println("Fim do programa. ");
            teclado.close();
        }
    }
}
