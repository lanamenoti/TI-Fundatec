
public class MainJogos {
	public static void main(String[] args) {
		Jogo jogo1 = new Jogo(new Time("Gremio", 5), new Time("Inter", 0));
		Jogo jogo2 = new Jogo(new Time("Gremio", 2), new Time("Flamengo", 2));
		Jogo jogo3 = new Jogo(new Time("Pelotas", 0), new Time("Inter", 1));
		Jogo jogo4 = new Jogo(new Time("Gremio", 6), new Time("Ayacucho", 1));

		Jogos jogosTemporada = new Jogos();
		
		jogosTemporada.adicionaJogos(jogo1);
		jogosTemporada.adicionaJogos(jogo2);
		jogosTemporada.adicionaJogos(jogo3);
		jogosTemporada.adicionaJogos(jogo4);
		
		System.out.println("Jogos da temporada:");
		jogosTemporada.imprimirListaJogos();
		
		System.out.println("Quantidade de jogos empatados: " + jogosTemporada.filtrarQuantidadeDeJogosEmpatados());
		System.out.println("Quantidade de jogos vencidos pelo time 1: " + jogosTemporada.filtrarQuantidadeDeJogosVencidosPeloTime1());
		System.out.println("Quantidade de jogos vencidos pelo time 2: " + jogosTemporada.filtrarQuantidadeDeJogosVencidosPeloTime2());

	}
}
