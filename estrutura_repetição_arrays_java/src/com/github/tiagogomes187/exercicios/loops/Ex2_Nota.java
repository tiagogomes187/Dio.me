package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
        }

        scanner.close();
    }
}
