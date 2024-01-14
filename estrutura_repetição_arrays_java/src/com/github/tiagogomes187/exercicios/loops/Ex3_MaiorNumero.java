package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;


        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            soma = soma + numero;
            if (numero > maior) maior = numero;
            count++;
        } while (count < 5);

        int media = soma / count;

        System.out.println("O maior número é: " + "[ " + maior + " ]");
        System.out.println("A soma dos números é: " + "[ " + soma + " ]");
        System.out.println("A média dos números é: " + "[ " + (media) + " ]");

    }
}
