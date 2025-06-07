/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorasalariosminimos;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class CalculadoraSalariosMinimos {

    public static void main(String[] args) {
      // Valor fixo do salário mínimo (R$ 1000,00)
         double salariominimo = 1000.00;
        
        Scanner scanner = new Scanner(System.in);

        // Ler apenas o salário do usuário
        System.out.print("Digite o valor do seu salário: R$ ");
        double salarioUsuario = scanner.nextDouble();

        // Calcular quantos salários mínimos
        double quantidade = salarioUsuario / salariominimo;

        // Mostrar resultado
        System.out.printf("\nVocê recebe %.2f salários mínimos (1 SM = R$ 1000,00).%n", quantidade);
        
        scanner.close();
    }
}