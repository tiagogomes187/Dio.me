package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dinheiro = sc.nextInt();

		// TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

		int doces = 2;
		int result = dinheiro * doces;

		System.out.println("O cliente obteve " + result+" doces");

		sc.close();
	}
}
