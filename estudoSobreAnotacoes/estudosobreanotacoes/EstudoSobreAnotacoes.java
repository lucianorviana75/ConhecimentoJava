/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudosobreanotacoes;

import java.util.List;

/**
 *
 * @author ribei
 */
public class EstudoSobreAnotacoes {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        //Usando o metodo antigo(vai aparecer um aviso mais funciona).
        int resultadoAntigo = calc.somarAntigo(5, 3);
        System.out.println("Resultado Antigo: " + resultadoAntigo);
        
        //Usando Lambda e a interface funcional.
        Operacao soma = (a,b)-> a + b;
        System.out.println("Resultado novo com lambda: " + soma.calcular(5, 3));
        
        //Testar varargs com @SafeVarargs 
        calc.imprimirTodos("um","Dois","Tres");
        
        //Testando @SuppressWarning
        List<String> lista = calc.criarLista();
        System.out.println("Lista criada: "+ lista);
    }    
    
}
