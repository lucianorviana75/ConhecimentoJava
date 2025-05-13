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
public class Exemplo3DeOU {
    Scanner scanner = new Scanner(System.in);
    
    private int idade;
    boolean comportamentoInadequado=false;
    
    public void retorno(){
        System.out.println("Qantos anos tem ?");
        idade = scanner.nextInt();
        if(idade < 18 || comportamentoInadequado){
            System.out.println("Spervisao necessaria .");
        }else{
            System.out.println("Pode seguir sem supervisao.");
        }
    }
}
