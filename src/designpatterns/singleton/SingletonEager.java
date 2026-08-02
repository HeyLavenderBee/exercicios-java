package designpatterns.singleton;

/**
 * Singleton "apressado".
 * 
 * @author heylavenderbee
 */
public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
