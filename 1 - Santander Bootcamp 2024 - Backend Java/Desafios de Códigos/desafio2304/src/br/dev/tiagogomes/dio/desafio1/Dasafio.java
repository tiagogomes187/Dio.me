package br.dev.tiagogomes.dio.desafio1;

import java.util.Scanner;

public class Dasafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DIGITE O VALOR DO SALÁRIO: ");
		float valorSalario = sc.nextFloat();
		System.out.print("DIGITE O VALOR DE BENEFÍCIOS: ");
		float valorBeneficios = sc.nextFloat();
		float valorImposto = 0;

		if (valorSalario >= 0 && valorSalario <= 1100) {
			valorImposto = 0.05F * valorSalario;
		} else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
			valorImposto = 0.10F * valorSalario;
		} else {
			valorImposto = 0.15F * valorSalario;
		}

		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println(String.format("VALOR ATUALIZADO DESCONTANDO O IMPOSTO: R$ %.2f", saida));

		sc.close();
	}
}