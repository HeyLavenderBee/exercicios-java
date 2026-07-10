package collectionsframework.list.pesquisalist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> catalogoLivros;
	
	public CatalogoLivros() {
		catalogoLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosIntervaloAno = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAno.add(l);
				}
			}
		}
		return livrosIntervaloAno;
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo){
		List<Livro> livrosTitulo = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livrosTitulo.add(l);
				}
			}
		}
		return livrosTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("A Culpa é das Estrelas", "Benjamin", 2020);
		catalogoLivros.adicionarLivro("Divindades", "Júlia e Darcy", 2017);
		System.out.println(catalogoLivros.pesquisarPorAutor("Benjamin"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2026));
		System.out.println(catalogoLivros.pesquisarPorTitulo("a culpa é das estrelas"));
	}
}
