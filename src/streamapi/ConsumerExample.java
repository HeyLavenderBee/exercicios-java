package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> imprimirNumeroPar = numero -> {
			if(numero%2==0) {
				System.out.println(numero);
			}
		};
		
		//roda o lambda em cada elemento com o foreach (também pode ser .stream().forEach()
		numeros.forEach(imprimirNumeroPar);
		
		System.out.println();
		
		// Também pode ser feito da forma abaixo, com o Predicate e filter
		numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
