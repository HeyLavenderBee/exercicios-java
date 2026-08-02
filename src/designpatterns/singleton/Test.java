package designpatterns.singleton;

public class Test {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy); //o endereço de memória é o mesmo para os dois
	}
}
