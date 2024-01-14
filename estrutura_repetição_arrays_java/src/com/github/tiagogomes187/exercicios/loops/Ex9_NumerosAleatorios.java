package com.github.tiagogomes187.exercicios.loops;

import java.util.Random;

/**
 * @author tiago
 */

/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[6];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(60);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nNúmeros aleatórios: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.println("\nNúmeros Antecessores: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero - 1)  + " ");
        }

        System.out.println("\nNúmeros sucessores: ");
        for ( int numero : numerosAleatorios ) {
            System.out.print((numero +1)  + " ");
        }
    }

}
