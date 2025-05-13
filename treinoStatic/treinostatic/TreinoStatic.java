/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.treinostatic;



//import static com.mycompany.treinostatic.Pacote1.contador;
//import static com.mycompany.treinostatic.Pacote1.incrementar;



/**
 *
 * @author ribei
 */
public class TreinoStatic {

    public static void main(String[] args) {
        Pacote1 P1 = new Pacote1();
        Pacote1 P2 = new Pacote1();
        P1.cor = "Azul";
        P2.cor = "Amarelo";
        
        System.out.println("Carro de cor "+ P1.cor);
        System.out.println("Carro de cor "+ P2.cor);
        System.out.println("E o "+ Pacote1.manual);
        System.out.println("E o "+ P1.manual);
        System.out.println("E o "+ P2.manual);
        
    }   
}
