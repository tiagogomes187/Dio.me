package br.dev.tiagogomes.application;

import br.dev.tiagogomes.entities.Pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("Marcos", "123");

		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");

		//e como definir o nome e cpf do marcos ?

		//imprimindo o marcos sem o nome e cpf

		System.out.println(marcos.toString());
		System.out.println(marcos.imprimeEndereco());
	}
}
