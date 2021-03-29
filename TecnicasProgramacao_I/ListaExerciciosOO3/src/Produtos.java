import java.util.ArrayList;
import java.util.List;

public class Produtos {
	
	private List<Produto> produtos = new ArrayList<>();
	
	
	public void adicionarProdutos(Produto produto) {
		this.produtos.add(produto);
	}
	
	public void imprimirLista() {
		for (Produto produto : produtos) {
			System.out.println("Produto: " + produto.getNome());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("---------------------------------");
		}
	}
	
	public int filtrarQuantidadeDeProdutoPorNome(String nome) {
		int quantidadeProduto = 0;
		
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				quantidadeProduto++;
			}
		}
		
		return quantidadeProduto;
	}
	
	public List<Produto> filtrarListaDeProdutoPorNome(String nome) {
		List<Produto> produtosFiltrados = new ArrayList<>();
		
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				produtosFiltrados.add(produto);			}
		}
		
		return produtosFiltrados;
	}
}
