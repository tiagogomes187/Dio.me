package br.dev.tiagogomes.gof;

/**
 * Singleton "preguiçoso",
 *
 * @author tiagogomes.com.br
 */
public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
