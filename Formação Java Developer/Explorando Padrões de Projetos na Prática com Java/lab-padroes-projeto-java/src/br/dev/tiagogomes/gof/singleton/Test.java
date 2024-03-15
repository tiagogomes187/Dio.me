package br.dev.tiagogomes.gof.singleton;

public class Test {
	public static void main(String[] args) {

		// Testes reacionados ao Design Pttern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println("1º lazy " + lazy);

		lazy = SingletonLazy.getInstancia();
		System.out.println("2º lazy " + lazy);

		System.out.println("---------");

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println("1º eager " + eager);

		eager = SingletonEager.getInstancia();
		System.out.println("2º eager " + eager);

		System.out.println("---------");

		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println("1º holder " + holder);

		holder = SingletonLazyHolder.getInstancia();
		System.out.println("2º holder " + holder);
	}
}
