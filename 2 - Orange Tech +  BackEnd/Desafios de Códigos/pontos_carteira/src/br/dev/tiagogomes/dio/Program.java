package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int velocidade = sc.nextInt();
		int multas = sc.nextInt();

		// TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade

		if (velocidade <= 80) {
			multas = multas;
		} else if (velocidade > 80) {
			multas = multas + 1;
		}

		// TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação
		if (multas <= 2) {
			System.out.println(multas + " multas. Nao levou pontos na carteira");
		} else {
			System.out.println(multas + " multas. Levou pontos na carteira");
		}
		sc.close();
	}
}
