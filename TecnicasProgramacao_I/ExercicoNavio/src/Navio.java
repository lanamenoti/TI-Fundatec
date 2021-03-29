import java.util.ArrayList;
import java.util.List;

public class Navio {
	
	private Tipo tipo;
	private Modelo modelo;
	private Navegacao navegacao;
	private String nome;
	private int anoFabricacao;
	private double velocidadeMaxima;
	private double velocidadeAtual;
	private double largura;
	private double comprimento;
	private double capacidadeCarga;
	private double cargaAtual;
	private List<Container> containers = new ArrayList<Container>();
	
	
	public Navio(Tipo tipo, Modelo modelo, Navegacao navegacao, String nome, int anoFabricacao, double velocidadeMaxima, double velocidadeAtual,
			double largura, double comprimento, double capacidadeCarga, double cargaAtual) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.navegacao = navegacao;
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidadeAtual = velocidadeAtual;
		this.largura = largura;
		this.comprimento = comprimento;
		this.capacidadeCarga = capacidadeCarga;
		this.cargaAtual = cargaAtual;
	}
	
	public void imprimirDadosNavio() {
		System.out.println("Informações sobre o navio:");
		System.out.println(" - Tipo: " + this.tipo.getNome());
		System.out.println(" - Modelo: " + this.modelo.getNome());
		System.out.printf(" - O navio vai sair de %s para %s\n", this.navegacao.getOrigem(), this.navegacao.getDestino());
		System.out.println(" - Nome do navio: " + this.nome);
		System.out.println(" - Ano de fabricação do navio: " + this.anoFabricacao);
		System.out.println(" - Velocidade máxima atingida pelo navio: " + this.velocidadeMaxima);
		System.out.println(" - Velocidade atual do navio: " + this.velocidadeAtual);
		System.out.println(" - Largura: " + this.largura);
		System.out.println(" - Comprimento: " + this.comprimento);
		System.out.println(" - Capacidade de carga máxima do navio: " + this.capacidadeCarga);
		System.out.println(" - Carga atual do navio: " + this.cargaAtual);
		
		if (containers.isEmpty()) {
			System.out.println(" - O navio ainda não possui containers");
			System.out.println("------------------------------------------------------");
		} else {
			System.out.println(" - Lista de containers no navio: ");
			
			for (Container container : containers) {
				System.out.println("	-Peso do container: " + container.getPeso());
			}	
			System.out.println("------------------------------------------------------");
		}
		
	}


	public Tipo getTipo() {
		return tipo;
	}


	public Modelo getModelo() {
		return modelo;
	}


	public Navegacao getNavegacao() {
		return navegacao;
	}


	public String getNome() {
		return nome;
	}


	public int getAnoFabricacao() {
		return anoFabricacao;
	}


	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}


	public double getLargura() {
		return largura;
	}


	public double getComprimento() {
		return comprimento;
	}


	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}


	public double getCargaAtual() {
		return cargaAtual;
	}
	
	
	public void acelerar() {
		if (podeAcelerar()) {
			this.velocidadeAtual += 1;
		} else {
			System.out.println("O navio não pode acelerar mais pois ultrapassaria a velocidade máxima de " + this.velocidadeMaxima);
		}
	}
	
	private boolean podeAcelerar() {
		return velocidadeAtual < velocidadeMaxima;
	}
	
	public void desacelerar() {
		if (podeDesacelerar()) {
			this.velocidadeAtual -= 1;	
		}
	}
	
	private boolean podeDesacelerar() {
		return velocidadeAtual > 0;
	}
	
	public void deveAdicionarContainer(Container container) {
		if (containerPodeSerAdicionado(container.getPeso())) {
			this.cargaAtual += container.getPeso();
			this.containers.add(container);	
		} else {
			System.out.printf("A adição do container com carga %f excederá a carga máxima do navio!\n", container.getPeso());
		}
		
	}
	
	private boolean containerPodeSerAdicionado(double peso) {
		return (cargaAtual + peso) <= capacidadeCarga;
	}
	
	public void deveRemoverContainer(Container container) {
		this.cargaAtual -= container.getPeso();
		this.containers.remove(container);
	}
	
	

}
