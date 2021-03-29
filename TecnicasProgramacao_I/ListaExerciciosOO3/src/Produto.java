
public class Produto {

	private String nome;
	private String descricao;
	private double valor;
	
	public Produto(String nome, String descricao, Double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
}
