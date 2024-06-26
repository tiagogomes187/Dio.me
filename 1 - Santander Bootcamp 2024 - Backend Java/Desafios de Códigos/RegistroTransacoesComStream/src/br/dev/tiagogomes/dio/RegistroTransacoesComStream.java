package br.dev.tiagogomes.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double saldo = scanner.nextDouble();
		int quantidadeTransacoes = scanner.nextInt();
		List<Transacao> transacoes = new ArrayList<>();

		for (int i = 1; i <= quantidadeTransacoes; i++) {
			char tipoTransacao = scanner.next().charAt(0);
			double valorTransacao = scanner.nextDouble();

			Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
			transacoes.add(transacao);

			if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
				saldo += valorTransacao;
			} else if (transacao.getTipo() == 'S' || transacao.getTipo() == 's') {
				saldo -= valorTransacao;
			}
		}

		System.out.print("\nSaldo: " + saldo);
		System.out.println("\nTransacoes:");

		// Crie um fluxo (stream) a partir da lista de transações:
		transacoes.stream()

				// Mapeie cada transação para uma string formatada:
				.map(transacao -> transacao.getTipo() + " de " + transacao.getValor())

				// Colete os elementos do fluxo em uma lista:
				.collect(Collectors.toList())

				// Para cada elemento da lista, imprime no console:
				.forEach(System.out::println);

		scanner.close();
	}
}

class Transacao {
	private char tipo;
	private double valor;

	public Transacao(char tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public char getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}
}
