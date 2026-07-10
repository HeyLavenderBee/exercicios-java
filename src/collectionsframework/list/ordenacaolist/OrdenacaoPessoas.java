package collectionsframework.list.ordenacaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
	private List<Pessoa> listaPessoas;
	
	public OrdenacaoPessoas() {
		listaPessoas = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaPessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
		ordenacaoPessoas.adicionarPessoa("Eduardo", 19, 1.75);
		ordenacaoPessoas.adicionarPessoa("Renato", 45, 1.82);
		ordenacaoPessoas.adicionarPessoa("Maria", 13, 1.45);
		ordenacaoPessoas.adicionarPessoa("Socorro", 68, 1.63);
		
		System.out.println(ordenacaoPessoas.ordenarPorIdade());
		System.out.println(ordenacaoPessoas.ordenarPorAltura());
	}
}
