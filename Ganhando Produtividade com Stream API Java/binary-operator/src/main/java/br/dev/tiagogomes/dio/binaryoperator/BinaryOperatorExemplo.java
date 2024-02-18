package br.dev.tiagogomes.dio.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

		BinaryOperator<Integer> somar = Integer::sum;

		int resultado = numeros.stream().reduce(0, somar);

		System.out.println("A soma do números é: " + resultado);
	}
}
