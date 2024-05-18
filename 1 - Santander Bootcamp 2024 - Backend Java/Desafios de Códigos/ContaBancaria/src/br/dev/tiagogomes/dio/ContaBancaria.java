package br.dev.tiagogomes.dio;

import java.util.Scanner;

class ContaBancaria {
	private double saldo;

	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Método para realizar depósito na conta:
	public void depositar(double valor) {
		// Aqui é incrementado o saldo da conta com o valor do depósito:
		this.saldo += valor;
		// É impressa uma mensagem indicando que o depósito foi feito:
		System.out.println("Depósito feito.");
	}

	// Método para realizar saque da conta:
	public void sacar(double valor) {
		// Verificamos se o valor do saque é maior que o saldo disponível na conta:
		if (valor > saldo) {
			// Se for, imprime uma mensagem informando que o saque não pode ser realizado por saldo insuficiente:
			System.out.println("Saldo insuficiente. Saque não realizado.");
		} else {
			// Caso contrário, realiza o saque subtraindo o valor do saldo da conta:
			this.saldo -= valor;
			// Imprime uma mensagem indicando que o saque foi feito:
			System.out.println("Saque feito.");
		}
	}

	// Método para obter o saldo atual da conta:
	public double getSaldo() {
		return saldo;
	}
}

class MainContaBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double saldoInicial = scanner.nextDouble();

		ContaBancaria conta = new ContaBancaria(saldoInicial);

		double valorDeposito = scanner.nextDouble();
		conta.depositar(valorDeposito);

		System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

		double valorSaque = scanner.nextDouble();
		conta.sacar(valorSaque);

		System.out.printf("Saldo atual: %.1f\n", conta.getSaldo());

		// Fechamos o scanner para evitar vazamento de recursos:
		scanner.close();
	}
}
