/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteum;

/**
 *
 * @author ribei
 */
import java.util.Scanner;
public class Exemplo2SemElse {
    Scanner scanner = new Scanner(System.in);
    public int nota;
    public void requerimento(){
        do{
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
            if(nota < 0 || nota > 10){
                System.out.println("Nota invalida ,tente novamente.");
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Nota valida ");
    }
}
