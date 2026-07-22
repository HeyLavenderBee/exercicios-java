package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		List<String> palavras = Arrays.asList("Peggy Carter", "Jarvis", "Go", "Python", "Um");
		
		// processa uma condição que retorna true ou false
		Predicate<String> maiorCincoCaracteres = palavra -> palavra.length() > 5;
		
		// o filter serve para mostrar apenas valores verdadeiros
		palavras.stream().filter(maiorCincoCaracteres).forEach(System.out::println);;
	}
}
