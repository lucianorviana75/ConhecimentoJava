/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaCarro;

/**
 *
 * @author ribei
 */
public class RetornoLojaCarros {
    private static void imprimeMensagem(){
        System.out.println("Sejam bem vindos");
    }
    public static void main(String[] args) {
        imprimeMensagem();
        
       
        
        LojaCarros carro1 = new LojaCarros("Ferrari",1975 );
        LojaCarros carro2 = new LojaCarros("Fusca",1974 );
        carro1.setAno(2000);
        //Alteração feito usando static ,modifica todos.
        carro1.anoCompra = 2007;
        
        
        
        //foi usado static
        System.out.println("Nome do carro: " +carro1.getNome());
        System.out.println("Ano de fabricacao: " +carro1.getAno());
        
        System.out.println("Ano de compra: " +carro1.anoCompra);
        
        
        System.out.println("Nome do carro: " +carro2.getNome());
        System.out.println("Ano de fabricacao: " +carro2 .getAno());
        //foi usado static
        System.out.println("Ano de compra: " +carro2.anoCompra);
        
        
        
        
        
    }
   
}
