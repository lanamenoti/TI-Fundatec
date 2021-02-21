
public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String chassi;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private int marchaAtual;
	private int numeroMarchas;
	private int primeiraMarcha;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public int getPrimeiraMarcha() {
		return primeiraMarcha;
	}

	public void setPrimeiraMarcha(int primeiraMarcha) {
		this.primeiraMarcha = primeiraMarcha;
	}

	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public int getNumeroMarchas() {
		return numeroMarchas;
	}
	
	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}
	
	
	public void acelera() {
		if (podeAcelerar()) {
			this.velocidadeAtual += 1;
			System.out.println("Carro está com a velocidade " + this.velocidadeAtual + "km/h");
		} else {
			System.out.println("Carro atingiu sua velocidade máxima, não pode mais acelerar");
		}
		
	}
	
	public boolean podeAcelerar() {
		if (velocidadeAtual < velocidadeMaxima) {
			return true;
		} else {
			return false;
		}
	}
	
	public void aumentaMarcha() {
		if (podeAumentarMarcha()) {
			marchaAtual += 1;
			System.out.println("Marcha atual: " + marchaAtual);
		} else {
			System.out.println("Não é possível aumentar a marcha");
		}
		
	}
	
	public void reducaoMarcha() {
		if (podeDiminuirMarcha()) {
			marchaAtual -= 1;
			System.out.println("Marcha atual: " + marchaAtual);
		} else {
			System.out.println("Não é possível diminuir a marcha");
		}
		
	}
	
	public boolean podeAumentarMarcha() {
		if (marchaAtual < numeroMarchas) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean podeDiminuirMarcha() {
		if (marchaAtual > primeiraMarcha) {
			return true;
		} else {
			return false;
		}
	}
}
