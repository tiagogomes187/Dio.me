package br.dev.tiagogomes.dio;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arquivoDoPc = sc.next();

		// TODO: Crie a condição necessária para verificar o formato do arquivo de entrada

		if (arquivoDoPc.contains(".mp3")){
			System.out.println("Salvar");
		}else {
			System.out.println("Deletar");
		}

		sc.close();
	}
}
