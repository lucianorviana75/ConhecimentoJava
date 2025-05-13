/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.treinorascunho;

/**
 *
 * @author ribei
 */
public class StatusPedido {
    public enum Pedidos{
        PENDENTE("Pendente de pagamento "),
        PROCESSANDO("Em processamento"),
        ENVIANDO("pedido enviado"),
        ENTREGUE("Pedido entregue");
        
        private String descricao;
        
        Pedidos(String descricao){
            this.descricao = descricao;
        }
        public String getDescricao(){
            return descricao;
        }
        
    }
    
}

