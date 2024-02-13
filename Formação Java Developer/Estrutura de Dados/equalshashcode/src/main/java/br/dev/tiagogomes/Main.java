package br.dev.tiagogomes;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Carro> listaCarros = new ArrayList<>();

		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("Volkswagen"));

		System.out.println(listaCarros.contains(new Carro("Ford")));
		System.out.println(new Carro("Ford").hashCode());
		System.out.println(new Carro("Ford1").hashCode());

		Carro c1 = new Carro("Ford");
		Carro c2 = new Carro("Chevrolet");
		System.out.println(c1.equals(c2));
	}
}
