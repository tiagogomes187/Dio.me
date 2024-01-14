package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        qtdNumeros = scanner.nextInt();

        int count = 0;

        do {

            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero % 2 == 0) qtdPares++;
            else qtdImpares++;
            count++;

        }while(count < qtdNumeros);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

    }
}
