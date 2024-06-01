package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int mesada = 50;

		int result = entrada * mesada;

		System.out.println("Voce tera "+ result +" reais");

		sc.close();
	}
}
