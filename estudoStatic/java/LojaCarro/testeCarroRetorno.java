/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaCarro;

/**
 *
 * @author ribei
 */
public class testeCarroRetorno {
    public static void main(String[] args) {
        
        TesteCarro C1 = new TesteCarro("Saveiro",1975 );
        TesteCarro C2 = new TesteCarro("Fusca",1978 );
        //C1.anoCompra = 2009;não consegue alterar o valor
        System.out.printf("\nO carro %s foi criado em %d. ",C1.getNome(),C1.getAno());
        System.out.printf("\nO carro %s foi criado em %d. ",C2.getNome(),C2.getAno());
        System.out.printf("\nO carro %s foi vendido no ano de %d. ",C1.getNome(),C1.anoCompra);
        System.out.printf("\nO carro %s foi vendido no ano de %d. ",C2.getNome(),C1.anoCompra);
        
    }
    
}
