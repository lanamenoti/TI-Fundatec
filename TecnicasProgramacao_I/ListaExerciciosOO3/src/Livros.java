import java.util.ArrayList;
import java.util.List;

public class Livros {
	
	private List<Livro> livros = new ArrayList<>();
	
	public void adicionarLivros(Livro livro) {
		if (!temLivroComMesmoIbsn(livro.getIsbn())) {
			this.livros.add(livro);
		} else {
			System.out.println("N�o � poss�vel adicionar esse livro na lista");
		}
		
	}
	
	private boolean temLivroComMesmoIbsn(String isbn) {
		boolean livroJaExiste = false;
		
		for (Livro livro : livros) {
			if (livro.getIsbn().equals(isbn)) {
				livroJaExiste = true;
			}
		}
		
		return livroJaExiste;
	}
	
	public void imprimirListaDeLivros() {
		for (Livro livro : livros) {
			System.out.println("T�tulo: " + livro.getNome());
			System.out.println("T�tulo: " + livro.getAutor());
			System.out.println("---------------------------------");
		}
	}
	
	public int filtrarQuantidadeDeLivrosPorAutor(String autor) {
		int quantidadeLivrosDoAutor =  0;
		
		for (Livro livro : livros) {
			if (livro.getAutor().equals(autor)) {
				quantidadeLivrosDoAutor++;
			}
		}
		
		return quantidadeLivrosDoAutor;
	}
	
	public List<Livro> filtrarListaDeLivrosPorAutor(String autor) {
		List<Livro> livrosDoAutor =  new ArrayList<>();
		
		for (Livro livro : livros) {
			if (livro.getAutor().equals(autor)) {
				livrosDoAutor.add(livro);
			}
		}
		
		return livrosDoAutor;
	}

}
