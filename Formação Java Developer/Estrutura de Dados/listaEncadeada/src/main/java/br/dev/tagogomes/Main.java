package br.dev.tagogomes;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		ListaEncadeada minhaListaEncadeada = new ListaEncadeada<>();

		minhaListaEncadeada.add("TESTE(1)");
		minhaListaEncadeada.add("TESTE(2)");
		minhaListaEncadeada.add("TESTE(3)");
		minhaListaEncadeada.add("TESTE(4)");


		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));

		System.out.println("------");

		System.out.println(minhaListaEncadeada);

		System.out.println(minhaListaEncadeada.remove(3));

		System.out.println(minhaListaEncadeada);

	}
}
