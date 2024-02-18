package br.dev.tiagogomes.dio.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
	public static void main(String[] args) {
		// Criar ma lista de números inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,25);

		// Usar a Function com expressão lambda para dobrar todos os números
		Function<Integer, Integer> dobrar = numero -> numero * 2;

		// Usar a função para dobrar todos os números no Stream e armazená-lo em otra lista
		List<Integer> numerosDobrados = numeros.stream()
				.map(dobrar)
				.collect(Collectors.toList());

		// Imprimir a lista de números dobrados
		numerosDobrados.forEach(System.out::println);
	}
}

