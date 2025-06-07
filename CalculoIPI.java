/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoipi;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class CalculoIPI {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Ler a porcentagem do IPI
        System.out.print("Digite a porcentagem do IPI (ex: 5 para 5%): ");
        double ipi = scanner.nextDouble();

        // Passo 2: Ler os dados da Peça 1
        System.out.println("\nDados da Peça 1:");
        System.out.print("Código: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário: R$ ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quant1 = scanner.nextInt();

        // Passo 2: Ler os dados da Peça 2
        System.out.println("\nDados da Peça 2:");
        System.out.print("Código: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário: R$ ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quant2 = scanner.nextInt();

        // Passo 3: Calcular o valor total com IPI
        double valorSemIPI = (valor1 * quant1) + (valor2 * quant2);
        double valorComIPI = valorSemIPI * (ipi / 100 + 1);

        // Passo 4: Exibir o resultado
        System.out.printf("\nValor total sem IPI: R$ %.2f%n", valorSemIPI);
        System.out.printf("Valor total com IPI (%.2f%%): R$ %.2f%n", ipi, valorComIPI);

        scanner.close();
    }
}
   
       
    
