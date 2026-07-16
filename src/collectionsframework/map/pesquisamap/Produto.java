package collectionsframework.map.pesquisamap;

public class Produto {
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return nome + " - " + quantidade + " - R$" + preco;
	}
}
