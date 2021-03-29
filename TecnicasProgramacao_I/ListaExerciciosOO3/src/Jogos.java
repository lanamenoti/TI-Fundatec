import java.util.ArrayList;
import java.util.List;

public class Jogos {
	
	private List<Jogo> jogos = new ArrayList<>();

	public void adicionaJogos(Jogo jogo) {
		this.jogos.add(jogo);
	}
	
	public void imprimirListaJogos() {
		for (Jogo jogo : jogos) {
			System.out.printf("Jogo: %s - %d x %d - %s\n", jogo.getTime1().getNome(), jogo.getTime1().getGols(), jogo.getTime2().getGols(), jogo.getTime2().getNome());
			System.out.println("-----------------------------");
		}
	}
	
	public int filtrarQuantidadeDeJogosEmpatados() {
		int quantidadeJogosEmpatados = 0;
		
		for (Jogo jogo : jogos) {
			if (jogo.foiEmpate()) {
				quantidadeJogosEmpatados++;
			}
		}
		
		return quantidadeJogosEmpatados;
	}
	
	public int filtrarQuantidadeDeJogosVencidosPeloTime1() {
		int quantidadeJogosVencidosPorTime1 = 0;
		
		for (Jogo jogo : jogos) {
			if (jogo.time1VenceuJogo()) {
				quantidadeJogosVencidosPorTime1++;
			}
		}
		
		return quantidadeJogosVencidosPorTime1;
	}
	
	public int filtrarQuantidadeDeJogosVencidosPeloTime2() {
		int quantidadeJogosVencidosPorTime2 = 0;
		
		for (Jogo jogo : jogos) {
			if (jogo.time2VenceuJogo()) {
				quantidadeJogosVencidosPorTime2++;
			}
		}
		
		return quantidadeJogosVencidosPorTime2;
	}
}
