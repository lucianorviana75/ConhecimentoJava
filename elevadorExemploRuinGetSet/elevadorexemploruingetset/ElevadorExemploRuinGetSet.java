/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elevadorexemploruingetset;

/**
 *
 * @author ribei
 */
public class ElevadorExemploRuinGetSet {

    public static void main(String[] args) {
        Elevador passageiro1 = new Elevador(2, 5, 4,13);
        passageiro1.getAndarAtual();
        passageiro1.getCapacidade();
        passageiro1.getPessoasPresentes();
        passageiro1.getTotalAndares();

        passageiro1.setAndarAtual(-9);
        passageiro1.setCapacidade(1000);
        passageiro1.setPessoasPresentes(50);
        passageiro1.setTotalAndares(500);
      
        System.out.println("O elevador esta no "+ passageiro1.getAndarAtual()+ " andar.");
        System.out.println("O predio tem "+ passageiro1.getTotalAndares()+" de andares");
        System.out.println("O elevador tem capacidade para "+ passageiro1.getCapacidade()+ " pessoa(s)");
        System.out.println("Neste elevador ja tem um total de "+ passageiro1.getPessoasPresentes()+ " pessoa.(s)");

    }
}
