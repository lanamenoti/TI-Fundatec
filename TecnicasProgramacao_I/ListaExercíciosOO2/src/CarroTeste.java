
public class CarroTeste {
	public static void main(String[] args) {
		Carro kwid = new Carro();
		kwid.setMarca("Renault");
		kwid.setModelo("Kwid");
		kwid.setAno(2020);
		kwid.setCor("Branco");
		kwid.setChassi("45SD8SF5DS485");
		kwid.setVelocidadeMaxima(150);
		kwid.setNumeroMarchas(5);
		kwid.setMarchaAtual(2);
		kwid.setPrimeiraMarcha(1);
		kwid.setVelocidadeAtual(148);
		
		
		
		System.out.println("Marca: " + kwid.getMarca());
		System.out.println("Modelo: " + kwid.getModelo());
		System.out.println("Ano: " + kwid.getAno());
		System.out.println("Cor: " + kwid.getCor());
		System.out.println("Chassi: " + kwid.getChassi());
		
		System.out.println("-------------------------------------------------");

		System.out.println("Velocidade M�xima: " + kwid.getVelocidadeMaxima());
		System.out.println("Velocidade Atual: " + kwid.getVelocidadeAtual());
		
		System.out.println("-------------------------------------------------");
		System.out.println("M�todo Acelera:");
		kwid.acelera();
		kwid.acelera();
		
		// Nessa chamada o carro n�o vai mais conseguir acelerar por causa da valida��o
		kwid.acelera();
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("Numero Marchas: " + kwid.getNumeroMarchas());
		System.out.println("Marcha Atual: " + kwid.getMarchaAtual());
		System.out.println("Primeira Marcha: " + kwid.getPrimeiraMarcha());
		
		System.out.println("-------------------------------------------------");
		System.out.println("M�todo Aumaneta Marcha:");
		
		kwid.aumentaMarcha();
		kwid.aumentaMarcha();
		kwid.aumentaMarcha();
		
		// Nessa chamada o carro n�o vai mais conseguir aumentar a marcha por causa da valida��o
		kwid.aumentaMarcha();
		
		System.out.println("-------------------------------------------------");
		System.out.println("M�todo Reduz Marcha:");
		
		kwid.reducaoMarcha();
		kwid.reducaoMarcha();
		kwid.reducaoMarcha();
		kwid.reducaoMarcha();
		
		// Nessa chamada n�o vai diminuir a marcha por causa da valida��o
		kwid.reducaoMarcha();
		
	}

}

