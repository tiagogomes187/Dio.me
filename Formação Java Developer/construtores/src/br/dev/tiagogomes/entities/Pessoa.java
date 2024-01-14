package br.dev.tiagogomes.entities;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;

	public Pessoa() {
	}

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?

	public String imprimeEndereco(){
		StringBuilder s = new StringBuilder();
		s.append("ENDEREÇO: ");
		s.append(this.endereco);

		return s.toString();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("NOME: " + this.nome + " - " + "CPF: " +  this.cpf);


		return s.toString();
	}
}
