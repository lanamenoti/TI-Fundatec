import java.util.List;

public class MainLivro {
	public static void main(String[] args) {
		Livro homoSapiens = new Livro("Homo Sapiens", "Yuval Noah", "123456789");
		Livro homoSapiens2 = new Livro("Homo Sapiens", "Yuval Noah", "123456789");
		Livro sutilArte = new Livro("A sutil arte de ligar f*da-se", "Mark Manson", "129345678");
		Livro fodeuGeral = new Livro("F*deu geral", "Mark Manson", "123945678");
	
		Livros livros = new Livros();
		
		livros.adicionarLivros(homoSapiens);
		livros.adicionarLivros(sutilArte);
		livros.adicionarLivros(fodeuGeral);
		
		System.out.println("Livros adicionados:");
		livros.imprimirListaDeLivros();
		
		//Tentando adicionar livro com mesmo isbn - Lista deve continuar igual
		livros.adicionarLivros(homoSapiens2);
		
		System.out.println("Lista de livros depois de tentar adicionar livro com mesmo isbn:");
		livros.imprimirListaDeLivros();
		
		System.out.println("Quantidade de livros do autor Mark Manson: " + livros.filtrarQuantidadeDeLivrosPorAutor("Mark Manson"));
		System.out.println("Quantidade de livros do autor Yuval Noah: " + livros.filtrarQuantidadeDeLivrosPorAutor("Yuval Noah"));
		System.out.println("---------------------------------------------------------");
		
		List<Livro> livrosDoMarkManson = livros.filtrarListaDeLivrosPorAutor("Mark Manson");
		
		System.out.println("Lista de livros do autor Mark Manson: ");
		
		for (Livro livro : livrosDoMarkManson) {
			System.out.println("Título: " +  livro.getNome());
		}
	}

}
