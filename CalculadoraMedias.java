/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoramedias;

/**
 *
 * @author Administrator
 */
public class CalculadoraMedias {

    public static void main(String[] args) {
        // Calculando a média do primeiro conjunto
        double media1 = (8 + 9 + 7) / 3;
        
        // Calculando a média do segundo conjunto
        double media2 = (4 + 5 + 6) / 3;
        
        // Calculando a soma das médias
        double somaMedias = (media1 + media2);
        
        // Calculando a média das médias
        double mediaDasMedias = somaMedias / 2;
        
        // Exibindo os resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
    
    
    }

    

