import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double mediaIdades, mediaPeso, peso = 0;
		int idade = 0, quantPessoas = 0, somaIdades = 0, somaPesos = 0;
		
		while (idade >= 0) {
			
			System.out.println("Digite um peso:");
			peso = teclado.nextDouble();
			
			System.out.println("Digite uma idade:");
			idade = teclado.nextInt();
			
			if (idade >= 0) {
				somaIdades += idade;
				somaPesos += peso;
				quantPessoas++;
			}
		}
		
		mediaIdades = somaIdades / quantPessoas;
		mediaPeso = somaPesos / quantPessoas;
		
		System.out.println("A m�dia das idades �: " + mediaIdades);
		System.out.println("A soma das idades �: " + somaIdades);
		System.out.println("A m�dia dos pesos �: " + mediaPeso);
		System.out.println("A soma dos pesos �: " + somaPesos);
	}

}
