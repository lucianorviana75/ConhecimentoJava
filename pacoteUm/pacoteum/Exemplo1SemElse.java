/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteum;

/**
 *
 * @author ribei
 */
//Nota valida ou nota invalida.
import java.util.Scanner;
public class Exemplo1SemElse {
    Scanner scanner = new Scanner(System.in);
    private int nota;
    
    
    public void retorno(){
        System.out.println("Digite uma nota ");
        nota = scanner.nextInt();
        if(nota < 0 || nota > 10){
            System.out.println("Nota invalida !");
        }
        if(nota >= 0 && nota <= 10){
            System.out.println("Nota valida ."); 
        }
    }
            
}
