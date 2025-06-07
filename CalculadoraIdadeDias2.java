/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraidadedias2;

/**
 *
 * @author Administrator
 */

  import java.util.Scanner;
public class CalculadoraIdadeDias2 {




    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê os anos
        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();
        
        // Solicita e lê os meses
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        
        // Solicita e lê os dias
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();
        
        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
        
        // Calcula o total de dias
        int totalDias = (anos * 365) + (meses * 30) + dias;
        
        // Exibe o resultado
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias equivalem a " + totalDias + " dias.");
    }
}
      
    

