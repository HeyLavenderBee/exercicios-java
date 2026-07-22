package streamapi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Double> numeroAleatorio = () -> Math.random();
		
		List<Double> listaNumerosAleatorios = Stream.generate(numeroAleatorio).limit(5).toList();
		
		listaNumerosAleatorios.forEach(s -> System.out.println(String.format("%.2f", s))); // mas pode ser System.out::println
	}
}
