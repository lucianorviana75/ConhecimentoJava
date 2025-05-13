/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

/**
 *
 * @author ribei
 */
public class RetornoCalculadora {
    public static void main(String[] args) {
        
        Calculadora2 c1 = new Calculadora2();
        CalculadoraEspacoTempo C1 = new CalculadoraEspacoTempo();
        C1.calculadora();
        
        
        
        
        //Chamada sem static
        System.out.println("A soma sem static e "+ c1.somar2(7, 8));
       //Chamada com static não precisa criar um objeto .
        System.out.println("A soma dos numeros com static, foi "+ Calculadora2.somar(4, 4));
        System.out.println("O metodo quadrado do valor acrescentado foi "+ Calculadora2.calcularMetodoQuadrado(7));
        System.out.println("A area circular do valor acrescentado foi "+ Calculadora2.calcularAreaCirculo(4));
        System.out.println("A nome do projeto e " + Calculadora2.nome("Luciano")+" E a soma e " + Calculadora2.somar(5, 7));
        System.out.println("A nome do projeto e " + Calculadora2.nome("Marcos")+" E a soma e " + Calculadora2.somar(8, 7));
        System.out.println("A nome do projeto e " + Calculadora2.nome("Filipe")+" E a soma e " + Calculadora2.somar(6, 7));
        
         
                
    }
    
}

