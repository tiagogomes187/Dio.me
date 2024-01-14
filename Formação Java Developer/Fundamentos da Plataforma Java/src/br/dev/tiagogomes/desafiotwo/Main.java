package br.dev.tiagogomes.desafiotwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, media;

		A = sc.nextDouble();
		B = sc.nextDouble();

		media = (A * 3.5 + B * 7.5 )/11;
		System.out.printf("MEDIA = %.5f",  media   );
		System.out.println();


		sc.close();
	}
}
