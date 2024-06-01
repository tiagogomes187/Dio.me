package br.dev.tiagogomes;

import java.util.Scanner;

public class dio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();

		// TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

		switch (tamanho) {
			case 1:
				System.out.println("/");
				break;
			case 2:
				System.out.println("//");
				break;
			case 3:
				System.out.println("///");
				break;
			case 4:
				System.out.println("////");
				break;
			case 5:
				System.out.println("/////");
				break;
			case 6:
				System.out.println("//////");
				break;
			case 7:
				System.out.println("///////");
				break;
			case 8:
				System.out.println("////////");
				break;
			case 9:
				System.out.println("/////////");
				break;
			case 10:
				System.out.println("//////////");
				break;
			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 a 10.");
		}

		sc.close();
	}
}
