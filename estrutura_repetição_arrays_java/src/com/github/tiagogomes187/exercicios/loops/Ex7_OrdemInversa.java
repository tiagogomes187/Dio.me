package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex7_OrdemInversa {

    public static void main(String[] args) {

        int [] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){

            System.out.print(vetor[count] + " / ");
            count++;
        }

        System.out.println("\n");
        System.out.print("Vetor na ordem inversa: ");

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " / ");
        }
    }
}
