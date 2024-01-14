package br.dev.tiagogomes.desafiofor;

import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[10];

		for (int i = 0; i <= 9; i++) {
			nomes[i] = sc.next();
			sc.nextLine();
		}
		System.out.println("----");
		System.out.println(nomes[2]);
		System.out.println(nomes[6]);
		System.out.println(nomes[8]);

		sc.close();
	}
}
