package br.dev.tiagogomes.application;

import br.dev.tiagogomes.enums.EstadoBrasileiro;

public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro e : EstadoBrasileiro.values()){
			System.out.println(e.imprimeEstado());
		}

		System.out.println("----");

		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());


	}
}
