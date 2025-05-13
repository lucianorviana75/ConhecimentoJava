/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteum;
import java.util.Scanner;
/**
 *
 * @author ribei
 */
public class Exemplo2DeOU {
    Scanner scanner = new Scanner(System.in);
    private double temperatura;
    
    
    
    public void retorno(){
        System.out.println("Qual e a temperatura ?");
        temperatura = scanner.nextDouble();
        if(temperatura < 10 || temperatura > 45 ){
            System.out.println("Temperatura fora da zona de seguranca.");
        }else{
            System.out.println("Temperatura segura. ");
        }
    }
    
   
}
