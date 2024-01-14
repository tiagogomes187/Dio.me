package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

/**
 * @author tiago
 */

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes;
*/
public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = sc.next();

            if(letra.matches("[b-df-hj-np-tvxz]")) {
                consoantes[contador] = letra;
                quantidadeConsoantes++;
            }

            contador++;

        }while (contador < consoantes.length);

        System.out.print("Consoantes: ");
        for ( String consoante : consoantes ) {
            if(consoante != null) {
                System.out.println(consoante + "");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

        sc.close();
    }

}
