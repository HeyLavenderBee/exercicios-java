package collectionsframework.list.pesquisalist.exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> listaNumeros;
	
	public SomaNumeros() {
		this.listaNumeros = new ArrayList<Integer>();
	}
	
	public void adicionarNumero(int numero) {
		listaNumeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer n : listaNumeros) {
			soma += n;
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = this.listaNumeros.getFirst();
		for(Integer n : listaNumeros) {
			if(n > maiorNumero) {
				maiorNumero = n;
			}
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = this.listaNumeros.getFirst();
		for(Integer n : listaNumeros) {
			if(n < menorNumero) {
				menorNumero = n;
			}
		}
		return menorNumero;
	}
	
	public void exibirNumeros() {
		for(Integer n : listaNumeros) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		somaNumeros.adicionarNumero(5);
		somaNumeros.adicionarNumero(-2);
		somaNumeros.adicionarNumero(143);
		somaNumeros.adicionarNumero(12);
		somaNumeros.adicionarNumero(87);
		somaNumeros.exibirNumeros();
		System.out.println("Soma números: "+somaNumeros.calcularSoma());
		System.out.println("Maior número: "+somaNumeros.encontrarMaiorNumero());
		System.out.println("Menor número: "+somaNumeros.encontrarMenorNumero());
	}
}
