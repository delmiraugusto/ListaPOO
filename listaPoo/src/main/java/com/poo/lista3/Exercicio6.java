package com.poo.lista3;

import java.util.Scanner;

public class Exercicio6 {

    public static void resolucao(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos andares a pirâmide terá? ");
        int andar = sc.nextInt();

        for (int i = 1; i <= andar; i++){
            for (int j = 1; j <= andar-i ; j++){
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2*i-1; k++) {
                    System.out.print("*"); 
            }
            
            System.out.println("");
        }

        sc.close();    
    }
}
