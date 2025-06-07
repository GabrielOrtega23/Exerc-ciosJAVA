/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesaldo2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class ReajusteSaldo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para entrada
        
        // Solicita o saldo atual
        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();
        
        // Calcula o reajuste de 1%
        double saldoReajustado = saldo * 1.01;
        
        // Mostra o resultado
        System.out.printf("Saldo antes do reajuste: R$ %.2f%n", saldo);
        System.out.printf("Saldo após 1%% de reajuste: R$ %.2f%n ", saldoReajustado);
        
        scanner.close(); // Fecha o Scanner
    }
}
