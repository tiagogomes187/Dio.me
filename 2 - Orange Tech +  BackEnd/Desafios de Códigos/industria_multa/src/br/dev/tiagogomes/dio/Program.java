package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int velocidadeAtual = sc.nextInt();

		// TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

		if (velocidadeAtual <= 60){
			System.out.println("Nao foi multado");
		} else if (velocidadeAtual > 60) {
			System.out.println("Foi multado");
		}
		sc.close();
	}
}
