package designpatterns.singleton;

/**
 * Singleton "lazy holder".
 * 
 * @author heylavenderbee
 */
public class SingletonLazyHolder {
	private static class InstanceHolder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
}
