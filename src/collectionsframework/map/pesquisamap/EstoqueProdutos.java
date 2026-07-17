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
		double valorTotal = 0.0;
		if(!listaProdutos.isEmpty()) {
			for(Produto p : listaProdutos.values()) {
				valorTotal += p.getPreco() * p.getQuantidade();
			}
		}
		return valorTotal;
	}
	
	public Produto obterProdutoMaisCaro() {
		double maiorValor = Double.MIN_VALUE;
		Produto produtoMaisCaro = null;
		if(!listaProdutos.isEmpty()) {
			for(Produto p : listaProdutos.values()) {
				if(p.getPreco() > maiorValor) {
					maiorValor = p.getPreco();
					produtoMaisCaro = p;
				}
			}
		}
		return produtoMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		double menorValor = Double.MAX_VALUE;
		Produto produtoMaisBarato = null;
		if(!listaProdutos.isEmpty()) {
			for(Produto p : listaProdutos.values()) {
				if(p.getPreco() < menorValor) {
					menorValor = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorValorTotal = null;
		double maiorValorTotal = Double.MIN_VALUE;
		if(!listaProdutos.isEmpty()) {
			for(Produto p : listaProdutos.values()) {
				if((p.getPreco() * p.getQuantidade()) > maiorValorTotal) {
					produtoMaiorValorTotal = p;
				}
			}
		}
		return produtoMaiorValorTotal;
	}
	
	public static void main(String[] args) {
		EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
		
		estoqueProdutos.adicionarProduto(1L, "Batata", 55, 1.4);
		estoqueProdutos.adicionarProduto(2L, "Tomate", 23, 2.85);
		estoqueProdutos.adicionarProduto(3L, "Repolho", 20, 3.2);
		estoqueProdutos.adicionarProduto(4L, "Beterraba", 62, 3.1);
		
		System.out.println("Valor total no estoque: R$"+estoqueProdutos.calcularValorTotalEstoque());
		System.out.println("Produto mais caro: "+estoqueProdutos.obterProdutoMaisCaro());
		System.out.println("Produto mais barato: "+estoqueProdutos.obterProdutoMaisBarato());
		System.out.println("Produto maior valor total no estoque: "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
	}
}
