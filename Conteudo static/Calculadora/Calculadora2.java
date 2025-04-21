package Calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ribei
 */
//import java.util.Scanner;
public class Calculadora2 {
    //Scanner teclado = new Scanner(System.in);
    //private int num1;
    //private int num2;
    //private String nome;
    
    public static String nome(String nome){
        /*
        //Sem static
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        */
        return nome;
        
        
    }
    
    public static int somar(int numeroA,int numeroB){
        return numeroA + numeroB;
    }
    public static double calcularMetodoQuadrado(double lado){
      return lado * lado;
    }
    public static double calcularAreaCirculo(double raio){
        //PI = raio * raio
        //PI = 3.14
        double area = 3.14 * raio * raio;
        return area;
        
    }
    //Sem static
    public int somar2(int num1, int num2){
        return num1 + num2;
        
    }
     
}
    

