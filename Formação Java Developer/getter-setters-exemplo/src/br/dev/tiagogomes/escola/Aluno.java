package br.dev.tiagogomes.escola;

public class Aluno {

	private String nome;
	private int idade;

	public Aluno() {
	}

	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	//	@Override
//	public String toString() {
//		StringBuilder s = new StringBuilder();
//		s.append("\n [ ALUNO ]\n");
//		s.append(" ______________________________________\n");
//		s.append("| Nome do aluno: " + nome + "\n");
//		s.append(" --------------------------------------\n");
//		s.append("| Idade do aluno: " + idade + "\n");
//		s.append(" --------------------------------------\n");
//
//		return s.toString();
//	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append(" ______________________________________\n");
		s.append("| O aluno, " + this.nome + " tem " + this.idade + " anos\n");
		s.append(" --------------------------------------");

		return s.toString();
	}
}