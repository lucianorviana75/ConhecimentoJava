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
public class Exemplo1DeOU {
    Scanner scanner = new Scanner(System.in);
    
    private int nota;
            
    public void resposta(){
        System.out.println("Me diga uma nota :");
        nota = scanner.nextInt();
        if(nota <= 9 || nota >= 10){
          System.out.println("Nota invalida! ");  
        }else{
          System.out.println("Nota valida.");
        }
    }
}
    


  
   
  
    
    
    
    
    
    
   


