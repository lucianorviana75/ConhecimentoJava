/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudosobreanotacoes;

/**
 *
 * @author ribei
 */
@FunctionalInterface
public interface Operacao {
    int calcular(int a, int b);
}
/*
Explicaçao : Aqui usamos @FunctionalInteface para garantir que so tenha 
um método abstrato(calcular).
*/