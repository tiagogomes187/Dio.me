package br.dev.tiagogomes.escola;

public class Escola {
	public static void main(String[] args) {

		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);

		Aluno bruno = new Aluno("Bruno", 17);

		System.out.println(felipe.toString());
		System.out.println(bruno.toString());
	}
}
