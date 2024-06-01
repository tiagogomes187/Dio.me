package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = sc.next();
		String array[] = new String[4];

		// TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável

		array = frase.split("/");

		System.out.print("Imovel: " + array[0] + "\n R$" + array[1] + " " + array[2] + "\n" + array[4]);
		sc.close();
	}
}