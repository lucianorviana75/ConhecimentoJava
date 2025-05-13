/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.energiarelatividade;

/**
 *
 * @author ribei
 */

import java.util.Scanner;
public class EnergiaRelatividade {
    public static void main(String[] args) {
    // Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Constante: velocidade da luz no vácuo (m/s)
    final double VELOCIDADE_DA_LUZ = 3.0e8; // 3 × 10^8

    try {
        // Solicita a massa ao usuário
        System.out.print("Digite a massa em kg: ");
        double massa = scanner.nextDouble();

        // Calcula a energia usando E = mc^2
        double energia = massa * Math.pow(VELOCIDADE_DA_LUZ, 2);

        // Exibe o resultado
        System.out.println("Energia equivalente (E = mc²): " + energia + " joules");

    } catch (Exception e) {
        System.out.println("Erro: Entrada inválida.");
    }

    // Fecha o scanner
    scanner.close();
    }
}
    

