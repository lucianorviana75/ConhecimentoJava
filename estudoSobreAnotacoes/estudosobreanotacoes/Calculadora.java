/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudosobreanotacoes;

/**
 *
 * @author ribei
 */
import java.util.ArrayList;
import java.util.List;
public class Calculadora {
    @Deprecated
    public int somarAntigo(int a, int b){
        //Método velho ,preferencia e usar lambdas agora.
        return a + b;
    } 
    @SafeVarargs
    public final <T> void imprimirTodos(T... elementos){
        for (T e : elementos){
            System.out.println(e);
        }
    }
    @SuppressWarnings({"unchecked", "unchecked"})
    public List<String> criarLista(){
        List lista = new ArrayList();
    //Tipo sem <String>, mas suprimimos o alerta
        
        lista.add("Item 1");
        lista.add("Item 2");
        return lista;
    }
}
