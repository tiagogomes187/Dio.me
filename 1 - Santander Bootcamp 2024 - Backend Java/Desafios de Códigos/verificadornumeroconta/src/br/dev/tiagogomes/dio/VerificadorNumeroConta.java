package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class VerificadorNumeroConta {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String numeroConta = "";
		try {
			numeroConta = scanner.next();
			verificarNumeroConta(numeroConta);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

	private static void verificarNumeroConta(String numeroConta) {
		// Verifica se o número da conta tem 8 caracteres
		if (numeroConta.length() != 8) {
			throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
		}
		System.out.println("O numero da conta e valido.");
	}

}