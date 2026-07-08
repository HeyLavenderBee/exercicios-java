package interfaces.interfacefuncional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
	public static void main() {
		List<User> users = List.of(new User("Maria", 21), new User("Ana", 19));
		users.forEach((User user) -> {
			System.out.println(user);
		}); //é possível tirar as chaves também (já que é uma linha, e a tipagem User
		//um jeito mais simples ainda é assim:
		users.forEach(System.out::println);
		
		printStringValue(user -> user.name(), users);
	}
	
	private static void printStringValue(Function<User, String> callback, List<User> users) {
		users.forEach(u -> System.out.println(callback.apply(u)));
	}
}
