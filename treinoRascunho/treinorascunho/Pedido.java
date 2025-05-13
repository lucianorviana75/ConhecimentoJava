/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

import com.mycompany.treinorascunho.StatusPedido.Pedidos;

/**
 *
 * @author ribei
 */
public class Pedido {
    Pedidos status = Pedidos.ENVIANDO;
    public void retorno(){
        System.out.println("Status: "+ status.getDescricao());
    }
}
