package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();

        for (int i = fatorial; i > 1; i--) {
            fatorial *= i - 1;
        }

        
        System.out.println(fatorial);

    }
}
