package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0.0;
		// Loop infinito para manter o programa em execução até que o usuário decida sair
		loop:
		while (true) {

			int opcao = scanner.nextInt();
			// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:

			// Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
			switch (opcao) {
				case 1:
					saldo = scanner.nextDouble() + saldo;
					System.out.println("Saldo atual: " + saldo);
					break;
				case 2:
					double saque = scanner.nextDouble();
					if (saque > saldo) {
						System.out.println("Saldo insuficiente.");
					} else if (saque <= saldo) {
						saldo = saldo - saque;
						System.out.println("Saldo atual: " + saldo);
					}

					break;
				case 3:
					System.out.println("Saldo atual: " + saldo);
					break;
				case 0:
					System.out.println("Programa encerrado.");
					break loop;


				// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}

		}

	}
}