package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class ControleSimplesDeSaques {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double limiteDiario = scanner.nextDouble();

		for (int i = 0; i <= limiteDiario; i++) {
			double saque = scanner.nextDouble();
			if (saque == 0) {
				System.out.println("Transacoes encerradas.");
				break;
			} else if (saque > limiteDiario) {
				System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
				break;
			} else {
				double result = limiteDiario - saque;
				System.out.printf("Saque realizado. Limite restante: %.1f\n", result);
			}

		}

		scanner.close();
	}
}