package one.digitalinnovation.gof;

/*
 * Singleton "Lazy Holder" .
 * @author Breno
 * 
 * */

public class SingletonLazyHolder {
	
	private static class instanceHolder {
		public static SingletonLazyHolder instancia  = new SingletonLazyHolder();
	}	

	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() { 
		return instanceHolder.instancia;
	}
}
