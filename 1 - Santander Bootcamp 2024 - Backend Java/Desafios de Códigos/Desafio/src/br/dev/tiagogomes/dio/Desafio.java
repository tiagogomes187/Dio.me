package br.dev.tiagogomes.dio;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Lendo os dados de Entrada:
		Scanner scanner = new Scanner(System.in);
		String titular = scanner.next();
		int numeroConta = scanner.nextInt();
		double saldo = scanner.nextDouble();
		double taxaJuros = scanner.nextDouble();

		ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

		System.out.println("Conta Poupança:");
		contaPoupanca.exibirInformacoes();
	}
}

class ContaBancaria {
	protected int numero;
	protected String titular;
	protected double saldo;

	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void exibirInformacoes() {
		DecimalFormat decimalFormat = new DecimalFormat("#.0");
		System.out.println(titular);
		System.out.println(numero);
		System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
	}
}

class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;

	public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
		super(numero, titular, saldo); // Chama o construtor da classe pai
		this.taxaJuros = taxaJuros; // Inicializa a taxa de juros
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes(); // Exibe as informações da conta bancária
		System.out.printf("Taxa de juros: %.1f%%\n", taxaJuros); // Exibe a taxa de juros
	}
}
