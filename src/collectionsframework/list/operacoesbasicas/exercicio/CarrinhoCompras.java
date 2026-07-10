package collectionsframework.list.operacoesbasicas.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> carrinhoList;
	
	public CarrinhoCompras() {
		carrinhoList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item t : carrinhoList) {
			if (t.getNome() == nome) {
				itensParaRemover.add(t);
			}
		}
		carrinhoList.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double total = 0.0;
		for(Item i : carrinhoList) {
			total += i.getPreco() * i.getQuantidade();
		}
		return total;
	}
	
	public void exibirItens() {
		System.out.println("Itens presentes no carrinho:");
		for(Item i : carrinhoList) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		carrinho.adicionarItem("Sabonete", 1.2, 50);
		carrinho.adicionarItem("Almofada", 30.50, 5);
		System.out.println("Valor total do carrinho: R$"+carrinho.calcularValorTotal());
		carrinho.removerItem("Sabonete");
		carrinho.exibirItens();
	}
}
