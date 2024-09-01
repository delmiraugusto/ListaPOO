package com.poo.lista2;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if(x == 0){
            System.out.println("O número é 0");
        }
        else if (x % 2 == 0){
            System.out.println("O número é PAR");
        }
        else {
            System.out.println("O número é IMPAR");
        }

        sc.close();
        
    }

}
