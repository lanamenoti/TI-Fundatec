import java.util.List;

public class MainProduto {
	public static void main(String[] args) {
		Produto canetaRosa = new Produto("Caneta", "Caneta rosa com ponta fina", 3.20);
		Produto canetaAzul = new Produto("Caneta", "Caneta azul com ponta fina", 3.20);
		Produto caderno = new Produto("Caderno", "Caderno capa dura 96 folhas", 20.50);
		Produto mochilaDisney = new Produto("Mochila", "Mochila com estampa Disney", 72.99);
		Produto mochilaCarros = new Produto("Mochila", "Mochila com estampa Carros", 67.90);
		
		Produtos produtosLivraria = new Produtos();
		
		produtosLivraria.adicionarProdutos(canetaRosa);
		produtosLivraria.adicionarProdutos(canetaAzul);
		produtosLivraria.adicionarProdutos(caderno);
		produtosLivraria.adicionarProdutos(mochilaDisney);
		produtosLivraria.adicionarProdutos(mochilaCarros);
		
		System.out.println("Produtos vendidos na livraria: ");
		produtosLivraria.imprimirLista();
		
		System.out.println("Quantidade de produtos filtrados por mochila: " + produtosLivraria.filtrarQuantidadeDeProdutoPorNome("Mochila"));
		System.out.println("Quantidade de produtos filtrados por caneta: " + produtosLivraria.filtrarQuantidadeDeProdutoPorNome("Caneta"));
		System.out.println("Quantidade de produtos filtrados por caderno: " + produtosLivraria.filtrarQuantidadeDeProdutoPorNome("Caderno"));
		System.out.println("------------------------------------------------");
		
		List<Produto> produtosFiltradosPorCaneta = produtosLivraria.filtrarListaDeProdutoPorNome("Caneta");
		
		System.out.println("Lista de produtos filtrados por caneta: ");
		for (Produto produtoFiltrado : produtosFiltradosPorCaneta) {
			System.out.println("Descrição: " + produtoFiltrado.getDescricao());
		}
		
	}
}
