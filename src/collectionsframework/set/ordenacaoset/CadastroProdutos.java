package collectionsframework.set.ordenacaoset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> listaProdutos;
	
	public CadastroProdutos() {
		listaProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		listaProdutos.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(listaProdutos);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "Produto 1", 15d, 5);
		cadastroProdutos.adicionarProduto(4L, "Produto 2", 38d, 8);
		cadastroProdutos.adicionarProduto(29L, "Produto 3", 11d, 1);
		cadastroProdutos.adicionarProduto(1L, "Produto 4", 19d, 23);
		
		System.out.println("Produtos ordenados por nome:");
		System.out.println(cadastroProdutos.exibirProdutosPorNome());
		System.out.println();
		System.out.println("Produtos ordenados por preço:");
		System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
