import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int votosValidos;
		int percVotosValidos;
		int votosBrancos;
		int percVotosBrancos;
		int votosNulos;
		int percVotosNulos;
		int totalEleitores;
		
		System.out.println("Informe a quantidade de votos v�lidos:");
		votosValidos = teclado.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos:");
		votosBrancos= teclado.nextInt();
		
		System.out.println("Informe a quantidade de votos nulos:");
		votosNulos = teclado.nextInt();
		
		totalEleitores = votosBrancos + votosNulos + votosValidos;
		percVotosValidos = (votosValidos * 100) / totalEleitores;
		percVotosBrancos = (votosBrancos * 100) /totalEleitores;
		percVotosNulos = (votosNulos * 100) / totalEleitores;
		
		System.out.println("O total de eleitores �: " + totalEleitores);
		System.out.println("O percentual de votos v�lidos �: " + votosValidos + "%");
		System.out.println("O percentual de votos brancos �: " + votosBrancos + "%");
		System.out.println("O percentual de votos nulos �: " + votosNulos + "%");
		
		
		
		
	}

}
