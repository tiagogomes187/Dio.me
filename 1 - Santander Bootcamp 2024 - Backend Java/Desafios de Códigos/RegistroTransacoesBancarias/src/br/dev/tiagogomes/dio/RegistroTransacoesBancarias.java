package br.dev.tiagogomes.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double saldo = scanner.nextDouble();
		int quantidadeTransacoes = scanner.nextInt();

		// Crie a lista para armazenar as transações:
		List<String> transacoes = new ArrayList<>();

		// Implemente um loop 'for' para iterar sobre as transações:
		for (int i = 0; i < quantidadeTransacoes; i++) {
			char tipoTransacao = scanner.next().charAt(0);
			double valorTransacao = scanner.nextDouble();

			// Verificar o tipo de transação e atualiza o saldo da conta de acordo:
			if (tipoTransacao == 'D' || tipoTransacao == 'd') {
				saldo += valorTransacao;
				// Adicione a transação à lista:
				transacoes.add("Depósito de " + valorTransacao);

			} else if (tipoTransacao == 'S' || tipoTransacao == 's') {
				saldo -= valorTransacao;
				// Adiciona a transação à lista
				transacoes.add("Saque de " + valorTransacao);

			} else {
				System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
				i--;
			}
		}

		System.out.println("\nSaldo: " + saldo);
		System.out.println("\nTransacoes:");

		// Crie um loop 'for' para exibir cada transação na lista:
		for (int j = 0; j < transacoes.size(); j++) {
			System.out.println((j + 1) + ". " + transacoes.get(j));
		}

		// Fechamos o scanner para liberar recursos:
		scanner.close();
	}
}
