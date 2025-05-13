/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojaproduto;

/**
 *
 * @author ribei
 * O programa deve:
    .Armazenar os nomes, preços e quantidades de 3 produtos.

    .Calcular o valor total de cada produto (preço * quantidade).

    .Mostrar o total geral da compra.

    .Usar try-catch para tratar erros de índice.
*/

import java.util.Scanner;
public class LojaProduto {
    Scanner teclado = new Scanner(System.in);
    
    //Constante: número fixo de produtos
    public static final int QUANTIDADE_PRODUTOS = 3;
    
    //Arrays para armazenar os dados dos produtos:
    static String[]nome = new String[QUANTIDADE_PRODUTOS];
    static double[]preco = new double[QUANTIDADE_PRODUTOS];
    static int[]quantidade = new int[QUANTIDADE_PRODUTOS];
    
    //Método principal:
    public void total(){
        double totalGeral = 0;
        
        try{
            //Cadastro dos produtos:
            for(int i = 0;i< QUANTIDADE_PRODUTOS;i++){
                System.out.println("Produto" +(i+1) +":");
                
                System.out.println("Nome: ");
                nome[i] = teclado.nextLine();
                
                System.out.println("Preco: ");
                preco[i] = Double.parseDouble(teclado.nextLine());
                
                System.out.println("Quantidade: ");
                quantidade[i] = Integer.parseInt(teclado.nextLine());
                
                System.out.println();
                
            }
            //Cálculo e exibicao dos totais
            System.out.println("Resumo da Compra");
            for(int i = 0;i< QUANTIDADE_PRODUTOS;i++ ){
                
                double totalProduto = preco[i]* quantidade[i];
                totalGeral += totalProduto;
                
                System.out.printf("%s - R$ %.2f X %d = R$ %.2f\n", nome[i], preco[i], quantidade[i], totalProduto);
                
            }
            System.out.printf("\nTotal geral da compra: R4 %.2f\n", totalGeral);
        }catch(Exception e){
            System.out.println("Erro ao processar os dados: " + e.getMessage());
        }
        teclado.close();
    }
    
}
