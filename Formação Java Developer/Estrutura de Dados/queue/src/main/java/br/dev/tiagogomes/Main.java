package br.dev.tiagogomes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Queue<Carro> queueCarros = new LinkedList<>();

		queueCarros.add(new Carro("Ford"));
		queueCarros.add(new Carro("Chevrolet"));
		queueCarros.add(new Carro("Fiat"));

		System.out.println(queueCarros.add(new Carro("Peugeot")));
		System.out.println(queueCarros);

		System.out.println(queueCarros.offer(new Carro("Renault")));
		System.out.println(queueCarros);

		System.out.println(queueCarros.peek());
		System.out.print("peek => ");
		System.out.println(queueCarros);

		System.out.println(queueCarros.poll());
		System.out.print("poll => ");
		System.out.println(queueCarros);
		System.out.print("Verifica se vazio => " + queueCarros.isEmpty() + "\n");

		System.out.print("Tamanho da fila => " + queueCarros.size());
	}
}