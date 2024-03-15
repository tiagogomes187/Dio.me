package br.dev.tiagogomes.gof.singleton;

/**
 * Singleton "apressado",
 *
 * @author tiagogomes.com.br
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
