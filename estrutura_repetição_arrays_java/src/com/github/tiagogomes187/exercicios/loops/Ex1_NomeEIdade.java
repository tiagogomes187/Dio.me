package com.github.tiagogomes187.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Digite seu nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();


        }
        System.out.println("Fim do programa");

        sc.close();

    }


}
