package collectionsframework.map.pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	private Map<Long, Produto> listaProdutos;
	
	public EstoqueProdutos() {
		listaProdutos = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		listaProdutos.put(cod, new Produto(nome, quantidade, preco));
	}
	
	public void exibirProdutos() {
		System.out.println(listaProdutos);
	}
	
	public double calcularValorTotalEstoque() {
		
	}
	
	public Produto obterProdutoMaisCaro() {
		
	}
	
	public Produto obterProdutoMaisBarato() {
		
	}
	
	public double obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1L, "Batata", 55, 1.4);
		estoqueProdutos.adicionarProduto(1L, "Batata", 55, 1.4);
		estoqueProdutos.adicionarProduto(1L, "Batata", 55, 1.4);
		estoqueProdutos.adicionarProduto(1L, "Batata", 55, 1.4);
	}
}
