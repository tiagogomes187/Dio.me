package br.dev.tiagogomes.gof;

/**
 * Singleton "Lazy Holder",
 *
 * @author tiagogomes.com.br
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
