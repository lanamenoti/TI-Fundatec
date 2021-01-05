import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double peso, idade, mediaI = 0, mediaP = 0, somaI = 0, somaP = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite a idade da pessoa:");
			idade = teclado.nextDouble();
			
			System.out.println("Digite o peso da pessoa:");
			peso = teclado.nextDouble();
			
			somaI += idade;
			somaP += peso;
		}
		
		mediaI = somaI / 20;
		mediaP = somaP / 20;
		
		System.out.println("A média das idades digitados é: " + mediaI);
		System.out.println("A média dos pesos digitados é: " + mediaP);
		System.out.println("A soma das idades digitadas é: " + somaI);
		System.out.println("A soma dos pesos digitados é: " + somaP);
	}

}
