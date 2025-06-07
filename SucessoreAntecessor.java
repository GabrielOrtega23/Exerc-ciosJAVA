/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessoreantecessor;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class SucessoreAntecessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Digite um numero:");
        int num = scanner.nextInt();
        
        int antecessor = (num - 1);
        
        int sucessor = (num + 1);
        
                System.out.println("Antecessor:" + antecessor);
                System.out.println("Sucessor:" + sucessor);
                
    }
}
