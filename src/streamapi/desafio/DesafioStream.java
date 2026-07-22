package streamapi.desafio;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Arrays;

public class DesafioStream {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		// Desafio 1 - Mostrar a lista na ordem numérica
		desafio1(numeros);
		
		// Desafio 2 - Imprima a soma dos números pares da lista
		desafio2(numeros);
		
		// Desafio 3 - Verifique se todos os números da lista são positivos
		desafio3(numeros);
		
		// Desafio 4 - Remova todos os valores ímpares
		desafio4(numeros);
		
		// Desafio 5 - Calcule a média dos números maiores que 5
		//desafio5(numeros);
	}
	
	public static void desafio1(List<Integer> numeros) {
		numeros.stream().sorted().forEach(System.out::println);
	}
	
	public static void desafio2(List<Integer> numeros) {
		BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;
		int resultado = numeros.stream().filter(n -> n%2 == 0).reduce(0, somar);
		System.out.println(resultado);
		System.out.println();
	}
	
	public static void desafio3(List<Integer> numeros) {
		Predicate<Integer> positivo = n -> n % 2 == 0;
		numeros.stream().filter(n -> n%2==0).forEach(System.out::println);
		System.out.println();
	}
	
	public static void desafio4(List<Integer> numeros) {
		List<Integer> numerosPares = numeros.stream().toList();
		System.out.println(numerosPares);
		System.out.println();
	}
	
	public static void desafio5(List<Integer> numeros) {
		BinaryOperator<Integer> somaMaiorCinco = (n1, n2) -> (n1 + n2)/2;
		double mediaMaiorCinco = numeros.stream().filter(n -> n > 5).reduce(0, somaMaiorCinco);
		System.out.println(mediaMaiorCinco);
		System.out.println();
	}
}
