package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paginas = sc.nextInt();
		int paginasLidas = 3;

		// TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

		int result = paginas / paginasLidas;

		System.out.println(result + " dias");

		sc.close();
	}
}
